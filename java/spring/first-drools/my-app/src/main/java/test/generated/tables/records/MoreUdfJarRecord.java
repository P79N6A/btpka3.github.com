/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.MoreUdfJar;


/**
 * UDF表-主要是jar包
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MoreUdfJarRecord extends UpdatableRecordImpl<MoreUdfJarRecord> implements Record13<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, Short, String, String> {

    private static final long serialVersionUID = 1545925557;

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.operator_id</code>. 操作人id
     */
    public void setOperatorId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.operator_id</code>. 操作人id
     */
    public String getOperatorId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.name</code>. jar包名称
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.name</code>. jar包名称
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.description</code>. jar包描述
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.description</code>. jar包描述
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.download_url</code>. 下载地址
     */
    public void setDownloadUrl(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.download_url</code>. 下载地址
     */
    public String getDownloadUrl() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.file_name</code>. jar包文件名称
     */
    public void setFileName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.file_name</code>. jar包文件名称
     */
    public String getFileName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.md5</code>. 文件的md5值，做文件完整性校验使用
     */
    public void setMd5(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.md5</code>. 文件的md5值，做文件完整性校验使用
     */
    public String getMd5() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.status</code>. 状态，1-有效，0-历史记录，-1-删除
     */
    public void setStatus(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.status</code>. 状态，1-有效，0-历史记录，-1-删除
     */
    public Short getStatus() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.class_name</code>. 对应的java类的名称
     */
    public void setClassName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.class_name</code>. 对应的java类的名称
     */
    public String getClassName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.more_udf_jar.blink_resource_id</code>. 对应的blink的字眼id
     */
    public void setBlinkResourceId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_udf_jar.blink_resource_id</code>. 对应的blink的字眼id
     */
    public String getBlinkResourceId() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, Short, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<ULong, Timestamp, Timestamp, String, String, String, String, String, String, String, Short, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return MoreUdfJar.MORE_UDF_JAR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return MoreUdfJar.MORE_UDF_JAR.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return MoreUdfJar.MORE_UDF_JAR.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MoreUdfJar.MORE_UDF_JAR.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MoreUdfJar.MORE_UDF_JAR.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MoreUdfJar.MORE_UDF_JAR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MoreUdfJar.MORE_UDF_JAR.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MoreUdfJar.MORE_UDF_JAR.DOWNLOAD_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MoreUdfJar.MORE_UDF_JAR.FILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return MoreUdfJar.MORE_UDF_JAR.MD5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return MoreUdfJar.MORE_UDF_JAR.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return MoreUdfJar.MORE_UDF_JAR.CLASS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return MoreUdfJar.MORE_UDF_JAR.BLINK_RESOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDownloadUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getMd5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getBlinkResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDownloadUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMd5();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getClassName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBlinkResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value4(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value5(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value8(String value) {
        setDownloadUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value9(String value) {
        setFileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value10(String value) {
        setMd5(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value11(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value12(String value) {
        setClassName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord value13(String value) {
        setBlinkResourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreUdfJarRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Short value11, String value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MoreUdfJarRecord
     */
    public MoreUdfJarRecord() {
        super(MoreUdfJar.MORE_UDF_JAR);
    }

    /**
     * Create a detached, initialised MoreUdfJarRecord
     */
    public MoreUdfJarRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String operatorId, String operator, String name, String description, String downloadUrl, String fileName, String md5, Short status, String className, String blinkResourceId) {
        super(MoreUdfJar.MORE_UDF_JAR);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, operatorId);
        set(4, operator);
        set(5, name);
        set(6, description);
        set(7, downloadUrl);
        set(8, fileName);
        set(9, md5);
        set(10, status);
        set(11, className);
        set(12, blinkResourceId);
    }
}
