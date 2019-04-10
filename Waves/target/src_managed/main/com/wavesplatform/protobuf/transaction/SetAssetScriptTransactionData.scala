// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.transaction

@SerialVersionUID(0L)
final case class SetAssetScriptTransactionData(
    assetId: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
    script: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Script] = None
    ) extends scalapb.GeneratedMessage with scalapb.Message[SetAssetScriptTransactionData] with scalapb.lenses.Updatable[SetAssetScriptTransactionData] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = assetId
        if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(1, __value)
        }
      };
      if (script.isDefined) {
        val __value = script.get
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
      {
        val __v = assetId
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(1, __v)
        }
      };
      script.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData = {
      var __assetId = this.assetId
      var __script = this.script
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __assetId = _input__.readBytes()
          case 18 =>
            __script = Option(_root_.scalapb.LiteParser.readMessage(_input__, __script.getOrElse(com.wavesplatform.protobuf.transaction.Script.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData(
          assetId = __assetId,
          script = __script
      )
    }
    def withAssetId(__v: _root_.com.google.protobuf.ByteString): SetAssetScriptTransactionData = copy(assetId = __v)
    def getScript: com.wavesplatform.protobuf.transaction.Script = script.getOrElse(com.wavesplatform.protobuf.transaction.Script.defaultInstance)
    def clearScript: SetAssetScriptTransactionData = copy(script = None)
    def withScript(__v: com.wavesplatform.protobuf.transaction.Script): SetAssetScriptTransactionData = copy(script = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = assetId
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
        case 2 => script.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PByteString(assetId)
        case 2 => script.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData
}

object SetAssetScriptTransactionData extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData(
      __fieldsMap.getOrElse(__fields.get(0), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Script]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.transaction.Script]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TransactionsProto.javaDescriptor.getMessageTypes.get(15)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TransactionsProto.scalaDescriptor.messages(15)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.wavesplatform.protobuf.transaction.Script
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData(
  )
  implicit class SetAssetScriptTransactionDataLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData](_l) {
    def assetId: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.assetId)((c_, f_) => c_.copy(assetId = f_))
    def script: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.transaction.Script] = field(_.getScript)((c_, f_) => c_.copy(script = Option(f_)))
    def optionalScript: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.transaction.Script]] = field(_.script)((c_, f_) => c_.copy(script = f_))
  }
  final val ASSETID_FIELD_NUMBER = 1
  final val SCRIPT_FIELD_NUMBER = 2
  def of(
    assetId: _root_.com.google.protobuf.ByteString,
    script: _root_.scala.Option[com.wavesplatform.protobuf.transaction.Script]
  ): _root_.com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData = _root_.com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData(
    assetId,
    script
  )
}