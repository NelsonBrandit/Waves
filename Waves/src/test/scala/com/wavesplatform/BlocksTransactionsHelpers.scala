package com.wavesplatform
import com.wavesplatform.account.{AddressOrAlias, PrivateKeyAccount}
import com.wavesplatform.block.{Block, MicroBlock, SignerData}
import com.wavesplatform.common.state.ByteStr
import com.wavesplatform.common.utils._
import com.wavesplatform.consensus.nxt.NxtLikeConsensusBlockData
import com.wavesplatform.history.DefaultBaseTarget
import com.wavesplatform.transaction.Asset.Waves
import com.wavesplatform.transaction.Transaction
import com.wavesplatform.transaction.lease.{
  LeaseCancelTransactionV1,
  LeaseTransactionV1
}
import com.wavesplatform.transaction.transfer.TransferTransactionV1
import org.scalacheck.Gen

trait BlocksTransactionsHelpers { self: TransactionGen =>
  object QuickTX {
    val FeeAmount = 400000

    def transfer(from: PrivateKeyAccount,
                 to: AddressOrAlias = accountGen.sample.get,
                 amount: Long = smallFeeGen.sample.get): Gen[Transaction] =
      for {
        timestamp <- timestampGen
      } yield
        TransferTransactionV1
          .selfSigned(Waves,
                      from,
                      to,
                      amount,
                      timestamp,
                      Waves,
                      FeeAmount,
                      Array.empty)
          .explicitGet()

    def lease(from: PrivateKeyAccount,
              to: AddressOrAlias = accountGen.sample.get,
              amount: Long = smallFeeGen.sample.get): Gen[LeaseTransactionV1] =
      for {
        timestamp <- timestampGen
      } yield
        LeaseTransactionV1
          .selfSigned(from, amount, FeeAmount, timestamp, to)
          .explicitGet()

    def leaseCancel(from: PrivateKeyAccount,
                    leaseId: ByteStr): Gen[LeaseCancelTransactionV1] =
      for {
        timestamp <- timestampGen
      } yield
        LeaseCancelTransactionV1
          .selfSigned(from, leaseId, FeeAmount, timestamp)
          .explicitGet()
  }

  object UnsafeBlocks {
    def unsafeChainBaseAndMicro(totalRefTo: ByteStr,
                                base: Seq[Transaction],
                                micros: Seq[Seq[Transaction]],
                                signer: PrivateKeyAccount,
                                version: Byte,
                                timestamp: Long): (Block, Seq[MicroBlock]) = {
      val block = unsafeBlock(totalRefTo, base, signer, version, timestamp)
      val microBlocks = micros
        .foldLeft((block, Seq.empty[MicroBlock])) {
          case ((lastTotal, allMicros), txs) =>
            val (newTotal, micro) = unsafeMicro(totalRefTo,
                                                lastTotal,
                                                txs,
                                                signer,
                                                version,
                                                timestamp)
            (newTotal, allMicros :+ micro)
        }
        ._2
      (block, microBlocks)
    }

    def unsafeMicro(totalRefTo: ByteStr,
                    prevTotal: Block,
                    txs: Seq[Transaction],
                    signer: PrivateKeyAccount,
                    version: Byte,
                    ts: Long): (Block, MicroBlock) = {
      val newTotalBlock = unsafeBlock(totalRefTo,
                                      prevTotal.transactionData ++ txs,
                                      signer,
                                      version,
                                      ts)
      val unsigned = new MicroBlock(version,
                                    signer,
                                    txs,
                                    prevTotal.uniqueId,
                                    newTotalBlock.uniqueId,
                                    ByteStr.empty)
      val signature = crypto.sign(signer, unsigned.bytes())
      val signed = unsigned.copy(signature = ByteStr(signature))
      (newTotalBlock, signed)
    }

    def unsafeBlock(reference: ByteStr,
                    txs: Seq[Transaction],
                    signer: PrivateKeyAccount,
                    version: Byte,
                    timestamp: Long,
                    bTarget: Long = DefaultBaseTarget): Block = {
      val unsigned = Block(
        version = version,
        timestamp = timestamp,
        reference = reference,
        consensusData = NxtLikeConsensusBlockData(
          baseTarget = bTarget,
          generationSignature = com.wavesplatform.history.generationSignature
        ),
        transactionData = txs,
        signerData = SignerData(
          generator = signer,
          signature = ByteStr.empty
        ),
        featureVotes = Set.empty
      )

      unsigned.copy(
        signerData =
          SignerData(signer, ByteStr(crypto.sign(signer, unsigned.bytes()))))
    }
  }
}