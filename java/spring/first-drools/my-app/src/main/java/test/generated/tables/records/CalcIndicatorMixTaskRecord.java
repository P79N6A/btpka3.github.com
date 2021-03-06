/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.CalcIndicatorMixTask;


/**
 * 融合指标数据处理调度任务
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcIndicatorMixTaskRecord extends UpdatableRecordImpl<CalcIndicatorMixTaskRecord> implements Record17<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Long, Long, Long, String, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1073628711;

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.rt_indi_code</code>. 实时指标编码
     */
    public void setRtIndiCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.rt_indi_code</code>. 实时指标编码
     */
    public String getRtIndiCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.nl_indi_code</code>. 近线指标编码
     */
    public void setNlIndiCode(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.nl_indi_code</code>. 近线指标编码
     */
    public String getNlIndiCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.nl_indi_name</code>. 近线指标名称
     */
    public void setNlIndiName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.nl_indi_name</code>. 近线指标名称
     */
    public String getNlIndiName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.indi_project</code>. 指标结果表应用
     */
    public void setIndiProject(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.indi_project</code>. 指标结果表应用
     */
    public String getIndiProject() {
        return (String) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.indi_table_name</code>. 指标结果表名称
     */
    public void setIndiTableName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.indi_table_name</code>. 指标结果表名称
     */
    public String getIndiTableName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.indi_table_partition</code>. 指标结果表分区
     */
    public void setIndiTablePartition(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.indi_table_partition</code>. 指标结果表分区
     */
    public String getIndiTablePartition() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.record</code>. 指标表总记录数
     */
    public void setRecord(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.record</code>. 指标表总记录数
     */
    public Long getRecord() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.read_start</code>. 读取记录的起始位置
     */
    public void setReadStart(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.read_start</code>. 读取记录的起始位置
     */
    public Long getReadStart() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.read_count</code>. 读取记录的数量
     */
    public void setReadCount(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.read_count</code>. 读取记录的数量
     */
    public Long getReadCount() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.consumer_ip</code>. 数据消费服务器
     */
    public void setConsumerIp(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.consumer_ip</code>. 数据消费服务器
     */
    public String getConsumerIp() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.consumer_status</code>. 数据消费状态：0未消费，1消费中，2消费完成，3消费失败
     */
    public void setConsumerStatus(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.consumer_status</code>. 数据消费状态：0未消费，1消费中，2消费完成，3消费失败
     */
    public Integer getConsumerStatus() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.consumer_version</code>. 数据消费版本
     */
    public void setConsumerVersion(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.consumer_version</code>. 数据消费版本
     */
    public Integer getConsumerVersion() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.consumer_start_time</code>. 消费开始时间
     */
    public void setConsumerStartTime(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.consumer_start_time</code>. 消费开始时间
     */
    public Timestamp getConsumerStartTime() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.calc_indicator_mix_task.consumer_end_time</code>. 消费结束时间
     */
    public void setConsumerEndTime(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_indicator_mix_task.consumer_end_time</code>. 消费结束时间
     */
    public Timestamp getConsumerEndTime() {
        return (Timestamp) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Long, Long, Long, String, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<ULong, Timestamp, Timestamp, String, String, String, String, String, String, Long, Long, Long, String, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.RT_INDI_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.NL_INDI_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.NL_INDI_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.INDI_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.INDI_TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.INDI_TABLE_PARTITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field11() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.READ_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.READ_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.CONSUMER_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.CONSUMER_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.CONSUMER_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.CONSUMER_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK.CONSUMER_END_TIME;
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
        return getRtIndiCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNlIndiCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNlIndiName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIndiProject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getIndiTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getIndiTablePartition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getRecord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component11() {
        return getReadStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getReadCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getConsumerIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getConsumerStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getConsumerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getConsumerStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getConsumerEndTime();
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
        return getRtIndiCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNlIndiCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNlIndiName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIndiProject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getIndiTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getIndiTablePartition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getRecord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value11() {
        return getReadStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getReadCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getConsumerIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getConsumerStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getConsumerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getConsumerStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getConsumerEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value4(String value) {
        setRtIndiCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value5(String value) {
        setNlIndiCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value6(String value) {
        setNlIndiName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value7(String value) {
        setIndiProject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value8(String value) {
        setIndiTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value9(String value) {
        setIndiTablePartition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value10(Long value) {
        setRecord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value11(Long value) {
        setReadStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value12(Long value) {
        setReadCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value13(String value) {
        setConsumerIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value14(Integer value) {
        setConsumerStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value15(Integer value) {
        setConsumerVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value16(Timestamp value) {
        setConsumerStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord value17(Timestamp value) {
        setConsumerEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcIndicatorMixTaskRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, Long value10, Long value11, Long value12, String value13, Integer value14, Integer value15, Timestamp value16, Timestamp value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CalcIndicatorMixTaskRecord
     */
    public CalcIndicatorMixTaskRecord() {
        super(CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK);
    }

    /**
     * Create a detached, initialised CalcIndicatorMixTaskRecord
     */
    public CalcIndicatorMixTaskRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String rtIndiCode, String nlIndiCode, String nlIndiName, String indiProject, String indiTableName, String indiTablePartition, Long record, Long readStart, Long readCount, String consumerIp, Integer consumerStatus, Integer consumerVersion, Timestamp consumerStartTime, Timestamp consumerEndTime) {
        super(CalcIndicatorMixTask.CALC_INDICATOR_MIX_TASK);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, rtIndiCode);
        set(4, nlIndiCode);
        set(5, nlIndiName);
        set(6, indiProject);
        set(7, indiTableName);
        set(8, indiTablePartition);
        set(9, record);
        set(10, readStart);
        set(11, readCount);
        set(12, consumerIp);
        set(13, consumerStatus);
        set(14, consumerVersion);
        set(15, consumerStartTime);
        set(16, consumerEndTime);
    }
}
