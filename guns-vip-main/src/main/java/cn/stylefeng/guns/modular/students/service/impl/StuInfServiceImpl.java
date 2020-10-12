package cn.stylefeng.guns.modular.students.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuInf;
import cn.stylefeng.guns.modular.students.mapper.StuInfMapper;
import cn.stylefeng.guns.modular.students.model.params.StuInfParam;
import cn.stylefeng.guns.modular.students.model.result.StuInfResult;
import  cn.stylefeng.guns.modular.students.service.StuInfService;
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
public class StuInfServiceImpl extends ServiceImpl<StuInfMapper, StuInf> implements StuInfService {

    @Override
    public void add(StuInfParam param){
        StuInf entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(StuInfParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(StuInfParam param){
        StuInf oldEntity = getOldEntity(param);
        StuInf newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public StuInfResult findBySpec(StuInfParam param){
        return null;
    }

    @Override
    public List<StuInfResult> findListBySpec(StuInfParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(StuInfParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(StuInfParam param){
        return param.getStuNumber();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private StuInf getOldEntity(StuInfParam param) {
        return this.getById(getKey(param));
    }

    private StuInf getEntity(StuInfParam param) {
        StuInf entity = new StuInf();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
