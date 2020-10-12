package cn.stylefeng.guns.modular.students.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuOther;
import cn.stylefeng.guns.modular.students.mapper.StuOtherMapper;
import cn.stylefeng.guns.modular.students.model.params.StuOtherParam;
import cn.stylefeng.guns.modular.students.model.result.StuOtherResult;
import  cn.stylefeng.guns.modular.students.service.StuOtherService;
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
public class StuOtherServiceImpl extends ServiceImpl<StuOtherMapper, StuOther> implements StuOtherService {

    @Override
    public void add(StuOtherParam param){
        StuOther entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(StuOtherParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(StuOtherParam param){
        StuOther oldEntity = getOldEntity(param);
        StuOther newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public StuOtherResult findBySpec(StuOtherParam param){
        return null;
    }

    @Override
    public List<StuOtherResult> findListBySpec(StuOtherParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(StuOtherParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(StuOtherParam param){
        return param.getStuNumber();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private StuOther getOldEntity(StuOtherParam param) {
        return this.getById(getKey(param));
    }

    private StuOther getEntity(StuOtherParam param) {
        StuOther entity = new StuOther();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
