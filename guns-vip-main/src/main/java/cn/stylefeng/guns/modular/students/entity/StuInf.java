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
 * @since 2020-10-09
 */
@TableName("stu_inf")
public class StuInf implements Serializable {

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
     * 学号
     */
      @TableId(value = "stu_number", type = IdType.ID_WORKER)
    private Long stuNumber;

    /**
     * 班级
     */
    @TableField("class_number")
    private String classNumber;

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
     * 个人照片
     */
    @TableField("photo_src")
    private String photoSrc;

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

    public Long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(Long stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
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

    public String getPhotoSrc() {
        return photoSrc;
    }

    public void setPhotoSrc(String photoSrc) {
        this.photoSrc = photoSrc;
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

    @Override
    public String toString() {
        return "StuInf{" +
        "stuName=" + stuName +
        ", pstuName=" + pstuName +
        ", stuNumber=" + stuNumber +
        ", classNumber=" + classNumber +
        ", cardNumber=" + cardNumber +
        ", idCard=" + idCard +
        ", phoneNumber=" + phoneNumber +
        ", photoSrc=" + photoSrc +
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
        "}";
    }
}
