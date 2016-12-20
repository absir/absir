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
public class TFromSetting implements org.apache.thrift.TBase<TFromSetting, TFromSetting._Fields>, java.io.Serializable, Cloneable, Comparable<TFromSetting> {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFromSetting");

    private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short) 1);

    private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short) 2);

    private static final org.apache.thrift.protocol.TField FORCE_FIELD_DESC = new org.apache.thrift.protocol.TField("force", org.apache.thrift.protocol.TType.BOOL, (short) 3);

    private static final org.apache.thrift.protocol.TField OPEN_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("openUrl", org.apache.thrift.protocol.TType.STRING, (short) 4);

    private static final org.apache.thrift.protocol.TField CDN_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("cdnUrl", org.apache.thrift.protocol.TType.STRING, (short) 5);

    private static final org.apache.thrift.protocol.TField OTHER_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("otherUrl", org.apache.thrift.protocol.TType.STRING, (short) 6);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    // optional
    protected String title;

    // optional
    protected String message;

    // optional
    protected boolean force;

    // optional
    protected String openUrl;

    // optional
    protected String cdnUrl;

    // optional
    protected String otherUrl;

    // isset id assignments
    private static final int __FORCE_ISSET_ID = 0;

    protected byte __isset_bitfield = 0;

    private static final _Fields optionals[] = { _Fields.TITLE, _Fields.MESSAGE, _Fields.FORCE, _Fields.OPEN_URL, _Fields.CDN_URL, _Fields.OTHER_URL };

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        schemes.put(StandardScheme.class, new TFromSettingStandardSchemeFactory());
        schemes.put(TupleScheme.class, new TFromSettingTupleSchemeFactory());
    }

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        TITLE((short) 1, "title"), MESSAGE((short) 2, "message"), FORCE((short) 3, "force"), OPEN_URL((short) 4, "openUrl"), CDN_URL((short) 5, "cdnUrl"), OTHER_URL((short) 6, "otherUrl");

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
                case // TITLE
                1:
                    return TITLE;
                case // MESSAGE
                2:
                    return MESSAGE;
                case // FORCE
                3:
                    return FORCE;
                case // OPEN_URL
                4:
                    return OPEN_URL;
                case // CDN_URL
                5:
                    return CDN_URL;
                case // OTHER_URL
                6:
                    return OTHER_URL;
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
        tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.FORCE, new org.apache.thrift.meta_data.FieldMetaData("force", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
        tmpMap.put(_Fields.OPEN_URL, new org.apache.thrift.meta_data.FieldMetaData("openUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.CDN_URL, new org.apache.thrift.meta_data.FieldMetaData("cdnUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.OTHER_URL, new org.apache.thrift.meta_data.FieldMetaData("otherUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFromSetting.class, metaDataMap);
    }

    public TFromSetting() {
        this.title = "";
        this.message = "";
        this.openUrl = "";
        this.cdnUrl = "";
        this.otherUrl = "";
    }

    /**
   * Performs a deep copy on <i>other</i>.
   */
    public TFromSetting(TFromSetting other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetMessage()) {
            this.message = other.message;
        }
        this.force = other.force;
        if (other.isSetOpenUrl()) {
            this.openUrl = other.openUrl;
        }
        if (other.isSetCdnUrl()) {
            this.cdnUrl = other.cdnUrl;
        }
        if (other.isSetOtherUrl()) {
            this.otherUrl = other.otherUrl;
        }
    }

    public TFromSetting deepCopy() {
        return new TFromSetting(this);
    }

    @Override
    public void clear() {
        this.title = "";
        this.message = "";
        setForceIsSet(false);
        this.force = false;
        this.openUrl = "";
        this.cdnUrl = "";
        this.otherUrl = "";
    }

    public String getTitle() {
        return this.title;
    }

    public TFromSetting setTitle(String title) {
        this.title = title;
        return this;
    }

    public void unsetTitle() {
        this.title = null;
    }

    /** Returns true if field title is set (has been assigned a value) and false otherwise */
    public boolean isSetTitle() {
        return this.title != null;
    }

    public void setTitleIsSet(boolean value) {
        if (!value) {
            this.title = null;
        }
    }

    public String getMessage() {
        return this.message;
    }

    public TFromSetting setMessage(String message) {
        this.message = message;
        return this;
    }

    public void unsetMessage() {
        this.message = null;
    }

    /** Returns true if field message is set (has been assigned a value) and false otherwise */
    public boolean isSetMessage() {
        return this.message != null;
    }

    public void setMessageIsSet(boolean value) {
        if (!value) {
            this.message = null;
        }
    }

    public boolean isForce() {
        return this.force;
    }

    public TFromSetting setForce(boolean force) {
        this.force = force;
        setForceIsSet(true);
        return this;
    }

    public void unsetForce() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FORCE_ISSET_ID);
    }

    /** Returns true if field force is set (has been assigned a value) and false otherwise */
    public boolean isSetForce() {
        return EncodingUtils.testBit(__isset_bitfield, __FORCE_ISSET_ID);
    }

    public void setForceIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FORCE_ISSET_ID, value);
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public TFromSetting setOpenUrl(String openUrl) {
        this.openUrl = openUrl;
        return this;
    }

    public void unsetOpenUrl() {
        this.openUrl = null;
    }

    /** Returns true if field openUrl is set (has been assigned a value) and false otherwise */
    public boolean isSetOpenUrl() {
        return this.openUrl != null;
    }

    public void setOpenUrlIsSet(boolean value) {
        if (!value) {
            this.openUrl = null;
        }
    }

    public String getCdnUrl() {
        return this.cdnUrl;
    }

    public TFromSetting setCdnUrl(String cdnUrl) {
        this.cdnUrl = cdnUrl;
        return this;
    }

    public void unsetCdnUrl() {
        this.cdnUrl = null;
    }

    /** Returns true if field cdnUrl is set (has been assigned a value) and false otherwise */
    public boolean isSetCdnUrl() {
        return this.cdnUrl != null;
    }

    public void setCdnUrlIsSet(boolean value) {
        if (!value) {
            this.cdnUrl = null;
        }
    }

    public String getOtherUrl() {
        return this.otherUrl;
    }

    public TFromSetting setOtherUrl(String otherUrl) {
        this.otherUrl = otherUrl;
        return this;
    }

    public void unsetOtherUrl() {
        this.otherUrl = null;
    }

    /** Returns true if field otherUrl is set (has been assigned a value) and false otherwise */
    public boolean isSetOtherUrl() {
        return this.otherUrl != null;
    }

    public void setOtherUrlIsSet(boolean value) {
        if (!value) {
            this.otherUrl = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch(field) {
            case TITLE:
                if (value == null) {
                    unsetTitle();
                } else {
                    setTitle((String) value);
                }
                break;
            case MESSAGE:
                if (value == null) {
                    unsetMessage();
                } else {
                    setMessage((String) value);
                }
                break;
            case FORCE:
                if (value == null) {
                    unsetForce();
                } else {
                    setForce((Boolean) value);
                }
                break;
            case OPEN_URL:
                if (value == null) {
                    unsetOpenUrl();
                } else {
                    setOpenUrl((String) value);
                }
                break;
            case CDN_URL:
                if (value == null) {
                    unsetCdnUrl();
                } else {
                    setCdnUrl((String) value);
                }
                break;
            case OTHER_URL:
                if (value == null) {
                    unsetOtherUrl();
                } else {
                    setOtherUrl((String) value);
                }
                break;
        }
    }

    public Object getFieldValue(_Fields field) {
        switch(field) {
            case TITLE:
                return getTitle();
            case MESSAGE:
                return getMessage();
            case FORCE:
                return isForce();
            case OPEN_URL:
                return getOpenUrl();
            case CDN_URL:
                return getCdnUrl();
            case OTHER_URL:
                return getOtherUrl();
        }
        throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }
        switch(field) {
            case TITLE:
                return isSetTitle();
            case MESSAGE:
                return isSetMessage();
            case FORCE:
                return isSetForce();
            case OPEN_URL:
                return isSetOpenUrl();
            case CDN_URL:
                return isSetCdnUrl();
            case OTHER_URL:
                return isSetOtherUrl();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof TFromSetting)
            return this.equals((TFromSetting) that);
        return false;
    }

    public boolean equals(TFromSetting that) {
        if (that == null)
            return false;
        boolean this_present_title = true && this.isSetTitle();
        boolean that_present_title = true && that.isSetTitle();
        if (this_present_title || that_present_title) {
            if (!(this_present_title && that_present_title))
                return false;
            if (!this.title.equals(that.title))
                return false;
        }
        boolean this_present_message = true && this.isSetMessage();
        boolean that_present_message = true && that.isSetMessage();
        if (this_present_message || that_present_message) {
            if (!(this_present_message && that_present_message))
                return false;
            if (!this.message.equals(that.message))
                return false;
        }
        boolean this_present_force = true && this.isSetForce();
        boolean that_present_force = true && that.isSetForce();
        if (this_present_force || that_present_force) {
            if (!(this_present_force && that_present_force))
                return false;
            if (this.force != that.force)
                return false;
        }
        boolean this_present_openUrl = true && this.isSetOpenUrl();
        boolean that_present_openUrl = true && that.isSetOpenUrl();
        if (this_present_openUrl || that_present_openUrl) {
            if (!(this_present_openUrl && that_present_openUrl))
                return false;
            if (!this.openUrl.equals(that.openUrl))
                return false;
        }
        boolean this_present_cdnUrl = true && this.isSetCdnUrl();
        boolean that_present_cdnUrl = true && that.isSetCdnUrl();
        if (this_present_cdnUrl || that_present_cdnUrl) {
            if (!(this_present_cdnUrl && that_present_cdnUrl))
                return false;
            if (!this.cdnUrl.equals(that.cdnUrl))
                return false;
        }
        boolean this_present_otherUrl = true && this.isSetOtherUrl();
        boolean that_present_otherUrl = true && that.isSetOtherUrl();
        if (this_present_otherUrl || that_present_otherUrl) {
            if (!(this_present_otherUrl && that_present_otherUrl))
                return false;
            if (!this.otherUrl.equals(that.otherUrl))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();
        boolean present_title = true && (isSetTitle());
        list.add(present_title);
        if (present_title)
            list.add(title);
        boolean present_message = true && (isSetMessage());
        list.add(present_message);
        if (present_message)
            list.add(message);
        boolean present_force = true && (isSetForce());
        list.add(present_force);
        if (present_force)
            list.add(force);
        boolean present_openUrl = true && (isSetOpenUrl());
        list.add(present_openUrl);
        if (present_openUrl)
            list.add(openUrl);
        boolean present_cdnUrl = true && (isSetCdnUrl());
        list.add(present_cdnUrl);
        if (present_cdnUrl)
            list.add(cdnUrl);
        boolean present_otherUrl = true && (isSetOtherUrl());
        list.add(present_otherUrl);
        if (present_otherUrl)
            list.add(otherUrl);
        return list.hashCode();
    }

    @Override
    public int compareTo(TFromSetting other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }
        int lastComparison = 0;
        lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetTitle()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetMessage()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetForce()).compareTo(other.isSetForce());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetForce()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.force, other.force);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetOpenUrl()).compareTo(other.isSetOpenUrl());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetOpenUrl()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.openUrl, other.openUrl);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetCdnUrl()).compareTo(other.isSetCdnUrl());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetCdnUrl()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cdnUrl, other.cdnUrl);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetOtherUrl()).compareTo(other.isSetOtherUrl());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetOtherUrl()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otherUrl, other.otherUrl);
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
        StringBuilder sb = new StringBuilder("TFromSetting(");
        boolean first = true;
        if (isSetTitle()) {
            sb.append("title:");
            if (this.title == null) {
                sb.append("null");
            } else {
                sb.append(this.title);
            }
            first = false;
        }
        if (isSetMessage()) {
            if (!first)
                sb.append(", ");
            sb.append("message:");
            if (this.message == null) {
                sb.append("null");
            } else {
                sb.append(this.message);
            }
            first = false;
        }
        if (isSetForce()) {
            if (!first)
                sb.append(", ");
            sb.append("force:");
            sb.append(this.force);
            first = false;
        }
        if (isSetOpenUrl()) {
            if (!first)
                sb.append(", ");
            sb.append("openUrl:");
            if (this.openUrl == null) {
                sb.append("null");
            } else {
                sb.append(this.openUrl);
            }
            first = false;
        }
        if (isSetCdnUrl()) {
            if (!first)
                sb.append(", ");
            sb.append("cdnUrl:");
            if (this.cdnUrl == null) {
                sb.append("null");
            } else {
                sb.append(this.cdnUrl);
            }
            first = false;
        }
        if (isSetOtherUrl()) {
            if (!first)
                sb.append(", ");
            sb.append("otherUrl:");
            if (this.otherUrl == null) {
                sb.append("null");
            } else {
                sb.append(this.otherUrl);
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
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class TFromSettingStandardSchemeFactory implements SchemeFactory {

        public TFromSettingStandardScheme getScheme() {
            return new TFromSettingStandardScheme();
        }
    }

    private static class TFromSettingStandardScheme extends StandardScheme<TFromSetting> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, TFromSetting struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch(schemeField.id) {
                    case // TITLE
                    1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.title = iprot.readString();
                            struct.setTitleIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // MESSAGE
                    2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.message = iprot.readString();
                            struct.setMessageIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // FORCE
                    3:
                        if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                            struct.force = iprot.readBool();
                            struct.setForceIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // OPEN_URL
                    4:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.openUrl = iprot.readString();
                            struct.setOpenUrlIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // CDN_URL
                    5:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.cdnUrl = iprot.readString();
                            struct.setCdnUrlIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // OTHER_URL
                    6:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.otherUrl = iprot.readString();
                            struct.setOtherUrlIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, TFromSetting struct) throws org.apache.thrift.TException {
            struct.validate();
            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.title != null) {
                if (struct.isSetTitle()) {
                    oprot.writeFieldBegin(TITLE_FIELD_DESC);
                    oprot.writeString(struct.title);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.message != null) {
                if (struct.isSetMessage()) {
                    oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
                    oprot.writeString(struct.message);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.isSetForce()) {
                oprot.writeFieldBegin(FORCE_FIELD_DESC);
                oprot.writeBool(struct.force);
                oprot.writeFieldEnd();
            }
            if (struct.openUrl != null) {
                if (struct.isSetOpenUrl()) {
                    oprot.writeFieldBegin(OPEN_URL_FIELD_DESC);
                    oprot.writeString(struct.openUrl);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.cdnUrl != null) {
                if (struct.isSetCdnUrl()) {
                    oprot.writeFieldBegin(CDN_URL_FIELD_DESC);
                    oprot.writeString(struct.cdnUrl);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.otherUrl != null) {
                if (struct.isSetOtherUrl()) {
                    oprot.writeFieldBegin(OTHER_URL_FIELD_DESC);
                    oprot.writeString(struct.otherUrl);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    private static class TFromSettingTupleSchemeFactory implements SchemeFactory {

        public TFromSettingTupleScheme getScheme() {
            return new TFromSettingTupleScheme();
        }
    }

    private static class TFromSettingTupleScheme extends TupleScheme<TFromSetting> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, TFromSetting struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetTitle()) {
                optionals.set(0);
            }
            if (struct.isSetMessage()) {
                optionals.set(1);
            }
            if (struct.isSetForce()) {
                optionals.set(2);
            }
            if (struct.isSetOpenUrl()) {
                optionals.set(3);
            }
            if (struct.isSetCdnUrl()) {
                optionals.set(4);
            }
            if (struct.isSetOtherUrl()) {
                optionals.set(5);
            }
            oprot.writeBitSet(optionals, 6);
            if (struct.isSetTitle()) {
                oprot.writeString(struct.title);
            }
            if (struct.isSetMessage()) {
                oprot.writeString(struct.message);
            }
            if (struct.isSetForce()) {
                oprot.writeBool(struct.force);
            }
            if (struct.isSetOpenUrl()) {
                oprot.writeString(struct.openUrl);
            }
            if (struct.isSetCdnUrl()) {
                oprot.writeString(struct.cdnUrl);
            }
            if (struct.isSetOtherUrl()) {
                oprot.writeString(struct.otherUrl);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, TFromSetting struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(6);
            if (incoming.get(0)) {
                struct.title = iprot.readString();
                struct.setTitleIsSet(true);
            }
            if (incoming.get(1)) {
                struct.message = iprot.readString();
                struct.setMessageIsSet(true);
            }
            if (incoming.get(2)) {
                struct.force = iprot.readBool();
                struct.setForceIsSet(true);
            }
            if (incoming.get(3)) {
                struct.openUrl = iprot.readString();
                struct.setOpenUrlIsSet(true);
            }
            if (incoming.get(4)) {
                struct.cdnUrl = iprot.readString();
                struct.setCdnUrlIsSet(true);
            }
            if (incoming.get(5)) {
                struct.otherUrl = iprot.readString();
                struct.setOtherUrlIsSet(true);
            }
        }
    }

    public byte get__isset_bitfield() {
        return __isset_bitfield;
    }

    public void set__isset_bitfield(byte __isset_bitfield) {
        this.__isset_bitfield = __isset_bitfield;
    }

    public TFromSetting create() {
        return new TFromSetting();
    }

    public TFromSetting clone() {
        return cloneDepth(0);
    }

    public TFromSetting cloneDepth(int _depth) {
        TFromSetting _clone = create();
        _clone.title = title;
        _clone.message = message;
        _clone.force = force;
        _clone.openUrl = openUrl;
        _clone.cdnUrl = cdnUrl;
        _clone.otherUrl = otherUrl;
        _clone.__isset_bitfield = __isset_bitfield;
        cloneMore(_clone, _depth);
        return _clone;
    }

    public void cloneMore(TFromSetting _clone, int _depth) {
    }
}
