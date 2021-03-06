/*
 * This file is generated by jOOQ.
*/
package test.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;

import test.generated.tables.AirbusOdpsQueryTask;


/**
 * 查询odps表数据的task
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AirbusOdpsQueryTaskRecord extends UpdatableRecordImpl<AirbusOdpsQueryTaskRecord> implements Record14<ULong, Timestamp, Timestamp, String, String, Long, Long, Long, String, Timestamp, Timestamp, Integer, Integer, ULong> {

    private static final long serialVersionUID = 1412087794;

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.sic_result_table</code>. 结果表名
     */
    public void setSicResultTable(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.sic_result_table</code>. 结果表名
     */
    public String getSicResultTable() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.sic_result_table_partition</code>. 分区
     */
    public void setSicResultTablePartition(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.sic_result_table_partition</code>. 分区
     */
    public String getSicResultTablePartition() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.record</code>. 总记录数
     */
    public void setRecord(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.record</code>. 总记录数
     */
    public Long getRecord() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.read_start</code>. 读取记录的起始位置
     */
    public void setReadStart(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.read_start</code>. 读取记录的起始位置
     */
    public Long getReadStart() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.read_count</code>. 读取记录的数量
     */
    public void setReadCount(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.read_count</code>. 读取记录的数量
     */
    public Long getReadCount() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.consumer_ip</code>. 数据消费服务器
     */
    public void setConsumerIp(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.consumer_ip</code>. 数据消费服务器
     */
    public String getConsumerIp() {
        return (String) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.consumer_start_time</code>. 消费开始时间
     */
    public void setConsumerStartTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.consumer_start_time</code>. 消费开始时间
     */
    public Timestamp getConsumerStartTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.consumer_end_time</code>. 消费结束时间
     */
    public void setConsumerEndTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.consumer_end_time</code>. 消费结束时间
     */
    public Timestamp getConsumerEndTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.consumer_status</code>. 消费状态
     */
    public void setConsumerStatus(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.consumer_status</code>. 消费状态
     */
    public Integer getConsumerStatus() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.consumer_version</code>. 消费版本
     */
    public void setConsumerVersion(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.consumer_version</code>. 消费版本
     */
    public Integer getConsumerVersion() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.airbus_odps_query_task.job_release_id</code>. job release id. 只有未进行合并的task会记录
     */
    public void setJobReleaseId(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.airbus_odps_query_task.job_release_id</code>. job release id. 只有未进行合并的task会记录
     */
    public ULong getJobReleaseId() {
        return (ULong) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, Timestamp, Timestamp, String, String, Long, Long, Long, String, Timestamp, Timestamp, Integer, Integer, ULong> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<ULong, Timestamp, Timestamp, String, String, Long, Long, Long, String, Timestamp, Timestamp, Integer, Integer, ULong> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.SIC_RESULT_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.SIC_RESULT_TABLE_PARTITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.RECORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.READ_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.READ_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.CONSUMER_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.CONSUMER_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.CONSUMER_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.CONSUMER_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.CONSUMER_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field14() {
        return AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK.JOB_RELEASE_ID;
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
        return getSicResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSicResultTablePartition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getRecord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getReadStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getReadCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getConsumerIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getConsumerStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getConsumerEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getConsumerStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getConsumerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component14() {
        return getJobReleaseId();
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
        return getSicResultTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSicResultTablePartition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getRecord();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getReadStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getReadCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getConsumerIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getConsumerStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getConsumerEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getConsumerStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getConsumerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value14() {
        return getJobReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value4(String value) {
        setSicResultTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value5(String value) {
        setSicResultTablePartition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value6(Long value) {
        setRecord(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value7(Long value) {
        setReadStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value8(Long value) {
        setReadCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value9(String value) {
        setConsumerIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value10(Timestamp value) {
        setConsumerStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value11(Timestamp value) {
        setConsumerEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value12(Integer value) {
        setConsumerStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value13(Integer value) {
        setConsumerVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord value14(ULong value) {
        setJobReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AirbusOdpsQueryTaskRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, Long value6, Long value7, Long value8, String value9, Timestamp value10, Timestamp value11, Integer value12, Integer value13, ULong value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AirbusOdpsQueryTaskRecord
     */
    public AirbusOdpsQueryTaskRecord() {
        super(AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK);
    }

    /**
     * Create a detached, initialised AirbusOdpsQueryTaskRecord
     */
    public AirbusOdpsQueryTaskRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String sicResultTable, String sicResultTablePartition, Long record, Long readStart, Long readCount, String consumerIp, Timestamp consumerStartTime, Timestamp consumerEndTime, Integer consumerStatus, Integer consumerVersion, ULong jobReleaseId) {
        super(AirbusOdpsQueryTask.AIRBUS_ODPS_QUERY_TASK);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, sicResultTable);
        set(4, sicResultTablePartition);
        set(5, record);
        set(6, readStart);
        set(7, readCount);
        set(8, consumerIp);
        set(9, consumerStartTime);
        set(10, consumerEndTime);
        set(11, consumerStatus);
        set(12, consumerVersion);
        set(13, jobReleaseId);
    }
}
