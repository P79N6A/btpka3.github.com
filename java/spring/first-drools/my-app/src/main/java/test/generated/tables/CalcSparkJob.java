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
import test.generated.tables.records.CalcSparkJobRecord;


/**
 * spark job
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalcSparkJob extends TableImpl<CalcSparkJobRecord> {

    private static final long serialVersionUID = -466923504;

    /**
     * The reference instance of <code>SMETA_APP.calc_spark_job</code>
     */
    public static final CalcSparkJob CALC_SPARK_JOB = new CalcSparkJob();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CalcSparkJobRecord> getRecordType() {
        return CalcSparkJobRecord.class;
    }

    /**
     * The column <code>SMETA_APP.calc_spark_job.id</code>. 主键
     */
    public final TableField<CalcSparkJobRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>SMETA_APP.calc_spark_job.gmt_create</code>. 创建时间
     */
    public final TableField<CalcSparkJobRecord, Timestamp> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>SMETA_APP.calc_spark_job.gmt_modified</code>. 修改时间
     */
    public final TableField<CalcSparkJobRecord, Timestamp> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>SMETA_APP.calc_spark_job.operator_id</code>. 操作人ID
     */
    public final TableField<CalcSparkJobRecord, String> OPERATOR_ID = createField("operator_id", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "操作人ID");

    /**
     * The column <code>SMETA_APP.calc_spark_job.operator</code>. 操作人
     */
    public final TableField<CalcSparkJobRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "操作人");

    /**
     * The column <code>SMETA_APP.calc_spark_job.del_status</code>. -1 ：表示删除
     */
    public final TableField<CalcSparkJobRecord, Integer> DEL_STATUS = createField("del_status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "-1 ：表示删除");

    /**
     * The column <code>SMETA_APP.calc_spark_job.status</code>. 状态
-5: 待终止
-3: 草稿
-1：待运行
1：成功
5：失败
7: 终止
10：运行中
     */
    public final TableField<CalcSparkJobRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "状态\n-5: 待终止\n-3: 草稿\n-1：待运行\n1：成功\n5：失败\n7: 终止\n10：运行中");

    /**
     * The column <code>SMETA_APP.calc_spark_job.content</code>. 任务内容(spark sql)
     */
    public final TableField<CalcSparkJobRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "任务内容(spark sql)");

    /**
     * The column <code>SMETA_APP.calc_spark_job.exception</code>. 异常信息
     */
    public final TableField<CalcSparkJobRecord, String> EXCEPTION = createField("exception", org.jooq.impl.SQLDataType.CLOB, this, "异常信息");

    /**
     * The column <code>SMETA_APP.calc_spark_job.job_id</code>. job_id
     */
    public final TableField<CalcSparkJobRecord, String> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.VARCHAR(128), this, "job_id");

    /**
     * The column <code>SMETA_APP.calc_spark_job.job_name</code>. job_name
     */
    public final TableField<CalcSparkJobRecord, String> JOB_NAME = createField("job_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "job_name");

    /**
     * The column <code>SMETA_APP.calc_spark_job.ctx_id</code>. spark context instance id
     */
    public final TableField<CalcSparkJobRecord, String> CTX_ID = createField("ctx_id", org.jooq.impl.SQLDataType.VARCHAR(128), this, "spark context instance id");

    /**
     * The column <code>SMETA_APP.calc_spark_job.host_name</code>. 运行hostname
     */
    public final TableField<CalcSparkJobRecord, String> HOST_NAME = createField("host_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "运行hostname");

    /**
     * The column <code>SMETA_APP.calc_spark_job.cupid_track_url</code>. spark ui
     */
    public final TableField<CalcSparkJobRecord, String> CUPID_TRACK_URL = createField("cupid_track_url", org.jooq.impl.SQLDataType.VARCHAR(2048), this, "spark ui");

    /**
     * The column <code>SMETA_APP.calc_spark_job.result</code>. spark计算信息结果
     */
    public final TableField<CalcSparkJobRecord, String> RESULT = createField("result", org.jooq.impl.SQLDataType.CLOB, this, "spark计算信息结果");

    /**
     * The column <code>SMETA_APP.calc_spark_job.access_id</code>. aliyun accessId
     */
    public final TableField<CalcSparkJobRecord, String> ACCESS_ID = createField("access_id", org.jooq.impl.SQLDataType.VARCHAR(256), this, "aliyun accessId");

    /**
     * The column <code>SMETA_APP.calc_spark_job.access_key</code>. aliyun accessKey
     */
    public final TableField<CalcSparkJobRecord, String> ACCESS_KEY = createField("access_key", org.jooq.impl.SQLDataType.VARCHAR(256), this, "aliyun accessKey");

    /**
     * Create a <code>SMETA_APP.calc_spark_job</code> table reference
     */
    public CalcSparkJob() {
        this(DSL.name("calc_spark_job"), null);
    }

    /**
     * Create an aliased <code>SMETA_APP.calc_spark_job</code> table reference
     */
    public CalcSparkJob(String alias) {
        this(DSL.name(alias), CALC_SPARK_JOB);
    }

    /**
     * Create an aliased <code>SMETA_APP.calc_spark_job</code> table reference
     */
    public CalcSparkJob(Name alias) {
        this(alias, CALC_SPARK_JOB);
    }

    private CalcSparkJob(Name alias, Table<CalcSparkJobRecord> aliased) {
        this(alias, aliased, null);
    }

    private CalcSparkJob(Name alias, Table<CalcSparkJobRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "spark job");
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
        return Arrays.<Index>asList(Indexes.CALC_SPARK_JOB_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CalcSparkJobRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CALC_SPARK_JOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CalcSparkJobRecord> getPrimaryKey() {
        return Keys.KEY_CALC_SPARK_JOB_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CalcSparkJobRecord>> getKeys() {
        return Arrays.<UniqueKey<CalcSparkJobRecord>>asList(Keys.KEY_CALC_SPARK_JOB_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkJob as(String alias) {
        return new CalcSparkJob(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CalcSparkJob as(Name alias) {
        return new CalcSparkJob(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CalcSparkJob rename(String name) {
        return new CalcSparkJob(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CalcSparkJob rename(Name name) {
        return new CalcSparkJob(name, null);
    }
}