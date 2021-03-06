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
import org.jooq.types.ULong;

import test.generated.tables.ProjectEvents;


/**
 * 应用事件关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProjectEventsRecord extends UpdatableRecordImpl<ProjectEventsRecord> implements Record12<ULong, Timestamp, Timestamp, String, String, String, String, Byte, String, Byte, String, String> {

    private static final long serialVersionUID = -1400962760;

    /**
     * Setter for <code>SMETA_APP.project_events.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.project_code</code>. 应用code
     */
    public void setProjectCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.project_code</code>. 应用code
     */
    public String getProjectCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.event_code</code>. 事件code
     */
    public void setEventCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.event_code</code>. 事件code
     */
    public String getEventCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.operator_id</code>. 操作人工号
     */
    public void setOperatorId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.operator_id</code>. 操作人工号
     */
    public String getOperatorId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.status</code>. 默认为0，无效，有效状态为1
     */
    public void setStatus(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.status</code>. 默认为0，无效，有效状态为1
     */
    public Byte getStatus() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.re_event_code</code>. 重命名事件code
     */
    public void setReEventCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.re_event_code</code>. 重命名事件code
     */
    public String getReEventCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.distributed</code>. 是否分发数据，0：不分发，1：分发
     */
    public void setDistributed(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.distributed</code>. 是否分发数据，0：不分发，1：分发
     */
    public Byte getDistributed() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.tenant_code</code>. 租户code
     */
    public void setTenantCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.tenant_code</code>. 租户code
     */
    public String getTenantCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.project_events.event_platform</code>. 风控平台标记，区分平台是mtee或airbus
     */
    public void setEventPlatform(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.project_events.event_platform</code>. 风控平台标记，区分平台是mtee或airbus
     */
    public String getEventPlatform() {
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
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, Byte, String, Byte, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, Byte, String, Byte, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return ProjectEvents.PROJECT_EVENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ProjectEvents.PROJECT_EVENTS.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ProjectEvents.PROJECT_EVENTS.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ProjectEvents.PROJECT_EVENTS.PROJECT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ProjectEvents.PROJECT_EVENTS.EVENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ProjectEvents.PROJECT_EVENTS.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProjectEvents.PROJECT_EVENTS.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ProjectEvents.PROJECT_EVENTS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ProjectEvents.PROJECT_EVENTS.RE_EVENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return ProjectEvents.PROJECT_EVENTS.DISTRIBUTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ProjectEvents.PROJECT_EVENTS.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ProjectEvents.PROJECT_EVENTS.EVENT_PLATFORM;
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
        return getProjectCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getReEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getDistributed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getEventPlatform();
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
        return getProjectCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getReEventCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getDistributed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getEventPlatform();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value4(String value) {
        setProjectCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value5(String value) {
        setEventCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value6(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value7(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value8(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value9(String value) {
        setReEventCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value10(Byte value) {
        setDistributed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value11(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord value12(String value) {
        setEventPlatform(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProjectEventsRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, Byte value8, String value9, Byte value10, String value11, String value12) {
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
     * Create a detached ProjectEventsRecord
     */
    public ProjectEventsRecord() {
        super(ProjectEvents.PROJECT_EVENTS);
    }

    /**
     * Create a detached, initialised ProjectEventsRecord
     */
    public ProjectEventsRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String projectCode, String eventCode, String operatorId, String operator, Byte status, String reEventCode, Byte distributed, String tenantCode, String eventPlatform) {
        super(ProjectEvents.PROJECT_EVENTS);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, projectCode);
        set(4, eventCode);
        set(5, operatorId);
        set(6, operator);
        set(7, status);
        set(8, reEventCode);
        set(9, distributed);
        set(10, tenantCode);
        set(11, eventPlatform);
    }
}
