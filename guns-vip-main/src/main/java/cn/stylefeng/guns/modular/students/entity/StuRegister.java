package cn.stylefeng.guns.modular.students.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yl 
 * @since 2020-10-09
 */
@TableName("stu_register")
public class StuRegister implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 学生类别
     */
    @TableField("stu_type")
    private Integer stuType;

    /**
     * 班级
     */
    @TableField("stu_class")
    private String stuClass;

    /**
     * 省内学校代码
     */
    @TableField("school_num")
    private String schoolNum;

    /**
     * 入学总分
     */
    @TableField("total_score")
    private Integer totalScore;

    /**
     * 中考文化课成绩
     */
    @TableField("test_score")
    private Integer testScore;

    /**
     * 原毕业院校
     */
    @TableField("graduate_school")
    private String graduateSchool;

    /**
     * 学生来源
     */
    @TableField("register_type")
    private Integer registerType;

    /**
     * 入学方式
     */
    @TableField("study_type")
    private Integer studyType;

    /**
     * 中招序号
     */
    @TableField("admit_order")
    private Long admitOrder;

    /**
     * 随班就读
     */
    @TableField("follow_class")
    private Integer followClass;

    /**
     * 是否住宿生
     */
    @TableField("accommodation")
    private Integer accommodation;

    /**
     * 就读方式
     */
    @TableField("study_mode")
    private Integer studyMode;

    /**
     * 是否随迁子女
     */
    @TableField("Migrant_Workers_children")
    private Integer migrantWorkersChildren;

    /**
     * 是否进城务工随迁子女
     */
    @TableField("country_workers_children")
    private Integer countryWorkersChildren;

    /**
     * 是否由政府购买学位
     */
    @TableField("government_purchase_degree")
    private Integer governmentPurchaseDegree;

    /**
     * 学籍变更备注
     */
    @TableField("enrollmentstatus")
    private String enrollmentstatus;

      @TableId(value = "stuNum", type = IdType.ID_WORKER)
    private Long stuNum;


    public Integer getStuType() {
        return stuType;
    }

    public void setStuType(Integer stuType) {
        this.stuType = stuType;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getSchoolNum() {
        return schoolNum;
    }

    public void setSchoolNum(String schoolNum) {
        this.schoolNum = schoolNum;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getTestScore() {
        return testScore;
    }

    public void setTestScore(Integer testScore) {
        this.testScore = testScore;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public Integer getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Integer registerType) {
        this.registerType = registerType;
    }

    public Integer getStudyType() {
        return studyType;
    }

    public void setStudyType(Integer studyType) {
        this.studyType = studyType;
    }

    public Long getAdmitOrder() {
        return admitOrder;
    }

    public void setAdmitOrder(Long admitOrder) {
        this.admitOrder = admitOrder;
    }

    public Integer getFollowClass() {
        return followClass;
    }

    public void setFollowClass(Integer followClass) {
        this.followClass = followClass;
    }

    public Integer getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Integer accommodation) {
        this.accommodation = accommodation;
    }

    public Integer getStudyMode() {
        return studyMode;
    }

    public void setStudyMode(Integer studyMode) {
        this.studyMode = studyMode;
    }

    public Integer getMigrantWorkersChildren() {
        return migrantWorkersChildren;
    }

    public void setMigrantWorkersChildren(Integer migrantWorkersChildren) {
        this.migrantWorkersChildren = migrantWorkersChildren;
    }

    public Integer getCountryWorkersChildren() {
        return countryWorkersChildren;
    }

    public void setCountryWorkersChildren(Integer countryWorkersChildren) {
        this.countryWorkersChildren = countryWorkersChildren;
    }

    public Integer getGovernmentPurchaseDegree() {
        return governmentPurchaseDegree;
    }

    public void setGovernmentPurchaseDegree(Integer governmentPurchaseDegree) {
        this.governmentPurchaseDegree = governmentPurchaseDegree;
    }

    public String getEnrollmentstatus() {
        return enrollmentstatus;
    }

    public void setEnrollmentstatus(String enrollmentstatus) {
        this.enrollmentstatus = enrollmentstatus;
    }

    public Long getStuNum() {
        return stuNum;
    }

    public void setStuNum(Long stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    public String toString() {
        return "StuRegister{" +
        "stuType=" + stuType +
        ", stuClass=" + stuClass +
        ", schoolNum=" + schoolNum +
        ", totalScore=" + totalScore +
        ", testScore=" + testScore +
        ", graduateSchool=" + graduateSchool +
        ", registerType=" + registerType +
        ", studyType=" + studyType +
        ", admitOrder=" + admitOrder +
        ", followClass=" + followClass +
        ", accommodation=" + accommodation +
        ", studyMode=" + studyMode +
        ", migrantWorkersChildren=" + migrantWorkersChildren +
        ", countryWorkersChildren=" + countryWorkersChildren +
        ", governmentPurchaseDegree=" + governmentPurchaseDegree +
        ", enrollmentstatus=" + enrollmentstatus +
        ", stuNum=" + stuNum +
        "}";
    }
}
