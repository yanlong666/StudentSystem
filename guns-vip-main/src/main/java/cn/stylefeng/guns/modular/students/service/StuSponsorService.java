package cn.stylefeng.guns.modular.students.service;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuSponsor;
import cn.stylefeng.guns.modular.students.model.params.StuSponsorParam;
import cn.stylefeng.guns.modular.students.model.result.StuSponsorResult;
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
public interface StuSponsorService extends IService<StuSponsor> {

    /**
     * 新增
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void add(StuSponsorParam param);

    /**
     * 删除
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void delete(StuSponsorParam param);

    /**
     * 更新
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void update(StuSponsorParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    StuSponsorResult findBySpec(StuSponsorParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<StuSponsorResult> findListBySpec(StuSponsorParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
     LayuiPageInfo findPageBySpec(StuSponsorParam param);

}
