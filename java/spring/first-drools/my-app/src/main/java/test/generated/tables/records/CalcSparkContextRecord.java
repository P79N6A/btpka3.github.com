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

import test.generated.tables.CalcSparkContext;


/**
 * spark context
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcSparkContextRecord extends UpdatableRecordImpl<CalcSparkContextRecord> implements Record17<ULong, Timestamp, Timestamp, String, String, Integer, Integer, String, Integer, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -137038489;

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.id</code>. 主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.id</code>. 主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.gmt_create</code>. 创建时间
     */
    public void setGmtCreate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.gmt_create</code>. 创建时间
     */
    public Timestamp getGmtCreate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.gmt_modified</code>. 修改时间
     */
    public void setGmtModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.gmt_modified</code>. 修改时间
     */
    public Timestamp getGmtModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.operator_id</code>. 操作人ID
     */
    public void setOperatorId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.operator_id</code>. 操作人ID
     */
    public String getOperatorId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.operator</code>. operator
     */
    public void setOperator(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.operator</code>. operator
     */
    public String getOperator() {
        return (String) get(4);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.status</code>. 状态：1：运行中，3：启动中，5：停止，10: 失败，-1：待启动，-3：待停止
     */
    public void setStatus(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.status</code>. 状态：1：运行中，3：启动中，5：停止，10: 失败，-1：待启动，-3：待停止
     */
    public Integer getStatus() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.del_status</code>. -1 ：表示删除
     */
    public void setDelStatus(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.del_status</code>. -1 ：表示删除
     */
    public Integer getDelStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.host_name</code>. 机器hostname
     */
    public void setHostName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.host_name</code>. 机器hostname
     */
    public String getHostName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.max_job_count</code>. 最大运行job数量
     */
    public void setMaxJobCount(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.max_job_count</code>. 最大运行job数量
     */
    public Integer getMaxJobCount() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.auto_start</code>. 是否自动启动
     */
    public void setAutoStart(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.auto_start</code>. 是否自动启动
     */
    public String getAutoStart() {
        return (String) get(9);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.config</code>. spark context 参数配置
     */
    public void setConfig(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.config</code>. spark context 参数配置
     */
    public String getConfig() {
        return (String) get(10);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.driver_jar_name</code>. driver_jar_name
     */
    public void setDriverJarName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.driver_jar_name</code>. driver_jar_name
     */
    public String getDriverJarName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.ctx_id</code>. spark content instance id
     */
    public void setCtxId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.ctx_id</code>. spark content instance id
     */
    public String getCtxId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.jar_name</code>. spark submit 提交jar返回jar name
     */
    public void setJarName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.jar_name</code>. spark submit 提交jar返回jar name
     */
    public String getJarName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.cupid_track_url</code>. spark ui
     */
    public void setCupidTrackUrl(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.cupid_track_url</code>. spark ui
     */
    public String getCupidTrackUrl() {
        return (String) get(14);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.exception</code>. 异常信息
     */
    public void setException(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.exception</code>. 异常信息
     */
    public String getException() {
        return (String) get(15);
    }

    /**
     * Setter for <code>SMETA_APP.calc_spark_context.is_test</code>. 是否测试
     */
    public void setIsTest(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>SMETA_APP.calc_spark_context.is_test</code>. 是否测试
     */
    public String getIsTest() {
        return (String) get(16);
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
    public Row17<ULong, Timestamp, Timestamp, String, String, Integer, Integer, String, Integer, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<ULong, Timestamp, Timestamp, String, String, Integer, Integer, String, Integer, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.GMT_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.GMT_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.OPERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.OPERATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.DEL_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.HOST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.MAX_JOB_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.AUTO_START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.DRIVER_JAR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.CTX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.JAR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.CUPID_TRACK_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.EXCEPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return CalcSparkContext.CALC_SPARK_CONTEXT.IS_TEST;
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
    public Integer component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDelStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getHostName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getMaxJobCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getAutoStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getDriverJarName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getCtxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getJarName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getCupidTrackUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getIsTest();
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
    public Integer value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDelStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getHostName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getMaxJobCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAutoStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getDriverJarName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getCtxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getJarName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getCupidTrackUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getException();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getIsTest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value2(Timestamp value) {
        setGmtCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value3(Timestamp value) {
        setGmtModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value4(String value) {
        setOperatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value5(String value) {
        setOperator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value6(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value7(Integer value) {
        setDelStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value8(String value) {
        setHostName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value9(Integer value) {
        setMaxJobCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value10(String value) {
        setAutoStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value11(String value) {
        setConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value12(String value) {
        setDriverJarName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value13(String value) {
        setCtxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value14(String value) {
        setJarName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value15(String value) {
        setCupidTrackUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value16(String value) {
        setException(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord value17(String value) {
        setIsTest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkContextRecord values(ULong value1, Timestamp value2, Timestamp value3, String value4, String value5, Integer value6, Integer value7, String value8, Integer value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17) {
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
     * Create a detached CalcSparkContextRecord
     */
    public CalcSparkContextRecord() {
        super(CalcSparkContext.CALC_SPARK_CONTEXT);
    }

    /**
     * Create a detached, initialised CalcSparkContextRecord
     */
    public CalcSparkContextRecord(ULong id, Timestamp gmtCreate, Timestamp gmtModified, String operatorId, String operator, Integer status, Integer delStatus, String hostName, Integer maxJobCount, String autoStart, String config, String driverJarName, String ctxId, String jarName, String cupidTrackUrl, String exception, String isTest) {
        super(CalcSparkContext.CALC_SPARK_CONTEXT);

        set(0, id);
        set(1, gmtCreate);
        set(2, gmtModified);
        set(3, operatorId);
        set(4, operator);
        set(5, status);
        set(6, delStatus);
        set(7, hostName);
        set(8, maxJobCount);
        set(9, autoStart);
        set(10, config);
        set(11, driverJarName);
        set(12, ctxId);
        set(13, jarName);
        set(14, cupidTrackUrl);
        set(15, exception);
        set(16, isTest);
    }
}
