/*
 * This file is generated by jOOQ.
*/
package test.generated.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;

import test.generated.Indexes;
import test.generated.Keys;
import test.generated.SmetaApp;
import test.generated.tables.records.DictColumnRuleInfoRecord;


/**
 * 属性对应规则信息表（精卫从mtee同步数据）
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictColumnRuleInfo extends TableImpl<DictColumnRuleInfoRecord> {

    private static final long serialVersionUID = 614134685;

    /**
     * The reference instance of <code>SMETA_APP.dict_column_rule_info</code>
     */
    public static final DictColumnRuleInfo DICT_COLUMN_RULE_INFO = new DictColumnRuleInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DictColumnRuleInfoRecord> getRecordType() {
        return DictColumnRuleInfoRecord.class;
    }

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.rule_id</code>. 规则id
     */
    public final TableField<DictColumnRuleInfoRecord, ULong> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "规则id");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.rule_name</code>. 规则名称
     */
    public final TableField<DictColumnRuleInfoRecord, String> RULE_NAME = createField("rule_name", org.jooq.impl.SQLDataType.VARCHAR(512), this, "规则名称");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.gmt_create</code>. 创建时间
     */
    public final TableField<DictColumnRuleInfoRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.event_code</code>. 事件code
     */
    public final TableField<DictColumnRuleInfoRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(512), this, "事件code");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.status</code>. 500120:线上状态, 500005:废弃状态, 500040:线下状态, 500070:线上手动, 500100:线上测试
     */
    public final TableField<DictColumnRuleInfoRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "500120:线上状态, 500005:废弃状态, 500040:线下状态, 500070:线上手动, 500100:线上测试");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.column_code</code>. 属性code
     */
    public final TableField<DictColumnRuleInfoRecord, String> COLUMN_CODE = createField("column_code", org.jooq.impl.SQLDataType.VARCHAR(4096), this, "属性code");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.id</code>. 主键
     */
    public final TableField<DictColumnRuleInfoRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.trust</code>. 属性与规则关系可信等级
     */
    public final TableField<DictColumnRuleInfoRecord, Integer> TRUST = createField("trust", org.jooq.impl.SQLDataType.INTEGER, this, "属性与规则关系可信等级");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.bizContacter</code>. 规则业务联系人
     */
    public final TableField<DictColumnRuleInfoRecord, String> BIZCONTACTER = createField("bizContacter", org.jooq.impl.SQLDataType.VARCHAR(218), this, "规则业务联系人");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.editor</code>. 规则编辑方式
     */
    public final TableField<DictColumnRuleInfoRecord, String> EDITOR = createField("editor", org.jooq.impl.SQLDataType.VARCHAR(32), this, "规则编辑方式");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.column_type</code>. 字典类型：1、基本属性 2、指标属性 3、实体 4、实体属性 5、模型属性
     */
    public final TableField<DictColumnRuleInfoRecord, Byte> COLUMN_TYPE = createField("column_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "字典类型：1、基本属性 2、指标属性 3、实体 4、实体属性 5、模型属性");

    /**
     * The column <code>SMETA_APP.dict_column_rule_info.platform_version</code>. 规则运行平台版本编号 : 2 mtee 2.0 ,3 mtee 3.0
     */
    public final TableField<DictColumnRuleInfoRecord, Byte> PLATFORM_VERSION = createField("platform_version", org.jooq.impl.SQLDataType.TINYINT, this, "规则运行平台版本编号 : 2 mtee 2.0 ,3 mtee 3.0");

    /**
     * Create a <code>SMETA_APP.dict_column_rule_info</code> table reference
     */
    public DictColumnRuleInfo() {
        this(DSL.name("dict_column_rule_info"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_column_rule_info</code> table reference
     */
    public DictColumnRuleInfo(String alias) {
        this(DSL.name(alias), DICT_COLUMN_RULE_INFO);
    }

    /**
     * Create an aliased <code>SMETA_APP.dict_column_rule_info</code> table reference
     */
    public DictColumnRuleInfo(Name alias) {
        this(alias, DICT_COLUMN_RULE_INFO);
    }

    private DictColumnRuleInfo(Name alias, Table<DictColumnRuleInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private DictColumnRuleInfo(Name alias, Table<DictColumnRuleInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "属性对应规则信息表（精卫从mtee同步数据）");
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
        return Arrays.<Index>asList(Indexes.DICT_COLUMN_RULE_INFO_IDX_COLUMN_CODE, Indexes.DICT_COLUMN_RULE_INFO_IDX_EVENT_CODE, Indexes.DICT_COLUMN_RULE_INFO_IDX_RULE_ID, Indexes.DICT_COLUMN_RULE_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DictColumnRuleInfoRecord, ULong> getIdentity() {
        return Keys.IDENTITY_DICT_COLUMN_RULE_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DictColumnRuleInfoRecord> getPrimaryKey() {
        return Keys.KEY_DICT_COLUMN_RULE_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DictColumnRuleInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<DictColumnRuleInfoRecord>>asList(Keys.KEY_DICT_COLUMN_RULE_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRuleInfo as(String alias) {
        return new DictColumnRuleInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictColumnRuleInfo as(Name alias) {
        return new DictColumnRuleInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DictColumnRuleInfo rename(String name) {
        return new DictColumnRuleInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DictColumnRuleInfo rename(Name name) {
        return new DictColumnRuleInfo(name, null);
    }
}
