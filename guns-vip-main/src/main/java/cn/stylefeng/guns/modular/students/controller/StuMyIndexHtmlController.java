package cn.stylefeng.guns.modular.students.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuMyIndexHtml;
import cn.stylefeng.guns.modular.students.model.params.StuMyIndexHtmlParam;
import cn.stylefeng.guns.modular.students.service.StuMyIndexHtmlService;
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
 * @Date 2020-10-10 10:28:47
 */
@Controller
@RequestMapping("/stuMyIndexHtml")
public class StuMyIndexHtmlController extends BaseController {

    private String PREFIX = "/stuMyIndexHtml";

    @Autowired
    private StuMyIndexHtmlService stuMyIndexHtmlService;

    /**
     * 跳转到主页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/stuMyIndexHtml.html";
    }

    /**
     * 新增页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/stuMyIndexHtml_add.html";
    }

    /**
     * 编辑页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/stuMyIndexHtml_edit.html";
    }

    /**
     * 新增接口
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(StuMyIndexHtmlParam stuMyIndexHtmlParam) {
        this.stuMyIndexHtmlService.add(stuMyIndexHtmlParam);
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
    public ResponseData editItem(StuMyIndexHtmlParam stuMyIndexHtmlParam) {
        this.stuMyIndexHtmlService.update(stuMyIndexHtmlParam);
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
    public ResponseData delete(StuMyIndexHtmlParam stuMyIndexHtmlParam) {
        this.stuMyIndexHtmlService.delete(stuMyIndexHtmlParam);
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
    public ResponseData detail(StuMyIndexHtmlParam stuMyIndexHtmlParam) {
        StuMyIndexHtml detail = this.stuMyIndexHtmlService.getById(stuMyIndexHtmlParam.getStuNumber());
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
    public LayuiPageInfo list(StuMyIndexHtmlParam stuMyIndexHtmlParam) {
        return this.stuMyIndexHtmlService.findPageBySpec(stuMyIndexHtmlParam);
    }

}


