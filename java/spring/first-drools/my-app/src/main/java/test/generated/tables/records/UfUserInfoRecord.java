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

import test.generated.tables.UfUserInfo;


/**
 * 用户信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfUserInfoRecord extends UpdatableRecordImpl<UfUserInfoRecord> implements Record8<ULong, Timestamp, Timestamp, String, String, String, ULong, String> {

    private static final long serialVersionUID = 14426765;

    /**
     * Setter for <code>SMETA_APP.uf_user_info.user_id</code>. 主键
     */
    public void setUserId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.user_id</code>. 主键
     */
    public ULong getUserId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_user_info.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_user_info.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_user_info.account_type</code>. 用户类型
     */
    public void setAccountType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.account_type</code>. 用户类型
     */
    public String getAccountType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_user_info.nick</code>. 用户昵称
     */
    public void setNick(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.nick</code>. 用户昵称
     */
    public String getNick() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_user_info.emp_id</code>. 用户工号
     */
    public void setEmpId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.emp_id</code>. 用户工号
     */
    public String getEmpId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_user_info.havana_id</code>. Havana Id
     */
    public void setHavanaId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.havana_id</code>. Havana Id
     */
    public ULong getHavanaId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_user_info.user_info</code>. 用户信息
     */
    public void setUserInfo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_user_info.user_info</code>. 用户信息
     */
    public String getUserInfo() {
        return (String) get(7);
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
    public Row8<ULong, Timestamp, Timestamp, String, String, String, ULong, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, Timestamp, Timestamp, String, String, String, ULong, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfUserInfo.UF_USER_INFO.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfUserInfo.UF_USER_INFO.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfUserInfo.UF_USER_INFO.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UfUserInfo.UF_USER_INFO.ACCOUNT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UfUserInfo.UF_USER_INFO.NICK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfUserInfo.UF_USER_INFO.EMP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return UfUserInfo.UF_USER_INFO.HAVANA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfUserInfo.UF_USER_INFO.USER_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getUserId();
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
        return getAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEmpId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getHavanaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUserInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getUserId();
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
        return getAccountType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmpId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getHavanaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUserInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value1(ULong value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value4(String value) {
        setAccountType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value5(String value) {
        setNick(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value6(String value) {
        setEmpId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value7(ULong value) {
        setHavanaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord value8(String value) {
        setUserInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfUserInfoRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, ULong value7, String value8) {
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
     * Create a detached UfUserInfoRecord
     */
    public UfUserInfoRecord() {
        super(UfUserInfo.UF_USER_INFO);
    }

    /**
     * Create a detached, initialised UfUserInfoRecord
     */
    public UfUserInfoRecord(ULong userId, Timestamp gmtCreate, Timestamp gmtModified, String accountType, String nick, String empId, ULong havanaId, String userInfo) {
        super(UfUserInfo.UF_USER_INFO);

        set(0, userId);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, accountType);
        set(4, nick);
        set(5, empId);
        set(6, havanaId);
        set(7, userInfo);
    }
}