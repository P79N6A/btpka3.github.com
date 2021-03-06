/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;

import test.generated.Indexes;
import test.generated.SmetaApp;
import test.generated.tables.records.UfRulesetRunningRecord;


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
public class UfRulesetRunning extends TableImpl<UfRulesetRunningRecord> {

    private static final long serialVersionUID = 1432808495;

    /**
     * The reference instance of <code>SMETA_APP.uf_ruleset_running</code>
     */
    public static final UfRulesetRunning UF_RULESET_RUNNING = new UfRulesetRunning();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfRulesetRunningRecord> getRecordType() {
        return UfRulesetRunningRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.id</code>. 主键
     */
    public final TableField<UfRulesetRunningRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.rule_set_id</code>. 规则集Id
     */
    public final TableField<UfRulesetRunningRecord, ULong> RULE_SET_ID = createField("rule_set_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "规则集Id");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.gmt_create</code>. 创建时间
     */
    public final TableField<UfRulesetRunningRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.gmt_modified</code>. 修改时间
     */
    public final TableField<UfRulesetRunningRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP(3)", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.title</code>. 规则集标题
     */
    public final TableField<UfRulesetRunningRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "规则集标题");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.contacts</code>. 联系人
     */
    public final TableField<UfRulesetRunningRecord, String> CONTACTS = createField("contacts", org.jooq.impl.SQLDataType.VARCHAR(250).nullable(false), this, "联系人");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.last_operator</code>. 最后操作人
     */
    public final TableField<UfRulesetRunningRecord, ULong> LAST_OPERATOR = createField("last_operator", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "最后操作人");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.version</code>. 当前版本
     */
    public final TableField<UfRulesetRunningRecord, Integer> VERSION = createField("version", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "当前版本");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.comment</code>. 版本备注
     */
    public final TableField<UfRulesetRunningRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR(250), this, "版本备注");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.status</code>. 状态
     */
    public final TableField<UfRulesetRunningRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "状态");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.tenant_code</code>. 租户
     */
    public final TableField<UfRulesetRunningRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "租户");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.type</code>. 规则集类型
     */
    public final TableField<UfRulesetRunningRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "规则集类型");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.risk_type_id</code>. 风险分类
     */
    public final TableField<UfRulesetRunningRecord, Integer> RISK_TYPE_ID = createField("risk_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "风险分类");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.risk_level</code>. 风险等级
     */
    public final TableField<UfRulesetRunningRecord, Integer> RISK_LEVEL = createField("risk_level", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "风险等级");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.settings</code>. 规则集设置
     */
    public final TableField<UfRulesetRunningRecord, String> SETTINGS = createField("settings", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "规则集设置");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.content</code>. 规则集内容
     */
    public final TableField<UfRulesetRunningRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "规则集内容");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.source_code</code>. 数据来源
     */
    public final TableField<UfRulesetRunningRecord, String> SOURCE_CODE = createField("source_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "数据来源");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.description</code>. 规则集描述
     */
    public final TableField<UfRulesetRunningRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "规则集描述");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.level</code>. 规则集分层
     */
    public final TableField<UfRulesetRunningRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "规则集分层");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.source_name</code>. 数据来源名称
     */
    public final TableField<UfRulesetRunningRecord, String> SOURCE_NAME = createField("source_name", org.jooq.impl.SQLDataType.VARCHAR(250), this, "数据来源名称");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.visual_settings</code>. 规则集可视化设置
     */
    public final TableField<UfRulesetRunningRecord, String> VISUAL_SETTINGS = createField("visual_settings", org.jooq.impl.SQLDataType.CLOB, this, "规则集可视化设置");

    /**
     * The column <code>SMETA_APP.uf_ruleset_running.risk_type_path</code>. 风险分类路径
     */
    public final TableField<UfRulesetRunningRecord, String> RISK_TYPE_PATH = createField("risk_type_path", org.jooq.impl.SQLDataType.VARCHAR(250), this, "风险分类路径");

    /**
     * Create a <code>SMETA_APP.uf_ruleset_running</code> table reference
     */
    public UfRulesetRunning() {
        this(DSL.name("uf_ruleset_running"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_ruleset_running</code> table reference
     */
    public UfRulesetRunning(String alias) {
        this(DSL.name(alias), UF_RULESET_RUNNING);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_ruleset_running</code> table reference
     */
    public UfRulesetRunning(Name alias) {
        this(alias, UF_RULESET_RUNNING);
    }

    private UfRulesetRunning(Name alias, Table<UfRulesetRunningRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfRulesetRunning(Name alias, Table<UfRulesetRunningRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return SmetaApp.SMETA_APP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.UF_RULESET_RUNNING_IDX_RULESET_RUNING_QUERY, Indexes.UF_RULESET_RUNNING_IDX_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfRulesetRunning as(String alias) {
        return new UfRulesetRunning(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfRulesetRunning as(Name alias) {
        return new UfRulesetRunning(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfRulesetRunning rename(String name) {
        return new UfRulesetRunning(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfRulesetRunning rename(Name name) {
        return new UfRulesetRunning(name, null);
    }
}
