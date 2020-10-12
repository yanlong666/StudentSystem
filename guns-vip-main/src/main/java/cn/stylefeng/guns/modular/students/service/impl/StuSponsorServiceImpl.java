package cn.stylefeng.guns.modular.students.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuSponsor;
import cn.stylefeng.guns.modular.students.mapper.StuSponsorMapper;
import cn.stylefeng.guns.modular.students.model.params.StuSponsorParam;
import cn.stylefeng.guns.modular.students.model.result.StuSponsorResult;
import  cn.stylefeng.guns.modular.students.service.StuSponsorService;
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
public class StuSponsorServiceImpl extends ServiceImpl<StuSponsorMapper, StuSponsor> implements StuSponsorService {

    @Override
    public void add(StuSponsorParam param){
        StuSponsor entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(StuSponsorParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(StuSponsorParam param){
        StuSponsor oldEntity = getOldEntity(param);
        StuSponsor newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public StuSponsorResult findBySpec(StuSponsorParam param){
        return null;
    }

    @Override
    public List<StuSponsorResult> findListBySpec(StuSponsorParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(StuSponsorParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(StuSponsorParam param){
        return param.getStuNumber();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private StuSponsor getOldEntity(StuSponsorParam param) {
        return this.getById(getKey(param));
    }

    private StuSponsor getEntity(StuSponsorParam param) {
        StuSponsor entity = new StuSponsor();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
