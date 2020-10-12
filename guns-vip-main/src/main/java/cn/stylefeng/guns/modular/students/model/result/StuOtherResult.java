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
public class StuOtherResult implements Serializable {

    private static final long serialVersionUID = 1L;


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

    private Long stuNumber;

}
