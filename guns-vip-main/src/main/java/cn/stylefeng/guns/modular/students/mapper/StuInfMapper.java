package cn.stylefeng.guns.modular.students.mapper;

import cn.stylefeng.guns.modular.students.entity.StuInf;
import cn.stylefeng.guns.modular.students.model.params.StuInfParam;
import cn.stylefeng.guns.modular.students.model.result.StuInfResult;
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
public interface StuInfMapper extends BaseMapper<StuInf> {

    /**
     * 获取列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    List<StuInfResult> customList(@Param("paramCondition") StuInfParam paramCondition);

    /**
     * 获取map列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") StuInfParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    Page<StuInfResult> customPageList(@Param("page") Page page, @Param("paramCondition") StuInfParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") StuInfParam paramCondition);

}
