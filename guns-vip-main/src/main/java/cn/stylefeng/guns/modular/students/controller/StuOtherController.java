package cn.stylefeng.guns.modular.students.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuOther;
import cn.stylefeng.guns.modular.students.model.params.StuOtherParam;
import cn.stylefeng.guns.modular.students.service.StuOtherService;
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
 * @Date 2020-10-10 09:48:32
 */
@Controller
@RequestMapping("/stuOther")
public class StuOtherController extends BaseController {

    private String PREFIX = "/stuOther";

    @Autowired
    private StuOtherService stuOtherService;

    /**
     * 跳转到主页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/stuOther.html";
    }

    /**
     * 新增页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/stuOther_add.html";
    }

    /**
     * 编辑页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/stuOther_edit.html";
    }

    /**
     * 新增接口
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(StuOtherParam stuOtherParam) {
        this.stuOtherService.add(stuOtherParam);
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
    public ResponseData editItem(StuOtherParam stuOtherParam) {
        this.stuOtherService.update(stuOtherParam);
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
    public ResponseData delete(StuOtherParam stuOtherParam) {
        this.stuOtherService.delete(stuOtherParam);
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
    public ResponseData detail(StuOtherParam stuOtherParam) {
        StuOther detail = this.stuOtherService.getById(stuOtherParam.getStuNumber());
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
    public LayuiPageInfo list(StuOtherParam stuOtherParam) {
        return this.stuOtherService.findPageBySpec(stuOtherParam);
    }

}


