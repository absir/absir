/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tplatform;

import com.absir.aserv.system.bean.value.JaLang;
import com.absir.data.value.IThrift;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import javax.persistence.MappedSuperclass;
import java.util.*;

@MappedSuperclass
@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-10-30")
public class DPlatformFrom implements org.apache.thrift.TBase<DPlatformFrom, DPlatformFrom._Fields>, java.io.Serializable, Cloneable, Comparable<DPlatformFrom>, IThrift {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DPlatformFrom");

    private static final org.apache.thrift.protocol.TField PLATFORM_FIELD_DESC = new org.apache.thrift.protocol.TField("platform", org.apache.thrift.protocol.TType.STRING, (short) 1);

    private static final org.apache.thrift.protocol.TField CHANNEL_FIELD_DESC = new org.apache.thrift.protocol.TField("channel", org.apache.thrift.protocol.TType.STRING, (short) 2);

    private static final org.apache.thrift.protocol.TField PACKAGE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("packageName", org.apache.thrift.protocol.TType.STRING, (short) 3);

    private static final org.apache.thrift.protocol.TField VERSION_DOUBLE_FIELD_DESC = new org.apache.thrift.protocol.TField("versionDouble", org.apache.thrift.protocol.TType.DOUBLE, (short) 4);

    private static final org.apache.thrift.protocol.TField FROM_STR_FIELD_DESC = new org.apache.thrift.protocol.TField("fromStr", org.apache.thrift.protocol.TType.STRING, (short) 5);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    // required
    @JaLang("平台")
    protected String platform;

    // required
    @JaLang("渠道")
    protected String channel;

    // required
    @JaLang("包名")
    protected String packageName;

    // required
    @JaLang("版本号")
    protected double versionDouble;

    // required
    @JaLang("来源")
    protected String fromStr;

    // isset id assignments
    private static final int __VERSIONDOUBLE_ISSET_ID = 0;

