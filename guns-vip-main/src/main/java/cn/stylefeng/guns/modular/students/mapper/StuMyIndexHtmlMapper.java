package cn.stylefeng.guns.modular.students.mapper;

import cn.stylefeng.guns.modular.students.entity.StuMyIndexHtml;
import cn.stylefeng.guns.modular.students.model.params.StuMyIndexHtmlParam;
import cn.stylefeng.guns.modular.students.model.result.StuMyIndexHtmlResult;
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
public interface StuMyIndexHtmlMapper extends BaseMapper<StuMyIndexHtml> {

    /**
     * 获取列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<StuMyIndexHtmlResult> customList(@Param("paramCondition") StuMyIndexHtmlParam paramCondition);

    /**
     * 获取map列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") StuMyIndexHtmlParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    Page<StuMyIndexHtmlResult> customPageList(@Param("page") Page page, @Param("paramCondition") StuMyIndexHtmlParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") StuMyIndexHtmlParam paramCondition);

}
