/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.MoreCluster;


/**
 * 近线引擎集群表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MoreClusterRecord extends UpdatableRecordImpl<MoreClusterRecord> implements Record9<ULong, Timestamp, Timestamp, String, String, String, String, String, Short> {

    private static final long serialVersionUID = -380683493;

    /**
     * Setter for <code>SMETA_APP.more_cluster.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.operator_id</code>. 操作人id
     */
    public void setOperatorId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.operator_id</code>. 操作人id
     */
    public String getOperatorId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.name</code>. 集群名称
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.name</code>. 集群名称
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.code</code>. 集群code，不能重复
     */
    public void setCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.code</code>. 集群code，不能重复
     */
    public String getCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.config_json</code>. 集群配置信息，json格式
     */
    public void setConfigJson(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.config_json</code>. 集群配置信息，json格式
     */
    public String getConfigJson() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.more_cluster.status</code>. 状态，0-有效，-1-删除
     */
    public void setStatus(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.more_cluster.status</code>. 状态，0-有效，-1-删除
     */
    public Short getStatus() {
        return (Short) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, Timestamp, Timestamp, String, String, String, String, String, Short> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<ULong, Timestamp, Timestamp, String, String, String, String, String, Short> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return MoreCluster.MORE_CLUSTER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return MoreCluster.MORE_CLUSTER.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return MoreCluster.MORE_CLUSTER.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MoreCluster.MORE_CLUSTER.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MoreCluster.MORE_CLUSTER.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MoreCluster.MORE_CLUSTER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MoreCluster.MORE_CLUSTER.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MoreCluster.MORE_CLUSTER.CONFIG_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return MoreCluster.MORE_CLUSTER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getConfigJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getGmtCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getGmtModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getConfigJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value4(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value5(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value7(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value8(String value) {
        setConfigJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord value9(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoreClusterRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, Short value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MoreClusterRecord
     */
    public MoreClusterRecord() {
        super(MoreCluster.MORE_CLUSTER);
    }

    /**
     * Create a detached, initialised MoreClusterRecord
     */
    public MoreClusterRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String operatorId, String operator, String name, String code, String configJson, Short status) {
        super(MoreCluster.MORE_CLUSTER);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, operatorId);
        set(4, operator);
        set(5, name);
        set(6, code);
        set(7, configJson);
        set(8, status);
    }
}
