// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: nts_protobuf/OrderData.proto

package org.nts.protobuf;

/**
 * Protobuf type {@code org.nts.protobuf.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.nts.protobuf.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    instrumentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Order();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Order(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            orderId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            instrumentId_ = s;
            break;
          }
          case 25: {

            qty_ = input.readDouble();
            break;
          }
          case 33: {

            limitPrice_ = input.readDouble();
            break;
          }
          case 41: {

            marketPrice_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return org.nts.protobuf.OrderData.internal_static_org_nts_protobuf_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.nts.protobuf.OrderData.internal_static_org_nts_protobuf_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.nts.protobuf.Order.class, org.nts.protobuf.Order.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private long orderId_;
  /**
   * <code>uint64 OrderId = 1;</code>
   * @return The orderId.
   */
  @java.lang.Override
  public long getOrderId() {
    return orderId_;
  }

  public static final int INSTRUMENTID_FIELD_NUMBER = 2;
  private volatile java.lang.Object instrumentId_;
  /**
   * <code>string instrumentId = 2;</code>
   * @return The instrumentId.
   */
  @java.lang.Override
  public java.lang.String getInstrumentId() {
    java.lang.Object ref = instrumentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instrumentId_ = s;
      return s;
    }
  }
  /**
   * <code>string instrumentId = 2;</code>
   * @return The bytes for instrumentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstrumentIdBytes() {
    java.lang.Object ref = instrumentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instrumentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QTY_FIELD_NUMBER = 3;
  private double qty_;
  /**
   * <code>double qty = 3;</code>
   * @return The qty.
   */
  @java.lang.Override
  public double getQty() {
    return qty_;
  }

  public static final int LIMIT_PRICE_FIELD_NUMBER = 4;
  private double limitPrice_;
  /**
   * <code>double limit_price = 4;</code>
   * @return The limitPrice.
   */
  @java.lang.Override
  public double getLimitPrice() {
    return limitPrice_;
  }

  public static final int MARKET_PRICE_FIELD_NUMBER = 5;
  private double marketPrice_;
  /**
   * <code>double market_price = 5;</code>
   * @return The marketPrice.
   */
  @java.lang.Override
  public double getMarketPrice() {
    return marketPrice_;
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
    if (orderId_ != 0L) {
      output.writeUInt64(1, orderId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instrumentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instrumentId_);
    }
    if (java.lang.Double.doubleToRawLongBits(qty_) != 0) {
      output.writeDouble(3, qty_);
    }
    if (java.lang.Double.doubleToRawLongBits(limitPrice_) != 0) {
      output.writeDouble(4, limitPrice_);
    }
    if (java.lang.Double.doubleToRawLongBits(marketPrice_) != 0) {
      output.writeDouble(5, marketPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (orderId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, orderId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(instrumentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instrumentId_);
    }
    if (java.lang.Double.doubleToRawLongBits(qty_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, qty_);
    }
    if (java.lang.Double.doubleToRawLongBits(limitPrice_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, limitPrice_);
    }
    if (java.lang.Double.doubleToRawLongBits(marketPrice_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, marketPrice_);
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
    if (!(obj instanceof org.nts.protobuf.Order)) {
      return super.equals(obj);
    }
    org.nts.protobuf.Order other = (org.nts.protobuf.Order) obj;

    if (getOrderId()
        != other.getOrderId()) return false;
    if (!getInstrumentId()
        .equals(other.getInstrumentId())) return false;
    if (java.lang.Double.doubleToLongBits(getQty())
        != java.lang.Double.doubleToLongBits(
            other.getQty())) return false;
    if (java.lang.Double.doubleToLongBits(getLimitPrice())
        != java.lang.Double.doubleToLongBits(
            other.getLimitPrice())) return false;
    if (java.lang.Double.doubleToLongBits(getMarketPrice())
        != java.lang.Double.doubleToLongBits(
            other.getMarketPrice())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrderId());
    hash = (37 * hash) + INSTRUMENTID_FIELD_NUMBER;
    hash = (53 * hash) + getInstrumentId().hashCode();
    hash = (37 * hash) + QTY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getQty()));
    hash = (37 * hash) + LIMIT_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLimitPrice()));
    hash = (37 * hash) + MARKET_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMarketPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.nts.protobuf.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.nts.protobuf.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.nts.protobuf.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.nts.protobuf.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.nts.protobuf.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.nts.protobuf.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.nts.protobuf.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.nts.protobuf.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.nts.protobuf.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.nts.protobuf.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.nts.protobuf.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.nts.protobuf.Order parseFrom(
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
  public static Builder newBuilder(org.nts.protobuf.Order prototype) {
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
   * Protobuf type {@code org.nts.protobuf.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.nts.protobuf.Order)
      org.nts.protobuf.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.nts.protobuf.OrderData.internal_static_org_nts_protobuf_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.nts.protobuf.OrderData.internal_static_org_nts_protobuf_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.nts.protobuf.Order.class, org.nts.protobuf.Order.Builder.class);
    }

    // Construct using org.nts.protobuf.Order.newBuilder()
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
      orderId_ = 0L;

      instrumentId_ = "";

      qty_ = 0D;

      limitPrice_ = 0D;

      marketPrice_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.nts.protobuf.OrderData.internal_static_org_nts_protobuf_Order_descriptor;
    }

    @java.lang.Override
    public org.nts.protobuf.Order getDefaultInstanceForType() {
      return org.nts.protobuf.Order.getDefaultInstance();
    }

    @java.lang.Override
    public org.nts.protobuf.Order build() {
      org.nts.protobuf.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.nts.protobuf.Order buildPartial() {
      org.nts.protobuf.Order result = new org.nts.protobuf.Order(this);
      result.orderId_ = orderId_;
      result.instrumentId_ = instrumentId_;
      result.qty_ = qty_;
      result.limitPrice_ = limitPrice_;
      result.marketPrice_ = marketPrice_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.nts.protobuf.Order) {
        return mergeFrom((org.nts.protobuf.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.nts.protobuf.Order other) {
      if (other == org.nts.protobuf.Order.getDefaultInstance()) return this;
      if (other.getOrderId() != 0L) {
        setOrderId(other.getOrderId());
      }
      if (!other.getInstrumentId().isEmpty()) {
        instrumentId_ = other.instrumentId_;
        onChanged();
      }
      if (other.getQty() != 0D) {
        setQty(other.getQty());
      }
      if (other.getLimitPrice() != 0D) {
        setLimitPrice(other.getLimitPrice());
      }
      if (other.getMarketPrice() != 0D) {
        setMarketPrice(other.getMarketPrice());
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
      org.nts.protobuf.Order parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.nts.protobuf.Order) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long orderId_ ;
    /**
     * <code>uint64 OrderId = 1;</code>
     * @return The orderId.
     */
    @java.lang.Override
    public long getOrderId() {
      return orderId_;
    }
    /**
     * <code>uint64 OrderId = 1;</code>
     * @param value The orderId to set.
     * @return This builder for chaining.
     */
    public Builder setOrderId(long value) {
      
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 OrderId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderId() {
      
      orderId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object instrumentId_ = "";
    /**
     * <code>string instrumentId = 2;</code>
     * @return The instrumentId.
     */
    public java.lang.String getInstrumentId() {
      java.lang.Object ref = instrumentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instrumentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string instrumentId = 2;</code>
     * @return The bytes for instrumentId.
     */
    public com.google.protobuf.ByteString
        getInstrumentIdBytes() {
      java.lang.Object ref = instrumentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instrumentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string instrumentId = 2;</code>
     * @param value The instrumentId to set.
     * @return This builder for chaining.
     */
    public Builder setInstrumentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instrumentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string instrumentId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstrumentId() {
      
      instrumentId_ = getDefaultInstance().getInstrumentId();
      onChanged();
      return this;
    }
    /**
     * <code>string instrumentId = 2;</code>
     * @param value The bytes for instrumentId to set.
     * @return This builder for chaining.
     */
    public Builder setInstrumentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instrumentId_ = value;
      onChanged();
      return this;
    }

    private double qty_ ;
    /**
     * <code>double qty = 3;</code>
     * @return The qty.
     */
    @java.lang.Override
    public double getQty() {
      return qty_;
    }
    /**
     * <code>double qty = 3;</code>
     * @param value The qty to set.
     * @return This builder for chaining.
     */
    public Builder setQty(double value) {
      
      qty_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double qty = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQty() {
      
      qty_ = 0D;
      onChanged();
      return this;
    }

    private double limitPrice_ ;
    /**
     * <code>double limit_price = 4;</code>
     * @return The limitPrice.
     */
    @java.lang.Override
    public double getLimitPrice() {
      return limitPrice_;
    }
    /**
     * <code>double limit_price = 4;</code>
     * @param value The limitPrice to set.
     * @return This builder for chaining.
     */
    public Builder setLimitPrice(double value) {
      
      limitPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double limit_price = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimitPrice() {
      
      limitPrice_ = 0D;
      onChanged();
      return this;
    }

    private double marketPrice_ ;
    /**
     * <code>double market_price = 5;</code>
     * @return The marketPrice.
     */
    @java.lang.Override
    public double getMarketPrice() {
      return marketPrice_;
    }
    /**
     * <code>double market_price = 5;</code>
     * @param value The marketPrice to set.
     * @return This builder for chaining.
     */
    public Builder setMarketPrice(double value) {
      
      marketPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double market_price = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearMarketPrice() {
      
      marketPrice_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.nts.protobuf.Order)
  }

  // @@protoc_insertion_point(class_scope:org.nts.protobuf.Order)
  private static final org.nts.protobuf.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.nts.protobuf.Order();
  }

  public static org.nts.protobuf.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Order(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.nts.protobuf.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

