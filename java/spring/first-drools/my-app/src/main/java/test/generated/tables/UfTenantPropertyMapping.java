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
import test.generated.tables.records.UfTenantPropertyMappingRecord;


/**
 * 租户和实体、指标、属性的关联表，租户隔离
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfTenantPropertyMapping extends TableImpl<UfTenantPropertyMappingRecord> {

    private static final long serialVersionUID = -1310595912;

    /**
     * The reference instance of <code>SMETA_APP.uf_tenant_property_mapping</code>
     */
    public static final UfTenantPropertyMapping UF_TENANT_PROPERTY_MAPPING = new UfTenantPropertyMapping();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfTenantPropertyMappingRecord> getRecordType() {
        return UfTenantPropertyMappingRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.id</code>. 主键
     */
    public final TableField<UfTenantPropertyMappingRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.gmt_create</code>. 创建时间
     */
    public final TableField<UfTenantPropertyMappingRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.gmt_modified</code>. 修改时间
     */
    public final TableField<UfTenantPropertyMappingRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.type</code>. 类型，1:指标；2:实体；3:属性
     */
    public final TableField<UfTenantPropertyMappingRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT, this, "类型，1:指标；2:实体；3:属性");

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.meta_code</code>. 关联的实体、指标、属性的code
     */
    public final TableField<UfTenantPropertyMappingRecord, String> META_CODE = createField("meta_code", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "关联的实体、指标、属性的code");

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.tenant_code</code>. 租户的code
     */
    public final TableField<UfTenantPropertyMappingRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "租户的code");

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.operator_id</code>. 操作人工号

     */
    public final TableField<UfTenantPropertyMappingRecord, String> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "操作人工号\n");

    /**
     * The column <code>SMETA_APP.uf_tenant_property_mapping.status</code>. 状态，0:有效，-1:无效
     */
    public final TableField<UfTenantPropertyMappingRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态，0:有效，-1:无效");

    /**
     * Create a <code>SMETA_APP.uf_tenant_property_mapping</code> table reference
     */
    public UfTenantPropertyMapping() {
        this(DSL.name("uf_tenant_property_mapping"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_tenant_property_mapping</code> table reference
     */
    public UfTenantPropertyMapping(String alias) {
        this(DSL.name(alias), UF_TENANT_PROPERTY_MAPPING);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_tenant_property_mapping</code> table reference
     */
    public UfTenantPropertyMapping(Name alias) {
        this(alias, UF_TENANT_PROPERTY_MAPPING);
    }

    private UfTenantPropertyMapping(Name alias, Table<UfTenantPropertyMappingRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfTenantPropertyMapping(Name alias, Table<UfTenantPropertyMappingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "租户和实体、指标、属性的关联表，租户隔离");
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
        return Arrays.<Index>asList(Indexes.UF_TENANT_PROPERTY_MAPPING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfTenantPropertyMappingRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_TENANT_PROPERTY_MAPPING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfTenantPropertyMappingRecord> getPrimaryKey() {
        return Keys.KEY_UF_TENANT_PROPERTY_MAPPING_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfTenantPropertyMappingRecord>> getKeys() {
        return Arrays.<UniqueKey<UfTenantPropertyMappingRecord>>asList(Keys.KEY_UF_TENANT_PROPERTY_MAPPING_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfTenantPropertyMapping as(String alias) {
        return new UfTenantPropertyMapping(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfTenantPropertyMapping as(Name alias) {
        return new UfTenantPropertyMapping(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfTenantPropertyMapping rename(String name) {
        return new UfTenantPropertyMapping(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfTenantPropertyMapping rename(Name name) {
        return new UfTenantPropertyMapping(name, null);
    }
}
