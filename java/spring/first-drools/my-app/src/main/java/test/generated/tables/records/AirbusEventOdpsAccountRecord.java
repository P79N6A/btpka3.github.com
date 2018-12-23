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

import test.generated.tables.AirbusEventOdpsAccount;


/**
 * 事件结果表权限的ODPS账号
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusEventOdpsAccountRecord extends UpdatableRecordImpl<AirbusEventOdpsAccountRecord> implements Record12<ULong, Timestamp, Timestamp, String, String, String, String, String, Byte, String, String, String> {

    private static final long serialVersionUID = -499900558;

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.event_code</code>. 事件code
     */
    public void setEventCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.event_code</code>. 事件code
     */
    public String getEventCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.sic_result_table</code>. sic结果表，表名以逗号分隔
     */
    public void setSicResultTable(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.sic_result_table</code>. sic结果表，表名以逗号分隔
     */
    public String getSicResultTable() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.account</code>. odps云账号
     */
    public void setAccount(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.account</code>. odps云账号
     */
    public String getAccount() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.operator_id</code>. 操作人工号
     */
    public void setOperatorId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.operator_id</code>. 操作人工号
     */
    public String getOperatorId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.operator</code>. 操作人昵称
     */
    public void setOperator(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.operator</code>. 操作人昵称
     */
    public String getOperator() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.deleted</code>. 是否已经删除
     */
    public void setDeleted(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.deleted</code>. 是否已经删除
     */
    public Byte getDeleted() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.project</code>. odps工程名
     */
    public void setProject(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.project</code>. odps工程名
     */
    public String getProject() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.employee_id</code>. 云账号对应的员工工号
     */
    public void setEmployeeId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.employee_id</code>. 云账号对应的员工工号
     */
    public String getEmployeeId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_event_odps_account.employee_nick</code>. 云账号对应的员工花名
     */
    public void setEmployeeNick(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_event_odps_account.employee_nick</code>. 云账号对应的员工花名
     */
    public String getEmployeeNick() {
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
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, Byte, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, String, String, String, String, String, Byte, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.EVENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.SIC_RESULT_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.EMPLOYEE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT.EMPLOYEE_NICK;
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
        return getSicResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getProject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getEmployeeNick();
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
        return getSicResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getProject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getEmployeeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getEmployeeNick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value4(String value) {
        setEventCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value5(String value) {
        setSicResultTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value6(String value) {
        setAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value7(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value8(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value9(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value10(String value) {
        setProject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value11(String value) {
        setEmployeeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord value12(String value) {
        setEmployeeNick(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventOdpsAccountRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, Byte value9, String value10, String value11, String value12) {
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
     * Create a detached AirbusEventOdpsAccountRecord
     */
    public AirbusEventOdpsAccountRecord() {
        super(AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT);
    }

    /**
     * Create a detached, initialised AirbusEventOdpsAccountRecord
     */
    public AirbusEventOdpsAccountRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String eventCode, String sicResultTable, String account, String operatorId, String operator, Byte deleted, String project, String employeeId, String employeeNick) {
        super(AirbusEventOdpsAccount.AIRBUS_EVENT_ODPS_ACCOUNT);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, eventCode);
        set(4, sicResultTable);
        set(5, account);
        set(6, operatorId);
        set(7, operator);
        set(8, deleted);
        set(9, project);
        set(10, employeeId);
        set(11, employeeNick);
    }
}