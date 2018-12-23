/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.UfClusterNode;


/**
 * 租户机器配置表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UfClusterNodeRecord extends UpdatableRecordImpl<UfClusterNodeRecord> implements Record16<ULong, Timestamp, Timestamp, ULong, String, String, String, String, String, String, String, String, String, String, Integer, String> {

    private static final long serialVersionUID = 1411349160;

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.last_operator</code>. 最后修改者
     */
    public void setLastOperator(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.last_operator</code>. 最后修改者
     */
    public ULong getLastOperator() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.host_name</code>. 机器hosthome
     */
    public void setHostName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.host_name</code>. 机器hosthome
     */
    public String getHostName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.region_code</code>. 地区
     */
    public void setRegionCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.region_code</code>. 地区
     */
    public String getRegionCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.lab_code</code>. 机房code
     */
    public void setLabCode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.lab_code</code>. 机房code
     */
    public String getLabCode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.sync_type</code>. sync/async
     */
    public void setSyncType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.sync_type</code>. sync/async
     */
    public String getSyncType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.tenant_code</code>. 租户编码
     */
    public void setTenantCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.tenant_code</code>. 租户编码
     */
    public String getTenantCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.node_ip</code>. 机器ip
     */
    public void setNodeIp(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.node_ip</code>. 机器ip
     */
    public String getNodeIp() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.node_group</code>. 机器分组
     */
    public void setNodeGroup(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.node_group</code>. 机器分组
     */
    public String getNodeGroup() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.group_schema</code>. 分组schema
     */
    public void setGroupSchema(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.group_schema</code>. 分组schema
     */
    public String getGroupSchema() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.app_name</code>. 机器资源所属的应用名
     */
    public void setAppName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.app_name</code>. 机器资源所属的应用名
     */
    public String getAppName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.armory_sn</code>. armory唯一标识符
     */
    public void setArmorySn(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.armory_sn</code>. armory唯一标识符
     */
    public String getArmorySn() {
        return (String) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.armory_status</code>. armory的节点状态
     */
    public void setArmoryStatus(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.armory_status</code>. armory的节点状态
     */
    public Integer getArmoryStatus() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.uf_cluster_node.cluster_name</code>. 构建Akka集群的名称
     */
    public void setClusterName(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.uf_cluster_node.cluster_name</code>. 构建Akka集群的名称
     */
    public String getClusterName() {
        return (String) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<ULong, Timestamp, Timestamp, ULong, String, String, String, String, String, String, String, String, String, String, Integer, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<ULong, Timestamp, Timestamp, ULong, String, String, String, String, String, String, String, String, String, String, Integer, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return UfClusterNode.UF_CLUSTER_NODE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return UfClusterNode.UF_CLUSTER_NODE.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UfClusterNode.UF_CLUSTER_NODE.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return UfClusterNode.UF_CLUSTER_NODE.LAST_OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UfClusterNode.UF_CLUSTER_NODE.HOST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UfClusterNode.UF_CLUSTER_NODE.REGION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UfClusterNode.UF_CLUSTER_NODE.LAB_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return UfClusterNode.UF_CLUSTER_NODE.SYNC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return UfClusterNode.UF_CLUSTER_NODE.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return UfClusterNode.UF_CLUSTER_NODE.NODE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return UfClusterNode.UF_CLUSTER_NODE.NODE_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return UfClusterNode.UF_CLUSTER_NODE.GROUP_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return UfClusterNode.UF_CLUSTER_NODE.APP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return UfClusterNode.UF_CLUSTER_NODE.ARMORY_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return UfClusterNode.UF_CLUSTER_NODE.ARMORY_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return UfClusterNode.UF_CLUSTER_NODE.CLUSTER_NAME;
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
    public ULong component4() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getHostName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRegionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLabCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getNodeIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getNodeGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getGroupSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getAppName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getArmorySn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getArmoryStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getClusterName();
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
    public ULong value4() {
        return getLastOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getHostName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRegionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLabCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getNodeIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getNodeGroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getGroupSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAppName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getArmorySn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getArmoryStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getClusterName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value4(ULong value) {
        setLastOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value5(String value) {
        setHostName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value6(String value) {
        setRegionCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value7(String value) {
        setLabCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value8(String value) {
        setSyncType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value9(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value10(String value) {
        setNodeIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value11(String value) {
        setNodeGroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value12(String value) {
        setGroupSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value13(String value) {
        setAppName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value14(String value) {
        setArmorySn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value15(Integer value) {
        setArmoryStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord value16(String value) {
        setClusterName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UfClusterNodeRecord values(ULong value1, Timestamp value2, Timestamp value3, ULong value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, Integer value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UfClusterNodeRecord
     */
    public UfClusterNodeRecord() {
        super(UfClusterNode.UF_CLUSTER_NODE);
    }

    /**
     * Create a detached, initialised UfClusterNodeRecord
     */
    public UfClusterNodeRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, ULong lastOperator, String hostName, String regionCode, String labCode, String syncType, String tenantCode, String nodeIp, String nodeGroup, String groupSchema, String appName, String armorySn, Integer armoryStatus, String clusterName) {
        super(UfClusterNode.UF_CLUSTER_NODE);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, lastOperator);
        set(4, hostName);
        set(5, regionCode);
        set(6, labCode);
        set(7, syncType);
        set(8, tenantCode);
        set(9, nodeIp);
        set(10, nodeGroup);
        set(11, groupSchema);
        set(12, appName);
        set(13, armorySn);
        set(14, armoryStatus);
        set(15, clusterName);
    }
}