/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.RaySqlLog;


/**
 * 整个sql框页面
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RaySqlLogRecord extends UpdatableRecordImpl<RaySqlLogRecord> implements Record6<ULong, Timestamp, Timestamp, String, String, ULong> {

    private static final long serialVersionUID = -1614334460;

    /**
     * Setter for <code>SMETA_APP.ray_sql_log.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.ray_sql_log.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.ray_sql_log.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.ray_sql_log.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.ray_sql_log.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.ray_sql_log.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.ray_sql_log.biz_id</code>. 创建者工号
     */
    public void setBizId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.ray_sql_log.biz_id</code>. 创建者工号
     */
    public String getBizId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.ray_sql_log.tenant_code</code>. 租户id
     */
    public void setTenantCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.ray_sql_log.tenant_code</code>. 租户id
     */
    public String getTenantCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.ray_sql_log.preheat_job_id</code>. 预热id，外键
     */
    public void setPreheatJobId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.ray_sql_log.preheat_job_id</code>. 预热id，外键
     */
    public ULong getPreheatJobId() {
        return (ULong) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, Timestamp, Timestamp, String, String, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, Timestamp, Timestamp, String, String, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return RaySqlLog.RAY_SQL_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return RaySqlLog.RAY_SQL_LOG.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return RaySqlLog.RAY_SQL_LOG.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RaySqlLog.RAY_SQL_LOG.BIZ_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return RaySqlLog.RAY_SQL_LOG.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return RaySqlLog.RAY_SQL_LOG.PREHEAT_JOB_ID;
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
        return getBizId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getPreheatJobId();
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
        return getBizId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getPreheatJobId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RaySqlLogRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RaySqlLogRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RaySqlLogRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RaySqlLogRecord value4(String value) {
        setBizId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RaySqlLogRecord value5(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RaySqlLogRecord value6(ULong value) {
        setPreheatJobId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RaySqlLogRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, ULong value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RaySqlLogRecord
     */
    public RaySqlLogRecord() {
        super(RaySqlLog.RAY_SQL_LOG);
    }

    /**
     * Create a detached, initialised RaySqlLogRecord
     */
    public RaySqlLogRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String bizId, String tenantCode, ULong preheatJobId) {
        super(RaySqlLog.RAY_SQL_LOG);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, bizId);
        set(4, tenantCode);
        set(5, preheatJobId);
    }
}