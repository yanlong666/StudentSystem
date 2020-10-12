package cn.stylefeng.guns.modular.students.service;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StudentTotal;
import cn.stylefeng.guns.modular.students.model.params.StudentTotalParam;
import cn.stylefeng.guns.modular.students.model.result.StudentTotalResult;
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
public interface StudentTotalService extends IService<StudentTotal> {

    /**
     * 新增
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void add(StudentTotalParam param);

    /**
     * 删除
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void delete(StudentTotalParam param);

    /**
     * 更新
     *
     * @author yl 
     * @Date 2020-10-10
     */
    void update(StudentTotalParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    StudentTotalResult findBySpec(StudentTotalParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
    List<StudentTotalResult> findListBySpec(StudentTotalParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author yl 
     * @Date 2020-10-10
     */
     LayuiPageInfo findPageBySpec(StudentTotalParam param);

}
