// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.transaction

@SerialVersionUID(0L)
final case class BurnTransactionData(
    assetAmount: _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[BurnTransactionData] with scalapb.lenses.Updatable[BurnTransactionData] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (assetAmount.isDefined) {
        val __value = assetAmount.get
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
      assetAmount.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.transaction.BurnTransactionData = {
      var __assetAmount = this.assetAmount
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __assetAmount = Option(_root_.scalapb.LiteParser.readMessage(_input__, __assetAmount.getOrElse(com.wavesplatform.protobuf.transaction.AssetAmount.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.wavesplatform.protobuf.transaction.BurnTransactionData(
          assetAmount = __assetAmount
      )
    }
    def getAssetAmount: com.wavesplatform.protobuf.transaction.AssetAmount = assetAmount.getOrElse(com.wavesplatform.protobuf.transaction.AssetAmount.defaultInstance)
    def clearAssetAmount: BurnTransactionData = copy(assetAmount = None)
    def withAssetAmount(__v: com.wavesplatform.protobuf.transaction.AssetAmount): BurnTransactionData = copy(assetAmount = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => assetAmount.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => assetAmount.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.wavesplatform.protobuf.transaction.BurnTransactionData
}

object BurnTransactionData extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.BurnTransactionData] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.BurnTransactionData] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.transaction.BurnTransactionData = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.wavesplatform.protobuf.transaction.BurnTransactionData(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.transaction.BurnTransactionData] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.wavesplatform.protobuf.transaction.BurnTransactionData(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TransactionsProto.javaDescriptor.getMessageTypes.get(12)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TransactionsProto.scalaDescriptor.messages(12)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.wavesplatform.protobuf.transaction.AssetAmount
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.wavesplatform.protobuf.transaction.BurnTransactionData(
  )
  implicit class BurnTransactionDataLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.BurnTransactionData]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.transaction.BurnTransactionData](_l) {
    def assetAmount: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.AssetAmount] = field(_.getAssetAmount)((c_, f_) => c_.copy(assetAmount = Option(f_)))
    def optionalAssetAmount: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]] = field(_.assetAmount)((c_, f_) => c_.copy(assetAmount = f_))
  }
  final val ASSETAMOUNT_FIELD_NUMBER = 1
  def of(
    assetAmount: _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]
  ): _root_.com.wavesplatform.protobuf.transaction.BurnTransactionData = _root_.com.wavesplatform.protobuf.transaction.BurnTransactionData(
    assetAmount
  )
}
