/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Fundamental diagram parameters on one link at one time.
   * Flow and density values are per lane in SI units. */
public class FD extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FD\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Fundamental diagram parameters on one link at one time.\\n   * Flow and density values are per lane in SI units.\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"criticalSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacity\",\"type\":[\"null\",\"double\"]},{\"name\":\"jamDensity\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityDrop\",\"type\":[\"null\",\"double\"]},{\"name\":\"freeFlowSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityStd\",\"type\":[\"null\",\"double\"]}]}");
  @Deprecated public java.lang.Double freeFlowSpeed;
  @Deprecated public java.lang.Double criticalSpeed;
  @Deprecated public java.lang.Double congestionWaveSpeed;
  @Deprecated public java.lang.Double capacity;
  @Deprecated public java.lang.Double jamDensity;
  @Deprecated public java.lang.Double capacityDrop;
  @Deprecated public java.lang.Double freeFlowSpeedStd;
  @Deprecated public java.lang.Double congestionWaveSpeedStd;
  @Deprecated public java.lang.Double capacityStd;

  /**
   * Default constructor.
   */
  public FD() {}

  /**
   * All-args constructor.
   */
  public FD(java.lang.Double freeFlowSpeed, java.lang.Double criticalSpeed, java.lang.Double congestionWaveSpeed, java.lang.Double capacity, java.lang.Double jamDensity, java.lang.Double capacityDrop, java.lang.Double freeFlowSpeedStd, java.lang.Double congestionWaveSpeedStd, java.lang.Double capacityStd) {
    this.freeFlowSpeed = freeFlowSpeed;
    this.criticalSpeed = criticalSpeed;
    this.congestionWaveSpeed = congestionWaveSpeed;
    this.capacity = capacity;
    this.jamDensity = jamDensity;
    this.capacityDrop = capacityDrop;
    this.freeFlowSpeedStd = freeFlowSpeedStd;
    this.congestionWaveSpeedStd = congestionWaveSpeedStd;
    this.capacityStd = capacityStd;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return freeFlowSpeed;
    case 1: return criticalSpeed;
    case 2: return congestionWaveSpeed;
    case 3: return capacity;
    case 4: return jamDensity;
    case 5: return capacityDrop;
    case 6: return freeFlowSpeedStd;
    case 7: return congestionWaveSpeedStd;
    case 8: return capacityStd;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: freeFlowSpeed = (java.lang.Double)value$; break;
    case 1: criticalSpeed = (java.lang.Double)value$; break;
    case 2: congestionWaveSpeed = (java.lang.Double)value$; break;
    case 3: capacity = (java.lang.Double)value$; break;
    case 4: jamDensity = (java.lang.Double)value$; break;
    case 5: capacityDrop = (java.lang.Double)value$; break;
    case 6: freeFlowSpeedStd = (java.lang.Double)value$; break;
    case 7: congestionWaveSpeedStd = (java.lang.Double)value$; break;
    case 8: capacityStd = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'freeFlowSpeed' field.
   */
  public java.lang.Double getFreeFlowSpeed() {
    return freeFlowSpeed;
  }

  /**
   * Sets the value of the 'freeFlowSpeed' field.
   * @param value the value to set.
   */
  public void setFreeFlowSpeed(java.lang.Double value) {
    this.freeFlowSpeed = value;
  }

  /**
   * Gets the value of the 'criticalSpeed' field.
   */
  public java.lang.Double getCriticalSpeed() {
    return criticalSpeed;
  }

  /**
   * Sets the value of the 'criticalSpeed' field.
   * @param value the value to set.
   */
  public void setCriticalSpeed(java.lang.Double value) {
    this.criticalSpeed = value;
  }

  /**
   * Gets the value of the 'congestionWaveSpeed' field.
   */
  public java.lang.Double getCongestionWaveSpeed() {
    return congestionWaveSpeed;
  }

  /**
   * Sets the value of the 'congestionWaveSpeed' field.
   * @param value the value to set.
   */
  public void setCongestionWaveSpeed(java.lang.Double value) {
    this.congestionWaveSpeed = value;
  }

  /**
   * Gets the value of the 'capacity' field.
   */
  public java.lang.Double getCapacity() {
    return capacity;
  }

  /**
   * Sets the value of the 'capacity' field.
   * @param value the value to set.
   */
  public void setCapacity(java.lang.Double value) {
    this.capacity = value;
  }

  /**
   * Gets the value of the 'jamDensity' field.
   */
  public java.lang.Double getJamDensity() {
    return jamDensity;
  }

  /**
   * Sets the value of the 'jamDensity' field.
   * @param value the value to set.
   */
  public void setJamDensity(java.lang.Double value) {
    this.jamDensity = value;
  }

  /**
   * Gets the value of the 'capacityDrop' field.
   */
  public java.lang.Double getCapacityDrop() {
    return capacityDrop;
  }

  /**
   * Sets the value of the 'capacityDrop' field.
   * @param value the value to set.
   */
  public void setCapacityDrop(java.lang.Double value) {
    this.capacityDrop = value;
  }

  /**
   * Gets the value of the 'freeFlowSpeedStd' field.
   */
  public java.lang.Double getFreeFlowSpeedStd() {
    return freeFlowSpeedStd;
  }

  /**
   * Sets the value of the 'freeFlowSpeedStd' field.
   * @param value the value to set.
   */
  public void setFreeFlowSpeedStd(java.lang.Double value) {
    this.freeFlowSpeedStd = value;
  }

  /**
   * Gets the value of the 'congestionWaveSpeedStd' field.
   */
  public java.lang.Double getCongestionWaveSpeedStd() {
    return congestionWaveSpeedStd;
  }

  /**
   * Sets the value of the 'congestionWaveSpeedStd' field.
   * @param value the value to set.
   */
  public void setCongestionWaveSpeedStd(java.lang.Double value) {
    this.congestionWaveSpeedStd = value;
  }

  /**
   * Gets the value of the 'capacityStd' field.
   */
  public java.lang.Double getCapacityStd() {
    return capacityStd;
  }

  /**
   * Sets the value of the 'capacityStd' field.
   * @param value the value to set.
   */
  public void setCapacityStd(java.lang.Double value) {
    this.capacityStd = value;
  }

  /** Creates a new FD RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FD.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FD.Builder();
  }
  
  /** Creates a new FD RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FD.Builder newBuilder(edu.berkeley.path.model_elements_base.FD.Builder other) {
    return new edu.berkeley.path.model_elements_base.FD.Builder(other);
  }
  
  /** Creates a new FD RecordBuilder by copying an existing FD instance */
  public static edu.berkeley.path.model_elements_base.FD.Builder newBuilder(edu.berkeley.path.model_elements_base.FD other) {
    return new edu.berkeley.path.model_elements_base.FD.Builder(other);
  }
  
  /**
   * RecordBuilder for FD instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FD>
    implements org.apache.avro.data.RecordBuilder<FD> {

    private java.lang.Double freeFlowSpeed;
    private java.lang.Double criticalSpeed;
    private java.lang.Double congestionWaveSpeed;
    private java.lang.Double capacity;
    private java.lang.Double jamDensity;
    private java.lang.Double capacityDrop;
    private java.lang.Double freeFlowSpeedStd;
    private java.lang.Double congestionWaveSpeedStd;
    private java.lang.Double capacityStd;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FD.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FD.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FD instance */
    private Builder(edu.berkeley.path.model_elements_base.FD other) {
            super(edu.berkeley.path.model_elements_base.FD.SCHEMA$);
      if (isValidValue(fields()[0], other.freeFlowSpeed)) {
        this.freeFlowSpeed = (java.lang.Double) data().deepCopy(fields()[0].schema(), other.freeFlowSpeed);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.criticalSpeed)) {
        this.criticalSpeed = (java.lang.Double) data().deepCopy(fields()[1].schema(), other.criticalSpeed);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.congestionWaveSpeed)) {
        this.congestionWaveSpeed = (java.lang.Double) data().deepCopy(fields()[2].schema(), other.congestionWaveSpeed);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.capacity)) {
        this.capacity = (java.lang.Double) data().deepCopy(fields()[3].schema(), other.capacity);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.jamDensity)) {
        this.jamDensity = (java.lang.Double) data().deepCopy(fields()[4].schema(), other.jamDensity);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.capacityDrop)) {
        this.capacityDrop = (java.lang.Double) data().deepCopy(fields()[5].schema(), other.capacityDrop);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.freeFlowSpeedStd)) {
        this.freeFlowSpeedStd = (java.lang.Double) data().deepCopy(fields()[6].schema(), other.freeFlowSpeedStd);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.congestionWaveSpeedStd)) {
        this.congestionWaveSpeedStd = (java.lang.Double) data().deepCopy(fields()[7].schema(), other.congestionWaveSpeedStd);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.capacityStd)) {
        this.capacityStd = (java.lang.Double) data().deepCopy(fields()[8].schema(), other.capacityStd);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'freeFlowSpeed' field */
    public java.lang.Double getFreeFlowSpeed() {
      return freeFlowSpeed;
    }
    
    /** Sets the value of the 'freeFlowSpeed' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setFreeFlowSpeed(java.lang.Double value) {
      validate(fields()[0], value);
      this.freeFlowSpeed = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'freeFlowSpeed' field has been set */
    public boolean hasFreeFlowSpeed() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'freeFlowSpeed' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearFreeFlowSpeed() {
      freeFlowSpeed = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'criticalSpeed' field */
    public java.lang.Double getCriticalSpeed() {
      return criticalSpeed;
    }
    
    /** Sets the value of the 'criticalSpeed' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setCriticalSpeed(java.lang.Double value) {
      validate(fields()[1], value);
      this.criticalSpeed = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'criticalSpeed' field has been set */
    public boolean hasCriticalSpeed() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'criticalSpeed' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearCriticalSpeed() {
      criticalSpeed = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'congestionWaveSpeed' field */
    public java.lang.Double getCongestionWaveSpeed() {
      return congestionWaveSpeed;
    }
    
    /** Sets the value of the 'congestionWaveSpeed' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setCongestionWaveSpeed(java.lang.Double value) {
      validate(fields()[2], value);
      this.congestionWaveSpeed = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'congestionWaveSpeed' field has been set */
    public boolean hasCongestionWaveSpeed() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'congestionWaveSpeed' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearCongestionWaveSpeed() {
      congestionWaveSpeed = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'capacity' field */
    public java.lang.Double getCapacity() {
      return capacity;
    }
    
    /** Sets the value of the 'capacity' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setCapacity(java.lang.Double value) {
      validate(fields()[3], value);
      this.capacity = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'capacity' field has been set */
    public boolean hasCapacity() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'capacity' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearCapacity() {
      capacity = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'jamDensity' field */
    public java.lang.Double getJamDensity() {
      return jamDensity;
    }
    
    /** Sets the value of the 'jamDensity' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setJamDensity(java.lang.Double value) {
      validate(fields()[4], value);
      this.jamDensity = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'jamDensity' field has been set */
    public boolean hasJamDensity() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'jamDensity' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearJamDensity() {
      jamDensity = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'capacityDrop' field */
    public java.lang.Double getCapacityDrop() {
      return capacityDrop;
    }
    
    /** Sets the value of the 'capacityDrop' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setCapacityDrop(java.lang.Double value) {
      validate(fields()[5], value);
      this.capacityDrop = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'capacityDrop' field has been set */
    public boolean hasCapacityDrop() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'capacityDrop' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearCapacityDrop() {
      capacityDrop = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'freeFlowSpeedStd' field */
    public java.lang.Double getFreeFlowSpeedStd() {
      return freeFlowSpeedStd;
    }
    
    /** Sets the value of the 'freeFlowSpeedStd' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setFreeFlowSpeedStd(java.lang.Double value) {
      validate(fields()[6], value);
      this.freeFlowSpeedStd = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'freeFlowSpeedStd' field has been set */
    public boolean hasFreeFlowSpeedStd() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'freeFlowSpeedStd' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearFreeFlowSpeedStd() {
      freeFlowSpeedStd = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'congestionWaveSpeedStd' field */
    public java.lang.Double getCongestionWaveSpeedStd() {
      return congestionWaveSpeedStd;
    }
    
    /** Sets the value of the 'congestionWaveSpeedStd' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setCongestionWaveSpeedStd(java.lang.Double value) {
      validate(fields()[7], value);
      this.congestionWaveSpeedStd = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'congestionWaveSpeedStd' field has been set */
    public boolean hasCongestionWaveSpeedStd() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'congestionWaveSpeedStd' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearCongestionWaveSpeedStd() {
      congestionWaveSpeedStd = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'capacityStd' field */
    public java.lang.Double getCapacityStd() {
      return capacityStd;
    }
    
    /** Sets the value of the 'capacityStd' field */
    public edu.berkeley.path.model_elements_base.FD.Builder setCapacityStd(java.lang.Double value) {
      validate(fields()[8], value);
      this.capacityStd = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'capacityStd' field has been set */
    public boolean hasCapacityStd() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'capacityStd' field */
    public edu.berkeley.path.model_elements_base.FD.Builder clearCapacityStd() {
      capacityStd = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public FD build() {
      try {
        FD record = new FD();
        record.freeFlowSpeed = fieldSetFlags()[0] ? this.freeFlowSpeed : (java.lang.Double) defaultValue(fields()[0]);
        record.criticalSpeed = fieldSetFlags()[1] ? this.criticalSpeed : (java.lang.Double) defaultValue(fields()[1]);
        record.congestionWaveSpeed = fieldSetFlags()[2] ? this.congestionWaveSpeed : (java.lang.Double) defaultValue(fields()[2]);
        record.capacity = fieldSetFlags()[3] ? this.capacity : (java.lang.Double) defaultValue(fields()[3]);
        record.jamDensity = fieldSetFlags()[4] ? this.jamDensity : (java.lang.Double) defaultValue(fields()[4]);
        record.capacityDrop = fieldSetFlags()[5] ? this.capacityDrop : (java.lang.Double) defaultValue(fields()[5]);
        record.freeFlowSpeedStd = fieldSetFlags()[6] ? this.freeFlowSpeedStd : (java.lang.Double) defaultValue(fields()[6]);
        record.congestionWaveSpeedStd = fieldSetFlags()[7] ? this.congestionWaveSpeedStd : (java.lang.Double) defaultValue(fields()[7]);
        record.capacityStd = fieldSetFlags()[8] ? this.capacityStd : (java.lang.Double) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
