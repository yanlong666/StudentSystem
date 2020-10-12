package cn.stylefeng.guns.modular.students.service;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuRegister;
import cn.stylefeng.guns.modular.students.model.params.StuRegisterParam;
import cn.stylefeng.guns.modular.students.model.result.StuRegisterResult;
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
public interface StuRegisterService extends IService<StuRegister> {

    /**
     * 新增
     *
     * @author yl 
     * @Date 2020-10-09
     */
    void add(StuRegisterParam param);

    /**
     * 删除
     *
     * @author yl 
     * @Date 2020-10-09
     */
    void delete(StuRegisterParam param);

    /**
     * 更新
     *
     * @author yl 
     * @Date 2020-10-09
     */
    void update(StuRegisterParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-09
     */
    StuRegisterResult findBySpec(StuRegisterParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author yl 
     * @Date 2020-10-09
     */
    List<StuRegisterResult> findListBySpec(StuRegisterParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-09
     */
     LayuiPageInfo findPageBySpec(StuRegisterParam param);

}
