package cn.stylefeng.guns.modular.students.service;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuInf;
import cn.stylefeng.guns.modular.students.model.params.StuInfParam;
import cn.stylefeng.guns.modular.students.model.result.StuInfResult;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yl 
 * @since 2020-10-09
 */
public interface StuInfService extends IService<StuInf> {

    /**
     * 新增
     *
     * @author yl 
     * @Date 2020-10-09
     */
    void add(StuInfParam param);

    /**
     * 删除
     *
     * @author yl 
     * @Date 2020-10-09
     */
    void delete(StuInfParam param);

    /**
     * 更新
     *
     * @author yl 
     * @Date 2020-10-09
     */
    void update(StuInfParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-09
     */
    StuInfResult findBySpec(StuInfParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author yl 
     * @Date 2020-10-09
     */
    List<StuInfResult> findListBySpec(StuInfParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-09
     */
     LayuiPageInfo findPageBySpec(StuInfParam param);

}
