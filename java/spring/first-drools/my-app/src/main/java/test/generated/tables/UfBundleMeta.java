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
import test.generated.tables.records.UfBundleMetaRecord;


/**
 * bundle基础信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfBundleMeta extends TableImpl<UfBundleMetaRecord> {

    private static final long serialVersionUID = 40427669;

    /**
     * The reference instance of <code>SMETA_APP.uf_bundle_meta</code>
     */
    public static final UfBundleMeta UF_BUNDLE_META = new UfBundleMeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfBundleMetaRecord> getRecordType() {
        return UfBundleMetaRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.id</code>. 主键
     */
    public final TableField<UfBundleMetaRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.gmt_create</code>. 创建时间
     */
    public final TableField<UfBundleMetaRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.gmt_modified</code>. 修改时间
     */
    public final TableField<UfBundleMetaRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.operator</code>. 操作人
     */
    public final TableField<UfBundleMetaRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "操作人");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.tenant_code</code>. 租户id
     */
    public final TableField<UfBundleMetaRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "租户id");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.artifact_id</code>. artifactId
     */
    public final TableField<UfBundleMetaRecord, String> ARTIFACT_ID = createField("artifact_id", org.jooq.impl.SQLDataType.VARCHAR(30).nullable(false), this, "artifactId");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.group_id</code>. groupId
     */
    public final TableField<UfBundleMetaRecord, String> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.VARCHAR(80).nullable(false), this, "groupId");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.version</code>. version
     */
    public final TableField<UfBundleMetaRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "version");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.bean_list</code>. bundle中所有的spring bean
     */
    public final TableField<UfBundleMetaRecord, String> BEAN_LIST = createField("bean_list", org.jooq.impl.SQLDataType.CLOB, this, "bundle中所有的spring bean");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.status</code>. 状态：1-启用，-1-禁用
     */
    public final TableField<UfBundleMetaRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "状态：1-启用，-1-禁用");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.description</code>. bundle描述
     */
    public final TableField<UfBundleMetaRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "bundle描述");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.sha1</code>. jar文件的sha1值
     */
    public final TableField<UfBundleMetaRecord, String> SHA1 = createField("sha1", org.jooq.impl.SQLDataType.VARCHAR(50), this, "jar文件的sha1值");

    /**
     * The column <code>SMETA_APP.uf_bundle_meta.code_repository_url</code>. 代码库url
     */
    public final TableField<UfBundleMetaRecord, String> CODE_REPOSITORY_URL = createField("code_repository_url", org.jooq.impl.SQLDataType.VARCHAR(200), this, "代码库url");

    /**
     * Create a <code>SMETA_APP.uf_bundle_meta</code> table reference
     */
    public UfBundleMeta() {
        this(DSL.name("uf_bundle_meta"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_bundle_meta</code> table reference
     */
    public UfBundleMeta(String alias) {
        this(DSL.name(alias), UF_BUNDLE_META);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_bundle_meta</code> table reference
     */
    public UfBundleMeta(Name alias) {
        this(alias, UF_BUNDLE_META);
    }

    private UfBundleMeta(Name alias, Table<UfBundleMetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfBundleMeta(Name alias, Table<UfBundleMetaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "bundle基础信息表");
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
        return Arrays.<Index>asList(Indexes.UF_BUNDLE_META_PRIMARY, Indexes.UF_BUNDLE_META_UK_TENANT_BUNDLEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfBundleMetaRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_BUNDLE_META;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfBundleMetaRecord> getPrimaryKey() {
        return Keys.KEY_UF_BUNDLE_META_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfBundleMetaRecord>> getKeys() {
        return Arrays.<UniqueKey<UfBundleMetaRecord>>asList(Keys.KEY_UF_BUNDLE_META_PRIMARY, Keys.KEY_UF_BUNDLE_META_UK_TENANT_BUNDLEID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfBundleMeta as(String alias) {
        return new UfBundleMeta(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfBundleMeta as(Name alias) {
        return new UfBundleMeta(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfBundleMeta rename(String name) {
        return new UfBundleMeta(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfBundleMeta rename(Name name) {
        return new UfBundleMeta(name, null);
    }
}