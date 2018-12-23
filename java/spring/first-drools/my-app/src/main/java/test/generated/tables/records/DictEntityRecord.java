/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.DictEntity;


/**
 * 字典实体信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DictEntityRecord extends UpdatableRecordImpl<DictEntityRecord> implements Record20<ULong, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, Byte, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = 2057107052;

    /**
     * Setter for <code>SMETA_APP.dict_entity.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.cn_name</code>. 实体中文名称
     */
    public void setCnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.cn_name</code>. 实体中文名称
     */
    public String getCnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.en_name</code>. 实体英文名称
     */
    public void setEnName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.en_name</code>. 实体英文名称
     */
    public String getEnName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.code</code>. 实体代码
     */
    public void setCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.code</code>. 实体代码
     */
    public String getCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.status</code>. 0 删除 1 已上线 2 草稿 3 审核中
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.status</code>. 0 删除 1 已上线 2 草稿 3 审核中
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.operator_id</code>. 操作人工号
     */
    public void setOperatorId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.operator_id</code>. 操作人工号
     */
    public String getOperatorId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.src_sys</code>. 源系统
     */
    public void setSrcSys(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.src_sys</code>. 源系统
     */
    public String getSrcSys() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.src_biz_pd</code>. 源业务pd
     */
    public void setSrcBizPd(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.src_biz_pd</code>. 源业务pd
     */
    public String getSrcBizPd() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.src_biz_tech</code>. 源业务技术
     */
    public void setSrcBizTech(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.src_biz_tech</code>. 源业务技术
     */
    public String getSrcBizTech() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.bu</code>. BU
     */
    public void setBu(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.bu</code>. BU
     */
    public String getBu() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.proto_type</code>. 是否原生实体，0：原生实体，1：实体别名
     */
    public void setProtoType(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.proto_type</code>. 是否原生实体，0：原生实体，1：实体别名
     */
    public Byte getProtoType() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.parent_code</code>. 别名实体指向原生实体的code
     */
    public void setParentCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.parent_code</code>. 别名实体指向原生实体的code
     */
    public String getParentCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.cost</code>. 补全成本，数值越小，成本越低
     */
    public void setCost(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.cost</code>. 补全成本，数值越小，成本越低
     */
    public Integer getCost() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.tenant_code</code>. 租户code
     */
    public void setTenantCode(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.tenant_code</code>. 租户code
     */
    public String getTenantCode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.offline_table</code>. 实体对应离线表（用于离线分析计算）
     */
    public void setOfflineTable(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.offline_table</code>. 实体对应离线表（用于离线分析计算）
     */
    public String getOfflineTable() {
        return (String) get(17);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.offline_table_pk</code>. 实体对应离线表主键（用于离线分析计算）
     */
    public void setOfflineTablePk(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.offline_table_pk</code>. 实体对应离线表主键（用于离线分析计算）
     */
    public String getOfflineTablePk() {
        return (String) get(18);
    }

    /**
     * Setter for <code>SMETA_APP.dict_entity.func_para</code>. 可能的实体的函数列表
     */
    public void setFuncPara(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>SMETA_APP.dict_entity.func_para</code>. 可能的实体的函数列表
     */
    public String getFuncPara() {
        return (String) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<ULong, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, Byte, String, Integer, String, String, String, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<ULong, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, Byte, String, Integer, String, String, String, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return DictEntity.DICT_ENTITY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DictEntity.DICT_ENTITY.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return DictEntity.DICT_ENTITY.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DictEntity.DICT_ENTITY.CN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DictEntity.DICT_ENTITY.EN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DictEntity.DICT_ENTITY.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return DictEntity.DICT_ENTITY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DictEntity.DICT_ENTITY.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DictEntity.DICT_ENTITY.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DictEntity.DICT_ENTITY.SRC_SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DictEntity.DICT_ENTITY.SRC_BIZ_PD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return DictEntity.DICT_ENTITY.SRC_BIZ_TECH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return DictEntity.DICT_ENTITY.BU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return DictEntity.DICT_ENTITY.PROTO_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return DictEntity.DICT_ENTITY.PARENT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return DictEntity.DICT_ENTITY.COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return DictEntity.DICT_ENTITY.TENANT_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return DictEntity.DICT_ENTITY.OFFLINE_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return DictEntity.DICT_ENTITY.OFFLINE_TABLE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return DictEntity.DICT_ENTITY.FUNC_PARA;
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
        return getCnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSrcSys();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSrcBizPd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getSrcBizTech();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getBu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getProtoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getParentCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getOfflineTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getOfflineTablePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getFuncPara();
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
        return getCnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOperatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOperator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSrcSys();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSrcBizPd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSrcBizTech();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getProtoType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getParentCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getCost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getTenantCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getOfflineTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getOfflineTablePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getFuncPara();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value4(String value) {
        setCnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value5(String value) {
        setEnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value6(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value8(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value9(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value10(String value) {
        setSrcSys(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value11(String value) {
        setSrcBizPd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value12(String value) {
        setSrcBizTech(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value13(String value) {
        setBu(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value14(Byte value) {
        setProtoType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value15(String value) {
        setParentCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value16(Integer value) {
        setCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value17(String value) {
        setTenantCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value18(String value) {
        setOfflineTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value19(String value) {
        setOfflineTablePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord value20(String value) {
        setFuncPara(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DictEntityRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, Byte value7, String value8, String value9, String value10, String value11, String value12, String value13, Byte value14, String value15, Integer value16, String value17, String value18, String value19, String value20) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DictEntityRecord
     */
    public DictEntityRecord() {
        super(DictEntity.DICT_ENTITY);
    }

    /**
     * Create a detached, initialised DictEntityRecord
     */
    public DictEntityRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String cnName, String enName, String code, Byte status, String operatorId, String operator, String srcSys, String srcBizPd, String srcBizTech, String bu, Byte protoType, String parentCode, Integer cost, String tenantCode, String offlineTable, String offlineTablePk, String funcPara) {
        super(DictEntity.DICT_ENTITY);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, cnName);
        set(4, enName);
        set(5, code);
        set(6, status);
        set(7, operatorId);
        set(8, operator);
        set(9, srcSys);
        set(10, srcBizPd);
        set(11, srcBizTech);
        set(12, bu);
        set(13, protoType);
        set(14, parentCode);
        set(15, cost);
        set(16, tenantCode);
        set(17, offlineTable);
        set(18, offlineTablePk);
        set(19, funcPara);
    }
}