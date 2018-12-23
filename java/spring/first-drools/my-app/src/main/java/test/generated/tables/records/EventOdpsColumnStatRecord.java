/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.EventOdpsColumnStat;


/**
 * 事件上云属性统
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventOdpsColumnStatRecord extends UpdatableRecordImpl<EventOdpsColumnStatRecord> implements Record8<ULong, Timestamp, Timestamp, String, String, Integer, Integer, Integer> {

    private static final long serialVersionUID = 334789519;

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.event_code</code>. 事件编码
     */
    public void setEventCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.event_code</code>. 事件编码
     */
    public String getEventCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.event_column_code</code>. 属性编码
     */
    public void setEventColumnCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.event_column_code</code>. 属性编码
     */
    public String getEventColumnCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.column_type</code>. 属性类型,1:原生属性，2：函数属性，3：实体属性
     */
    public void setColumnType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.column_type</code>. 属性类型,1:原生属性，2：函数属性，3：实体属性
     */
    public Integer getColumnType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.cost</code>. 补全成本
     */
    public void setCost(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.cost</code>. 补全成本
     */
    public Integer getCost() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.event_odps_column_stat.status</code>. 上云状态，1：已上云，0：未上云
     */
    public void setStatus(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.event_odps_column_stat.status</code>. 上云状态，1：已上云，0：未上云
     */
    public Integer getStatus() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, Timestamp, Timestamp, String, String, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, Timestamp, Timestamp, String, String, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.EVENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.EVENT_COLUMN_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.COLUMN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT.STATUS;
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
        return getEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEventColumnCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getColumnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getStatus();
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
        return getEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEventColumnCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getColumnType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value4(String value) {
        setEventCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value5(String value) {
        setEventColumnCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value6(Integer value) {
        setColumnType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value7(Integer value) {
        setCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord value8(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventOdpsColumnStatRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, Integer value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventOdpsColumnStatRecord
     */
    public EventOdpsColumnStatRecord() {
        super(EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT);
    }

    /**
     * Create a detached, initialised EventOdpsColumnStatRecord
     */
    public EventOdpsColumnStatRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String eventCode, String eventColumnCode, Integer columnType, Integer cost, Integer status) {
        super(EventOdpsColumnStat.EVENT_ODPS_COLUMN_STAT);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, eventCode);
        set(4, eventColumnCode);
        set(5, columnType);
        set(6, cost);
        set(7, status);
    }
}