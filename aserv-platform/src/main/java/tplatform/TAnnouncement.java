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
public class TAnnouncement implements org.apache.thrift.TBase<TAnnouncement, TAnnouncement._Fields>, java.io.Serializable, Cloneable, Comparable<TAnnouncement> {

    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAnnouncement");

    private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short) 1);

    private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short) 2);

    private static final org.apache.thrift.protocol.TField ATTACH_FIELD_DESC = new org.apache.thrift.protocol.TField("attach", org.apache.thrift.protocol.TType.STRING, (short) 3);

    private static final org.apache.thrift.protocol.TField OPEN_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("openUrl", org.apache.thrift.protocol.TType.STRING, (short) 4);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    // required
    protected String title;

    // required
    protected String content;

    // required
    protected String attach;

    // optional
    protected String openUrl;

    // isset id assignments
    private static final _Fields optionals[] = { _Fields.OPEN_URL };

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        schemes.put(StandardScheme.class, new TAnnouncementStandardSchemeFactory());
        schemes.put(TupleScheme.class, new TAnnouncementTupleSchemeFactory());
    }

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        TITLE((short) 1, "title"), CONTENT((short) 2, "content"), ATTACH((short) 3, "attach"), OPEN_URL((short) 4, "openUrl");

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
                case // CONTENT
                2:
                    return CONTENT;
                case // ATTACH
                3:
                    return ATTACH;
                case // OPEN_URL
                4:
                    return OPEN_URL;
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
        tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ATTACH, new org.apache.thrift.meta_data.FieldMetaData("attach", org.apache.thrift.TFieldRequirementType.DEFAULT, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.OPEN_URL, new org.apache.thrift.meta_data.FieldMetaData("openUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAnnouncement.class, metaDataMap);
    }

    public TAnnouncement() {
        this.openUrl = "";
    }

    public TAnnouncement(String title, String content, String attach) {
        this();
        this.title = title;
        this.content = content;
        this.attach = attach;
    }

    /**
   * Performs a deep copy on <i>other</i>.
   */
    public TAnnouncement(TAnnouncement other) {
        if (other.isSetTitle()) {
            this.title = other.title;
        }
        if (other.isSetContent()) {
            this.content = other.content;
        }
        if (other.isSetAttach()) {
            this.attach = other.attach;
        }
        if (other.isSetOpenUrl()) {
            this.openUrl = other.openUrl;
        }
    }

    public TAnnouncement deepCopy() {
        return new TAnnouncement(this);
    }

    @Override
    public void clear() {
        this.title = null;
        this.content = null;
        this.attach = null;
        this.openUrl = "";
    }

    public String getTitle() {
        return this.title;
    }

    public TAnnouncement setTitle(String title) {
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

    public String getContent() {
        return this.content;
    }

    public TAnnouncement setContent(String content) {
        this.content = content;
        return this;
    }

    public void unsetContent() {
        this.content = null;
    }

    /** Returns true if field content is set (has been assigned a value) and false otherwise */
    public boolean isSetContent() {
        return this.content != null;
    }

    public void setContentIsSet(boolean value) {
        if (!value) {
            this.content = null;
        }
    }

    public String getAttach() {
        return this.attach;
    }

    public TAnnouncement setAttach(String attach) {
        this.attach = attach;
        return this;
    }

    public void unsetAttach() {
        this.attach = null;
    }

    /** Returns true if field attach is set (has been assigned a value) and false otherwise */
    public boolean isSetAttach() {
        return this.attach != null;
    }

    public void setAttachIsSet(boolean value) {
        if (!value) {
            this.attach = null;
        }
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public TAnnouncement setOpenUrl(String openUrl) {
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

    public void setFieldValue(_Fields field, Object value) {
        switch(field) {
            case TITLE:
                if (value == null) {
                    unsetTitle();
                } else {
                    setTitle((String) value);
                }
                break;
            case CONTENT:
                if (value == null) {
                    unsetContent();
                } else {
                    setContent((String) value);
                }
                break;
            case ATTACH:
                if (value == null) {
                    unsetAttach();
                } else {
                    setAttach((String) value);
                }
                break;
            case OPEN_URL:
                if (value == null) {
                    unsetOpenUrl();
                } else {
                    setOpenUrl((String) value);
                }
                break;
        }
    }

    public Object getFieldValue(_Fields field) {
        switch(field) {
            case TITLE:
                return getTitle();
            case CONTENT:
                return getContent();
            case ATTACH:
                return getAttach();
            case OPEN_URL:
                return getOpenUrl();
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
            case CONTENT:
                return isSetContent();
            case ATTACH:
                return isSetAttach();
            case OPEN_URL:
                return isSetOpenUrl();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof TAnnouncement)
            return this.equals((TAnnouncement) that);
        return false;
    }

    public boolean equals(TAnnouncement that) {
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
        boolean this_present_content = true && this.isSetContent();
        boolean that_present_content = true && that.isSetContent();
        if (this_present_content || that_present_content) {
            if (!(this_present_content && that_present_content))
                return false;
            if (!this.content.equals(that.content))
                return false;
        }
        boolean this_present_attach = true && this.isSetAttach();
        boolean that_present_attach = true && that.isSetAttach();
        if (this_present_attach || that_present_attach) {
            if (!(this_present_attach && that_present_attach))
                return false;
            if (!this.attach.equals(that.attach))
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
        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();
        boolean present_title = true && (isSetTitle());
        list.add(present_title);
        if (present_title)
            list.add(title);
        boolean present_content = true && (isSetContent());
        list.add(present_content);
        if (present_content)
            list.add(content);
        boolean present_attach = true && (isSetAttach());
        list.add(present_attach);
        if (present_attach)
            list.add(attach);
        boolean present_openUrl = true && (isSetOpenUrl());
        list.add(present_openUrl);
        if (present_openUrl)
            list.add(openUrl);
        return list.hashCode();
    }

    @Override
    public int compareTo(TAnnouncement other) {
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
        lastComparison = Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetContent()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetAttach()).compareTo(other.isSetAttach());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAttach()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attach, other.attach);
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
        StringBuilder sb = new StringBuilder("TAnnouncement(");
        boolean first = true;
        sb.append("title:");
        if (this.title == null) {
            sb.append("null");
        } else {
            sb.append(this.title);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("content:");
        if (this.content == null) {
            sb.append("null");
        } else {
            sb.append(this.content);
        }
        first = false;
        if (!first)
            sb.append(", ");
        sb.append("attach:");
        if (this.attach == null) {
            sb.append("null");
        } else {
            sb.append(this.attach);
        }
        first = false;
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

    private static class TAnnouncementStandardSchemeFactory implements SchemeFactory {

        public TAnnouncementStandardScheme getScheme() {
            return new TAnnouncementStandardScheme();
        }
    }

    private static class TAnnouncementStandardScheme extends StandardScheme<TAnnouncement> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, TAnnouncement struct) throws org.apache.thrift.TException {
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
                    case // CONTENT
                    2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.content = iprot.readString();
                            struct.setContentIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case // ATTACH
                    3:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.attach = iprot.readString();
                            struct.setAttachIsSet(true);
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
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();
            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, TAnnouncement struct) throws org.apache.thrift.TException {
            struct.validate();
            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.title != null) {
                oprot.writeFieldBegin(TITLE_FIELD_DESC);
                oprot.writeString(struct.title);
                oprot.writeFieldEnd();
            }
            if (struct.content != null) {
                oprot.writeFieldBegin(CONTENT_FIELD_DESC);
                oprot.writeString(struct.content);
                oprot.writeFieldEnd();
            }
            if (struct.attach != null) {
                oprot.writeFieldBegin(ATTACH_FIELD_DESC);
                oprot.writeString(struct.attach);
                oprot.writeFieldEnd();
            }
            if (struct.openUrl != null) {
                if (struct.isSetOpenUrl()) {
                    oprot.writeFieldBegin(OPEN_URL_FIELD_DESC);
                    oprot.writeString(struct.openUrl);
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }
    }

    private static class TAnnouncementTupleSchemeFactory implements SchemeFactory {

        public TAnnouncementTupleScheme getScheme() {
            return new TAnnouncementTupleScheme();
        }
    }

    private static class TAnnouncementTupleScheme extends TupleScheme<TAnnouncement> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, TAnnouncement struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetTitle()) {
                optionals.set(0);
            }
            if (struct.isSetContent()) {
                optionals.set(1);
            }
            if (struct.isSetAttach()) {
                optionals.set(2);
            }
            if (struct.isSetOpenUrl()) {
                optionals.set(3);
            }
            oprot.writeBitSet(optionals, 4);
            if (struct.isSetTitle()) {
                oprot.writeString(struct.title);
            }
            if (struct.isSetContent()) {
                oprot.writeString(struct.content);
            }
            if (struct.isSetAttach()) {
                oprot.writeString(struct.attach);
            }
            if (struct.isSetOpenUrl()) {
                oprot.writeString(struct.openUrl);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, TAnnouncement struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(4);
            if (incoming.get(0)) {
                struct.title = iprot.readString();
                struct.setTitleIsSet(true);
            }
            if (incoming.get(1)) {
                struct.content = iprot.readString();
                struct.setContentIsSet(true);
            }
            if (incoming.get(2)) {
                struct.attach = iprot.readString();
                struct.setAttachIsSet(true);
            }
            if (incoming.get(3)) {
                struct.openUrl = iprot.readString();
                struct.setOpenUrlIsSet(true);
            }
        }
    }

    public TAnnouncement create() {
        return new TAnnouncement();
    }

    public TAnnouncement clone() {
        return cloneDepth(0);
    }

    public TAnnouncement cloneDepth(int _depth) {
        TAnnouncement _clone = create();
        _clone.title = title;
        _clone.content = content;
        _clone.attach = attach;
        _clone.openUrl = openUrl;
        cloneMore(_clone, _depth);
        return _clone;
    }

    public void cloneMore(TAnnouncement _clone, int _depth) {
    }
}
