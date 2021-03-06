// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.block

@SerialVersionUID(0L)
final case class Block(
    chainId: _root_.scala.Int = 0,
    header: _root_.scala.Option[com.wavesplatform.protobuf.block.Block.SignedHeader] = None,
    transactions: _root_.scala.collection.Seq[com.wavesplatform.protobuf.transaction.SignedTransaction] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Block] with scalapb.lenses.Updatable[Block] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = chainId
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      if (header.isDefined) {
        val __value = header.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      transactions.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
      {
        val __v = chainId
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      header.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      transactions.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.block.Block = {
      var __chainId = this.chainId
      var __header = this.header
      val __transactions = (_root_.scala.collection.immutable.Vector.newBuilder[com.wavesplatform.protobuf.transaction.SignedTransaction] ++= this.transactions)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __chainId = _input__.readInt32()
          case 18 =>
            __header = Option(_root_.scalapb.LiteParser.readMessage(_input__, __header.getOrElse(com.wavesplatform.protobuf.block.Block.SignedHeader.defaultInstance)))
          case 26 =>
            __transactions += _root_.scalapb.LiteParser.readMessage(_input__, com.wavesplatform.protobuf.transaction.SignedTransaction.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.wavesplatform.protobuf.block.Block(
          chainId = __chainId,
          header = __header,
          transactions = __transactions.result()
      )
    }
    def withChainId(__v: _root_.scala.Int): Block = copy(chainId = __v)
    def getHeader: com.wavesplatform.protobuf.block.Block.SignedHeader = header.getOrElse(com.wavesplatform.protobuf.block.Block.SignedHeader.defaultInstance)
    def clearHeader: Block = copy(header = None)
    def withHeader(__v: com.wavesplatform.protobuf.block.Block.SignedHeader): Block = copy(header = Option(__v))
    def clearTransactions = copy(transactions = _root_.scala.collection.Seq.empty)
    def addTransactions(__vs: com.wavesplatform.protobuf.transaction.SignedTransaction*): Block = addAllTransactions(__vs)
    def addAllTransactions(__vs: TraversableOnce[com.wavesplatform.protobuf.transaction.SignedTransaction]): Block = copy(transactions = transactions ++ __vs)
    def withTransactions(__v: _root_.scala.collection.Seq[com.wavesplatform.protobuf.transaction.SignedTransaction]): Block = copy(transactions = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = chainId
          if (__t != 0) __t else null
        }
        case 2 => header.orNull
        case 3 => transactions
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(chainId)
        case 2 => header.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PRepeated(transactions.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.wavesplatform.protobuf.block.Block
}

object Block extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.block.Block] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.block.Block] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.block.Block = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.wavesplatform.protobuf.block.Block(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.block.Block.SignedHeader]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.collection.Seq[com.wavesplatform.protobuf.transaction.SignedTransaction]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.block.Block] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.wavesplatform.protobuf.block.Block(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.block.Block.SignedHeader]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.collection.Seq[com.wavesplatform.protobuf.transaction.SignedTransaction]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = BlockProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = BlockProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.wavesplatform.protobuf.block.Block.SignedHeader
      case 3 => __out = com.wavesplatform.protobuf.transaction.SignedTransaction
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.com.wavesplatform.protobuf.block.Block.SignedHeader,
    _root_.com.wavesplatform.protobuf.block.Block.Header
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.wavesplatform.protobuf.block.Block(
  )
  @SerialVersionUID(0L)
  final case class SignedHeader(
      header: _root_.scala.Option[com.wavesplatform.protobuf.block.Block.Header] = None,
      signature: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
      ) extends scalapb.GeneratedMessage with scalapb.Message[SignedHeader] with scalapb.lenses.Updatable[SignedHeader] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (header.isDefined) {
          val __value = header.get
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
        };
        
        {
          val __value = signature
          if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(8, __value)
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
        header.foreach { __v =>
          val __m = __v
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(__m.serializedSize)
          __m.writeTo(_output__)
        };
        {
          val __v = signature
          if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
            _output__.writeBytes(8, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.block.Block.SignedHeader = {
        var __header = this.header
        var __signature = this.signature
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __header = Option(_root_.scalapb.LiteParser.readMessage(_input__, __header.getOrElse(com.wavesplatform.protobuf.block.Block.Header.defaultInstance)))
            case 66 =>
              __signature = _input__.readBytes()
            case tag => _input__.skipField(tag)
          }
        }
        com.wavesplatform.protobuf.block.Block.SignedHeader(
            header = __header,
            signature = __signature
        )
      }
      def getHeader: com.wavesplatform.protobuf.block.Block.Header = header.getOrElse(com.wavesplatform.protobuf.block.Block.Header.defaultInstance)
      def clearHeader: SignedHeader = copy(header = None)
      def withHeader(__v: com.wavesplatform.protobuf.block.Block.Header): SignedHeader = copy(header = Option(__v))
      def withSignature(__v: _root_.com.google.protobuf.ByteString): SignedHeader = copy(signature = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => header.orNull
          case 8 => {
            val __t = signature
            if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => header.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 8 => _root_.scalapb.descriptors.PByteString(signature)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.wavesplatform.protobuf.block.Block.SignedHeader
  }
  
  object SignedHeader extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.block.Block.SignedHeader] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.block.Block.SignedHeader] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.block.Block.SignedHeader = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.wavesplatform.protobuf.block.Block.SignedHeader(
        __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.wavesplatform.protobuf.block.Block.Header]],
        __fieldsMap.getOrElse(__fields.get(1), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.block.Block.SignedHeader] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.wavesplatform.protobuf.block.Block.SignedHeader(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.wavesplatform.protobuf.block.Block.Header]]),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.wavesplatform.protobuf.block.Block.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.wavesplatform.protobuf.block.Block.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
      var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
      (__number: @_root_.scala.unchecked) match {
        case 1 => __out = com.wavesplatform.protobuf.block.Block.Header
      }
      __out
    }
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.wavesplatform.protobuf.block.Block.SignedHeader(
    )
    implicit class SignedHeaderLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.block.Block.SignedHeader]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.block.Block.SignedHeader](_l) {
      def header: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.block.Block.Header] = field(_.getHeader)((c_, f_) => c_.copy(header = Option(f_)))
      def optionalHeader: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.block.Block.Header]] = field(_.header)((c_, f_) => c_.copy(header = f_))
      def signature: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.signature)((c_, f_) => c_.copy(signature = f_))
    }
    final val HEADER_FIELD_NUMBER = 1
    final val SIGNATURE_FIELD_NUMBER = 8
    def of(
      header: _root_.scala.Option[com.wavesplatform.protobuf.block.Block.Header],
      signature: _root_.com.google.protobuf.ByteString
    ): _root_.com.wavesplatform.protobuf.block.Block.SignedHeader = _root_.com.wavesplatform.protobuf.block.Block.SignedHeader(
      header,
      signature
    )
  }
  
  @SerialVersionUID(0L)
  final case class Header(
      reference: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
      baseTarget: _root_.scala.Long = 0L,
      generationSignature: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY,
      featureVotes: _root_.scala.collection.Seq[_root_.scala.Int] = _root_.scala.collection.Seq.empty,
      timestamp: _root_.scala.Long = 0L,
      version: _root_.scala.Int = 0,
      generator: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
      ) extends scalapb.GeneratedMessage with scalapb.Message[Header] with scalapb.lenses.Updatable[Header] {
      private[this] def featureVotesSerializedSize = {
        if (__featureVotesSerializedSizeField == 0) __featureVotesSerializedSizeField = {
          var __s: _root_.scala.Int = 0
          featureVotes.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__i))
          __s
        }
        __featureVotesSerializedSizeField
      }
      @transient private[this] var __featureVotesSerializedSizeField: _root_.scala.Int = 0
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = reference
          if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(1, __value)
          }
        };
        
        {
          val __value = baseTarget
          if (__value != 0L) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(2, __value)
          }
        };
        
        {
          val __value = generationSignature
          if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(3, __value)
          }
        };
        if(featureVotes.nonEmpty) {
          val __localsize = featureVotesSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        
        {
          val __value = timestamp
          if (__value != 0L) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(5, __value)
          }
        };
        
        {
          val __value = version
          if (__value != 0) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(6, __value)
          }
        };
        
        {
          val __value = generator
          if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(7, __value)
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
        {
          val __v = reference
          if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
            _output__.writeBytes(1, __v)
          }
        };
        {
          val __v = baseTarget
          if (__v != 0L) {
            _output__.writeInt64(2, __v)
          }
        };
        {
          val __v = generationSignature
          if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
            _output__.writeBytes(3, __v)
          }
        };
        if (featureVotes.nonEmpty) {
          _output__.writeTag(4, 2)
          _output__.writeUInt32NoTag(featureVotesSerializedSize)
          featureVotes.foreach(_output__.writeUInt32NoTag)
        };
        {
          val __v = timestamp
          if (__v != 0L) {
            _output__.writeInt64(5, __v)
          }
        };
        {
          val __v = version
          if (__v != 0) {
            _output__.writeInt32(6, __v)
          }
        };
        {
          val __v = generator
          if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
            _output__.writeBytes(7, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.wavesplatform.protobuf.block.Block.Header = {
        var __reference = this.reference
        var __baseTarget = this.baseTarget
        var __generationSignature = this.generationSignature
        val __featureVotes = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int] ++= this.featureVotes)
        var __timestamp = this.timestamp
        var __version = this.version
        var __generator = this.generator
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __reference = _input__.readBytes()
            case 16 =>
              __baseTarget = _input__.readInt64()
            case 26 =>
              __generationSignature = _input__.readBytes()
            case 32 =>
              __featureVotes += _input__.readUInt32()
            case 34 => {
              val length = _input__.readRawVarint32()
              val oldLimit = _input__.pushLimit(length)
              while (_input__.getBytesUntilLimit > 0) {
                __featureVotes += _input__.readUInt32
              }
              _input__.popLimit(oldLimit)
            }
            case 40 =>
              __timestamp = _input__.readInt64()
            case 48 =>
              __version = _input__.readInt32()
            case 58 =>
              __generator = _input__.readBytes()
            case tag => _input__.skipField(tag)
          }
        }
        com.wavesplatform.protobuf.block.Block.Header(
            reference = __reference,
            baseTarget = __baseTarget,
            generationSignature = __generationSignature,
            featureVotes = __featureVotes.result(),
            timestamp = __timestamp,
            version = __version,
            generator = __generator
        )
      }
      def withReference(__v: _root_.com.google.protobuf.ByteString): Header = copy(reference = __v)
      def withBaseTarget(__v: _root_.scala.Long): Header = copy(baseTarget = __v)
      def withGenerationSignature(__v: _root_.com.google.protobuf.ByteString): Header = copy(generationSignature = __v)
      def clearFeatureVotes = copy(featureVotes = _root_.scala.collection.Seq.empty)
      def addFeatureVotes(__vs: _root_.scala.Int*): Header = addAllFeatureVotes(__vs)
      def addAllFeatureVotes(__vs: TraversableOnce[_root_.scala.Int]): Header = copy(featureVotes = featureVotes ++ __vs)
      def withFeatureVotes(__v: _root_.scala.collection.Seq[_root_.scala.Int]): Header = copy(featureVotes = __v)
      def withTimestamp(__v: _root_.scala.Long): Header = copy(timestamp = __v)
      def withVersion(__v: _root_.scala.Int): Header = copy(version = __v)
      def withGenerator(__v: _root_.com.google.protobuf.ByteString): Header = copy(generator = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = reference
            if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
          }
          case 2 => {
            val __t = baseTarget
            if (__t != 0L) __t else null
          }
          case 3 => {
            val __t = generationSignature
            if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
          }
          case 4 => featureVotes
          case 5 => {
            val __t = timestamp
            if (__t != 0L) __t else null
          }
          case 6 => {
            val __t = version
            if (__t != 0) __t else null
          }
          case 7 => {
            val __t = generator
            if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PByteString(reference)
          case 2 => _root_.scalapb.descriptors.PLong(baseTarget)
          case 3 => _root_.scalapb.descriptors.PByteString(generationSignature)
          case 4 => _root_.scalapb.descriptors.PRepeated(featureVotes.map(_root_.scalapb.descriptors.PInt)(_root_.scala.collection.breakOut))
          case 5 => _root_.scalapb.descriptors.PLong(timestamp)
          case 6 => _root_.scalapb.descriptors.PInt(version)
          case 7 => _root_.scalapb.descriptors.PByteString(generator)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.wavesplatform.protobuf.block.Block.Header
  }
  
  object Header extends scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.block.Block.Header] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.wavesplatform.protobuf.block.Block.Header] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.wavesplatform.protobuf.block.Block.Header = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.wavesplatform.protobuf.block.Block.Header(
        __fieldsMap.getOrElse(__fields.get(0), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString],
        __fieldsMap.getOrElse(__fields.get(1), 0L).asInstanceOf[_root_.scala.Long],
        __fieldsMap.getOrElse(__fields.get(2), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString],
        __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Int]],
        __fieldsMap.getOrElse(__fields.get(4), 0L).asInstanceOf[_root_.scala.Long],
        __fieldsMap.getOrElse(__fields.get(5), 0).asInstanceOf[_root_.scala.Int],
        __fieldsMap.getOrElse(__fields.get(6), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.wavesplatform.protobuf.block.Block.Header] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.wavesplatform.protobuf.block.Block.Header(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.collection.Seq.empty),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Int]).getOrElse(0),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.wavesplatform.protobuf.block.Block.javaDescriptor.getNestedTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.wavesplatform.protobuf.block.Block.scalaDescriptor.nestedMessages(1)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.wavesplatform.protobuf.block.Block.Header(
    )
    implicit class HeaderLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.block.Block.Header]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.block.Block.Header](_l) {
      def reference: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.reference)((c_, f_) => c_.copy(reference = f_))
      def baseTarget: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.baseTarget)((c_, f_) => c_.copy(baseTarget = f_))
      def generationSignature: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.generationSignature)((c_, f_) => c_.copy(generationSignature = f_))
      def featureVotes: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Int]] = field(_.featureVotes)((c_, f_) => c_.copy(featureVotes = f_))
      def timestamp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.timestamp)((c_, f_) => c_.copy(timestamp = f_))
      def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.version)((c_, f_) => c_.copy(version = f_))
      def generator: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.generator)((c_, f_) => c_.copy(generator = f_))
    }
    final val REFERENCE_FIELD_NUMBER = 1
    final val BASETARGET_FIELD_NUMBER = 2
    final val GENERATIONSIGNATURE_FIELD_NUMBER = 3
    final val FEATUREVOTES_FIELD_NUMBER = 4
    final val TIMESTAMP_FIELD_NUMBER = 5
    final val VERSION_FIELD_NUMBER = 6
    final val GENERATOR_FIELD_NUMBER = 7
    def of(
      reference: _root_.com.google.protobuf.ByteString,
      baseTarget: _root_.scala.Long,
      generationSignature: _root_.com.google.protobuf.ByteString,
      featureVotes: _root_.scala.collection.Seq[_root_.scala.Int],
      timestamp: _root_.scala.Long,
      version: _root_.scala.Int,
      generator: _root_.com.google.protobuf.ByteString
    ): _root_.com.wavesplatform.protobuf.block.Block.Header = _root_.com.wavesplatform.protobuf.block.Block.Header(
      reference,
      baseTarget,
      generationSignature,
      featureVotes,
      timestamp,
      version,
      generator
    )
  }
  
  implicit class BlockLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.block.Block]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.wavesplatform.protobuf.block.Block](_l) {
    def chainId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.chainId)((c_, f_) => c_.copy(chainId = f_))
    def header: _root_.scalapb.lenses.Lens[UpperPB, com.wavesplatform.protobuf.block.Block.SignedHeader] = field(_.getHeader)((c_, f_) => c_.copy(header = Option(f_)))
    def optionalHeader: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.wavesplatform.protobuf.block.Block.SignedHeader]] = field(_.header)((c_, f_) => c_.copy(header = f_))
    def transactions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.wavesplatform.protobuf.transaction.SignedTransaction]] = field(_.transactions)((c_, f_) => c_.copy(transactions = f_))
  }
  final val CHAINID_FIELD_NUMBER = 1
  final val HEADER_FIELD_NUMBER = 2
  final val TRANSACTIONS_FIELD_NUMBER = 3
  def of(
    chainId: _root_.scala.Int,
    header: _root_.scala.Option[com.wavesplatform.protobuf.block.Block.SignedHeader],
    transactions: _root_.scala.collection.Seq[com.wavesplatform.protobuf.transaction.SignedTransaction]
  ): _root_.com.wavesplatform.protobuf.block.Block = _root_.com.wavesplatform.protobuf.block.Block(
    chainId,
    header,
    transactions
  )
}
