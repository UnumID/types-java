// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proof.proto

package crypto.v1;

/**
 * <pre>
 **
 * Object to encapsulate cryptographic proof for any signed object: Credentials, Presentations, PresentationRequests.
 * </pre>
 *
 * Protobuf type {@code crypto.v1.Proof}
 */
public  final class Proof extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:crypto.v1.Proof)
    ProofOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Proof.newBuilder() to construct.
  private Proof(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Proof() {
    signatureValue_ = "";
    type_ = "";
    verificationMethod_ = "";
    proofPurpose_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Proof(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            signatureValue_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            verificationMethod_ = s;
            break;
          }
          case 34: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (created_ != null) {
              subBuilder = created_.toBuilder();
            }
            created_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(created_);
              created_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            proofPurpose_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return crypto.v1.ProofProto.internal_static_crypto_v1_Proof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return crypto.v1.ProofProto.internal_static_crypto_v1_Proof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            crypto.v1.Proof.class, crypto.v1.Proof.Builder.class);
  }

  public static final int SIGNATURE_VALUE_FIELD_NUMBER = 1;
  private volatile java.lang.Object signatureValue_;
  /**
   * <code>string signature_value = 1;</code>
   */
  public java.lang.String getSignatureValue() {
    java.lang.Object ref = signatureValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signatureValue_ = s;
      return s;
    }
  }
  /**
   * <code>string signature_value = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSignatureValueBytes() {
    java.lang.Object ref = signatureValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signatureValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 2;</code>
   */
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERIFICATION_METHOD_FIELD_NUMBER = 3;
  private volatile java.lang.Object verificationMethod_;
  /**
   * <code>string verification_method = 3;</code>
   */
  public java.lang.String getVerificationMethod() {
    java.lang.Object ref = verificationMethod_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      verificationMethod_ = s;
      return s;
    }
  }
  /**
   * <code>string verification_method = 3;</code>
   */
  public com.google.protobuf.ByteString
      getVerificationMethodBytes() {
    java.lang.Object ref = verificationMethod_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      verificationMethod_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp created_;
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   */
  public boolean hasCreated() {
    return created_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   */
  public com.google.protobuf.Timestamp getCreated() {
    return created_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : created_;
  }
  /**
   * <code>.google.protobuf.Timestamp created = 4;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder() {
    return getCreated();
  }

  public static final int PROOF_PURPOSE_FIELD_NUMBER = 5;
  private volatile java.lang.Object proofPurpose_;
  /**
   * <code>string proof_purpose = 5;</code>
   */
  public java.lang.String getProofPurpose() {
    java.lang.Object ref = proofPurpose_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proofPurpose_ = s;
      return s;
    }
  }
  /**
   * <code>string proof_purpose = 5;</code>
   */
  public com.google.protobuf.ByteString
      getProofPurposeBytes() {
    java.lang.Object ref = proofPurpose_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      proofPurpose_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSignatureValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, signatureValue_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (!getVerificationMethodBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, verificationMethod_);
    }
    if (created_ != null) {
      output.writeMessage(4, getCreated());
    }
    if (!getProofPurposeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, proofPurpose_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSignatureValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, signatureValue_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (!getVerificationMethodBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, verificationMethod_);
    }
    if (created_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCreated());
    }
    if (!getProofPurposeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, proofPurpose_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof crypto.v1.Proof)) {
      return super.equals(obj);
    }
    crypto.v1.Proof other = (crypto.v1.Proof) obj;

    boolean result = true;
    result = result && getSignatureValue()
        .equals(other.getSignatureValue());
    result = result && getType()
        .equals(other.getType());
    result = result && getVerificationMethod()
        .equals(other.getVerificationMethod());
    result = result && (hasCreated() == other.hasCreated());
    if (hasCreated()) {
      result = result && getCreated()
          .equals(other.getCreated());
    }
    result = result && getProofPurpose()
        .equals(other.getProofPurpose());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SIGNATURE_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getSignatureValue().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + VERIFICATION_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getVerificationMethod().hashCode();
    if (hasCreated()) {
      hash = (37 * hash) + CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getCreated().hashCode();
    }
    hash = (37 * hash) + PROOF_PURPOSE_FIELD_NUMBER;
    hash = (53 * hash) + getProofPurpose().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static crypto.v1.Proof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static crypto.v1.Proof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static crypto.v1.Proof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static crypto.v1.Proof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static crypto.v1.Proof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static crypto.v1.Proof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static crypto.v1.Proof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static crypto.v1.Proof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static crypto.v1.Proof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static crypto.v1.Proof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static crypto.v1.Proof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static crypto.v1.Proof parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(crypto.v1.Proof prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * Object to encapsulate cryptographic proof for any signed object: Credentials, Presentations, PresentationRequests.
   * </pre>
   *
   * Protobuf type {@code crypto.v1.Proof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:crypto.v1.Proof)
      crypto.v1.ProofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return crypto.v1.ProofProto.internal_static_crypto_v1_Proof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return crypto.v1.ProofProto.internal_static_crypto_v1_Proof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              crypto.v1.Proof.class, crypto.v1.Proof.Builder.class);
    }

    // Construct using crypto.v1.Proof.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      signatureValue_ = "";

      type_ = "";

      verificationMethod_ = "";

      if (createdBuilder_ == null) {
        created_ = null;
      } else {
        created_ = null;
        createdBuilder_ = null;
      }
      proofPurpose_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return crypto.v1.ProofProto.internal_static_crypto_v1_Proof_descriptor;
    }

    @java.lang.Override
    public crypto.v1.Proof getDefaultInstanceForType() {
      return crypto.v1.Proof.getDefaultInstance();
    }

    @java.lang.Override
    public crypto.v1.Proof build() {
      crypto.v1.Proof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public crypto.v1.Proof buildPartial() {
      crypto.v1.Proof result = new crypto.v1.Proof(this);
      result.signatureValue_ = signatureValue_;
      result.type_ = type_;
      result.verificationMethod_ = verificationMethod_;
      if (createdBuilder_ == null) {
        result.created_ = created_;
      } else {
        result.created_ = createdBuilder_.build();
      }
      result.proofPurpose_ = proofPurpose_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof crypto.v1.Proof) {
        return mergeFrom((crypto.v1.Proof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(crypto.v1.Proof other) {
      if (other == crypto.v1.Proof.getDefaultInstance()) return this;
      if (!other.getSignatureValue().isEmpty()) {
        signatureValue_ = other.signatureValue_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getVerificationMethod().isEmpty()) {
        verificationMethod_ = other.verificationMethod_;
        onChanged();
      }
      if (other.hasCreated()) {
        mergeCreated(other.getCreated());
      }
      if (!other.getProofPurpose().isEmpty()) {
        proofPurpose_ = other.proofPurpose_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      crypto.v1.Proof parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (crypto.v1.Proof) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object signatureValue_ = "";
    /**
     * <code>string signature_value = 1;</code>
     */
    public java.lang.String getSignatureValue() {
      java.lang.Object ref = signatureValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signatureValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string signature_value = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSignatureValueBytes() {
      java.lang.Object ref = signatureValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signatureValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string signature_value = 1;</code>
     */
    public Builder setSignatureValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      signatureValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string signature_value = 1;</code>
     */
    public Builder clearSignatureValue() {
      
      signatureValue_ = getDefaultInstance().getSignatureValue();
      onChanged();
      return this;
    }
    /**
     * <code>string signature_value = 1;</code>
     */
    public Builder setSignatureValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      signatureValue_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object verificationMethod_ = "";
    /**
     * <code>string verification_method = 3;</code>
     */
    public java.lang.String getVerificationMethod() {
      java.lang.Object ref = verificationMethod_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        verificationMethod_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string verification_method = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVerificationMethodBytes() {
      java.lang.Object ref = verificationMethod_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        verificationMethod_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string verification_method = 3;</code>
     */
    public Builder setVerificationMethod(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      verificationMethod_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string verification_method = 3;</code>
     */
    public Builder clearVerificationMethod() {
      
      verificationMethod_ = getDefaultInstance().getVerificationMethod();
      onChanged();
      return this;
    }
    /**
     * <code>string verification_method = 3;</code>
     */
    public Builder setVerificationMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      verificationMethod_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp created_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> createdBuilder_;
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public boolean hasCreated() {
      return createdBuilder_ != null || created_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public com.google.protobuf.Timestamp getCreated() {
      if (createdBuilder_ == null) {
        return created_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : created_;
      } else {
        return createdBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder setCreated(com.google.protobuf.Timestamp value) {
      if (createdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        created_ = value;
        onChanged();
      } else {
        createdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder setCreated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (createdBuilder_ == null) {
        created_ = builderForValue.build();
        onChanged();
      } else {
        createdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder mergeCreated(com.google.protobuf.Timestamp value) {
      if (createdBuilder_ == null) {
        if (created_ != null) {
          created_ =
            com.google.protobuf.Timestamp.newBuilder(created_).mergeFrom(value).buildPartial();
        } else {
          created_ = value;
        }
        onChanged();
      } else {
        createdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public Builder clearCreated() {
      if (createdBuilder_ == null) {
        created_ = null;
        onChanged();
      } else {
        created_ = null;
        createdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreatedBuilder() {
      
      onChanged();
      return getCreatedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder() {
      if (createdBuilder_ != null) {
        return createdBuilder_.getMessageOrBuilder();
      } else {
        return created_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : created_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp created = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreatedFieldBuilder() {
      if (createdBuilder_ == null) {
        createdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreated(),
                getParentForChildren(),
                isClean());
        created_ = null;
      }
      return createdBuilder_;
    }

    private java.lang.Object proofPurpose_ = "";
    /**
     * <code>string proof_purpose = 5;</code>
     */
    public java.lang.String getProofPurpose() {
      java.lang.Object ref = proofPurpose_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proofPurpose_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string proof_purpose = 5;</code>
     */
    public com.google.protobuf.ByteString
        getProofPurposeBytes() {
      java.lang.Object ref = proofPurpose_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        proofPurpose_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string proof_purpose = 5;</code>
     */
    public Builder setProofPurpose(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      proofPurpose_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string proof_purpose = 5;</code>
     */
    public Builder clearProofPurpose() {
      
      proofPurpose_ = getDefaultInstance().getProofPurpose();
      onChanged();
      return this;
    }
    /**
     * <code>string proof_purpose = 5;</code>
     */
    public Builder setProofPurposeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      proofPurpose_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:crypto.v1.Proof)
  }

  // @@protoc_insertion_point(class_scope:crypto.v1.Proof)
  private static final crypto.v1.Proof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new crypto.v1.Proof();
  }

  public static crypto.v1.Proof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Proof>
      PARSER = new com.google.protobuf.AbstractParser<Proof>() {
    @java.lang.Override
    public Proof parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Proof(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Proof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Proof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public crypto.v1.Proof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

