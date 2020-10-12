package cn.stylefeng.guns.modular.students.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuResume;
import cn.stylefeng.guns.modular.students.model.params.StuResumeParam;
import cn.stylefeng.guns.modular.students.service.StuResumeService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.kernel.model.response.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 控制器
 *
 * @author yl
 * @Date 2020-10-10 08:09:34
 */
@Controller
@RequestMapping("/stuResume")
public class StuResumeController extends BaseController {

    private String PREFIX = "/stuResume";

    @Autowired
    private StuResumeService stuResumeService;

    /**
     * 跳转到主页面
     *
     * @author yl
     * @Date 2020-10-10
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/stuResume.html";
    }

    /**
     * 新增页面
     *
     * @author yl
     * @Date 2020-10-10
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/stuResume_add.html";
    }

    /**
     * 编辑页面
     *
     * @author yl
     * @Date 2020-10-10
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/stuResume_edit.html";
    }

    /**
     * 新增接口
     *
     * @author yl
     * @Date 2020-10-10
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(StuResumeParam stuResumeParam) {
        this.stuResumeService.add(stuResumeParam);
        return ResponseData.success();
    }

    /**
     * 编辑接口
     *
     * @author yl
     * @Date 2020-10-10
     */
    @RequestMapping("/editItem")
    @ResponseBody
    public ResponseData editItem(StuResumeParam stuResumeParam) {
        this.stuResumeService.update(stuResumeParam);
        return ResponseData.success();
    }

    /**
     * 删除接口
     *
     * @author yl
     * @Date 2020-10-10
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(StuResumeParam stuResumeParam) {
        this.stuResumeService.delete(stuResumeParam);
        return ResponseData.success();
    }

    /**
     * 查看详情接口
     *
     * @author yl
     * @Date 2020-10-10
     */
    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(StuResumeParam stuResumeParam) {
        StuResume detail = this.stuResumeService.getById(stuResumeParam.getStuNumber());
        return ResponseData.success(detail);
    }

    /**
     * 查询列表
     *
     * @author yl
     * @Date 2020-10-10
     */
    @ResponseBody
    @RequestMapping("/list")
    public LayuiPageInfo list(StuResumeParam stuResumeParam) {
        return this.stuResumeService.findPageBySpec(stuResumeParam);
    }

}


