/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** milliseconds, absolute, since epoch, utc */
public class DateTime extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DateTime\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}");
  @Deprecated public long milliseconds;

  /**
   * Default constructor.
   */
  public DateTime() {}

  /**
   * All-args constructor.
   */
  public DateTime(java.lang.Long milliseconds) {
    this.milliseconds = milliseconds;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return milliseconds;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: milliseconds = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'milliseconds' field.
   */
  public java.lang.Long getMilliseconds() {
    return milliseconds;
  }

  /**
   * Sets the value of the 'milliseconds' field.
   * @param value the value to set.
   */
  public void setMilliseconds(java.lang.Long value) {
    this.milliseconds = value;
  }

  /** Creates a new DateTime RecordBuilder */
  public static edu.berkeley.path.model_elements_base.DateTime.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.DateTime.Builder();
  }
  
  /** Creates a new DateTime RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.DateTime.Builder newBuilder(edu.berkeley.path.model_elements_base.DateTime.Builder other) {
    return new edu.berkeley.path.model_elements_base.DateTime.Builder(other);
  }
  
  /** Creates a new DateTime RecordBuilder by copying an existing DateTime instance */
  public static edu.berkeley.path.model_elements_base.DateTime.Builder newBuilder(edu.berkeley.path.model_elements_base.DateTime other) {
    return new edu.berkeley.path.model_elements_base.DateTime.Builder(other);
  }
  
  /**
   * RecordBuilder for DateTime instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DateTime>
    implements org.apache.avro.data.RecordBuilder<DateTime> {

    private long milliseconds;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.DateTime.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.DateTime.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DateTime instance */
    private Builder(edu.berkeley.path.model_elements_base.DateTime other) {
            super(edu.berkeley.path.model_elements_base.DateTime.SCHEMA$);
      if (isValidValue(fields()[0], other.milliseconds)) {
        this.milliseconds = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.milliseconds);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'milliseconds' field */
    public java.lang.Long getMilliseconds() {
      return milliseconds;
    }
    
    /** Sets the value of the 'milliseconds' field */
    public edu.berkeley.path.model_elements_base.DateTime.Builder setMilliseconds(long value) {
      validate(fields()[0], value);
      this.milliseconds = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'milliseconds' field has been set */
    public boolean hasMilliseconds() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'milliseconds' field */
    public edu.berkeley.path.model_elements_base.DateTime.Builder clearMilliseconds() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public DateTime build() {
      try {
        DateTime record = new DateTime();
        record.milliseconds = fieldSetFlags()[0] ? this.milliseconds : (java.lang.Long) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
