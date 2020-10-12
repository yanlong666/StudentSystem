package cn.stylefeng.guns.modular.students.service;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuMyIndexHtml;
import cn.stylefeng.guns.modular.students.model.params.StuMyIndexHtmlParam;
import cn.stylefeng.guns.modular.students.model.result.StuMyIndexHtmlResult;
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
public interface StuMyIndexHtmlService extends IService<StuMyIndexHtml> {

    /**
     * 新增
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void add(StuMyIndexHtmlParam param);

    /**
     * 删除
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void delete(StuMyIndexHtmlParam param);

    /**
     * 更新
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void update(StuMyIndexHtmlParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    StuMyIndexHtmlResult findBySpec(StuMyIndexHtmlParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<StuMyIndexHtmlResult> findListBySpec(StuMyIndexHtmlParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
     LayuiPageInfo findPageBySpec(StuMyIndexHtmlParam param);

}
