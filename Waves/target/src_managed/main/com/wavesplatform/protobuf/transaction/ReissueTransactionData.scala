// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.transaction

@SerialVersionUID(0L)
final case class ReissueTransactionData(
    assetAmount: _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount] = None,
    reissuable: _root_.scala.Boolean = false
    ) extends scalapb.GeneratedMessage with scalapb.Message[ReissueTransactionData] with scalapb.lenses.Updatable[ReissueTransactionData] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (assetAmount.isDefined) {
        val __value = assetAmount.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = reissuable
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
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
      assetAmount.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = reissuable
        if (__v != false) {
          _output__.writeBool(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.transaction.ReissueTransactionData = {
      var __assetAmount = this.assetAmount
      var __reissuable = this.reissuable
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __assetAmount = Option(_root_.scalapb.LiteParser.readMessage(_input__, __assetAmount.getOrElse(com.wavesplatform.protobuf.transaction.AssetAmount.defaultInstance)))
          case 16 =>
            __reissuable = _input__.readBool()
          case tag => _input__.skipField(tag)
        }
      }
      com.wavesplatform.protobuf.transaction.ReissueTransactionData(
          assetAmount = __assetAmount,
          reissuable = __reissuable
      )
    }
    def getAssetAmount: com.wavesplatform.protobuf.transaction.AssetAmount = assetAmount.getOrElse(com.wavesplatform.protobuf.transaction.AssetAmount.defaultInstance)
    def clearAssetAmount: ReissueTransactionData = copy(assetAmount = None)
    def withAssetAmount(__v: com.wavesplatform.protobuf.transaction.AssetAmount): ReissueTransactionData = copy(assetAmount = Option(__v))
    def withReissuable(__v: _root_.scala.Boolean): ReissueTransactionData = copy(reissuable = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => assetAmount.orNull
        case 2 => {
          val __t = reissuable
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => assetAmount.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PBoolean(reissuable)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.wavesplatform.protobuf.transaction.ReissueTransactionData
}

object ReissueTransactionData extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.ReissueTransactionData] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.ReissueTransactionData] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.transaction.ReissueTransactionData = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.wavesplatform.protobuf.transaction.ReissueTransactionData(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]],
      __fieldsMap.getOrElse(__fields.get(1), false).asInstanceOf[_root_.scala.Boolean]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.transaction.ReissueTransactionData] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.wavesplatform.protobuf.transaction.ReissueTransactionData(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TransactionsProto.javaDescriptor.getMessageTypes.get(14)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TransactionsProto.scalaDescriptor.messages(14)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.wavesplatform.protobuf.transaction.AssetAmount
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.wavesplatform.protobuf.transaction.ReissueTransactionData(
  )
  implicit class ReissueTransactionDataLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.ReissueTransactionData]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.transaction.ReissueTransactionData](_l) {
    def assetAmount: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.AssetAmount] = field(_.getAssetAmount)((c_, f_) => c_.copy(assetAmount = Option(f_)))
    def optionalAssetAmount: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount]] = field(_.assetAmount)((c_, f_) => c_.copy(assetAmount = f_))
    def reissuable: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.reissuable)((c_, f_) => c_.copy(reissuable = f_))
  }
  final val ASSETAMOUNT_FIELD_NUMBER = 1
  final val REISSUABLE_FIELD_NUMBER = 2
  def of(
    assetAmount: _root_.scala.Option[com.wavesplatform.protobuf.transaction.AssetAmount],
    reissuable: _root_.scala.Boolean
  ): _root_.com.wavesplatform.protobuf.transaction.ReissueTransactionData = _root_.com.wavesplatform.protobuf.transaction.ReissueTransactionData(
    assetAmount,
    reissuable
  )
}
