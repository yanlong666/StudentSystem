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
 * @since 2020-10-10
 */
@Data
public class StuOtherParam implements Serializable, BaseValidatingParam {

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

    @Override
    public String checkParam() {
        return null;
    }

}
