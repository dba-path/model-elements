/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class Network extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Network\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"default\":\"1\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"nodes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Node\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]}},\"default\":[]},{\"name\":\"links\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Link\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":\"double\"},{\"name\":\"length\",\"type\":\"double\"},{\"name\":\"laneOffset\",\"type\":\"int\",\"default\":0},{\"name\":\"begin_id\",\"type\":\"int\"},{\"name\":\"end_id\",\"type\":\"int\"}]}},\"default\":[]}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.Node> nodes;
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.Link> links;

  /**
   * Default constructor.
   */
  public Network() {}

  /**
   * All-args constructor.
   */
  public Network(java.lang.CharSequence id, java.lang.CharSequence name, java.util.List<edu.berkeley.path.model_elements_base.Node> nodes, java.util.List<edu.berkeley.path.model_elements_base.Link> links) {
    this.id = id;
    this.name = name;
    this.nodes = nodes;
    this.links = links;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return nodes;
    case 3: return links;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: nodes = (java.util.List<edu.berkeley.path.model_elements_base.Node>)value$; break;
    case 3: links = (java.util.List<edu.berkeley.path.model_elements_base.Link>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'nodes' field.
   */
  public java.util.List<edu.berkeley.path.model_elements_base.Node> getNodes() {
    return nodes;
  }

  /**
   * Sets the value of the 'nodes' field.
   * @param value the value to set.
   */
  public void setNodes(java.util.List<edu.berkeley.path.model_elements_base.Node> value) {
    this.nodes = value;
  }

  /**
   * Gets the value of the 'links' field.
   */
  public java.util.List<edu.berkeley.path.model_elements_base.Link> getLinks() {
    return links;
  }

  /**
   * Sets the value of the 'links' field.
   * @param value the value to set.
   */
  public void setLinks(java.util.List<edu.berkeley.path.model_elements_base.Link> value) {
    this.links = value;
  }

  /** Creates a new Network RecordBuilder */
  public static edu.berkeley.path.model_elements_base.Network.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.Network.Builder();
  }
  
  /** Creates a new Network RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.Network.Builder newBuilder(edu.berkeley.path.model_elements_base.Network.Builder other) {
    return new edu.berkeley.path.model_elements_base.Network.Builder(other);
  }
  
  /** Creates a new Network RecordBuilder by copying an existing Network instance */
  public static edu.berkeley.path.model_elements_base.Network.Builder newBuilder(edu.berkeley.path.model_elements_base.Network other) {
    return new edu.berkeley.path.model_elements_base.Network.Builder(other);
  }
  
  /**
   * RecordBuilder for Network instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Network>
    implements org.apache.avro.data.RecordBuilder<Network> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.util.List<edu.berkeley.path.model_elements_base.Node> nodes;
    private java.util.List<edu.berkeley.path.model_elements_base.Link> links;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.Network.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.Network.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Network instance */
    private Builder(edu.berkeley.path.model_elements_base.Network other) {
            super(edu.berkeley.path.model_elements_base.Network.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nodes)) {
        this.nodes = (java.util.List<edu.berkeley.path.model_elements_base.Node>) data().deepCopy(fields()[2].schema(), other.nodes);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.links)) {
        this.links = (java.util.List<edu.berkeley.path.model_elements_base.Link>) data().deepCopy(fields()[3].schema(), other.links);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Network.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.Network.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Network.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.Network.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'nodes' field */
    public java.util.List<edu.berkeley.path.model_elements_base.Node> getNodes() {
      return nodes;
    }
    
    /** Sets the value of the 'nodes' field */
    public edu.berkeley.path.model_elements_base.Network.Builder setNodes(java.util.List<edu.berkeley.path.model_elements_base.Node> value) {
      validate(fields()[2], value);
      this.nodes = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'nodes' field has been set */
    public boolean hasNodes() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'nodes' field */
    public edu.berkeley.path.model_elements_base.Network.Builder clearNodes() {
      nodes = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'links' field */
    public java.util.List<edu.berkeley.path.model_elements_base.Link> getLinks() {
      return links;
    }
    
    /** Sets the value of the 'links' field */
    public edu.berkeley.path.model_elements_base.Network.Builder setLinks(java.util.List<edu.berkeley.path.model_elements_base.Link> value) {
      validate(fields()[3], value);
      this.links = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'links' field has been set */
    public boolean hasLinks() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'links' field */
    public edu.berkeley.path.model_elements_base.Network.Builder clearLinks() {
      links = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Network build() {
      try {
        Network record = new Network();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.nodes = fieldSetFlags()[2] ? this.nodes : (java.util.List<edu.berkeley.path.model_elements_base.Node>) defaultValue(fields()[2]);
        record.links = fieldSetFlags()[3] ? this.links : (java.util.List<edu.berkeley.path.model_elements_base.Link>) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
