// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.transaction

@SerialVersionUID(0L)
final case class SponsorFeeTransactionData(
    minFee: _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[SponsorFeeTransactionData] with scalapb.lenses.Updatable[SponsorFeeTransactionData] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (minFee.isDefined) {
        val __value = minFee.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      minFee.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData = {
      var __minFee = this.minFee
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __minFee = Option(_root_.scalapb.LiteParser.readMessage(_input__, __minFee.getOrElse(com.wavesplatform.protobuf.transaction.AssetAmount.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData(
          minFee = __minFee
      )
    }
    def getMinFee: com.wavesplatform.protobuf.transaction.AssetAmount = minFee.getOrElse(com.wavesplatform.protobuf.transaction.AssetAmount.defaultInstance)
    def clearMinFee: SponsorFeeTransactionData = copy(minFee = None)
    def withMinFee(__v: com.wavesplatform.protobuf.transaction.AssetAmount): SponsorFeeTransactionData = copy(minFee = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => minFee.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => minFee.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData
}

object SponsorFeeTransactionData extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TransactionsProto.javaDescriptor.getMessageTypes.get(18)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TransactionsProto.scalaDescriptor.messages(18)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.wavesplatform.protobuf.transaction.AssetAmount
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData(
  )
  implicit class SponsorFeeTransactionDataLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData](_l) {
    def minFee: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.AssetAmount] = field(_.getMinFee)((c_, f_) => c_.copy(minFee = Option(f_)))
    def optionalMinFee: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]] = field(_.minFee)((c_, f_) => c_.copy(minFee = f_))
  }
  final val MINFEE_FIELD_NUMBER = 1
  def of(
    minFee: _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]
  ): _root_.com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData = _root_.com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData(
    minFee
  )
}