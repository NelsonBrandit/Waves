// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.transaction

@SerialVersionUID(0L)
final case class SignedTransaction(
    transaction: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Transaction] = None,
    proofs: _root_.scala.collection.Seq[_root_.com.google.protobuf.ByteString] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[SignedTransaction] with scalapb.lenses.Updatable[SignedTransaction] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (transaction.isDefined) {
        val __value = transaction.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      proofs.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(2, __value)
      }
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      transaction.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      proofs.foreach { __v =>
        val __m = __v
        _output__.writeBytes(2, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.transaction.SignedTransaction = {
      var __transaction = this.transaction
      val __proofs = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.com.google.protobuf.ByteString] ++= this.proofs)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __transaction = Option(_root_.scalapb.LiteParser.readMessage(_input__, __transaction.getOrElse(com.wavesplatform.protobuf.transaction.Transaction.defaultInstance)))
          case 18 =>
            __proofs += _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      com.wavesplatform.protobuf.transaction.SignedTransaction(
          transaction = __transaction,
          proofs = __proofs.result()
      )
    }
    def getTransaction: com.wavesplatform.protobuf.transaction.Transaction = transaction.getOrElse(com.wavesplatform.protobuf.transaction.Transaction.defaultInstance)
    def clearTransaction: SignedTransaction = copy(transaction = None)
    def withTransaction(__v: com.wavesplatform.protobuf.transaction.Transaction): SignedTransaction = copy(transaction = Option(__v))
    def clearProofs = copy(proofs = _root_.scala.collection.Seq.empty)
    def addProofs(__vs: _root_.com.google.protobuf.ByteString*): SignedTransaction = addAllProofs(__vs)
    def addAllProofs(__vs: TraversableOnce[_root_.com.google.protobuf.ByteString]): SignedTransaction = copy(proofs = proofs ++ __vs)
    def withProofs(__v: _root_.scala.collection.Seq[_root_.com.google.protobuf.ByteString]): SignedTransaction = copy(proofs = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => transaction.orNull
        case 2 => proofs
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => transaction.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(proofs.map(_root_.scalapb.descriptors.PByteString)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.wavesplatform.protobuf.transaction.SignedTransaction
}

object SignedTransaction extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.SignedTransaction] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.SignedTransaction] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.transaction.SignedTransaction = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.wavesplatform.protobuf.transaction.SignedTransaction(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Transaction]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.com.google.protobuf.ByteString]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.transaction.SignedTransaction] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.wavesplatform.protobuf.transaction.SignedTransaction(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Transaction]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.collection.Seq[_root_.com.google.protobuf.ByteString]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TransactionsProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TransactionsProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.wavesplatform.protobuf.transaction.Transaction
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.wavesplatform.protobuf.transaction.SignedTransaction(
  )
  implicit class SignedTransactionLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.SignedTransaction]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.transaction.SignedTransaction](_l) {
    def transaction: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.Transaction] = field(_.getTransaction)((c_, f_) => c_.copy(transaction = Option(f_)))
    def optionalTransaction: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.transaction.Transaction]] = field(_.transaction)((c_, f_) => c_.copy(transaction = f_))
    def proofs: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.com.google.protobuf.ByteString]] = field(_.proofs)((c_, f_) => c_.copy(proofs = f_))
  }
  final val TRANSACTION_FIELD_NUMBER = 1
  final val PROOFS_FIELD_NUMBER = 2
  def of(
    transaction: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Transaction],
    proofs: _root_.scala.collection.Seq[_root_.com.google.protobuf.ByteString]
  ): _root_.com.wavesplatform.protobuf.transaction.SignedTransaction = _root_.com.wavesplatform.protobuf.transaction.SignedTransaction(
    transaction,
    proofs
  )
}
