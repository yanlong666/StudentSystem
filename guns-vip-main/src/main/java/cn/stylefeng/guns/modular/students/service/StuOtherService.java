package cn.stylefeng.guns.modular.students.service;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuOther;
import cn.stylefeng.guns.modular.students.model.params.StuOtherParam;
import cn.stylefeng.guns.modular.students.model.result.StuOtherResult;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yl 
 * @since 2020-10-10
 */
public interface StuOtherService extends IService<StuOther> {

    /**
     * 新增
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void add(StuOtherParam param);

    /**
     * 删除
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void delete(StuOtherParam param);

    /**
     * 更新
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void update(StuOtherParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    StuOtherResult findBySpec(StuOtherParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<StuOtherResult> findListBySpec(StuOtherParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
     LayuiPageInfo findPageBySpec(StuOtherParam param);

}
