/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-06")
public class Tree implements org.apache.thrift.TBase<Tree, Tree._Fields>, java.io.Serializable, Cloneable, Comparable<Tree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Tree");

  private static final org.apache.thrift.protocol.TField ROOT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("rootId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NODES_FIELD_DESC = new org.apache.thrift.protocol.TField("nodes", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TreeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TreeTupleSchemeFactory());
  }

  public int rootId; // required
  public Map<Integer,TreeNode> nodes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROOT_ID((short)1, "rootId"),
    NODES((short)2, "nodes");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROOT_ID
          return ROOT_ID;
        case 2: // NODES
          return NODES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ROOTID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROOT_ID, new org.apache.thrift.meta_data.FieldMetaData("rootId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NODES, new org.apache.thrift.meta_data.FieldMetaData("nodes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TreeNode.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Tree.class, metaDataMap);
  }

  public Tree() {
  }

  public Tree(
    int rootId,
    Map<Integer,TreeNode> nodes)
  {
    this();
    this.rootId = rootId;
    setRootIdIsSet(true);
    this.nodes = nodes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Tree(Tree other) {
    __isset_bitfield = other.__isset_bitfield;
    this.rootId = other.rootId;
    if (other.isSetNodes()) {
      Map<Integer,TreeNode> __this__nodes = new HashMap<Integer,TreeNode>(other.nodes.size());
      for (Map.Entry<Integer, TreeNode> other_element : other.nodes.entrySet()) {

        Integer other_element_key = other_element.getKey();
        TreeNode other_element_value = other_element.getValue();

        Integer __this__nodes_copy_key = other_element_key;

        TreeNode __this__nodes_copy_value = new TreeNode(other_element_value);

        __this__nodes.put(__this__nodes_copy_key, __this__nodes_copy_value);
      }
      this.nodes = __this__nodes;
    }
  }

  public Tree deepCopy() {
    return new Tree(this);
  }

  @Override
  public void clear() {
    setRootIdIsSet(false);
    this.rootId = 0;
    this.nodes = null;
  }

  public int getRootId() {
    return this.rootId;
  }

  public Tree setRootId(int rootId) {
    this.rootId = rootId;
    setRootIdIsSet(true);
    return this;
  }

  public void unsetRootId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROOTID_ISSET_ID);
  }

  /** Returns true if field rootId is set (has been assigned a value) and false otherwise */
  public boolean isSetRootId() {
    return EncodingUtils.testBit(__isset_bitfield, __ROOTID_ISSET_ID);
  }

  public void setRootIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROOTID_ISSET_ID, value);
  }

  public int getNodesSize() {
    return (this.nodes == null) ? 0 : this.nodes.size();
  }

  public void putToNodes(int key, TreeNode val) {
    if (this.nodes == null) {
      this.nodes = new HashMap<Integer,TreeNode>();
    }
    this.nodes.put(key, val);
  }

  public Map<Integer,TreeNode> getNodes() {
    return this.nodes;
  }

  public Tree setNodes(Map<Integer,TreeNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public void unsetNodes() {
    this.nodes = null;
  }

  /** Returns true if field nodes is set (has been assigned a value) and false otherwise */
  public boolean isSetNodes() {
    return this.nodes != null;
  }

  public void setNodesIsSet(boolean value) {
    if (!value) {
      this.nodes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROOT_ID:
      if (value == null) {
        unsetRootId();
      } else {
        setRootId((Integer)value);
      }
      break;

    case NODES:
      if (value == null) {
        unsetNodes();
      } else {
        setNodes((Map<Integer,TreeNode>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROOT_ID:
      return getRootId();

    case NODES:
      return getNodes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROOT_ID:
      return isSetRootId();
    case NODES:
      return isSetNodes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Tree)
      return this.equals((Tree)that);
    return false;
  }

  public boolean equals(Tree that) {
    if (that == null)
      return false;

    boolean this_present_rootId = true;
    boolean that_present_rootId = true;
    if (this_present_rootId || that_present_rootId) {
      if (!(this_present_rootId && that_present_rootId))
        return false;
      if (this.rootId != that.rootId)
        return false;
    }

    boolean this_present_nodes = true && this.isSetNodes();
    boolean that_present_nodes = true && that.isSetNodes();
    if (this_present_nodes || that_present_nodes) {
      if (!(this_present_nodes && that_present_nodes))
        return false;
      if (!this.nodes.equals(that.nodes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_rootId = true;
    list.add(present_rootId);
    if (present_rootId)
      list.add(rootId);

    boolean present_nodes = true && (isSetNodes());
    list.add(present_nodes);
    if (present_nodes)
      list.add(nodes);

    return list.hashCode();
  }

  @Override
  public int compareTo(Tree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRootId()).compareTo(other.isSetRootId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRootId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rootId, other.rootId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodes()).compareTo(other.isSetNodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodes, other.nodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Tree(");
    boolean first = true;

    sb.append("rootId:");
    sb.append(this.rootId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodes:");
    if (this.nodes == null) {
      sb.append("null");
    } else {
      sb.append(this.nodes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TreeStandardSchemeFactory implements SchemeFactory {
    public TreeStandardScheme getScheme() {
      return new TreeStandardScheme();
    }
  }

  private static class TreeStandardScheme extends StandardScheme<Tree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Tree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROOT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.rootId = iprot.readI32();
              struct.setRootIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NODES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map8 = iprot.readMapBegin();
                struct.nodes = new HashMap<Integer,TreeNode>(2*_map8.size);
                int _key9;
                TreeNode _val10;
                for (int _i11 = 0; _i11 < _map8.size; ++_i11)
                {
                  _key9 = iprot.readI32();
                  _val10 = new TreeNode();
                  _val10.read(iprot);
                  struct.nodes.put(_key9, _val10);
                }
                iprot.readMapEnd();
              }
              struct.setNodesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Tree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ROOT_ID_FIELD_DESC);
      oprot.writeI32(struct.rootId);
      oprot.writeFieldEnd();
      if (struct.nodes != null) {
        oprot.writeFieldBegin(NODES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.nodes.size()));
          for (Map.Entry<Integer, TreeNode> _iter12 : struct.nodes.entrySet())
          {
            oprot.writeI32(_iter12.getKey());
            _iter12.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TreeTupleSchemeFactory implements SchemeFactory {
    public TreeTupleScheme getScheme() {
      return new TreeTupleScheme();
    }
  }

  private static class TreeTupleScheme extends TupleScheme<Tree> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Tree struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRootId()) {
        optionals.set(0);
      }
      if (struct.isSetNodes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRootId()) {
        oprot.writeI32(struct.rootId);
      }
      if (struct.isSetNodes()) {
        {
          oprot.writeI32(struct.nodes.size());
          for (Map.Entry<Integer, TreeNode> _iter13 : struct.nodes.entrySet())
          {
            oprot.writeI32(_iter13.getKey());
            _iter13.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Tree struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.rootId = iprot.readI32();
        struct.setRootIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.nodes = new HashMap<Integer,TreeNode>(2*_map14.size);
          int _key15;
          TreeNode _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readI32();
            _val16 = new TreeNode();
            _val16.read(iprot);
            struct.nodes.put(_key15, _val16);
          }
        }
        struct.setNodesIsSet(true);
      }
    }
  }

}

