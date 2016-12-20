/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tplatform;

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

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-20")
public class OrderResult implements org.apache.thrift.TBase<OrderResult, OrderResult._Fields>, java.io.Serializable, Cloneable, Comparable<OrderResult> {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OrderResult");

    private static final org.apache.thrift.protocol.TField TRADE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tradeId", org.apache.thrift.protocol.TType.STRING, (short) 1);

    private static final org.apache.thrift.protocol.TField TRADE_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("tradeData", org.apache.thrift.protocol.TType.STRING, (short) 2);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    // required
    protected String tradeId;

    // optional
    protected String tradeData;

    // isset id assignments
    private static final _Fields optionals[] = { _Fields.TRADE_DATA };

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        schemes.put(StandardScheme.class, new OrderResultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new OrderResultTupleSchemeFactory());
    }

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        TRADE_ID((short) 1, "tradeId"), TRADE_DATA((short) 2, "tradeData");

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
                case // TRADE_ID
                1:
                    return TRADE_ID;
                case // TRADE_DATA
                2:
                    return TRADE_DATA;
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
            if (fields == null)
                throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
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

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.TRADE_ID, new org.apache.thrift.meta_data.FieldMetaData("tradeId", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.TRADE_DATA, new org.apache.thrift.meta_data.FieldMetaData("tradeData", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OrderResult.class, metaDataMap);
    }

    public OrderResult() {
    }

    public OrderResult(String tradeId) {
        this();
        this.tradeId = tradeId;
    }

    /**
   * Performs a deep copy on <i>other</i>.
   */
    public OrderResult(OrderResult other) {
        if (other.isSetTradeId()) {
            this.tradeId = other.tradeId;
        }
        if (other.isSetTradeData()) {
            this.tradeData = other.tradeData;
        }
    }

    public OrderResult deepCopy() {
        return new OrderResult(this);
    }

    @Override
    public void clear() {
        this.tradeId = null;
        this.tradeData = null;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public OrderResult setTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    public void unsetTradeId() {
        this.tradeId = null;
    }

    /** Returns true if field tradeId is set (has been assigned a value) and false otherwise */
    public boolean isSetTradeId() {
        return this.tradeId != null;
    }

    public void setTradeIdIsSet(boolean value) {
        if (!value) {
            this.tradeId = null;
        }
    }

    public String getTradeData() {
        return this.tradeData;
    }

    public OrderResult setTradeData(String tradeData) {
        this.tradeData = tradeData;
        return this;
    }

    public void unsetTradeData() {
        this.tradeData = null;
    }

    /** Returns true if field tradeData is set (has been assigned a value) and false otherwise */
    public boolean isSetTradeData() {
        return this.tradeData != null;
    }

    public void setTradeDataIsSet(boolean value) {
        if (!value) {
            this.tradeData = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch(field) {
            case TRADE_ID:
                if (value == null) {
                    unsetTradeId();
                } else {
                    setTradeId((String) value);
                }
                break;
            case TRADE_DATA:
                if (value == null) {
                    unsetTradeData();
                } else {
                    setTradeData((String) value);
                }
                break;
        }
    }

    public Object getFieldValue(_Fields field) {
        switch(field) {
            case TRADE_ID:
                return getTradeId();
            case TRADE_DATA:
                return getTradeData();
        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch(field) {
            case TRADE_ID:
                return isSetTradeId();
            case TRADE_DATA:
                return isSetTradeData();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof OrderResult)
            return this.equals((OrderResult) that);
        return false;
    }

    public boolean equals(OrderResult that) {
        if (that == null)
            return false;
        boolean this_present_tradeId = true && this.isSetTradeId();
        boolean that_present_tradeId = true && that.isSetTradeId();
        if (this_present_tradeId || that_present_tradeId) {
            if (!(this_present_tradeId && that_present_tradeId))
                return false;
            if (!this.tradeId.equals(that.tradeId))
                return false;
        }
        boolean this_present_tradeData = true && this.isSetTradeData();
        boolean that_present_tradeData = true && that.isSetTradeData();
        if (this_present_tradeData || that_present_tradeData) {
            if (!(this_present_tradeData && that_present_tradeData))
                return false;
            if (!this.tradeData.equals(that.tradeData))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();
        boolean present_tradeId = true && (isSetTradeId());
        list.add(present_tradeId);
        if (present_tradeId)
            list.add(tradeId);
        boolean present_tradeData = true && (isSetTradeData());
        list.add(present_tradeData);
        if (present_tradeData)
            list.add(tradeData);
        return list.hashCode();
    }

    @Override
    public int compareTo(OrderResult other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int lastComparison = 0;
        lastComparison = Boolean.valueOf(isSetTradeId()).compareTo(other.isSetTradeId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetTradeId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tradeId, other.tradeId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetTradeData()).compareTo(other.isSetTradeData());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetTradeData()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tradeData, other.tradeData);
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
        StringBuilder sb = new StringBuilder("OrderResult(");
        boolean first = true;
        sb.append("tradeId:");
        if (this.tradeId == null) {
            sb.append("null");
        } else {
            sb.append(this.tradeId);
        }
        first = false;
        if (isSetTradeData()) {
            if (!first)
                sb.append(", ");
            sb.append("tradeData:");
            if (this.tradeData == null) {
                sb.append("null");
            } else {
                sb.append(this.tradeData);
            }
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
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
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class OrderResultStandardSchemeFactory implements SchemeFactory {

        public OrderResultStandardScheme getScheme() {
            return new OrderResultStandardScheme();
        }
    }

    private static class OrderResultStandardScheme extends StandardScheme<OrderResult> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, OrderResult struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch(schemeField.id) {
                    case // TRADE_ID
                    1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.tradeId = iprot.readString();
                            struct.setTradeIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // TRADE_DATA
                    2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.tradeData = iprot.readString();
                            struct.setTradeDataIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, OrderResult struct) throws org.apache.thrift.TException {
            struct.validate();
            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.tradeId != null) {
                oprot.writeFieldBegin(TRADE_ID_FIELD_DESC);
                oprot.writeString(struct.tradeId);
                oprot.writeFieldEnd();
            }
            if (struct.tradeData != null) {
                if (struct.isSetTradeData()) {
                    oprot.writeFieldBegin(TRADE_DATA_FIELD_DESC);
                    oprot.writeString(struct.tradeData);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    private static class OrderResultTupleSchemeFactory implements SchemeFactory {

        public OrderResultTupleScheme getScheme() {
            return new OrderResultTupleScheme();
        }
    }

    private static class OrderResultTupleScheme extends TupleScheme<OrderResult> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, OrderResult struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetTradeId()) {
                optionals.set(0);
            }
            if (struct.isSetTradeData()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetTradeId()) {
                oprot.writeString(struct.tradeId);
            }
            if (struct.isSetTradeData()) {
                oprot.writeString(struct.tradeData);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, OrderResult struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.tradeId = iprot.readString();
                struct.setTradeIdIsSet(true);
            }
            if (incoming.get(1)) {
                struct.tradeData = iprot.readString();
                struct.setTradeDataIsSet(true);
            }
        }
    }

    public OrderResult create() {
        return new OrderResult();
    }

    public OrderResult clone() {
        return cloneDepth(0);
    }

    public OrderResult cloneDepth(int _depth) {
        OrderResult _clone = create();
        _clone.tradeId = tradeId;
        _clone.tradeData = tradeData;
        cloneMore(_clone, _depth);
        return _clone;
    }

    public void cloneMore(OrderResult _clone, int _depth) {
    }
}
