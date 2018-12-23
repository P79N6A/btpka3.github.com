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
import org.jooq.types.UByte;
import org.jooq.types.ULong;

import test.generated.Indexes;
import test.generated.Keys;
import test.generated.SmetaApp;
import test.generated.tables.records.IndiWorkspaceRecord;


/**
 * 指标中心为接入的系统需要创建一个workspace
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndiWorkspace extends TableImpl<IndiWorkspaceRecord> {

    private static final long serialVersionUID = 1109447582;

    /**
     * The reference instance of <code>SMETA_APP.indi_workspace</code>
     */
    public static final IndiWorkspace INDI_WORKSPACE = new IndiWorkspace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IndiWorkspaceRecord> getRecordType() {
        return IndiWorkspaceRecord.class;
    }

    /**
     * The column <code>SMETA_APP.indi_workspace.id</code>. 主键
     */
    public final TableField<IndiWorkspaceRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.indi_workspace.gmt_create</code>. 创建时间
     */
    public final TableField<IndiWorkspaceRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.indi_workspace.gmt_modified</code>. 修改时间
     */
    public final TableField<IndiWorkspaceRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.indi_workspace.name</code>. workspace 工作区间， 指标系统为每个接入的应用分配一个独立的workspace
     */
    public final TableField<IndiWorkspaceRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(16).nullable(false), this, "workspace 工作区间， 指标系统为每个接入的应用分配一个独立的workspace");

    /**
     * The column <code>SMETA_APP.indi_workspace.description</code>. 命名空间的描述
     */
    public final TableField<IndiWorkspaceRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "命名空间的描述");

    /**
     * The column <code>SMETA_APP.indi_workspace.code</code>. 唯一code
     */
    public final TableField<IndiWorkspaceRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "唯一code");

    /**
     * The column <code>SMETA_APP.indi_workspace.created_by</code>. 创建者
     */
    public final TableField<IndiWorkspaceRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR(64), this, "创建者");

    /**
     * The column <code>SMETA_APP.indi_workspace.updated_by</code>. 修改者
     */
    public final TableField<IndiWorkspaceRecord, String> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.VARCHAR(64), this, "修改者");

    /**
     * The column <code>SMETA_APP.indi_workspace.is_effective</code>. 逻辑删除标记位
     */
    public final TableField<IndiWorkspaceRecord, UByte> IS_EFFECTIVE = createField("is_effective", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "逻辑删除标记位");

    /**
     * The column <code>SMETA_APP.indi_workspace.group_code</code>. 项目空间分组编码
     */
    public final TableField<IndiWorkspaceRecord, String> GROUP_CODE = createField("group_code", org.jooq.impl.SQLDataType.VARCHAR(32), this, "项目空间分组编码");

    /**
     * Create a <code>SMETA_APP.indi_workspace</code> table reference
     */
    public IndiWorkspace() {
        this(DSL.name("indi_workspace"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.indi_workspace</code> table reference
     */
    public IndiWorkspace(String alias) {
        this(DSL.name(alias), INDI_WORKSPACE);
    }

    /**
     * Create an aliased <code>SMETA_APP.indi_workspace</code> table reference
     */
    public IndiWorkspace(Name alias) {
        this(alias, INDI_WORKSPACE);
    }

    private IndiWorkspace(Name alias, Table<IndiWorkspaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private IndiWorkspace(Name alias, Table<IndiWorkspaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "指标中心为接入的系统需要创建一个workspace");
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
        return Arrays.<Index>asList(Indexes.INDI_WORKSPACE_IDX_GROUP_CODE, Indexes.INDI_WORKSPACE_IDX_IND_CO, Indexes.INDI_WORKSPACE_IDX_IND_IS, Indexes.INDI_WORKSPACE_IDX_NAME_ID, Indexes.INDI_WORKSPACE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<IndiWorkspaceRecord, ULong> getIdentity() {
        return Keys.IDENTITY_INDI_WORKSPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IndiWorkspaceRecord> getPrimaryKey() {
        return Keys.KEY_INDI_WORKSPACE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IndiWorkspaceRecord>> getKeys() {
        return Arrays.<UniqueKey<IndiWorkspaceRecord>>asList(Keys.KEY_INDI_WORKSPACE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiWorkspace as(String alias) {
        return new IndiWorkspace(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndiWorkspace as(Name alias) {
        return new IndiWorkspace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IndiWorkspace rename(String name) {
        return new IndiWorkspace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IndiWorkspace rename(Name name) {
        return new IndiWorkspace(name, null);
    }
}