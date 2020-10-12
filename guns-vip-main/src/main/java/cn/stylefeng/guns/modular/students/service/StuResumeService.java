package cn.stylefeng.guns.modular.students.service;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuResume;
import cn.stylefeng.guns.modular.students.model.params.StuResumeParam;
import cn.stylefeng.guns.modular.students.model.result.StuResumeResult;
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
public interface StuResumeService extends IService<StuResume> {

    /**
     * 新增
     *
     * @author yl
     * @Date 2020-10-10
     */
    void add(StuResumeParam param);

    /**
     * 删除
     *
     * @author yl
     * @Date 2020-10-10
     */
    void delete(StuResumeParam param);

    /**
     * 更新
     *
     * @author yl
     * @Date 2020-10-10
     */
    void update(StuResumeParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author yl
     * @Date 2020-10-10
     */
    StuResumeResult findBySpec(StuResumeParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author yl
     * @Date 2020-10-10
     */
    List<StuResumeResult> findListBySpec(StuResumeParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author yl
     * @Date 2020-10-10
     */
     LayuiPageInfo findPageBySpec(StuResumeParam param);

}
