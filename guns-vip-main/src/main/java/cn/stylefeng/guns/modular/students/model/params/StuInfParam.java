package cn.stylefeng.guns.modular.students.model.params;

import lombok.Data;
import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author yl 
 * @since 2020-10-09
 */
@Data
public class StuInfParam implements Serializable, BaseValidatingParam {

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
     * 学号
     */
    private Long stuNumber;

    /**
     * 班级
     */
    private String classNumber;

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
     * 个人照片
     */
    private String photoSrc;

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

    @Override
    public String checkParam() {
        return null;
    }

}
