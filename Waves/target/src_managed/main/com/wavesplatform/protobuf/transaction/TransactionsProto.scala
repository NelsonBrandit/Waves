// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.wavesplatform.protobuf.transaction

object TransactionsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    com.wavesplatform.protobuf.transaction.ScriptProto,
    com.wavesplatform.protobuf.transaction.RecipientProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    com.wavesplatform.protobuf.transaction.AssetAmount,
    com.wavesplatform.protobuf.transaction.Amount,
    com.wavesplatform.protobuf.transaction.SignedTransaction,
    com.wavesplatform.protobuf.transaction.Transaction,
    com.wavesplatform.protobuf.transaction.GenesisTransactionData,
    com.wavesplatform.protobuf.transaction.PaymentTransactionData,
    com.wavesplatform.protobuf.transaction.TransferTransactionData,
    com.wavesplatform.protobuf.transaction.CreateAliasTransactionData,
    com.wavesplatform.protobuf.transaction.DataTransactionData,
    com.wavesplatform.protobuf.transaction.MassTransferTransactionData,
    com.wavesplatform.protobuf.transaction.LeaseTransactionData,
    com.wavesplatform.protobuf.transaction.LeaseCancelTransactionData,
    com.wavesplatform.protobuf.transaction.BurnTransactionData,
    com.wavesplatform.protobuf.transaction.IssueTransactionData,
    com.wavesplatform.protobuf.transaction.ReissueTransactionData,
    com.wavesplatform.protobuf.transaction.SetAssetScriptTransactionData,
    com.wavesplatform.protobuf.transaction.SetScriptTransactionData,
    com.wavesplatform.protobuf.transaction.ExchangeTransactionData,
    com.wavesplatform.protobuf.transaction.SponsorFeeTransactionData
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """ChJ0cmFuc2FjdGlvbnMucHJvdG8aDHNjcmlwdC5wcm90bxoPcmVjaXBpZW50LnByb3RvIloKC0Fzc2V0QW1vdW50EiYKB2Fzc
  2V0SWQYASABKAxCDOI/CRIHYXNzZXRJZFIHYXNzZXRJZBIjCgZhbW91bnQYAiABKANCC+I/CBIGYW1vdW50UgZhbW91bnQijAEKB
  kFtb3VudBI0Cgt3YXZlc0Ftb3VudBgBIAEoA0IQ4j8NEgt3YXZlc0Ftb3VudEgAUgt3YXZlc0Ftb3VudBJCCgthc3NldEFtb3Vud
  BgCIAEoCzIMLkFzc2V0QW1vdW50QhDiPw0SC2Fzc2V0QW1vdW50SABSC2Fzc2V0QW1vdW50QggKBmFtb3VudCJ6ChFTaWduZWRUc
  mFuc2FjdGlvbhJACgt0cmFuc2FjdGlvbhgBIAEoCzIMLlRyYW5zYWN0aW9uQhDiPw0SC3RyYW5zYWN0aW9uUgt0cmFuc2FjdGlvb
  hIjCgZwcm9vZnMYAiADKAxCC+I/CBIGcHJvb2ZzUgZwcm9vZnMiygoKC1RyYW5zYWN0aW9uEiYKB2NoYWluSWQYASABKAVCDOI/C
  RIHY2hhaW5JZFIHY2hhaW5JZBI+Cg9zZW5kZXJQdWJsaWNLZXkYAiABKAxCFOI/ERIPc2VuZGVyUHVibGljS2V5Ug9zZW5kZXJQd
  WJsaWNLZXkSIwoDZmVlGAMgASgLMgcuQW1vdW50QgjiPwUSA2ZlZVIDZmVlEiwKCXRpbWVzdGFtcBgEIAEoA0IO4j8LEgl0aW1lc
  3RhbXBSCXRpbWVzdGFtcBImCgd2ZXJzaW9uGAUgASgFQgziPwkSB3ZlcnNpb25SB3ZlcnNpb24SQQoHZ2VuZXNpcxhlIAEoCzIXL
  kdlbmVzaXNUcmFuc2FjdGlvbkRhdGFCDOI/CRIHZ2VuZXNpc0gAUgdnZW5lc2lzEkEKB3BheW1lbnQYZiABKAsyFy5QYXltZW50V
  HJhbnNhY3Rpb25EYXRhQgziPwkSB3BheW1lbnRIAFIHcGF5bWVudBI5CgVpc3N1ZRhnIAEoCzIVLklzc3VlVHJhbnNhY3Rpb25EY
  XRhQgriPwcSBWlzc3VlSABSBWlzc3VlEkUKCHRyYW5zZmVyGGggASgLMhguVHJhbnNmZXJUcmFuc2FjdGlvbkRhdGFCDeI/ChIId
  HJhbnNmZXJIAFIIdHJhbnNmZXISQQoHcmVpc3N1ZRhpIAEoCzIXLlJlaXNzdWVUcmFuc2FjdGlvbkRhdGFCDOI/CRIHcmVpc3N1Z
  UgAUgdyZWlzc3VlEjUKBGJ1cm4YaiABKAsyFC5CdXJuVHJhbnNhY3Rpb25EYXRhQgniPwYSBGJ1cm5IAFIEYnVybhJFCghleGNoY
  W5nZRhrIAEoCzIYLkV4Y2hhbmdlVHJhbnNhY3Rpb25EYXRhQg3iPwoSCGV4Y2hhbmdlSABSCGV4Y2hhbmdlEjkKBWxlYXNlGGwgA
  SgLMhUuTGVhc2VUcmFuc2FjdGlvbkRhdGFCCuI/BxIFbGVhc2VIAFIFbGVhc2USUQoLbGVhc2VDYW5jZWwYbSABKAsyGy5MZWFzZ
  UNhbmNlbFRyYW5zYWN0aW9uRGF0YUIQ4j8NEgtsZWFzZUNhbmNlbEgAUgtsZWFzZUNhbmNlbBJRCgtjcmVhdGVBbGlhcxhuIAEoC
  zIbLkNyZWF0ZUFsaWFzVHJhbnNhY3Rpb25EYXRhQhDiPw0SC2NyZWF0ZUFsaWFzSABSC2NyZWF0ZUFsaWFzElUKDG1hc3NUcmFuc
  2ZlchhvIAEoCzIcLk1hc3NUcmFuc2ZlclRyYW5zYWN0aW9uRGF0YUIR4j8OEgxtYXNzVHJhbnNmZXJIAFIMbWFzc1RyYW5zZmVyE
  lYKD2RhdGFUcmFuc2FjdGlvbhhwIAEoCzIULkRhdGFUcmFuc2FjdGlvbkRhdGFCFOI/ERIPZGF0YVRyYW5zYWN0aW9uSABSD2Rhd
  GFUcmFuc2FjdGlvbhJJCglzZXRTY3JpcHQYcSABKAsyGS5TZXRTY3JpcHRUcmFuc2FjdGlvbkRhdGFCDuI/CxIJc2V0U2NyaXB0S
  ABSCXNldFNjcmlwdBJNCgpzcG9uc29yRmVlGHIgASgLMhouU3BvbnNvckZlZVRyYW5zYWN0aW9uRGF0YUIP4j8MEgpzcG9uc29yR
  mVlSABSCnNwb25zb3JGZWUSXQoOc2V0QXNzZXRTY3JpcHQYcyABKAsyHi5TZXRBc3NldFNjcmlwdFRyYW5zYWN0aW9uRGF0YUIT4
  j8QEg5zZXRBc3NldFNjcmlwdEgAUg5zZXRBc3NldFNjcmlwdEIGCgRkYXRhIoABChZHZW5lc2lzVHJhbnNhY3Rpb25EYXRhEkEKE
  HJlY2lwaWVudEFkZHJlc3MYASABKAxCFeI/EhIQcmVjaXBpZW50QWRkcmVzc1IQcmVjaXBpZW50QWRkcmVzcxIjCgZhbW91bnQYA
  iABKANCC+I/CBIGYW1vdW50UgZhbW91bnQiZQoWUGF5bWVudFRyYW5zYWN0aW9uRGF0YRImCgdhZGRyZXNzGAEgASgMQgziPwkSB
  2FkZHJlc3NSB2FkZHJlc3MSIwoGYW1vdW50GAIgASgDQgviPwgSBmFtb3VudFIGYW1vdW50IrIBChdUcmFuc2ZlclRyYW5zYWN0a
  W9uRGF0YRI4CglyZWNpcGllbnQYASABKAsyCi5SZWNpcGllbnRCDuI/CxIJcmVjaXBpZW50UglyZWNpcGllbnQSLAoGYW1vdW50G
  AIgASgLMgcuQW1vdW50QgviPwgSBmFtb3VudFIGYW1vdW50Ei8KCmF0dGFjaG1lbnQYAyABKAxCD+I/DBIKYXR0YWNobWVudFIKY
  XR0YWNobWVudCI+ChpDcmVhdGVBbGlhc1RyYW5zYWN0aW9uRGF0YRIgCgVhbGlhcxgBIAEoCUIK4j8HEgVhbGlhc1IFYWxpYXMi0
  AIKE0RhdGFUcmFuc2FjdGlvbkRhdGESPQoEZGF0YRgBIAMoCzIeLkRhdGFUcmFuc2FjdGlvbkRhdGEuRGF0YUVudHJ5QgniPwYSB
  GRhdGFSBGRhdGEa+QEKCURhdGFFbnRyeRIaCgNrZXkYASABKAlCCOI/BRIDa2V5UgNrZXkSKwoIaW50VmFsdWUYCiABKANCDeI/C
  hIIaW50VmFsdWVIAFIIaW50VmFsdWUSLgoJYm9vbFZhbHVlGAsgASgIQg7iPwsSCWJvb2xWYWx1ZUgAUglib29sVmFsdWUSNAoLY
  mluYXJ5VmFsdWUYDCABKAxCEOI/DRILYmluYXJ5VmFsdWVIAFILYmluYXJ5VmFsdWUSNAoLc3RyaW5nVmFsdWUYDSABKAlCEOI/D
  RILc3RyaW5nVmFsdWVIAFILc3RyaW5nVmFsdWVCBwoFdmFsdWUisAIKG01hc3NUcmFuc2ZlclRyYW5zYWN0aW9uRGF0YRImCgdhc
  3NldElkGAEgASgMQgziPwkSB2Fzc2V0SWRSB2Fzc2V0SWQSUwoJdHJhbnNmZXJzGAIgAygLMiUuTWFzc1RyYW5zZmVyVHJhbnNhY
  3Rpb25EYXRhLlRyYW5zZmVyQg7iPwsSCXRyYW5zZmVyc1IJdHJhbnNmZXJzEi8KCmF0dGFjaG1lbnQYAyABKAxCD+I/DBIKYXR0Y
  WNobWVudFIKYXR0YWNobWVudBpjCghUcmFuc2ZlchIyCgdhZGRyZXNzGAEgASgLMgouUmVjaXBpZW50QgziPwkSB2FkZHJlc3NSB
  2FkZHJlc3MSIwoGYW1vdW50GAIgASgDQgviPwgSBmFtb3VudFIGYW1vdW50InUKFExlYXNlVHJhbnNhY3Rpb25EYXRhEjgKCXJlY
  2lwaWVudBgBIAEoCzIKLlJlY2lwaWVudEIO4j8LEglyZWNpcGllbnRSCXJlY2lwaWVudBIjCgZhbW91bnQYAiABKANCC+I/CBIGY
  W1vdW50UgZhbW91bnQiRAoaTGVhc2VDYW5jZWxUcmFuc2FjdGlvbkRhdGESJgoHbGVhc2VJZBgBIAEoDEIM4j8JEgdsZWFzZUlkU
  gdsZWFzZUlkIlcKE0J1cm5UcmFuc2FjdGlvbkRhdGESQAoLYXNzZXRBbW91bnQYASABKAsyDC5Bc3NldEFtb3VudEIQ4j8NEgthc
  3NldEFtb3VudFILYXNzZXRBbW91bnQimAIKFElzc3VlVHJhbnNhY3Rpb25EYXRhEh0KBG5hbWUYASABKAxCCeI/BhIEbmFtZVIEb
  mFtZRIyCgtkZXNjcmlwdGlvbhgCIAEoDEIQ4j8NEgtkZXNjcmlwdGlvblILZGVzY3JpcHRpb24SIwoGYW1vdW50GAMgASgDQgviP
  wgSBmFtb3VudFIGYW1vdW50EikKCGRlY2ltYWxzGAQgASgFQg3iPwoSCGRlY2ltYWxzUghkZWNpbWFscxIvCgpyZWlzc3VhYmxlG
  AUgASgIQg/iPwwSCnJlaXNzdWFibGVSCnJlaXNzdWFibGUSLAoGc2NyaXB0GAYgASgLMgcuU2NyaXB0QgviPwgSBnNjcmlwdFIGc
  2NyaXB0IosBChZSZWlzc3VlVHJhbnNhY3Rpb25EYXRhEkAKC2Fzc2V0QW1vdW50GAEgASgLMgwuQXNzZXRBbW91bnRCEOI/DRILY
  XNzZXRBbW91bnRSC2Fzc2V0QW1vdW50Ei8KCnJlaXNzdWFibGUYAiABKAhCD+I/DBIKcmVpc3N1YWJsZVIKcmVpc3N1YWJsZSJ1C
  h1TZXRBc3NldFNjcmlwdFRyYW5zYWN0aW9uRGF0YRImCgdhc3NldElkGAEgASgMQgziPwkSB2Fzc2V0SWRSB2Fzc2V0SWQSLAoGc
  2NyaXB0GAIgASgLMgcuU2NyaXB0QgviPwgSBnNjcmlwdFIGc2NyaXB0IkgKGFNldFNjcmlwdFRyYW5zYWN0aW9uRGF0YRIsCgZzY
  3JpcHQYAiABKAsyBy5TY3JpcHRCC+I/CBIGc2NyaXB0UgZzY3JpcHQivQwKF0V4Y2hhbmdlVHJhbnNhY3Rpb25EYXRhEmIKDWJ1e
  VNlbGxPcmRlcnMYASABKAsyJi5FeGNoYW5nZVRyYW5zYWN0aW9uRGF0YS5CdXlTZWxsT3JkZXJzQhLiPw8SDWJ1eVNlbGxPcmRlc
  nNIAFINYnV5U2VsbE9yZGVycxJuChBtYWtlclRha2VyT3JkZXJzGAIgASgLMikuRXhjaGFuZ2VUcmFuc2FjdGlvbkRhdGEuTWFrZ
  XJUYWtlck9yZGVyc0IV4j8SEhBtYWtlclRha2VyT3JkZXJzSABSEG1ha2VyVGFrZXJPcmRlcnMSIwoGYW1vdW50GAMgASgDQgviP
  wgSBmFtb3VudFIGYW1vdW50EiAKBXByaWNlGAQgASgDQgriPwcSBXByaWNlUgVwcmljZRI4Cg1idXlNYXRjaGVyRmVlGAUgASgDQ
  hLiPw8SDWJ1eU1hdGNoZXJGZWVSDWJ1eU1hdGNoZXJGZWUSOwoOc2VsbE1hdGNoZXJGZWUYBiABKANCE+I/EBIOc2VsbE1hdGNoZ
  XJGZWVSDnNlbGxNYXRjaGVyRmVlGqgBCg1CdXlTZWxsT3JkZXJzEkkKCGJ1eU9yZGVyGAEgASgLMh4uRXhjaGFuZ2VUcmFuc2Fjd
  GlvbkRhdGEuT3JkZXJCDeI/ChIIYnV5T3JkZXJSCGJ1eU9yZGVyEkwKCXNlbGxPcmRlchgCIAEoCzIeLkV4Y2hhbmdlVHJhbnNhY
  3Rpb25EYXRhLk9yZGVyQg7iPwsSCXNlbGxPcmRlclIJc2VsbE9yZGVyGrQBChBNYWtlclRha2VyT3JkZXJzEk8KCm1ha2VyT3JkZ
  XIYASABKAsyHi5FeGNoYW5nZVRyYW5zYWN0aW9uRGF0YS5PcmRlckIP4j8MEgptYWtlck9yZGVyUgptYWtlck9yZGVyEk8KCnRha
  2VyT3JkZXIYAiABKAsyHi5FeGNoYW5nZVRyYW5zYWN0aW9uRGF0YS5PcmRlckIP4j8MEgp0YWtlck9yZGVyUgp0YWtlck9yZGVyG
  qMGCgVPcmRlchImCgdjaGFpbklkGAEgASgFQgziPwkSB2NoYWluSWRSB2NoYWluSWQSPgoPc2VuZGVyUHVibGljS2V5GAIgASgMQ
  hTiPxESD3NlbmRlclB1YmxpY0tleVIPc2VuZGVyUHVibGljS2V5EkEKEG1hdGNoZXJQdWJsaWNLZXkYAyABKAxCFeI/EhIQbWF0Y
  2hlclB1YmxpY0tleVIQbWF0Y2hlclB1YmxpY0tleRJWCglhc3NldFBhaXIYBCABKAsyKC5FeGNoYW5nZVRyYW5zYWN0aW9uRGF0Y
  S5PcmRlci5Bc3NldFBhaXJCDuI/CxIJYXNzZXRQYWlyUglhc3NldFBhaXISUQoJb3JkZXJTaWRlGAUgASgOMiMuRXhjaGFuZ2VUc
  mFuc2FjdGlvbkRhdGEuT3JkZXIuU2lkZUIO4j8LEglvcmRlclNpZGVSCW9yZGVyU2lkZRIjCgZhbW91bnQYBiABKANCC+I/CBIGY
  W1vdW50UgZhbW91bnQSIAoFcHJpY2UYByABKANCCuI/BxIFcHJpY2VSBXByaWNlEiwKCXRpbWVzdGFtcBgIIAEoA0IO4j8LEgl0a
  W1lc3RhbXBSCXRpbWVzdGFtcBIvCgpleHBpcmF0aW9uGAkgASgDQg/iPwwSCmV4cGlyYXRpb25SCmV4cGlyYXRpb24SOAoKbWF0Y
  2hlckZlZRgKIAEoCzIHLkFtb3VudEIP4j8MEgptYXRjaGVyRmVlUgptYXRjaGVyRmVlEiYKB3ZlcnNpb24YCyABKAVCDOI/CRIHd
  mVyc2lvblIHdmVyc2lvbhIjCgZwcm9vZnMYDCADKAxCC+I/CBIGcHJvb2ZzUgZwcm9vZnMafAoJQXNzZXRQYWlyEjgKDWFtb3Vud
  EFzc2V0SWQYASABKAxCEuI/DxINYW1vdW50QXNzZXRJZFINYW1vdW50QXNzZXRJZBI1CgxwcmljZUFzc2V0SWQYAiABKAxCEeI/D
  hIMcHJpY2VBc3NldElkUgxwcmljZUFzc2V0SWQiGQoEU2lkZRIHCgNCVVkQABIICgRTRUxMEAFCCAoGb3JkZXJzIk4KGVNwb25zb
  3JGZWVUcmFuc2FjdGlvbkRhdGESMQoGbWluRmVlGAEgASgLMgwuQXNzZXRBbW91bnRCC+I/CBIGbWluRmVlUgZtaW5GZWVCKAomY
  29tLndhdmVzcGxhdGZvcm0ucHJvdG9idWYudHJhbnNhY3Rpb25iBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
      com.wavesplatform.protobuf.transaction.ScriptProto.javaDescriptor,
      com.wavesplatform.protobuf.transaction.RecipientProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}