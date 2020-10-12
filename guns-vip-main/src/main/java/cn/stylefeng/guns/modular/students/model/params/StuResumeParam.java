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
public class StuResumeParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


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

    private Long stuNumber;

    @Override
    public String checkParam() {
        return null;
    }

}
