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

import test.generated.tables.DictCrossRule;


/**
 * 字典规则血缘关系
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictCrossRuleRecord extends UpdatableRecordImpl<DictCrossRuleRecord> implements Record6<ULong, Timestamp, Timestamp, String, String, String> {

    private static final long serialVersionUID = 290222649;

    /**
     * Setter for <code>SMETA_APP.dict_cross_rule.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_rule.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_rule.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_rule.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_rule.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_rule.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_rule.event_code</code>. 事件code
     */
    public void setEventCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_rule.event_code</code>. 事件code
     */
    public String getEventCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_rule.event_column_code</code>. 事件属性code
     */
    public void setEventColumnCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_rule.event_column_code</code>. 事件属性code
     */
    public String getEventColumnCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.dict_cross_rule.rule_id</code>. 规则id
     */
    public void setRuleId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_cross_rule.rule_id</code>. 规则id
     */
    public String getRuleId() {
        return (String) get(5);
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
    public Row6<ULong, Timestamp, Timestamp, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, Timestamp, Timestamp, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return DictCrossRule.DICT_CROSS_RULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DictCrossRule.DICT_CROSS_RULE.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return DictCrossRule.DICT_CROSS_RULE.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DictCrossRule.DICT_CROSS_RULE.EVENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DictCrossRule.DICT_CROSS_RULE.EVENT_COLUMN_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DictCrossRule.DICT_CROSS_RULE.RULE_ID;
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
    public String component6() {
        return getRuleId();
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
    public String value6() {
        return getRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossRuleRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossRuleRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossRuleRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossRuleRecord value4(String value) {
        setEventCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossRuleRecord value5(String value) {
        setEventColumnCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossRuleRecord value6(String value) {
        setRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictCrossRuleRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6) {
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
     * Create a detached DictCrossRuleRecord
     */
    public DictCrossRuleRecord() {
        super(DictCrossRule.DICT_CROSS_RULE);
    }

    /**
     * Create a detached, initialised DictCrossRuleRecord
     */
    public DictCrossRuleRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String eventCode, String eventColumnCode, String ruleId) {
        super(DictCrossRule.DICT_CROSS_RULE);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, eventCode);
        set(4, eventColumnCode);
        set(5, ruleId);
    }
}
