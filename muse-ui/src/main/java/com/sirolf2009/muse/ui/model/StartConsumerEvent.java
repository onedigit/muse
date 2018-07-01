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
public class StartConsumerEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7591604734929926278L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StartConsumerEvent\",\"namespace\":\"com.sirolf2009.muse.ui.model\",\"fields\":[{\"name\":\"ID\",\"type\":\"string\"},{\"name\":\"Topic\",\"type\":\"string\"},{\"name\":\"keyDeserializer\",\"type\":\"string\"},{\"name\":\"valueDeserializer\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<StartConsumerEvent> ENCODER =
      new BinaryMessageEncoder<StartConsumerEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<StartConsumerEvent> DECODER =
      new BinaryMessageDecoder<StartConsumerEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<StartConsumerEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<StartConsumerEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<StartConsumerEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this StartConsumerEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a StartConsumerEvent from a ByteBuffer. */
  public static StartConsumerEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence ID;
  @Deprecated public java.lang.CharSequence Topic;
  @Deprecated public java.lang.CharSequence keyDeserializer;
  @Deprecated public java.lang.CharSequence valueDeserializer;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StartConsumerEvent() {}

  /**
   * All-args constructor.
   * @param ID The new value for ID
   * @param Topic The new value for Topic
   * @param keyDeserializer The new value for keyDeserializer
   * @param valueDeserializer The new value for valueDeserializer
   */
  public StartConsumerEvent(java.lang.CharSequence ID, java.lang.CharSequence Topic, java.lang.CharSequence keyDeserializer, java.lang.CharSequence valueDeserializer) {
    this.ID = ID;
    this.Topic = Topic;
    this.keyDeserializer = keyDeserializer;
    this.valueDeserializer = valueDeserializer;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ID;
    case 1: return Topic;
    case 2: return keyDeserializer;
    case 3: return valueDeserializer;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ID = (java.lang.CharSequence)value$; break;
    case 1: Topic = (java.lang.CharSequence)value$; break;
    case 2: keyDeserializer = (java.lang.CharSequence)value$; break;
    case 3: valueDeserializer = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'ID' field.
   * @return The value of the 'ID' field.
   */
  public java.lang.CharSequence getID() {
    return ID;
  }

  /**
   * Sets the value of the 'ID' field.
   * @param value the value to set.
   */
  public void setID(java.lang.CharSequence value) {
    this.ID = value;
  }

  /**
   * Gets the value of the 'Topic' field.
   * @return The value of the 'Topic' field.
   */
  public java.lang.CharSequence getTopic() {
    return Topic;
  }

  /**
   * Sets the value of the 'Topic' field.
   * @param value the value to set.
   */
  public void setTopic(java.lang.CharSequence value) {
    this.Topic = value;
  }

  /**
   * Gets the value of the 'keyDeserializer' field.
   * @return The value of the 'keyDeserializer' field.
   */
  public java.lang.CharSequence getKeyDeserializer() {
    return keyDeserializer;
  }

  /**
   * Sets the value of the 'keyDeserializer' field.
   * @param value the value to set.
   */
  public void setKeyDeserializer(java.lang.CharSequence value) {
    this.keyDeserializer = value;
  }

  /**
   * Gets the value of the 'valueDeserializer' field.
   * @return The value of the 'valueDeserializer' field.
   */
  public java.lang.CharSequence getValueDeserializer() {
    return valueDeserializer;
  }

  /**
   * Sets the value of the 'valueDeserializer' field.
   * @param value the value to set.
   */
  public void setValueDeserializer(java.lang.CharSequence value) {
    this.valueDeserializer = value;
  }

  /**
   * Creates a new StartConsumerEvent RecordBuilder.
   * @return A new StartConsumerEvent RecordBuilder
   */
  public static com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder newBuilder() {
    return new com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder();
  }

  /**
   * Creates a new StartConsumerEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StartConsumerEvent RecordBuilder
   */
  public static com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder newBuilder(com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder other) {
    return new com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder(other);
  }

  /**
   * Creates a new StartConsumerEvent RecordBuilder by copying an existing StartConsumerEvent instance.
   * @param other The existing instance to copy.
   * @return A new StartConsumerEvent RecordBuilder
   */
  public static com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder newBuilder(com.sirolf2009.muse.ui.model.StartConsumerEvent other) {
    return new com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder(other);
  }

  /**
   * RecordBuilder for StartConsumerEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StartConsumerEvent>
    implements org.apache.avro.data.RecordBuilder<StartConsumerEvent> {

    private java.lang.CharSequence ID;
    private java.lang.CharSequence Topic;
    private java.lang.CharSequence keyDeserializer;
    private java.lang.CharSequence valueDeserializer;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ID)) {
        this.ID = data().deepCopy(fields()[0].schema(), other.ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Topic)) {
        this.Topic = data().deepCopy(fields()[1].schema(), other.Topic);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.keyDeserializer)) {
        this.keyDeserializer = data().deepCopy(fields()[2].schema(), other.keyDeserializer);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.valueDeserializer)) {
        this.valueDeserializer = data().deepCopy(fields()[3].schema(), other.valueDeserializer);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing StartConsumerEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.sirolf2009.muse.ui.model.StartConsumerEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.ID)) {
        this.ID = data().deepCopy(fields()[0].schema(), other.ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Topic)) {
        this.Topic = data().deepCopy(fields()[1].schema(), other.Topic);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.keyDeserializer)) {
        this.keyDeserializer = data().deepCopy(fields()[2].schema(), other.keyDeserializer);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.valueDeserializer)) {
        this.valueDeserializer = data().deepCopy(fields()[3].schema(), other.valueDeserializer);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getID() {
      return ID;
    }

    /**
      * Sets the value of the 'ID' field.
      * @param value The value of 'ID'.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder setID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ID' field has been set.
      * @return True if the 'ID' field has been set, false otherwise.
      */
    public boolean hasID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ID' field.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder clearID() {
      ID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Topic' field.
      * @return The value.
      */
    public java.lang.CharSequence getTopic() {
      return Topic;
    }

    /**
      * Sets the value of the 'Topic' field.
      * @param value The value of 'Topic'.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder setTopic(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.Topic = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Topic' field has been set.
      * @return True if the 'Topic' field has been set, false otherwise.
      */
    public boolean hasTopic() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Topic' field.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder clearTopic() {
      Topic = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'keyDeserializer' field.
      * @return The value.
      */
    public java.lang.CharSequence getKeyDeserializer() {
      return keyDeserializer;
    }

    /**
      * Sets the value of the 'keyDeserializer' field.
      * @param value The value of 'keyDeserializer'.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder setKeyDeserializer(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.keyDeserializer = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'keyDeserializer' field has been set.
      * @return True if the 'keyDeserializer' field has been set, false otherwise.
      */
    public boolean hasKeyDeserializer() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'keyDeserializer' field.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder clearKeyDeserializer() {
      keyDeserializer = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'valueDeserializer' field.
      * @return The value.
      */
    public java.lang.CharSequence getValueDeserializer() {
      return valueDeserializer;
    }

    /**
      * Sets the value of the 'valueDeserializer' field.
      * @param value The value of 'valueDeserializer'.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder setValueDeserializer(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.valueDeserializer = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'valueDeserializer' field has been set.
      * @return True if the 'valueDeserializer' field has been set, false otherwise.
      */
    public boolean hasValueDeserializer() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'valueDeserializer' field.
      * @return This builder.
      */
    public com.sirolf2009.muse.ui.model.StartConsumerEvent.Builder clearValueDeserializer() {
      valueDeserializer = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public StartConsumerEvent build() {
      try {
        StartConsumerEvent record = new StartConsumerEvent();
        record.ID = fieldSetFlags()[0] ? this.ID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Topic = fieldSetFlags()[1] ? this.Topic : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.keyDeserializer = fieldSetFlags()[2] ? this.keyDeserializer : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.valueDeserializer = fieldSetFlags()[3] ? this.valueDeserializer : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<StartConsumerEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<StartConsumerEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<StartConsumerEvent>
    READER$ = (org.apache.avro.io.DatumReader<StartConsumerEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
