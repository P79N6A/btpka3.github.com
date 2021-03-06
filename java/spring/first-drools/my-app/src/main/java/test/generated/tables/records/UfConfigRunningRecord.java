/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;

import test.generated.tables.UfConfigRunning;


/**
 * 配置信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfConfigRunningRecord extends UpdatableRecordImpl<UfConfigRunningRecord> implements Record12<ULong, Timestamp, Timestamp, String, String, String, String, String, ULong, UInteger, Byte, String> {

    private static final long serialVersionUID = -670560874;

    /**
     * Setter for <code>SMETA_APP.uf_config_running.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.category</code>. 分类
     */
    public void setCategory(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.category</code>. 分类
     */
    public String getCategory() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.type</code>. 数据类型
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.type</code>. 数据类型
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.clz</code>. 全限类名
     */
    public void setClz(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.clz</code>. 全限类名
     */
    public String getClz() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.value</code>. 值
     */
    public void setValue(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.value</code>. 值
     */
    public String getValue() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.tenant_code</code>. 租户
     */
    public void setTenantCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.tenant_code</code>. 租户
     */
    public String getTenantCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.operator</code>. 操作人
     */
    public void setOperator(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.operator</code>. 操作人
     */
    public ULong getOperator() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.version</code>. 版本
     */
    public void setVersion(UInteger value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.version</code>. 版本
     */
    public UInteger getVersion() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.status</code>. 状态
     */
    public void setStatus(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.status</code>. 状态
     */
    public Byte getStatus() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.uf_config_running.key_name</code>. 键
     */
    public void setKeyName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_config_running.key_name</code>. 键
     */
    public String getKeyName() {
        return (String) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, ULong, UInteger, Byte, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, ULong, UInteger, Byte, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfConfigRunning.UF_CONFIG_RUNNING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfConfigRunning.UF_CONFIG_RUNNING.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfConfigRunning.UF_CONFIG_RUNNING.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UfConfigRunning.UF_CONFIG_RUNNING.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UfConfigRunning.UF_CONFIG_RUNNING.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfConfigRunning.UF_CONFIG_RUNNING.CLZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UfConfigRunning.UF_CONFIG_RUNNING.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfConfigRunning.UF_CONFIG_RUNNING.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return UfConfigRunning.UF_CONFIG_RUNNING.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field10() {
        return UfConfigRunning.UF_CONFIG_RUNNING.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return UfConfigRunning.UF_CONFIG_RUNNING.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UfConfigRunning.UF_CONFIG_RUNNING.KEY_NAME;
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
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getClz();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getKeyName();
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
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getClz();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value10() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getKeyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value4(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value5(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value6(String value) {
        setClz(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value7(String value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value8(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value9(ULong value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value10(UInteger value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value11(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord value12(String value) {
        setKeyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfConfigRunningRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, ULong value9, UInteger value10, Byte value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfConfigRunningRecord
     */
    public UfConfigRunningRecord() {
        super(UfConfigRunning.UF_CONFIG_RUNNING);
    }

    /**
     * Create a detached, initialised UfConfigRunningRecord
     */
    public UfConfigRunningRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String category, String type, String clz, String value, String tenantCode, ULong operator, UInteger version, Byte status, String keyName) {
        super(UfConfigRunning.UF_CONFIG_RUNNING);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, category);
        set(4, type);
        set(5, clz);
        set(6, value);
        set(7, tenantCode);
        set(8, operator);
        set(9, version);
        set(10, status);
        set(11, keyName);
    }
}
