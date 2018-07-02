/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.sirolf2009.muse.ui.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ConnectionDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 625845055871302947L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ConnectionDetails\",\"namespace\":\"com.sirolf2009.muse.ui.model\",\"fields\":[{\"name\":\"Name\",\"type\":\"string\"},{\"name\":\"BootstrapServers\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"clientID\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ConnectionDetails> ENCODER =
      new BinaryMessageEncoder<ConnectionDetails>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ConnectionDetails> DECODER =
      new BinaryMessageDecoder<ConnectionDetails>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ConnectionDetails> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ConnectionDetails> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ConnectionDetails>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ConnectionDetails to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ConnectionDetails from a ByteBuffer. */
  public static ConnectionDetails fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence Name;
  @Deprecated public java.util.List<java.lang.CharSequence> BootstrapServers;
  @Deprecated public java.lang.CharSequence clientID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ConnectionDetails() {}

  /**
   * All-args constructor.
   * @param Name The new value for Name
   * @param BootstrapServers The new value for BootstrapServers
   * @param clientID The new value for clientID
   */
  public ConnectionDetails(java.lang.CharSequence Name, java.util.List<java.lang.CharSequence> BootstrapServers, java.lang.CharSequence clientID) {
    this.Name = Name;
    this.BootstrapServers = BootstrapServers;
    this.clientID = clientID;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Name;
    case 1: return BootstrapServers;
    case 2: return clientID;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Name = (java.lang.CharSequence)value$; break;
    case 1: BootstrapServers = (java.util.List<java.lang.CharSequence>)value$; break;
    case 2: clientID = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Name' field.
   * @return The value of the 'Name' field.
   */
  public java.lang.CharSequence getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'BootstrapServers' field.
   * @return The value of the 'BootstrapServers' field.
   */
  public java.util.List<java.lang.CharSequence> getBootstrapServers() {
    return BootstrapServers;
  }

  /**
   * Sets the value of the 'BootstrapServers' field.
   * @param value the value to set.
   */
  public void setBootstrapServers(java.util.List<java.lang.CharSequence> value) {
    this.BootstrapServers = value;
  }

  /**
   * Gets the value of the 'clientID' field.
   * @return The value of the 'clientID' field.
   */
  public java.lang.CharSequence getClientID() {
    return clientID;
  }

  /**
   * Sets the value of the 'clientID' field.
   * @param value the value to set.
   */
  public void setClientID(java.lang.CharSequence value) {
    this.clientID = value;
  }

  /**
   * Creates a new ConnectionDetails RecordBuilder.
   * @return A new ConnectionDetails RecordBuilder
   */
  public static com.sirolf2009.muse.ui.model.ConnectionDetails.Builder newBuilder() {
    return new com.sirolf2009.muse.ui.model.ConnectionDetails.Builder();
  }

  /**
   * Creates a new ConnectionDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ConnectionDetails RecordBuilder
   */
  public static com.sirolf2009.muse.ui.model.ConnectionDetails.Builder newBuilder(com.sirolf2009.muse.ui.model.ConnectionDetails.Builder other) {
    return new com.sirolf2009.muse.ui.model.ConnectionDetails.Builder(other);
  }

  /**
   * Creates a new ConnectionDetails RecordBuilder by copying an existing ConnectionDetails instance.
   * @param other The existing instance to copy.
   * @return A new ConnectionDetails RecordBuilder
   */
  public static com.sirolf2009.muse.ui.model.ConnectionDetails.Builder newBuilder(com.sirolf2009.muse.ui.model.ConnectionDetails other) {
    return new com.sirolf2009.muse.ui.model.ConnectionDetails.Builder(other);
  }

  /**
   * RecordBuilder for ConnectionDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ConnectionDetails>
    implements org.apache.avro.data.RecordBuilder<ConnectionDetails> {

    private java.lang.CharSequence Name;
    private java.util.List<java.lang.CharSequence> BootstrapServers;
    private java.lang.CharSequence clientID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.sirolf2009.muse.ui.model.ConnectionDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.BootstrapServers)) {
        this.BootstrapServers = data().deepCopy(fields()[1].schema(), other.BootstrapServers);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.clientID)) {
        this.clientID = data().deepCopy(fields()[2].schema(), other.clientID);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ConnectionDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.sirolf2009.muse.ui.model.ConnectionDetails other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.BootstrapServers)) {
        this.BootstrapServers = data().deepCopy(fields()[1].schema(), other.BootstrapServers);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.clientID)) {
        this.clientID = data().deepCopy(fields()[2].schema(), other.clientID);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'Name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return Name;
    }

    /**
      * Sets the value of the 'Name' field.
      * @param value The value of 'Name'.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.ConnectionDetails.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Name' field.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.ConnectionDetails.Builder clearName() {
      Name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'BootstrapServers' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getBootstrapServers() {
      return BootstrapServers;
    }

    /**
      * Sets the value of the 'BootstrapServers' field.
      * @param value The value of 'BootstrapServers'.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.ConnectionDetails.Builder setBootstrapServers(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.BootstrapServers = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'BootstrapServers' field has been set.
      * @return True if the 'BootstrapServers' field has been set, false otherwise.
      */
    public boolean hasBootstrapServers() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'BootstrapServers' field.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.ConnectionDetails.Builder clearBootstrapServers() {
      BootstrapServers = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'clientID' field.
      * @return The value.
      */
    public java.lang.CharSequence getClientID() {
      return clientID;
    }

    /**
      * Sets the value of the 'clientID' field.
      * @param value The value of 'clientID'.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.ConnectionDetails.Builder setClientID(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.clientID = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'clientID' field has been set.
      * @return True if the 'clientID' field has been set, false otherwise.
      */
    public boolean hasClientID() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'clientID' field.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.ConnectionDetails.Builder clearClientID() {
      clientID = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ConnectionDetails build() {
      try {
        ConnectionDetails record = new ConnectionDetails();
        record.Name = fieldSetFlags()[0] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.BootstrapServers = fieldSetFlags()[1] ? this.BootstrapServers : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        record.clientID = fieldSetFlags()[2] ? this.clientID : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ConnectionDetails>
    WRITER$ = (org.apache.avro.io.DatumWriter<ConnectionDetails>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ConnectionDetails>
    READER$ = (org.apache.avro.io.DatumReader<ConnectionDetails>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
