/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.CalcIndicatorAccRecord;


/**
 * 事件指标取数定义
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcIndicatorAccRecordRecord extends UpdatableRecordImpl<CalcIndicatorAccRecordRecord> {

    private static final long serialVersionUID = -630693426;

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.operator</code>. 操作人
     */
    public void setOperator(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.operator</code>. 操作人
     */
    public String getOperator() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.operator_id</code>. 操作人工号
     */
    public void setOperatorId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.operator_id</code>. 操作人工号
     */
    public String getOperatorId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.creator</code>. 创建人
     */
    public void setCreator(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.creator</code>. 创建人
     */
    public String getCreator() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.creator_id</code>. 创建人工号
     */
    public void setCreatorId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.creator_id</code>. 创建人工号
     */
    public String getCreatorId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.name</code>. 名称
     */
    public void setName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.name</code>. 名称
     */
    public String getName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.data_type</code>. 数据分类（1：规则实验计算，2：特征预热计算，3：特征周期计算，99：其他）
     */
    public void setDataType(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.data_type</code>. 数据分类（1：规则实验计算，2：特征预热计算，3：特征周期计算，99：其他）
     */
    public Integer getDataType() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.comment</code>. 备注
     */
    public void setComment(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.comment</code>. 备注
     */
    public String getComment() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.submitter</code>. 审核提交人员
     */
    public void setSubmitter(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.submitter</code>. 审核提交人员
     */
    public String getSubmitter() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.status</code>. 状态（1：草稿，2：审核，3：有效，4：数据准备，5：运行）
     */
    public void setStatus(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.status</code>. 状态（1：草稿，2：审核，3：有效，4：数据准备，5：运行）
     */
    public Integer getStatus() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.result_table_name</code>. 输出结果表明
     */
    public void setResultTableName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.result_table_name</code>. 输出结果表明
     */
    public String getResultTableName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.code</code>. 取数编码
     */
    public void setCode(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.code</code>. 取数编码
     */
    public String getCode() {
        return (String) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.odps_pre_node_id</code>. odps准备数据阶段node id
     */
    public void setOdpsPreNodeId(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.odps_pre_node_id</code>. odps准备数据阶段node id
     */
    public String getOdpsPreNodeId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.odps_node_id</code>. odps运行阶段node id
     */
    public void setOdpsNodeId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.odps_node_id</code>. odps运行阶段node id
     */
    public String getOdpsNodeId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.run_step</code>. 运行步骤 1: 预处理数据, 2: 指标准备阶段, 3: 最终运行阶段(数据结果数据)
     */
    public void setRunStep(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.run_step</code>. 运行步骤 1: 预处理数据, 2: 指标准备阶段, 3: 最终运行阶段(数据结果数据)
     */
    public Integer getRunStep() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.scene_id</code>. 指标中心场景ID
     */
    public void setSceneId(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.scene_id</code>. 指标中心场景ID
     */
    public ULong getSceneId() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.old_record_id</code>. 上一次可复用取数定义ID
     */
    public void setOldRecordId(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.old_record_id</code>. 上一次可复用取数定义ID
     */
    public ULong getOldRecordId() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.old_scene_id</code>. 上一次可复用指标计算ID
     */
    public void setOldSceneId(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.old_scene_id</code>. 上一次可复用指标计算ID
     */
    public ULong getOldSceneId() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.old_result_table_name</code>. 上一次可复用取数结果表名
     */
    public void setOldResultTableName(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.old_result_table_name</code>. 上一次可复用取数结果表名
     */
    public String getOldResultTableName() {
        return (String) get(20);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.sample_sql</code>. 样本计算SQL
     */
    public void setSampleSql(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.sample_sql</code>. 样本计算SQL
     */
    public String getSampleSql() {
        return (String) get(21);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.has_need_completion</code>. 是否需要在线补全：0不需要，1需要
     */
    public void setHasNeedCompletion(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.has_need_completion</code>. 是否需要在线补全：0不需要，1需要
     */
    public Integer getHasNeedCompletion() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_acc_record.is_pst</code>. 取数时间 是否是美国时间（1：是美国时间，0：是中国时间）
     */
    public void setIsPst(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_acc_record.is_pst</code>. 取数时间 是否是美国时间（1：是美国时间，0：是中国时间）
     */
    public Integer getIsPst() {
        return (Integer) get(23);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CalcIndicatorAccRecordRecord
     */
    public CalcIndicatorAccRecordRecord() {
        super(CalcIndicatorAccRecord.CALC_INDICATOR_ACC_RECORD);
    }

    /**
     * Create a detached, initialised CalcIndicatorAccRecordRecord
     */
    public CalcIndicatorAccRecordRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String operator, String operatorId, String creator, String creatorId, String name, Integer dataType, String comment, String submitter, Integer status, String resultTableName, String code, String odpsPreNodeId, String odpsNodeId, Integer runStep, ULong sceneId, ULong oldRecordId, ULong oldSceneId, String oldResultTableName, String sampleSql, Integer hasNeedCompletion, Integer isPst) {
        super(CalcIndicatorAccRecord.CALC_INDICATOR_ACC_RECORD);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, operator);
        set(4, operatorId);
        set(5, creator);
        set(6, creatorId);
        set(7, name);
        set(8, dataType);
        set(9, comment);
        set(10, submitter);
        set(11, status);
        set(12, resultTableName);
        set(13, code);
        set(14, odpsPreNodeId);
        set(15, odpsNodeId);
        set(16, runStep);
        set(17, sceneId);
        set(18, oldRecordId);
        set(19, oldSceneId);
        set(20, oldResultTableName);
        set(21, sampleSql);
        set(22, hasNeedCompletion);
        set(23, isPst);
    }
}
