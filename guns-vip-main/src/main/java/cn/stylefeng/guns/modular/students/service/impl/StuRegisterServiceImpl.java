package cn.stylefeng.guns.modular.students.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuRegister;
import cn.stylefeng.guns.modular.students.mapper.StuRegisterMapper;
import cn.stylefeng.guns.modular.students.model.params.StuRegisterParam;
import cn.stylefeng.guns.modular.students.model.result.StuRegisterResult;
import  cn.stylefeng.guns.modular.students.service.StuRegisterService;
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
 * @since 2020-10-09
 */
@Service
public class StuRegisterServiceImpl extends ServiceImpl<StuRegisterMapper, StuRegister> implements StuRegisterService {

    @Override
    public void add(StuRegisterParam param){
        StuRegister entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(StuRegisterParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(StuRegisterParam param){
        StuRegister oldEntity = getOldEntity(param);
        StuRegister newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public StuRegisterResult findBySpec(StuRegisterParam param){
        return null;
    }

    @Override
    public List<StuRegisterResult> findListBySpec(StuRegisterParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(StuRegisterParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(StuRegisterParam param){
        return param.getStuNum();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private StuRegister getOldEntity(StuRegisterParam param) {
        return this.getById(getKey(param));
    }

    private StuRegister getEntity(StuRegisterParam param) {
        StuRegister entity = new StuRegister();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
