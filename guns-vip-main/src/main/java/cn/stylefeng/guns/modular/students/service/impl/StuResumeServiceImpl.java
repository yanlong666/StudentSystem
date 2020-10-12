package cn.stylefeng.guns.modular.students.service.impl;

import cn.stylefeng.guns.base.pojo.page.LayuiPageFactory;
import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuResume;
import cn.stylefeng.guns.modular.students.mapper.StuResumeMapper;
import cn.stylefeng.guns.modular.students.model.params.StuResumeParam;
import cn.stylefeng.guns.modular.students.model.result.StuResumeResult;
import  cn.stylefeng.guns.modular.students.service.StuResumeService;
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
public class StuResumeServiceImpl extends ServiceImpl<StuResumeMapper, StuResume> implements StuResumeService {

    @Override
    public void add(StuResumeParam param){
        StuResume entity = getEntity(param);
        this.save(entity);
    }

    @Override
    public void delete(StuResumeParam param){
        this.removeById(getKey(param));
    }

    @Override
    public void update(StuResumeParam param){
        StuResume oldEntity = getOldEntity(param);
        StuResume newEntity = getEntity(param);
        ToolUtil.copyProperties(newEntity, oldEntity);
        this.updateById(newEntity);
    }

    @Override
    public StuResumeResult findBySpec(StuResumeParam param){
        return null;
    }

    @Override
    public List<StuResumeResult> findListBySpec(StuResumeParam param){
        return null;
    }

    @Override
    public LayuiPageInfo findPageBySpec(StuResumeParam param){
        Page pageContext = getPageContext();
        IPage page = this.baseMapper.customPageList(pageContext, param);
        return LayuiPageFactory.createPageInfo(page);
    }

    private Serializable getKey(StuResumeParam param){
        return param.getStuNumber();
    }

    private Page getPageContext() {
        return LayuiPageFactory.defaultPage();
    }

    private StuResume getOldEntity(StuResumeParam param) {
        return this.getById(getKey(param));
    }

    private StuResume getEntity(StuResumeParam param) {
        StuResume entity = new StuResume();
        ToolUtil.copyProperties(param, entity);
        return entity;
    }

}
