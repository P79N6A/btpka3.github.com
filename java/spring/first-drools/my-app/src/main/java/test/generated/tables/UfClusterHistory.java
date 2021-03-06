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
import test.generated.tables.records.UfClusterHistoryRecord;


/**
 * 租户机器历史表(每个月一条记录)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfClusterHistory extends TableImpl<UfClusterHistoryRecord> {

    private static final long serialVersionUID = 1850244545;

    /**
     * The reference instance of <code>SMETA_APP.uf_cluster_history</code>
     */
    public static final UfClusterHistory UF_CLUSTER_HISTORY = new UfClusterHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UfClusterHistoryRecord> getRecordType() {
        return UfClusterHistoryRecord.class;
    }

    /**
     * The column <code>SMETA_APP.uf_cluster_history.id</code>. 主键
     */
    public final TableField<UfClusterHistoryRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.gmt_create</code>. 创建时间
     */
    public final TableField<UfClusterHistoryRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.gmt_modified</code>. 修改时间
     */
    public final TableField<UfClusterHistoryRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.sync_type</code>. 接收类型
     */
    public final TableField<UfClusterHistoryRecord, String> SYNC_TYPE = createField("sync_type", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false), this, "接收类型");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.region_code</code>. 地区
     */
    public final TableField<UfClusterHistoryRecord, String> REGION_CODE = createField("region_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "地区");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.tenant_code</code>. 租户code
     */
    public final TableField<UfClusterHistoryRecord, String> TENANT_CODE = createField("tenant_code", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "租户code");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.date</code>. 日期
     */
    public final TableField<UfClusterHistoryRecord, String> DATE = createField("date", org.jooq.impl.SQLDataType.VARCHAR(18).nullable(false), this, "日期");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.available_node_num</code>. 现有的机器数量
     */
    public final TableField<UfClusterHistoryRecord, Integer> AVAILABLE_NODE_NUM = createField("available_node_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "现有的机器数量");

    /**
     * The column <code>SMETA_APP.uf_cluster_history.last_operator</code>. 最后修改者
     */
    public final TableField<UfClusterHistoryRecord, ULong> LAST_OPERATOR = createField("last_operator", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "最后修改者");

    /**
     * Create a <code>SMETA_APP.uf_cluster_history</code> table reference
     */
    public UfClusterHistory() {
        this(DSL.name("uf_cluster_history"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_cluster_history</code> table reference
     */
    public UfClusterHistory(String alias) {
        this(DSL.name(alias), UF_CLUSTER_HISTORY);
    }

    /**
     * Create an aliased <code>SMETA_APP.uf_cluster_history</code> table reference
     */
    public UfClusterHistory(Name alias) {
        this(alias, UF_CLUSTER_HISTORY);
    }

    private UfClusterHistory(Name alias, Table<UfClusterHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private UfClusterHistory(Name alias, Table<UfClusterHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "租户机器历史表(每个月一条记录)");
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
        return Arrays.<Index>asList(Indexes.UF_CLUSTER_HISTORY_PRIMARY, Indexes.UF_CLUSTER_HISTORY_UK_REGION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UfClusterHistoryRecord, ULong> getIdentity() {
        return Keys.IDENTITY_UF_CLUSTER_HISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UfClusterHistoryRecord> getPrimaryKey() {
        return Keys.KEY_UF_CLUSTER_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UfClusterHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<UfClusterHistoryRecord>>asList(Keys.KEY_UF_CLUSTER_HISTORY_PRIMARY, Keys.KEY_UF_CLUSTER_HISTORY_UK_REGION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistory as(String alias) {
        return new UfClusterHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterHistory as(Name alias) {
        return new UfClusterHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UfClusterHistory rename(String name) {
        return new UfClusterHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UfClusterHistory rename(Name name) {
        return new UfClusterHistory(name, null);
    }
}
