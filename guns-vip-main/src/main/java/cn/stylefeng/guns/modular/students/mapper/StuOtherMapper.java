package cn.stylefeng.guns.modular.students.mapper;

import cn.stylefeng.guns.modular.students.entity.StuOther;
import cn.stylefeng.guns.modular.students.model.params.StuOtherParam;
import cn.stylefeng.guns.modular.students.model.result.StuOtherResult;
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
 * @since 2020-10-10
 */
public interface StuOtherMapper extends BaseMapper<StuOther> {

    /**
     * 获取列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<StuOtherResult> customList(@Param("paramCondition") StuOtherParam paramCondition);

    /**
     * 获取map列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") StuOtherParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    Page<StuOtherResult> customPageList(@Param("page") Page page, @Param("paramCondition") StuOtherParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") StuOtherParam paramCondition);

}
