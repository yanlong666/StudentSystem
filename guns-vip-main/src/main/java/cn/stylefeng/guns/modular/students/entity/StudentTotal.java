package cn.stylefeng.guns.modular.students.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yl 
 * @since 2020-10-10
 */
@TableName("student_total")
public class StudentTotal implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 姓名
     */
    @TableField("stu_name")
    private String stuName;

    /**
     * 曾用名
     */
    @TableField("pstu_name")
    private String pstuName;

    /**
     * 个人照片
     */
    @TableField("photo_src")
    private String photoSrc;

    /**
     * 学号
     */
    @TableField("stu_number")
    private Long stuNumber;

    /**
     * 一卡通号
     */
    @TableField("card_number")
    private Long cardNumber;

    /**
     * 证件号码
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 联系电话
     */
    @TableField("phone_number")
    private Long phoneNumber;

    /**
     * 出生日期
     */
    @TableField("birth")
    private Date birth;

    /**
     * 性别
     */
    @TableField("gender")
    private Integer gender;

    /**
     * 民族
     */
    @TableField("nation")
    private Integer nation;

    /**
     * 血型
     */
    @TableField("blood_type")
    private Integer bloodType;

    /**
     * 户籍类别
     */
    @TableField("Household_Register_type")
    private Integer householdRegisterType;

    /**
     * 入团日期
     */
    @TableField("youth_league_date")
    private Date youthLeagueDate;

    /**
     * 团员发展编号
     */
    @TableField("youth_league_num")
    private String youthLeagueNum;

    /**
     * 户籍地址
     */
    @TableField("residence_addr")
    private String residenceAddr;

    /**
     * 现居住地
     */
    @TableField("current_addr")
    private String currentAddr;

    /**
     * 户口本首页
     */
    @TableField("Household_Register_front")
    private String householdRegisterFront;

    /**
     * 户口本主页
     */
    @TableField("Household_Register_main")
    private String householdRegisterMain;

    /**
     * 户口本本人页
     */
    @TableField("Household_Register_self")
    private String householdRegisterSelf;

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

    /**
     * 政治面貌
     */
    @TableField("Political_Status")
    private Integer politicalStatus;

    /**
     * 特长
     */
    @TableField("hobby")
    private String hobby;

    /**
     * 主页地址
     */
    @TableField("principal_sheet")
    private String principalSheet;

    /**
     * 健康状况
     */
    @TableField("health_condition")
    private Integer healthCondition;

    /**
     * 是否为留守儿童
     */
    @TableField("left_behind_children")
    private Integer leftBehindChildren;

    /**
     * 残疾类型
     */
    @TableField("disable_type")
    private Integer disableType;

    /**
     * 是否孤儿
     */
    @TableField("orphan")
    private Integer orphan;

    /**
     * 是否农村低保
     */
    @TableField("rural_dibao")
    private Integer ruralDibao;

    /**
     * 是否农村特困救助供养
     */
    @TableField("extremely_poor")
    private Integer extremelyPoor;

    /**
     * 是否单亲
     */
    @TableField("single_parent")
    private Integer singleParent;

    /**
     * 是否军人子女
     */
    @TableField("solder_children")
    private Integer solderChildren;

    /**
     * 家庭是否有其他重大致贫因素
     */
    @TableField("causes_of_poverty")
    private Integer causesOfPoverty;

    /**
     * 是否需要申请资助
     */
    @TableField("apply_sponsor")
    private Integer applySponsor;

    /**
     * 是否享受一补
     */
    @TableField("need_supply")
    private Integer needSupply;

    /**
     * 是否为独生子女
     */
    @TableField("only_child")
    private Integer onlyChild;

    /**
     * 是否烈士或优抚子女
     */
    @TableField("Martyr_children")
    private Integer martyrChildren;

    /**
     * 是否享受营养餐
     */
    @TableField("healthful_diet")
    private Integer healthfulDiet;

    /**
     * 是否建档立卡贫困户在校生
     */
    @TableField("put_on_record")
    private Integer putOnRecord;

    /**
     * 删除
     */
    @TableField("delete_member")
    private Integer deleteMember;

      @TableId(value = "ordernumber", type = IdType.ID_WORKER)
    private String ordernumber;


    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getPstuName() {
        return pstuName;
    }

    public void setPstuName(String pstuName) {
        this.pstuName = pstuName;
    }

    public String getPhotoSrc() {
        return photoSrc;
    }

    public void setPhotoSrc(String photoSrc) {
        this.photoSrc = photoSrc;
    }

    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getBloodType() {
        return bloodType;
    }

    public void setBloodType(Integer bloodType) {
        this.bloodType = bloodType;
    }

    public Integer getHouseholdRegisterType() {
        return householdRegisterType;
    }

    public void setHouseholdRegisterType(Integer householdRegisterType) {
        this.householdRegisterType = householdRegisterType;
    }

    public Date getYouthLeagueDate() {
        return youthLeagueDate;
    }

    public void setYouthLeagueDate(Date youthLeagueDate) {
        this.youthLeagueDate = youthLeagueDate;
    }

    public String getYouthLeagueNum() {
        return youthLeagueNum;
    }

    public void setYouthLeagueNum(String youthLeagueNum) {
        this.youthLeagueNum = youthLeagueNum;
    }

    public String getResidenceAddr() {
        return residenceAddr;
    }

    public void setResidenceAddr(String residenceAddr) {
        this.residenceAddr = residenceAddr;
    }

    public String getCurrentAddr() {
        return currentAddr;
    }

    public void setCurrentAddr(String currentAddr) {
        this.currentAddr = currentAddr;
    }

    public String getHouseholdRegisterFront() {
        return householdRegisterFront;
    }

    public void setHouseholdRegisterFront(String householdRegisterFront) {
        this.householdRegisterFront = householdRegisterFront;
    }

    public String getHouseholdRegisterMain() {
        return householdRegisterMain;
    }

    public void setHouseholdRegisterMain(String householdRegisterMain) {
        this.householdRegisterMain = householdRegisterMain;
    }

    public String getHouseholdRegisterSelf() {
        return householdRegisterSelf;
    }

    public void setHouseholdRegisterSelf(String householdRegisterSelf) {
        this.householdRegisterSelf = householdRegisterSelf;
    }

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

    public Integer getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPrincipalSheet() {
        return principalSheet;
    }

    public void setPrincipalSheet(String principalSheet) {
        this.principalSheet = principalSheet;
    }

    public Integer getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(Integer healthCondition) {
        this.healthCondition = healthCondition;
    }

    public Integer getLeftBehindChildren() {
        return leftBehindChildren;
    }

    public void setLeftBehindChildren(Integer leftBehindChildren) {
        this.leftBehindChildren = leftBehindChildren;
    }

    public Integer getDisableType() {
        return disableType;
    }

    public void setDisableType(Integer disableType) {
        this.disableType = disableType;
    }

    public Integer getOrphan() {
        return orphan;
    }

    public void setOrphan(Integer orphan) {
        this.orphan = orphan;
    }

    public Integer getRuralDibao() {
        return ruralDibao;
    }

    public void setRuralDibao(Integer ruralDibao) {
        this.ruralDibao = ruralDibao;
    }

    public Integer getExtremelyPoor() {
        return extremelyPoor;
    }

    public void setExtremelyPoor(Integer extremelyPoor) {
        this.extremelyPoor = extremelyPoor;
    }

    public Integer getSingleParent() {
        return singleParent;
    }

    public void setSingleParent(Integer singleParent) {
        this.singleParent = singleParent;
    }

    public Integer getSolderChildren() {
        return solderChildren;
    }

    public void setSolderChildren(Integer solderChildren) {
        this.solderChildren = solderChildren;
    }

    public Integer getCausesOfPoverty() {
        return causesOfPoverty;
    }

    public void setCausesOfPoverty(Integer causesOfPoverty) {
        this.causesOfPoverty = causesOfPoverty;
    }

    public Integer getApplySponsor() {
        return applySponsor;
    }

    public void setApplySponsor(Integer applySponsor) {
        this.applySponsor = applySponsor;
    }

    public Integer getNeedSupply() {
        return needSupply;
    }

    public void setNeedSupply(Integer needSupply) {
        this.needSupply = needSupply;
    }

    public Integer getOnlyChild() {
        return onlyChild;
    }

    public void setOnlyChild(Integer onlyChild) {
        this.onlyChild = onlyChild;
    }

    public Integer getMartyrChildren() {
        return martyrChildren;
    }

    public void setMartyrChildren(Integer martyrChildren) {
        this.martyrChildren = martyrChildren;
    }

    public Integer getHealthfulDiet() {
        return healthfulDiet;
    }

    public void setHealthfulDiet(Integer healthfulDiet) {
        this.healthfulDiet = healthfulDiet;
    }

    public Integer getPutOnRecord() {
        return putOnRecord;
    }

    public void setPutOnRecord(Integer putOnRecord) {
        this.putOnRecord = putOnRecord;
    }

    public Integer getDeleteMember() {
        return deleteMember;
    }

    public void setDeleteMember(Integer deleteMember) {
        this.deleteMember = deleteMember;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    @Override
    public String toString() {
        return "StudentTotal{" +
        "stuName=" + stuName +
        ", pstuName=" + pstuName +
        ", photoSrc=" + photoSrc +
        ", stuNumber=" + stuNumber +
        ", cardNumber=" + cardNumber +
        ", idCard=" + idCard +
        ", phoneNumber=" + phoneNumber +
        ", birth=" + birth +
        ", gender=" + gender +
        ", nation=" + nation +
        ", bloodType=" + bloodType +
        ", householdRegisterType=" + householdRegisterType +
        ", youthLeagueDate=" + youthLeagueDate +
        ", youthLeagueNum=" + youthLeagueNum +
        ", residenceAddr=" + residenceAddr +
        ", currentAddr=" + currentAddr +
        ", householdRegisterFront=" + householdRegisterFront +
        ", householdRegisterMain=" + householdRegisterMain +
        ", householdRegisterSelf=" + householdRegisterSelf +
        ", stuType=" + stuType +
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
        ", politicalStatus=" + politicalStatus +
        ", hobby=" + hobby +
        ", principalSheet=" + principalSheet +
        ", healthCondition=" + healthCondition +
        ", leftBehindChildren=" + leftBehindChildren +
        ", disableType=" + disableType +
        ", orphan=" + orphan +
        ", ruralDibao=" + ruralDibao +
        ", extremelyPoor=" + extremelyPoor +
        ", singleParent=" + singleParent +
        ", solderChildren=" + solderChildren +
        ", causesOfPoverty=" + causesOfPoverty +
        ", applySponsor=" + applySponsor +
        ", needSupply=" + needSupply +
        ", onlyChild=" + onlyChild +
        ", martyrChildren=" + martyrChildren +
        ", healthfulDiet=" + healthfulDiet +
        ", putOnRecord=" + putOnRecord +
        ", deleteMember=" + deleteMember +
        ", ordernumber=" + ordernumber +
        "}";
    }
}
