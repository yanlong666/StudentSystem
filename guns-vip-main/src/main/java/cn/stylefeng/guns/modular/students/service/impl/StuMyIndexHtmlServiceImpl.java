package cn.stylefeng.guns.modular.students.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuMyIndexHtml;
import cn.stylefeng.guns.modular.students.mapper.StuMyIndexHtmlMapper;
import cn.stylefeng.guns.modular.students.model.params.StuMyIndexHtmlParam;
import cn.stylefeng.guns.modular.students.model.result.StuMyIndexHtmlResult;
import  cn.stylefeng.guns.modular.students.service.StuMyIndexHtmlService;
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
public class StuMyIndexHtmlServiceImpl extends ServiceImpl<StuMyIndexHtmlMapper, StuMyIndexHtml> implements StuMyIndexHtmlService {

    @Override
    public void add(StuMyIndexHtmlParam param){
        StuMyIndexHtml entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(StuMyIndexHtmlParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(StuMyIndexHtmlParam param){
        StuMyIndexHtml oldEntity = getOldEntity(param);
        StuMyIndexHtml newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public StuMyIndexHtmlResult findBySpec(StuMyIndexHtmlParam param){
        return null;
    }

    @Override
    public List<StuMyIndexHtmlResult> findListBySpec(StuMyIndexHtmlParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(StuMyIndexHtmlParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(StuMyIndexHtmlParam param){
        return param.getStuNumber();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private StuMyIndexHtml getOldEntity(StuMyIndexHtmlParam param) {
        return this.getById(getKey(param));
    }

    private StuMyIndexHtml getEntity(StuMyIndexHtmlParam param) {
        StuMyIndexHtml entity = new StuMyIndexHtml();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
