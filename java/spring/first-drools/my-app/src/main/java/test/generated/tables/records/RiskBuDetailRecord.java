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

import test.generated.tables.RiskBuDetail;


/**
 * 风险点对应多个站点的信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiskBuDetailRecord extends UpdatableRecordImpl<RiskBuDetailRecord> implements Record12<ULong, Timestamp, Timestamp, Long, Long, String, Long, String, String, String, String, Short> {

    private static final long serialVersionUID = -1775340230;

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.risk_id</code>. 对应的风险id
     */
    public void setRiskId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.risk_id</code>. 对应的风险id
     */
    public Long getRiskId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.risk_tag_id</code>. 对应的风险标签id
     */
    public void setRiskTagId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.risk_tag_id</code>. 对应的风险标签id
     */
    public Long getRiskTagId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.risk_level</code>. 风险等级-A,B,C,D,E,F
     */
    public void setRiskLevel(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.risk_level</code>. 风险等级-A,B,C,D,E,F
     */
    public String getRiskLevel() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.taobao_rule_id</code>. 淘宝规则id
     */
    public void setTaobaoRuleId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.taobao_rule_id</code>. 淘宝规则id
     */
    public Long getTaobaoRuleId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.rule_content</code>. 规则内容
     */
    public void setRuleContent(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.rule_content</code>. 规则内容
     */
    public String getRuleContent() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.risk_bu</code>. 对应站点的bu
     */
    public void setRiskBu(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.risk_bu</code>. 对应站点的bu
     */
    public String getRiskBu() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.tenant_code</code>. 租户
     */
    public void setTenantCode(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.tenant_code</code>. 租户
     */
    public String getTenantCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.risk_bu_detail.status</code>. 状态，1-有效，-1-删除
     */
    public void setStatus(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.risk_bu_detail.status</code>. 状态，1-有效，-1-删除
     */
    public Short getStatus() {
        return (Short) get(11);
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
    public Row12<ULong, Timestamp, Timestamp, Long, Long, String, Long, String, String, String, String, Short> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, Timestamp, Timestamp, Long, Long, String, Long, String, String, String, String, Short> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return RiskBuDetail.RISK_BU_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return RiskBuDetail.RISK_BU_DETAIL.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return RiskBuDetail.RISK_BU_DETAIL.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return RiskBuDetail.RISK_BU_DETAIL.RISK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return RiskBuDetail.RISK_BU_DETAIL.RISK_TAG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return RiskBuDetail.RISK_BU_DETAIL.RISK_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return RiskBuDetail.RISK_BU_DETAIL.TAOBAO_RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return RiskBuDetail.RISK_BU_DETAIL.RULE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return RiskBuDetail.RISK_BU_DETAIL.RISK_BU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return RiskBuDetail.RISK_BU_DETAIL.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return RiskBuDetail.RISK_BU_DETAIL.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return RiskBuDetail.RISK_BU_DETAIL.STATUS;
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
    public Long component4() {
        return getRiskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getRiskTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRiskLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getTaobaoRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRuleContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getRiskBu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOperator();
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
    public Short component12() {
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
    public Long value4() {
        return getRiskId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getRiskTagId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRiskLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getTaobaoRuleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRuleContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRiskBu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOperator();
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
    public Short value12() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value4(Long value) {
        setRiskId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value5(Long value) {
        setRiskTagId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value6(String value) {
        setRiskLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value7(Long value) {
        setTaobaoRuleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value8(String value) {
        setRuleContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value9(String value) {
        setRiskBu(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value10(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value11(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord value12(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RiskBuDetailRecord values(ULong value1, Timestamp value2, Timestamp value3, Long value4, Long value5, String value6, Long value7, String value8, String value9, String value10, String value11, Short value12) {
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
     * Create a detached RiskBuDetailRecord
     */
    public RiskBuDetailRecord() {
        super(RiskBuDetail.RISK_BU_DETAIL);
    }

    /**
     * Create a detached, initialised RiskBuDetailRecord
     */
    public RiskBuDetailRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, Long riskId, Long riskTagId, String riskLevel, Long taobaoRuleId, String ruleContent, String riskBu, String operator, String tenantCode, Short status) {
        super(RiskBuDetail.RISK_BU_DETAIL);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, riskId);
        set(4, riskTagId);
        set(5, riskLevel);
        set(6, taobaoRuleId);
        set(7, ruleContent);
        set(8, riskBu);
        set(9, operator);
        set(10, tenantCode);
        set(11, status);
    }
}