// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.transaction

@SerialVersionUID(0L)
final case class TransferTransactionData(
    recipient: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Recipient] = None,
    amount: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Amount] = None,
    attachment: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    ) extends scalapb.GeneratedMessage with scalapb.Message[TransferTransactionData] with scalapb.lenses.Updatable[TransferTransactionData] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (recipient.isDefined) {
        val __value = recipient.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (amount.isDefined) {
        val __value = amount.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = attachment
        if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(3, __value)
        }
      };
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
      recipient.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      amount.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = attachment
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.transaction.TransferTransactionData = {
      var __recipient = this.recipient
      var __amount = this.amount
      var __attachment = this.attachment
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __recipient = Option(_root_.scalapb.LiteParser.readMessage(_input__, __recipient.getOrElse(com.wavesplatform.protobuf.transaction.Recipient.defaultInstance)))
          case 18 =>
            __amount = Option(_root_.scalapb.LiteParser.readMessage(_input__, __amount.getOrElse(com.wavesplatform.protobuf.transaction.Amount.defaultInstance)))
          case 26 =>
            __attachment = _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      com.wavesplatform.protobuf.transaction.TransferTransactionData(
          recipient = __recipient,
          amount = __amount,
          attachment = __attachment
      )
    }
    def getRecipient: com.wavesplatform.protobuf.transaction.Recipient = recipient.getOrElse(com.wavesplatform.protobuf.transaction.Recipient.defaultInstance)
    def clearRecipient: TransferTransactionData = copy(recipient = None)
    def withRecipient(__v: com.wavesplatform.protobuf.transaction.Recipient): TransferTransactionData = copy(recipient = Option(__v))
    def getAmount: com.wavesplatform.protobuf.transaction.Amount = amount.getOrElse(com.wavesplatform.protobuf.transaction.Amount.defaultInstance)
    def clearAmount: TransferTransactionData = copy(amount = None)
    def withAmount(__v: com.wavesplatform.protobuf.transaction.Amount): TransferTransactionData = copy(amount = Option(__v))
    def withAttachment(__v: _root_.com.google.protobuf.ByteString): TransferTransactionData = copy(attachment = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => recipient.orNull
        case 2 => amount.orNull
        case 3 => {
          val __t = attachment
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => recipient.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => amount.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PByteString(attachment)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.wavesplatform.protobuf.transaction.TransferTransactionData
}

object TransferTransactionData extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.TransferTransactionData] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.TransferTransactionData] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.transaction.TransferTransactionData = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.wavesplatform.protobuf.transaction.TransferTransactionData(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Recipient]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Amount]],
      __fieldsMap.getOrElse(__fields.get(2), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.transaction.TransferTransactionData] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.wavesplatform.protobuf.transaction.TransferTransactionData(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Recipient]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Amount]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TransactionsProto.javaDescriptor.getMessageTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TransactionsProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.wavesplatform.protobuf.transaction.Recipient
      case 2 => __out = com.wavesplatform.protobuf.transaction.Amount
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.wavesplatform.protobuf.transaction.TransferTransactionData(
  )
  implicit class TransferTransactionDataLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.TransferTransactionData]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.transaction.TransferTransactionData](_l) {
    def recipient: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.Recipient] = field(_.getRecipient)((c_, f_) => c_.copy(recipient = Option(f_)))
    def optionalRecipient: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.transaction.Recipient]] = field(_.recipient)((c_, f_) => c_.copy(recipient = f_))
    def amount: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.Amount] = field(_.getAmount)((c_, f_) => c_.copy(amount = Option(f_)))
    def optionalAmount: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.transaction.Amount]] = field(_.amount)((c_, f_) => c_.copy(amount = f_))
    def attachment: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.attachment)((c_, f_) => c_.copy(attachment = f_))
  }
  final val RECIPIENT_FIELD_NUMBER = 1
  final val AMOUNT_FIELD_NUMBER = 2
  final val ATTACHMENT_FIELD_NUMBER = 3
  def of(
    recipient: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Recipient],
    amount: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Amount],
    attachment: _root_.com.google.protobuf.ByteString
  ): _root_.com.wavesplatform.protobuf.transaction.TransferTransactionData = _root_.com.wavesplatform.protobuf.transaction.TransferTransactionData(
    recipient,
    amount,
    attachment
  )
}
