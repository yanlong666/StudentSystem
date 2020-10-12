package cn.stylefeng.guns.modular.students.mapper;

import cn.stylefeng.guns.modular.students.entity.StuRegister;
import cn.stylefeng.guns.modular.students.model.params.StuRegisterParam;
import cn.stylefeng.guns.modular.students.model.result.StuRegisterResult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yl 
 * @since 2020-10-09
 */
public interface StuRegisterMapper extends BaseMapper<StuRegister> {

    /**
     * 获取列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    List<StuRegisterResult> customList(@Param("paramCondition") StuRegisterParam paramCondition);

    /**
     * 获取map列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") StuRegisterParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    Page<StuRegisterResult> customPageList(@Param("page") Page page, @Param("paramCondition") StuRegisterParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") StuRegisterParam paramCondition);

}
