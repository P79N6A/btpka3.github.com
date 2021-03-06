/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.DictSceneColumnPool;


/**
 * 场景里用到的特征集合
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictSceneColumnPoolRecord extends UpdatableRecordImpl<DictSceneColumnPoolRecord> implements Record10<ULong, Timestamp, Timestamp, String, String, String, String, String, Integer, String> {

    private static final long serialVersionUID = 2051645540;

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.cn_name</code>. 特征中文名
     */
    public void setCnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.cn_name</code>. 特征中文名
     */
    public String getCnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.en_name</code>. 特征英文名
     */
    public void setEnName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.en_name</code>. 特征英文名
     */
    public String getEnName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.code</code>. 特征code
     */
    public void setCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.code</code>. 特征code
     */
    public String getCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.type</code>. 特征类型
     */
    public void setType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.type</code>. 特征类型
     */
    public String getType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.status</code>. 状态，1-有效，0-废弃
     */
    public void setStatus(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.status</code>. 状态，1-有效，0-废弃
     */
    public Integer getStatus() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.dict_scene_column_pool.operator_id</code>. 操作人id
     */
    public void setOperatorId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_scene_column_pool.operator_id</code>. 操作人id
     */
    public String getOperatorId() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, Timestamp, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, Timestamp, Timestamp, String, String, String, String, String, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.CN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.EN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DictSceneColumnPool.DICT_SCENE_COLUMN_POOL.OPERATOR_ID;
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
        return getCnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getType();
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
    public Integer component9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOperatorId();
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
        return getCnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getType();
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
    public Integer value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value4(String value) {
        setCnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value5(String value) {
        setEnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value6(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value7(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value8(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value9(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord value10(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictSceneColumnPoolRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, Integer value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictSceneColumnPoolRecord
     */
    public DictSceneColumnPoolRecord() {
        super(DictSceneColumnPool.DICT_SCENE_COLUMN_POOL);
    }

    /**
     * Create a detached, initialised DictSceneColumnPoolRecord
     */
    public DictSceneColumnPoolRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String cnName, String enName, String code, String type, String operator, Integer status, String operatorId) {
        super(DictSceneColumnPool.DICT_SCENE_COLUMN_POOL);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, cnName);
        set(4, enName);
        set(5, code);
        set(6, type);
        set(7, operator);
        set(8, status);
        set(9, operatorId);
    }
}
