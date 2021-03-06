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
import test.generated.tables.records.AirbusEventInfoRecord;


/**
 * 离线事件配置信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusEventInfo extends TableImpl<AirbusEventInfoRecord> {

    private static final long serialVersionUID = -816210006;

    /**
     * The reference instance of <code>SMETA_APP.airbus_event_info</code>
     */
    public static final AirbusEventInfo AIRBUS_EVENT_INFO = new AirbusEventInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AirbusEventInfoRecord> getRecordType() {
        return AirbusEventInfoRecord.class;
    }

    /**
     * The column <code>SMETA_APP.airbus_event_info.id</code>. 主键
     */
    public final TableField<AirbusEventInfoRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.airbus_event_info.gmt_create</code>. 创建时间
     */
    public final TableField<AirbusEventInfoRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.airbus_event_info.gmt_modified</code>. 修改时间
     */
    public final TableField<AirbusEventInfoRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.airbus_event_info.event_code</code>. 事件code
     */
    public final TableField<AirbusEventInfoRecord, String> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "事件code");

    /**
     * The column <code>SMETA_APP.airbus_event_info.config</code>. 事件配置信息
     */
    public final TableField<AirbusEventInfoRecord, String> CONFIG = createField("config", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "事件配置信息");

    /**
     * The column <code>SMETA_APP.airbus_event_info.creator</code>. 新建人
     */
    public final TableField<AirbusEventInfoRecord, String> CREATOR = createField("creator", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "新建人");

    /**
     * The column <code>SMETA_APP.airbus_event_info.operator</code>. 操作人
     */
    public final TableField<AirbusEventInfoRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "操作人");

    /**
     * The column <code>SMETA_APP.airbus_event_info.status</code>. 状态值
     */
    public final TableField<AirbusEventInfoRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "状态值");

    /**
     * Create a <code>SMETA_APP.airbus_event_info</code> table reference
     */
    public AirbusEventInfo() {
        this(DSL.name("airbus_event_info"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_event_info</code> table reference
     */
    public AirbusEventInfo(String alias) {
        this(DSL.name(alias), AIRBUS_EVENT_INFO);
    }

    /**
     * Create an aliased <code>SMETA_APP.airbus_event_info</code> table reference
     */
    public AirbusEventInfo(Name alias) {
        this(alias, AIRBUS_EVENT_INFO);
    }

    private AirbusEventInfo(Name alias, Table<AirbusEventInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private AirbusEventInfo(Name alias, Table<AirbusEventInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "离线事件配置信息");
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
        return Arrays.<Index>asList(Indexes.AIRBUS_EVENT_INFO_PRIMARY, Indexes.AIRBUS_EVENT_INFO_UK_EVENT_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AirbusEventInfoRecord, ULong> getIdentity() {
        return Keys.IDENTITY_AIRBUS_EVENT_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AirbusEventInfoRecord> getPrimaryKey() {
        return Keys.KEY_AIRBUS_EVENT_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AirbusEventInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<AirbusEventInfoRecord>>asList(Keys.KEY_AIRBUS_EVENT_INFO_PRIMARY, Keys.KEY_AIRBUS_EVENT_INFO_UK_EVENT_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventInfo as(String alias) {
        return new AirbusEventInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusEventInfo as(Name alias) {
        return new AirbusEventInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusEventInfo rename(String name) {
        return new AirbusEventInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AirbusEventInfo rename(Name name) {
        return new AirbusEventInfo(name, null);
    }
}
