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
import test.generated.tables.records.StateMachineRecord;


/**
 * 状态机配置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StateMachine extends TableImpl<StateMachineRecord> {

    private static final long serialVersionUID = 689591040;

    /**
     * The reference instance of <code>SMETA_APP.state_machine</code>
     */
    public static final StateMachine STATE_MACHINE = new StateMachine();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StateMachineRecord> getRecordType() {
        return StateMachineRecord.class;
    }

    /**
     * The column <code>SMETA_APP.state_machine.id</code>. 主键
     */
    public final TableField<StateMachineRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.state_machine.gmt_create</code>. 创建时间
     */
    public final TableField<StateMachineRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.state_machine.gmt_modified</code>. 修改时间
     */
    public final TableField<StateMachineRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.state_machine.balance_id</code>. 天平id
     */
    public final TableField<StateMachineRecord, ULong> BALANCE_ID = createField("balance_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "天平id");

    /**
     * The column <code>SMETA_APP.state_machine.name</code>. 状态名
     */
    public final TableField<StateMachineRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "状态名");

    /**
     * The column <code>SMETA_APP.state_machine.content</code>. 天平状态机内容
     */
    public final TableField<StateMachineRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "天平状态机内容");

    /**
     * The column <code>SMETA_APP.state_machine.remark</code>. 备注
     */
    public final TableField<StateMachineRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(256), this, "备注");

    /**
     * Create a <code>SMETA_APP.state_machine</code> table reference
     */
    public StateMachine() {
        this(DSL.name("state_machine"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.state_machine</code> table reference
     */
    public StateMachine(String alias) {
        this(DSL.name(alias), STATE_MACHINE);
    }

    /**
     * Create an aliased <code>SMETA_APP.state_machine</code> table reference
     */
    public StateMachine(Name alias) {
        this(alias, STATE_MACHINE);
    }

    private StateMachine(Name alias, Table<StateMachineRecord> aliased) {
        this(alias, aliased, null);
    }

    private StateMachine(Name alias, Table<StateMachineRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "状态机配置");
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
        return Arrays.<Index>asList(Indexes.STATE_MACHINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StateMachineRecord, ULong> getIdentity() {
        return Keys.IDENTITY_STATE_MACHINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StateMachineRecord> getPrimaryKey() {
        return Keys.KEY_STATE_MACHINE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StateMachineRecord>> getKeys() {
        return Arrays.<UniqueKey<StateMachineRecord>>asList(Keys.KEY_STATE_MACHINE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StateMachine as(String alias) {
        return new StateMachine(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StateMachine as(Name alias) {
        return new StateMachine(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StateMachine rename(String name) {
        return new StateMachine(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StateMachine rename(Name name) {
        return new StateMachine(name, null);
    }
}
