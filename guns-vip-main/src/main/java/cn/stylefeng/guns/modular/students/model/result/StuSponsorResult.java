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
public class StuSponsorResult implements Serializable {

    private static final long serialVersionUID = 1L;


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

    private Long stuNumber;

}
