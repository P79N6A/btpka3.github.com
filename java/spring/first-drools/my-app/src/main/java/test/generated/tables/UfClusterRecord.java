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
import test.generated.tables.records.UfClusterRecordRecord;


/**
 * 租户机器资源申请表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfClusterRecord extends TableImpl<UfClusterRecordRecord> {

    private static final long serialVersionUID = 451040293;

    /**
     * The reference instance of <code>SMETA_APP.uf_cluster_record</code>
     */
    public static final UfClusterRecord UF_CLUSTER_RECORD = new UfClusterRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfClusterRecordRecord> getRecordType() {
        return UfClusterRecordRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_cluster_record.id</code>. 主键
     */
    public final TableField<UfClusterRecordRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.gmt_create</code>. 创建时间
     */
    public final TableField<UfClusterRecordRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.gmt_modified</code>. 修改时间
     */
    public final TableField<UfClusterRecordRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.last_operator</code>. 最后修改者
     */
    public final TableField<UfClusterRecordRecord, ULong> LAST_OPERATOR = createField("last_operator", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "最后修改者");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.region_code</code>. 地区
     */
    public final TableField<UfClusterRecordRecord, String> REGION_CODE = createField("region_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "地区");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.node_num</code>. 机器数量
     */
    public final TableField<UfClusterRecordRecord, Integer> NODE_NUM = createField("node_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "机器数量");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.tenant_code</code>. 租户code
     */
    public final TableField<UfClusterRecordRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "租户code");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.sync_type</code>. 接收类型
     */
    public final TableField<UfClusterRecordRecord, String> SYNC_TYPE = createField("sync_type", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false), this, "接收类型");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.action</code>. 扩容add，缩容reduce ,删除delete,新增 new,修改接收方式 edit
     */
    public final TableField<UfClusterRecordRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "扩容add，缩容reduce ,删除delete,新增 new,修改接收方式 edit");

    /**
     * The column <code>SMETA_APP.uf_cluster_record.status</code>. 正常1，审批中2 等待提交审核 3  审批不通过4
     */
    public final TableField<UfClusterRecordRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "正常1，审批中2 等待提交审核 3  审批不通过4");

    /**
     * Create a <code>SMETA_APP.uf_cluster_record</code> table reference
     */
    public UfClusterRecord() {
        this(DSL.name("uf_cluster_record"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_cluster_record</code> table reference
     */
    public UfClusterRecord(String alias) {
        this(DSL.name(alias), UF_CLUSTER_RECORD);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_cluster_record</code> table reference
     */
    public UfClusterRecord(Name alias) {
        this(alias, UF_CLUSTER_RECORD);
    }

    private UfClusterRecord(Name alias, Table<UfClusterRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfClusterRecord(Name alias, Table<UfClusterRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "租户机器资源申请表");
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
        return Arrays.<Index>asList(Indexes.UF_CLUSTER_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfClusterRecordRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_CLUSTER_RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfClusterRecordRecord> getPrimaryKey() {
        return Keys.KEY_UF_CLUSTER_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfClusterRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<UfClusterRecordRecord>>asList(Keys.KEY_UF_CLUSTER_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord as(String alias) {
        return new UfClusterRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterRecord as(Name alias) {
        return new UfClusterRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfClusterRecord rename(String name) {
        return new UfClusterRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfClusterRecord rename(Name name) {
        return new UfClusterRecord(name, null);
    }
}