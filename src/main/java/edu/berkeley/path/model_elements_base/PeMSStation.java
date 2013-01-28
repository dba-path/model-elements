/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * PeMS sensor (the VDS station info, rather than the sensor data). */
public class PeMSStation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PeMSStation\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* PeMS sensor (the VDS station info, rather than the sensor data).\",\"fields\":[{\"name\":\"Id\",\"type\":\"long\"},{\"name\":\"fwyNum\",\"type\":\"int\"},{\"name\":\"direction\",\"type\":\"string\"},{\"name\":\"district\",\"type\":\"int\"},{\"name\":\"county\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"statePostmile\",\"type\":\"double\"},{\"name\":\"absPostmile\",\"type\":\"double\"},{\"name\":\"point\",\"type\":{\"type\":\"record\",\"name\":\"Point\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\",\"default\":0.0},{\"name\":\"longitude\",\"type\":\"double\",\"default\":0.0}]}},{\"name\":\"detectorLength\",\"type\":\"double\"},{\"name\":\"detectorType\",\"type\":\"string\"},{\"name\":\"detectorName\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":\"int\"},{\"name\":\"userId\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
  @Deprecated public long Id;
  @Deprecated public int fwyNum;
  @Deprecated public java.lang.CharSequence direction;
  @Deprecated public int district;
  @Deprecated public java.lang.CharSequence county;
  @Deprecated public java.lang.CharSequence city;
  @Deprecated public double statePostmile;
  @Deprecated public double absPostmile;
  @Deprecated public edu.berkeley.path.model_elements_base.Point point;
  @Deprecated public double detectorLength;
  @Deprecated public java.lang.CharSequence detectorType;
  @Deprecated public java.lang.CharSequence detectorName;
  @Deprecated public int laneCount;
  @Deprecated public java.util.List<java.lang.CharSequence> userId;

  /**
   * Default constructor.
   */
  public PeMSStation() {}

  /**
   * All-args constructor.
   */
  public PeMSStation(java.lang.Long Id, java.lang.Integer fwyNum, java.lang.CharSequence direction, java.lang.Integer district, java.lang.CharSequence county, java.lang.CharSequence city, java.lang.Double statePostmile, java.lang.Double absPostmile, edu.berkeley.path.model_elements_base.Point point, java.lang.Double detectorLength, java.lang.CharSequence detectorType, java.lang.CharSequence detectorName, java.lang.Integer laneCount, java.util.List<java.lang.CharSequence> userId) {
    this.Id = Id;
    this.fwyNum = fwyNum;
    this.direction = direction;
    this.district = district;
    this.county = county;
    this.city = city;
    this.statePostmile = statePostmile;
    this.absPostmile = absPostmile;
    this.point = point;
    this.detectorLength = detectorLength;
    this.detectorType = detectorType;
    this.detectorName = detectorName;
    this.laneCount = laneCount;
    this.userId = userId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Id;
    case 1: return fwyNum;
    case 2: return direction;
    case 3: return district;
    case 4: return county;
    case 5: return city;
    case 6: return statePostmile;
    case 7: return absPostmile;
    case 8: return point;
    case 9: return detectorLength;
    case 10: return detectorType;
    case 11: return detectorName;
    case 12: return laneCount;
    case 13: return userId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Id = (java.lang.Long)value$; break;
    case 1: fwyNum = (java.lang.Integer)value$; break;
    case 2: direction = (java.lang.CharSequence)value$; break;
    case 3: district = (java.lang.Integer)value$; break;
    case 4: county = (java.lang.CharSequence)value$; break;
    case 5: city = (java.lang.CharSequence)value$; break;
    case 6: statePostmile = (java.lang.Double)value$; break;
    case 7: absPostmile = (java.lang.Double)value$; break;
    case 8: point = (edu.berkeley.path.model_elements_base.Point)value$; break;
    case 9: detectorLength = (java.lang.Double)value$; break;
    case 10: detectorType = (java.lang.CharSequence)value$; break;
    case 11: detectorName = (java.lang.CharSequence)value$; break;
    case 12: laneCount = (java.lang.Integer)value$; break;
    case 13: userId = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Id' field.
   */
  public java.lang.Long getId() {
    return Id;
  }

  /**
   * Sets the value of the 'Id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.Id = value;
  }

  /**
   * Gets the value of the 'fwyNum' field.
   */
  public java.lang.Integer getFwyNum() {
    return fwyNum;
  }

  /**
   * Sets the value of the 'fwyNum' field.
   * @param value the value to set.
   */
  public void setFwyNum(java.lang.Integer value) {
    this.fwyNum = value;
  }

  /**
   * Gets the value of the 'direction' field.
   */
  public java.lang.CharSequence getDirection() {
    return direction;
  }

  /**
   * Sets the value of the 'direction' field.
   * @param value the value to set.
   */
  public void setDirection(java.lang.CharSequence value) {
    this.direction = value;
  }

  /**
   * Gets the value of the 'district' field.
   */
  public java.lang.Integer getDistrict() {
    return district;
  }

  /**
   * Sets the value of the 'district' field.
   * @param value the value to set.
   */
  public void setDistrict(java.lang.Integer value) {
    this.district = value;
  }

  /**
   * Gets the value of the 'county' field.
   */
  public java.lang.CharSequence getCounty() {
    return county;
  }

  /**
   * Sets the value of the 'county' field.
   * @param value the value to set.
   */
  public void setCounty(java.lang.CharSequence value) {
    this.county = value;
  }

  /**
   * Gets the value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }

  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'statePostmile' field.
   */
  public java.lang.Double getStatePostmile() {
    return statePostmile;
  }

  /**
   * Sets the value of the 'statePostmile' field.
   * @param value the value to set.
   */
  public void setStatePostmile(java.lang.Double value) {
    this.statePostmile = value;
  }

  /**
   * Gets the value of the 'absPostmile' field.
   */
  public java.lang.Double getAbsPostmile() {
    return absPostmile;
  }

  /**
   * Sets the value of the 'absPostmile' field.
   * @param value the value to set.
   */
  public void setAbsPostmile(java.lang.Double value) {
    this.absPostmile = value;
  }

  /**
   * Gets the value of the 'point' field.
   */
  public edu.berkeley.path.model_elements_base.Point getPoint() {
    return point;
  }

  /**
   * Sets the value of the 'point' field.
   * @param value the value to set.
   */
  public void setPoint(edu.berkeley.path.model_elements_base.Point value) {
    this.point = value;
  }

  /**
   * Gets the value of the 'detectorLength' field.
   */
  public java.lang.Double getDetectorLength() {
    return detectorLength;
  }

  /**
   * Sets the value of the 'detectorLength' field.
   * @param value the value to set.
   */
  public void setDetectorLength(java.lang.Double value) {
    this.detectorLength = value;
  }

  /**
   * Gets the value of the 'detectorType' field.
   */
  public java.lang.CharSequence getDetectorType() {
    return detectorType;
  }

  /**
   * Sets the value of the 'detectorType' field.
   * @param value the value to set.
   */
  public void setDetectorType(java.lang.CharSequence value) {
    this.detectorType = value;
  }

  /**
   * Gets the value of the 'detectorName' field.
   */
  public java.lang.CharSequence getDetectorName() {
    return detectorName;
  }

  /**
   * Sets the value of the 'detectorName' field.
   * @param value the value to set.
   */
  public void setDetectorName(java.lang.CharSequence value) {
    this.detectorName = value;
  }

  /**
   * Gets the value of the 'laneCount' field.
   */
  public java.lang.Integer getLaneCount() {
    return laneCount;
  }

  /**
   * Sets the value of the 'laneCount' field.
   * @param value the value to set.
   */
  public void setLaneCount(java.lang.Integer value) {
    this.laneCount = value;
  }

  /**
   * Gets the value of the 'userId' field.
   */
  public java.util.List<java.lang.CharSequence> getUserId() {
    return userId;
  }

  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.util.List<java.lang.CharSequence> value) {
    this.userId = value;
  }

  /** Creates a new PeMSStation RecordBuilder */
  public static edu.berkeley.path.model_elements_base.PeMSStation.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.PeMSStation.Builder();
  }
  
  /** Creates a new PeMSStation RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.PeMSStation.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSStation.Builder other) {
    return new edu.berkeley.path.model_elements_base.PeMSStation.Builder(other);
  }
  
  /** Creates a new PeMSStation RecordBuilder by copying an existing PeMSStation instance */
  public static edu.berkeley.path.model_elements_base.PeMSStation.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSStation other) {
    return new edu.berkeley.path.model_elements_base.PeMSStation.Builder(other);
  }
  
  /**
   * RecordBuilder for PeMSStation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PeMSStation>
    implements org.apache.avro.data.RecordBuilder<PeMSStation> {

    private long Id;
    private int fwyNum;
    private java.lang.CharSequence direction;
    private int district;
    private java.lang.CharSequence county;
    private java.lang.CharSequence city;
    private double statePostmile;
    private double absPostmile;
    private edu.berkeley.path.model_elements_base.Point point;
    private double detectorLength;
    private java.lang.CharSequence detectorType;
    private java.lang.CharSequence detectorName;
    private int laneCount;
    private java.util.List<java.lang.CharSequence> userId;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.PeMSStation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.PeMSStation.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing PeMSStation instance */
    private Builder(edu.berkeley.path.model_elements_base.PeMSStation other) {
            super(edu.berkeley.path.model_elements_base.PeMSStation.SCHEMA$);
      if (isValidValue(fields()[0], other.Id)) {
        this.Id = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.Id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fwyNum)) {
        this.fwyNum = (java.lang.Integer) data().deepCopy(fields()[1].schema(), other.fwyNum);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.direction)) {
        this.direction = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.direction);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.district)) {
        this.district = (java.lang.Integer) data().deepCopy(fields()[3].schema(), other.district);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.county)) {
        this.county = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.county);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.city)) {
        this.city = (java.lang.CharSequence) data().deepCopy(fields()[5].schema(), other.city);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.statePostmile)) {
        this.statePostmile = (java.lang.Double) data().deepCopy(fields()[6].schema(), other.statePostmile);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.absPostmile)) {
        this.absPostmile = (java.lang.Double) data().deepCopy(fields()[7].schema(), other.absPostmile);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.point)) {
        this.point = (edu.berkeley.path.model_elements_base.Point) data().deepCopy(fields()[8].schema(), other.point);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.detectorLength)) {
        this.detectorLength = (java.lang.Double) data().deepCopy(fields()[9].schema(), other.detectorLength);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.detectorType)) {
        this.detectorType = (java.lang.CharSequence) data().deepCopy(fields()[10].schema(), other.detectorType);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.detectorName)) {
        this.detectorName = (java.lang.CharSequence) data().deepCopy(fields()[11].schema(), other.detectorName);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.laneCount)) {
        this.laneCount = (java.lang.Integer) data().deepCopy(fields()[12].schema(), other.laneCount);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.userId)) {
        this.userId = (java.util.List<java.lang.CharSequence>) data().deepCopy(fields()[13].schema(), other.userId);
        fieldSetFlags()[13] = true;
      }
    }

    /** Gets the value of the 'Id' field */
    public java.lang.Long getId() {
      return Id;
    }
    
    /** Sets the value of the 'Id' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setId(long value) {
      validate(fields()[0], value);
      this.Id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'Id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'Id' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'fwyNum' field */
    public java.lang.Integer getFwyNum() {
      return fwyNum;
    }
    
    /** Sets the value of the 'fwyNum' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setFwyNum(int value) {
      validate(fields()[1], value);
      this.fwyNum = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'fwyNum' field has been set */
    public boolean hasFwyNum() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'fwyNum' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearFwyNum() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'direction' field */
    public java.lang.CharSequence getDirection() {
      return direction;
    }
    
    /** Sets the value of the 'direction' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setDirection(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.direction = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'direction' field has been set */
    public boolean hasDirection() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'direction' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearDirection() {
      direction = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'district' field */
    public java.lang.Integer getDistrict() {
      return district;
    }
    
    /** Sets the value of the 'district' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setDistrict(int value) {
      validate(fields()[3], value);
      this.district = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'district' field has been set */
    public boolean hasDistrict() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'district' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearDistrict() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'county' field */
    public java.lang.CharSequence getCounty() {
      return county;
    }
    
    /** Sets the value of the 'county' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setCounty(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.county = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'county' field has been set */
    public boolean hasCounty() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'county' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearCounty() {
      county = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'city' field */
    public java.lang.CharSequence getCity() {
      return city;
    }
    
    /** Sets the value of the 'city' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.city = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'city' field has been set */
    public boolean hasCity() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'city' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearCity() {
      city = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'statePostmile' field */
    public java.lang.Double getStatePostmile() {
      return statePostmile;
    }
    
    /** Sets the value of the 'statePostmile' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setStatePostmile(double value) {
      validate(fields()[6], value);
      this.statePostmile = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'statePostmile' field has been set */
    public boolean hasStatePostmile() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'statePostmile' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearStatePostmile() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'absPostmile' field */
    public java.lang.Double getAbsPostmile() {
      return absPostmile;
    }
    
    /** Sets the value of the 'absPostmile' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setAbsPostmile(double value) {
      validate(fields()[7], value);
      this.absPostmile = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'absPostmile' field has been set */
    public boolean hasAbsPostmile() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'absPostmile' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearAbsPostmile() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'point' field */
    public edu.berkeley.path.model_elements_base.Point getPoint() {
      return point;
    }
    
    /** Sets the value of the 'point' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setPoint(edu.berkeley.path.model_elements_base.Point value) {
      validate(fields()[8], value);
      this.point = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'point' field has been set */
    public boolean hasPoint() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'point' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearPoint() {
      point = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'detectorLength' field */
    public java.lang.Double getDetectorLength() {
      return detectorLength;
    }
    
    /** Sets the value of the 'detectorLength' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setDetectorLength(double value) {
      validate(fields()[9], value);
      this.detectorLength = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'detectorLength' field has been set */
    public boolean hasDetectorLength() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'detectorLength' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearDetectorLength() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'detectorType' field */
    public java.lang.CharSequence getDetectorType() {
      return detectorType;
    }
    
    /** Sets the value of the 'detectorType' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setDetectorType(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.detectorType = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'detectorType' field has been set */
    public boolean hasDetectorType() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'detectorType' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearDetectorType() {
      detectorType = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'detectorName' field */
    public java.lang.CharSequence getDetectorName() {
      return detectorName;
    }
    
    /** Sets the value of the 'detectorName' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setDetectorName(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.detectorName = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'detectorName' field has been set */
    public boolean hasDetectorName() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'detectorName' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearDetectorName() {
      detectorName = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'laneCount' field */
    public java.lang.Integer getLaneCount() {
      return laneCount;
    }
    
    /** Sets the value of the 'laneCount' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setLaneCount(int value) {
      validate(fields()[12], value);
      this.laneCount = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'laneCount' field has been set */
    public boolean hasLaneCount() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'laneCount' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearLaneCount() {
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'userId' field */
    public java.util.List<java.lang.CharSequence> getUserId() {
      return userId;
    }
    
    /** Sets the value of the 'userId' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder setUserId(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[13], value);
      this.userId = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'userId' field has been set */
    public boolean hasUserId() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'userId' field */
    public edu.berkeley.path.model_elements_base.PeMSStation.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public PeMSStation build() {
      try {
        PeMSStation record = new PeMSStation();
        record.Id = fieldSetFlags()[0] ? this.Id : (java.lang.Long) defaultValue(fields()[0]);
        record.fwyNum = fieldSetFlags()[1] ? this.fwyNum : (java.lang.Integer) defaultValue(fields()[1]);
        record.direction = fieldSetFlags()[2] ? this.direction : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.district = fieldSetFlags()[3] ? this.district : (java.lang.Integer) defaultValue(fields()[3]);
        record.county = fieldSetFlags()[4] ? this.county : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.city = fieldSetFlags()[5] ? this.city : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.statePostmile = fieldSetFlags()[6] ? this.statePostmile : (java.lang.Double) defaultValue(fields()[6]);
        record.absPostmile = fieldSetFlags()[7] ? this.absPostmile : (java.lang.Double) defaultValue(fields()[7]);
        record.point = fieldSetFlags()[8] ? this.point : (edu.berkeley.path.model_elements_base.Point) defaultValue(fields()[8]);
        record.detectorLength = fieldSetFlags()[9] ? this.detectorLength : (java.lang.Double) defaultValue(fields()[9]);
        record.detectorType = fieldSetFlags()[10] ? this.detectorType : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.detectorName = fieldSetFlags()[11] ? this.detectorName : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.laneCount = fieldSetFlags()[12] ? this.laneCount : (java.lang.Integer) defaultValue(fields()[12]);
        record.userId = fieldSetFlags()[13] ? this.userId : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[13]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
