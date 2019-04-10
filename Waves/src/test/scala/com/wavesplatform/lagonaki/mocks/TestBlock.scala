package com.wavesplatform.lagonaki.mocks

import com.wavesplatform.account.PrivateKeyAccount
import com.wavesplatform.block._
import com.wavesplatform.common.state.ByteStr
import com.wavesplatform.common.utils.EitherExt2
import com.wavesplatform.consensus.nxt.NxtLikeConsensusBlockData
import com.wavesplatform.crypto._
import com.wavesplatform.transaction.Transaction

import scala.util.{Random, Try}

object TestBlock {
  val defaultSigner = PrivateKeyAccount(Array.fill(KeyLength)(0))

  val random: Random = new Random()

  def randomOfLength(length: Int): ByteStr =
    ByteStr(Array.fill(length)(random.nextInt().toByte))

  def randomSignature(): ByteStr = randomOfLength(SignatureLength)

  def sign(signer: PrivateKeyAccount, b: Block): Block = {
    Block
      .buildAndSign(
        version = b.version,
        timestamp = b.timestamp,
        reference = b.reference,
        consensusData = b.consensusData,
        transactionData = b.transactionData,
        signer = signer,
        featureVotes = b.featureVotes
      )
      .explicitGet()
  }

  def create(txs: Seq[Transaction]): Block = create(defaultSigner, txs)

  def create(signer: PrivateKeyAccount, txs: Seq[Transaction]): Block =
    create(time = Try(txs.map(_.timestamp).max).getOrElse(0),
           txs = txs,
           signer = signer)

  def create(signer: PrivateKeyAccount,
             txs: Seq[Transaction],
             features: Set[Short]): Block =
    create(time = Try(txs.map(_.timestamp).max).getOrElse(0),
           ref = randomSignature(),
           txs = txs,
           signer = signer,
           version = 3,
           features = features)

  def create(time: Long, txs: Seq[Transaction]): Block =
    create(time, randomSignature(), txs, defaultSigner)

  def create(time: Long,
             txs: Seq[Transaction],
             signer: PrivateKeyAccount): Block =
    create(time, randomSignature(), txs, signer)

  def create(time: Long,
             ref: ByteStr,
             txs: Seq[Transaction],
             signer: PrivateKeyAccount = defaultSigner,
             version: Byte = 2,
             features: Set[Short] = Set.empty[Short]): Block =
    sign(
      signer,
      Block(
        timestamp = time,
        version = version,
        reference = ref,
        signerData = SignerData(signer, ByteStr.empty),
        consensusData = NxtLikeConsensusBlockData(
          2L,
          ByteStr(Array.fill(Block.GeneratorSignatureLength)(0: Byte))),
        transactionData = txs,
        featureVotes = features
      )
    )

  def withReference(ref: ByteStr): Block =
    sign(
      defaultSigner,
      Block(0,
            1,
            ref,
            SignerData(defaultSigner, ByteStr.empty),
            NxtLikeConsensusBlockData(
              2L,
              randomOfLength(Block.GeneratorSignatureLength)),
            Seq.empty,
            Set.empty)
    )

  def withReferenceAndFeatures(ref: ByteStr, features: Set[Short]): Block =
    sign(
      defaultSigner,
      Block(0,
            3,
            ref,
            SignerData(defaultSigner, ByteStr.empty),
            NxtLikeConsensusBlockData(
              2L,
              randomOfLength(Block.GeneratorSignatureLength)),
            Seq.empty,
            features)
    )
}
