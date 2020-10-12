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
public class StuMyIndexHtmlParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    private Long stuNumber;

    @Override
    public String checkParam() {
        return null;
    }

}
