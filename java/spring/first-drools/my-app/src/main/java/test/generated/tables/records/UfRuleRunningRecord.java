/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.UfRuleRunning;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfRuleRunningRecord extends TableRecordImpl<UfRuleRunningRecord> {

    private static final long serialVersionUID = 1973628333;

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.rule_id</code>. 规则ID
     */
    public void setRuleId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.rule_id</code>. 规则ID
     */
    public ULong getRuleId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.title</code>. 规则标题
     */
    public void setTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.title</code>. 规则标题
     */
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.description</code>. 描述
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.description</code>. 描述
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.contacts</code>. 联系人
     */
    public void setContacts(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.contacts</code>. 联系人
     */
    public String getContacts() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.risk_level</code>. 风险等级
     */
    public void setRiskLevel(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.risk_level</code>. 风险等级
     */
    public Integer getRiskLevel() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.last_operator</code>. 最后操作人
     */
    public void setLastOperator(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.last_operator</code>. 最后操作人
     */
    public ULong getLastOperator() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.origin_version</code>. 来源版本
     */
    public void setOriginVersion(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.origin_version</code>. 来源版本
     */
    public String getOriginVersion() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.version</code>. 主版本
     */
    public void setVersion(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.version</code>. 主版本
     */
    public Integer getVersion() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.subversion</code>. 子版本
     */
    public void setSubversion(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.subversion</code>. 子版本
     */
    public Integer getSubversion() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.comment</code>. 版本备注
     */
    public void setComment(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.comment</code>. 版本备注
     */
    public String getComment() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.status</code>. 规则状态
     */
    public void setStatus(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.status</code>. 规则状态
     */
    public Integer getStatus() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.tenant_code</code>. 租户
     */
    public void setTenantCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.tenant_code</code>. 租户
     */
    public String getTenantCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.settings</code>. 设置信息
     */
    public void setSettings(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.settings</code>. 设置信息
     */
    public String getSettings() {
        return (String) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.visual_settings</code>. 规则体设置
     */
    public void setVisualSettings(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.visual_settings</code>. 规则体设置
     */
    public String getVisualSettings() {
        return (String) get(16);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.gray_settings</code>. 灰度条件设置
     */
    public void setGraySettings(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.gray_settings</code>. 灰度条件设置
     */
    public String getGraySettings() {
        return (String) get(17);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.content</code>. 规则内容
     */
    public void setContent(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.content</code>. 规则内容
     */
    public String getContent() {
        return (String) get(18);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.rule_set_id</code>. 归属规则集
     */
    public void setRuleSetId(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.rule_set_id</code>. 归属规则集
     */
    public ULong getRuleSetId() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.category</code>. 规则分层
     */
    public void setCategory(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.category</code>. 规则分层
     */
    public Integer getCategory() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.source_code</code>. 事件代码
     */
    public void setSourceCode(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.source_code</code>. 事件代码
     */
    public String getSourceCode() {
        return (String) get(21);
    }

    /**
     * Setter for <code>SMETA_APP.uf_rule_running.props</code>. 相关属性
     */
    public void setProps(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_rule_running.props</code>. 相关属性
     */
    public String getProps() {
        return (String) get(22);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfRuleRunningRecord
     */
    public UfRuleRunningRecord() {
        super(UfRuleRunning.UF_RULE_RUNNING);
    }

    /**
     * Create a detached, initialised UfRuleRunningRecord
     */
    public UfRuleRunningRecord(ULong id, ULong ruleId, Timestamp gmtCreate, Timestamp gmtModified, String title, String description, String contacts, Integer riskLevel, ULong lastOperator, String originVersion, Integer version, Integer subversion, String comment, Integer status, String tenantCode, String settings, String visualSettings, String graySettings, String content, ULong ruleSetId, Integer category, String sourceCode, String props) {
        super(UfRuleRunning.UF_RULE_RUNNING);

        set(0, id);
        set(1, ruleId);
        set(2, gmtCreate);
        set(3, gmtModified);
        set(4, title);
        set(5, description);
        set(6, contacts);
        set(7, riskLevel);
        set(8, lastOperator);
        set(9, originVersion);
        set(10, version);
        set(11, subversion);
        set(12, comment);
        set(13, status);
        set(14, tenantCode);
        set(15, settings);
        set(16, visualSettings);
        set(17, graySettings);
        set(18, content);
        set(19, ruleSetId);
        set(20, category);
        set(21, sourceCode);
        set(22, props);
    }
}