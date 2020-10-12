package cn.stylefeng.guns.modular.students.model.result;

import lombok.Data;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author yl 
 * @since 2020-10-10
 */
@Data
public class StudentTotalResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 姓名
     */
    private String stuName;

    /**
     * 曾用名
     */
    private String pstuName;

    /**
     * 个人照片
     */
    private String photoSrc;

    /**
     * 学号
     */
    private Long stuNumber;

    /**
     * 一卡通号
     */
    private Long cardNumber;

    /**
     * 证件号码
     */
    private String idCard;

    /**
     * 联系电话
     */
    private Long phoneNumber;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 民族
     */
    private Integer nation;

    /**
     * 血型
     */
    private Integer bloodType;

    /**
     * 户籍类别
     */
    private Integer householdRegisterType;

    /**
     * 入团日期
     */
    private Date youthLeagueDate;

    /**
     * 团员发展编号
     */
    private String youthLeagueNum;

    /**
     * 户籍地址
     */
    private String residenceAddr;

    /**
     * 现居住地
     */
    private String currentAddr;

    /**
     * 户口本首页
     */
    private String householdRegisterFront;

    /**
     * 户口本主页
     */
    private String householdRegisterMain;

    /**
     * 户口本本人页
     */
    private String householdRegisterSelf;

    /**
     * 学生类别
     */
    private Integer stuType;

    /**
     * 班级
     */
    private String stuClass;

    /**
     * 省内学校代码
     */
    private String schoolNum;

    /**
     * 入学总分
     */
    private Integer totalScore;

    /**
     * 中考文化课成绩
     */
    private Integer testScore;

    /**
     * 原毕业院校
     */
    private String graduateSchool;

    /**
     * 学生来源
     */
    private Integer registerType;

    /**
     * 入学方式
     */
    private Integer studyType;

    /**
     * 中招序号
     */
    private Long admitOrder;

    /**
     * 随班就读
     */
    private Integer followClass;

    /**
     * 是否住宿生
     */
    private Integer accommodation;

    /**
     * 就读方式
     */
    private Integer studyMode;

    /**
     * 是否随迁子女
     */
    private Integer migrantWorkersChildren;

    /**
     * 是否进城务工随迁子女
     */
    private Integer countryWorkersChildren;

    /**
     * 是否由政府购买学位
     */
    private Integer governmentPurchaseDegree;

    /**
     * 学籍变更备注
     */
    private String enrollmentstatus;

    /**
     * 政治面貌
     */
    private Integer politicalStatus;

    /**
     * 特长
     */
    private String hobby;

    /**
     * 主页地址
     */
    private String principalSheet;

    /**
     * 健康状况
     */
    private Integer healthCondition;

    /**
     * 是否为留守儿童
     */
    private Integer leftBehindChildren;

    /**
     * 残疾类型
     */
    private Integer disableType;

    /**
     * 是否孤儿
     */
    private Integer orphan;

    /**
     * 是否农村低保
     */
    private Integer ruralDibao;

    /**
     * 是否农村特困救助供养
     */
    private Integer extremelyPoor;

    /**
     * 是否单亲
     */
    private Integer singleParent;

    /**
     * 是否军人子女
     */
    private Integer solderChildren;

    /**
     * 家庭是否有其他重大致贫因素
     */
    private Integer causesOfPoverty;

    /**
     * 是否需要申请资助
     */
    private Integer applySponsor;

    /**
     * 是否享受一补
     */
    private Integer needSupply;

    /**
     * 是否为独生子女
     */
    private Integer onlyChild;

    /**
     * 是否烈士或优抚子女
     */
    private Integer martyrChildren;

    /**
     * 是否享受营养餐
     */
    private Integer healthfulDiet;

    /**
     * 是否建档立卡贫困户在校生
     */
    private Integer putOnRecord;

    /**
     * 删除
     */
    private Integer deleteMember;

    private String ordernumber;

}
