package cn.stylefeng.guns.modular.students.mapper;

import cn.stylefeng.guns.modular.students.entity.StuSponsor;
import cn.stylefeng.guns.modular.students.model.params.StuSponsorParam;
import cn.stylefeng.guns.modular.students.model.result.StuSponsorResult;
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
public interface StuSponsorMapper extends BaseMapper<StuSponsor> {

    /**
     * 获取列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<StuSponsorResult> customList(@Param("paramCondition") StuSponsorParam paramCondition);

    /**
     * 获取map列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<Map<String, Object>> customMapList(@Param("paramCondition") StuSponsorParam paramCondition);

    /**
     * 获取分页实体列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    Page<StuSponsorResult> customPageList(@Param("page") Page page, @Param("paramCondition") StuSponsorParam paramCondition);

    /**
     * 获取分页map列表
     *
     * @author yl 
     * @Date 2020-10-10
     */
    Page<Map<String, Object>> customPageMapList(@Param("page") Page page, @Param("paramCondition") StuSponsorParam paramCondition);

}
