package cn.stylefeng.guns.modular.students.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StudentTotal;
import cn.stylefeng.guns.modular.students.mapper.StudentTotalMapper;
import cn.stylefeng.guns.modular.students.model.params.StudentTotalParam;
import cn.stylefeng.guns.modular.students.model.result.StudentTotalResult;
import  cn.stylefeng.guns.modular.students.service.StudentTotalService;
import cn.stylefeng.roses.core.util.ToolUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yl 
 * @since 2020-10-10
 */
@Service
public class StudentTotalServiceImpl extends ServiceImpl<StudentTotalMapper, StudentTotal> implements StudentTotalService {

    @Override
    public void add(StudentTotalParam param){
        StudentTotal entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(StudentTotalParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(StudentTotalParam param){
        StudentTotal oldEntity = getOldEntity(param);
        StudentTotal newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public StudentTotalResult findBySpec(StudentTotalParam param){
        return null;
    }

    @Override
    public List<StudentTotalResult> findListBySpec(StudentTotalParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(StudentTotalParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(StudentTotalParam param){
        return param.getOrdernumber();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private StudentTotal getOldEntity(StudentTotalParam param) {
        return this.getById(getKey(param));
    }

    private StudentTotal getEntity(StudentTotalParam param) {
        StudentTotal entity = new StudentTotal();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
