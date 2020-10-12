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
public class StuRegisterParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


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

    private Long stuNum;

    @Override
    public String checkParam() {
        return null;
    }

}