    protected byte __isset_bitfield = 0;

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        schemes.put(StandardScheme.class, new DPlatformFromStandardSchemeFactory());
        schemes.put(TupleScheme.class, new DPlatformFromTupleSchemeFactory());
    }

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        PLATFORM((short) 1, "platform"), CHANNEL((short) 2, "channel"), PACKAGE_NAME((short) 3, "packageName"), VERSION_DOUBLE((short) 4, "versionDouble"), FROM_STR((short) 5, "fromStr");

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
                case // PLATFORM
                1:
                    return PLATFORM;
                case // CHANNEL
                2:
                    return CHANNEL;
                case // PACKAGE_NAME
                3:
                    return PACKAGE_NAME;
                case // VERSION_DOUBLE
                4:
                    return VERSION_DOUBLE;
                case // FROM_STR
                5:
                    return FROM_STR;
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

    public DPlatformFrom() {
    }

    public DPlatformFrom(String platform, String channel, String packageName, double versionDouble, String fromStr) {
        this();
        this.platform = platform;
        this.channel = channel;
        this.packageName = packageName;
        this.versionDouble = versionDouble;
        setVersionDoubleIsSet(true);
        this.fromStr = fromStr;
    }

    /**
   * Performs a deep copy on <i>other</i>.
   */
    public DPlatformFrom(DPlatformFrom other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetPlatform()) {
            this.platform = other.platform;
        }
        if (other.isSetChannel()) {
            this.channel = other.channel;
        }
        if (other.isSetPackageName()) {
            this.packageName = other.packageName;
        }
        this.versionDouble = other.versionDouble;
        if (other.isSetFromStr()) {
            this.fromStr = other.fromStr;
        }
    }

    public DPlatformFrom deepCopy() {
        return new DPlatformFrom(this);
    }

    @Override
    public void clear() {
        this.platform = null;
        this.channel = null;
        this.packageName = null;
        setVersionDoubleIsSet(false);
        this.versionDouble = 0.0;
        this.fromStr = null;
    }

    public String getPlatform() {
        return this.platform;
    }

    public DPlatformFrom setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    public void unsetPlatform() {
        this.platform = null;
    }

    /** Returns true if field platform is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetPlatform() {
        return this.platform != null;
    }

    public void setPlatformIsSet(boolean value) {
        if (!value) {
            this.platform = null;
        }
    }

    public String getChannel() {
        return this.channel;
    }

    public DPlatformFrom setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public void unsetChannel() {
        this.channel = null;
    }

    /** Returns true if field channel is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetChannel() {
        return this.channel != null;
    }

    public void setChannelIsSet(boolean value) {
        if (!value) {
            this.channel = null;
        }
    }

    public String getPackageName() {
        return this.packageName;
    }

    public DPlatformFrom setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public void unsetPackageName() {
        this.packageName = null;
    }

    /** Returns true if field packageName is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetPackageName() {
        return this.packageName != null;
    }

    public void setPackageNameIsSet(boolean value) {
        if (!value) {
            this.packageName = null;
        }
    }

    public double getVersionDouble() {
        return this.versionDouble;
    }

    public DPlatformFrom setVersionDouble(double versionDouble) {
        this.versionDouble = versionDouble;
        setVersionDoubleIsSet(true);
        return this;
    }

    public void unsetVersionDouble() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSIONDOUBLE_ISSET_ID);
    }

    /** Returns true if field versionDouble is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetVersionDouble() {
        return EncodingUtils.testBit(__isset_bitfield, __VERSIONDOUBLE_ISSET_ID);
    }

    public void setVersionDoubleIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSIONDOUBLE_ISSET_ID, value);
    }

    public String getFromStr() {
        return this.fromStr;
    }

    public DPlatformFrom setFromStr(String fromStr) {
        this.fromStr = fromStr;
        return this;
    }

    public void unsetFromStr() {
        this.fromStr = null;
    }

    /** Returns true if field fromStr is set (has been assigned a value) and false otherwise */
    @JsonIgnore
    public boolean isSetFromStr() {
        return this.fromStr != null;
    }

    public void setFromStrIsSet(boolean value) {
        if (!value) {
            this.fromStr = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch(field) {
            case PLATFORM:
                if (value == null) {
                    unsetPlatform();
                } else {
                    setPlatform((String) value);
                }
                break;
            case CHANNEL:
                if (value == null) {
                    unsetChannel();
                } else {
                    setChannel((String) value);
                }
                break;
            case PACKAGE_NAME:
                if (value == null) {
                    unsetPackageName();
                } else {
                    setPackageName((String) value);
                }
                break;
            case VERSION_DOUBLE:
                if (value == null) {
                    unsetVersionDouble();
                } else {
                    setVersionDouble((Double) value);
                }
                break;
            case FROM_STR:
                if (value == null) {
                    unsetFromStr();
                } else {
                    setFromStr((String) value);
                }
                break;
        }
    }

    public Object getFieldValue(_Fields field) {
        switch(field) {
            case PLATFORM:
                return getPlatform();
            case CHANNEL:
                return getChannel();
            case PACKAGE_NAME:
                return getPackageName();
            case VERSION_DOUBLE:
                return getVersionDouble();
            case FROM_STR:
                return getFromStr();
        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch(field) {
            case PLATFORM:
                return isSetPlatform();
            case CHANNEL:
                return isSetChannel();
            case PACKAGE_NAME:
                return isSetPackageName();
            case VERSION_DOUBLE:
                return isSetVersionDouble();
            case FROM_STR:
                return isSetFromStr();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof DPlatformFrom)
            return this.equals((DPlatformFrom) that);
        return false;
    }

    public boolean equals(DPlatformFrom that) {
        if (that == null)
            return false;
        boolean this_present_platform = true && this.isSetPlatform();
        boolean that_present_platform = true && that.isSetPlatform();
        if (this_present_platform || that_present_platform) {
            if (!(this_present_platform && that_present_platform))
                return false;
            if (!this.platform.equals(that.platform))
                return false;
        }
        boolean this_present_channel = true && this.isSetChannel();
        boolean that_present_channel = true && that.isSetChannel();
        if (this_present_channel || that_present_channel) {
            if (!(this_present_channel && that_present_channel))
                return false;
            if (!this.channel.equals(that.channel))
                return false;
        }
        boolean this_present_packageName = true && this.isSetPackageName();
        boolean that_present_packageName = true && that.isSetPackageName();
        if (this_present_packageName || that_present_packageName) {
            if (!(this_present_packageName && that_present_packageName))
                return false;
            if (!this.packageName.equals(that.packageName))
                return false;
        }
        boolean this_present_versionDouble = true;
        boolean that_present_versionDouble = true;
        if (this_present_versionDouble || that_present_versionDouble) {
            if (!(this_present_versionDouble && that_present_versionDouble))
                return false;
            if (this.versionDouble != that.versionDouble)
                return false;
        }
        boolean this_present_fromStr = true && this.isSetFromStr();
        boolean that_present_fromStr = true && that.isSetFromStr();
        if (this_present_fromStr || that_present_fromStr) {
            if (!(this_present_fromStr && that_present_fromStr))
                return false;
            if (!this.fromStr.equals(that.fromStr))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();
        boolean present_platform = true && (isSetPlatform());
        list.add(present_platform);
        if (present_platform)
            list.add(platform);
        boolean present_channel = true && (isSetChannel());
        list.add(present_channel);
        if (present_channel)
            list.add(channel);
        boolean present_packageName = true && (isSetPackageName());
        list.add(present_packageName);
        if (present_packageName)
            list.add(packageName);
        boolean present_versionDouble = true;
        list.add(present_versionDouble);
        if (present_versionDouble)
            list.add(versionDouble);
        boolean present_fromStr = true && (isSetFromStr());
        list.add(present_fromStr);
        if (present_fromStr)
            list.add(fromStr);
        return list.hashCode();
    }

    @Override
    public int compareTo(DPlatformFrom other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int lastComparison = 0;
        lastComparison = Boolean.valueOf(isSetPlatform()).compareTo(other.isSetPlatform());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPlatform()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.platform, other.platform);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetChannel()).compareTo(other.isSetChannel());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetChannel()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channel, other.channel);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetPackageName()).compareTo(other.isSetPackageName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetPackageName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.packageName, other.packageName);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetVersionDouble()).compareTo(other.isSetVersionDouble());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetVersionDouble()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versionDouble, other.versionDouble);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetFromStr()).compareTo(other.isSetFromStr());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetFromStr()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fromStr, other.fromStr);
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
        StringBuilder sb = new StringBuilder("DPlatformFrom(");
        boolean first = true;
        sb.append("platform:");
        if (this.platform == null) {
            sb.append("null");
        } else {
            sb.append(this.platform);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("channel:");
        if (this.channel == null) {
            sb.append("null");
        } else {
            sb.append(this.channel);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("packageName:");
        if (this.packageName == null) {
            sb.append("null");
        } else {
            sb.append(this.packageName);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("versionDouble:");
        sb.append(this.versionDouble);
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("fromStr:");
        if (this.fromStr == null) {
            sb.append("null");
        } else {
            sb.append(this.fromStr);
        }
        first = false;
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
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class DPlatformFromStandardSchemeFactory implements SchemeFactory {

        public DPlatformFromStandardScheme getScheme() {
            return new DPlatformFromStandardScheme();
        }
    }

    private static class DPlatformFromStandardScheme extends StandardScheme<DPlatformFrom> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, DPlatformFrom struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch(schemeField.id) {
                    case // PLATFORM
                    1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.platform = iprot.readString();
                            struct.setPlatformIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // CHANNEL
                    2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.channel = iprot.readString();
                            struct.setChannelIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // PACKAGE_NAME
                    3:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.packageName = iprot.readString();
                            struct.setPackageNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // VERSION_DOUBLE
                    4:
                        if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
                            struct.versionDouble = iprot.readDouble();
                            struct.setVersionDoubleIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // FROM_STR
                    5:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.fromStr = iprot.readString();
                            struct.setFromStrIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, DPlatformFrom struct) throws org.apache.thrift.TException {
            struct.validate();
            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.platform != null) {
                oprot.writeFieldBegin(PLATFORM_FIELD_DESC);
                oprot.writeString(struct.platform);
                oprot.writeFieldEnd();
            }
            if (struct.channel != null) {
                oprot.writeFieldBegin(CHANNEL_FIELD_DESC);
                oprot.writeString(struct.channel);
                oprot.writeFieldEnd();
            }
            if (struct.packageName != null) {
                oprot.writeFieldBegin(PACKAGE_NAME_FIELD_DESC);
                oprot.writeString(struct.packageName);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(VERSION_DOUBLE_FIELD_DESC);
            oprot.writeDouble(struct.versionDouble);
            oprot.writeFieldEnd();
            if (struct.fromStr != null) {
                oprot.writeFieldBegin(FROM_STR_FIELD_DESC);
                oprot.writeString(struct.fromStr);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    private static class DPlatformFromTupleSchemeFactory implements SchemeFactory {

        public DPlatformFromTupleScheme getScheme() {
            return new DPlatformFromTupleScheme();
        }
    }

    private static class DPlatformFromTupleScheme extends TupleScheme<DPlatformFrom> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, DPlatformFrom struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetPlatform()) {
                optionals.set(0);
            }
            if (struct.isSetChannel()) {
                optionals.set(1);
            }
            if (struct.isSetPackageName()) {
                optionals.set(2);
            }
            if (struct.isSetVersionDouble()) {
                optionals.set(3);
            }
            if (struct.isSetFromStr()) {
                optionals.set(4);
            }
            oprot.writeBitSet(optionals, 5);
            if (struct.isSetPlatform()) {
                oprot.writeString(struct.platform);
            }
            if (struct.isSetChannel()) {
                oprot.writeString(struct.channel);
            }
            if (struct.isSetPackageName()) {
                oprot.writeString(struct.packageName);
            }
            if (struct.isSetVersionDouble()) {
                oprot.writeDouble(struct.versionDouble);
            }
            if (struct.isSetFromStr()) {
                oprot.writeString(struct.fromStr);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, DPlatformFrom struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(5);
            if (incoming.get(0)) {
                struct.platform = iprot.readString();
                struct.setPlatformIsSet(true);
            }
            if (incoming.get(1)) {
                struct.channel = iprot.readString();
                struct.setChannelIsSet(true);
            }
            if (incoming.get(2)) {
                struct.packageName = iprot.readString();
                struct.setPackageNameIsSet(true);
            }
            if (incoming.get(3)) {
                struct.versionDouble = iprot.readDouble();
                struct.setVersionDoubleIsSet(true);
            }
            if (incoming.get(4)) {
                struct.fromStr = iprot.readString();
                struct.setFromStrIsSet(true);
            }
        }
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.PLATFORM, new org.apache.thrift.meta_data.FieldMetaData("platform", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.CHANNEL, new org.apache.thrift.meta_data.FieldMetaData("channel", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.PACKAGE_NAME, new org.apache.thrift.meta_data.FieldMetaData("packageName", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.VERSION_DOUBLE, new org.apache.thrift.meta_data.FieldMetaData("versionDouble", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
        tmpMap.put(_Fields.FROM_STR, new org.apache.thrift.meta_data.FieldMetaData("fromStr", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DPlatformFrom.class, metaDataMap);
    }

    public DPlatformFrom create() {
        return new DPlatformFrom();
    }

    public DPlatformFrom clone() {
        return cloneDepth(0);
    }

    public DPlatformFrom cloneDepth(int _depth) {
        DPlatformFrom _clone = create();
        _clone.setPlatform(platform);
        _clone.setChannel(channel);
        _clone.setPackageName(packageName);
        _clone.setVersionDouble(versionDouble);
        _clone.setFromStr(fromStr);
        cloneMore(_clone, _depth);
        return _clone;
    }

    public void cloneMore(DPlatformFrom _clone, int _depth) {
    }
}
