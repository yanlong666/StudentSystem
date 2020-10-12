package cn.stylefeng.guns.modular.students.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuSponsor;
import cn.stylefeng.guns.modular.students.model.params.StuSponsorParam;
import cn.stylefeng.guns.modular.students.service.StuSponsorService;
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
 * @Date 2020-10-10 09:34:48
 */
@Controller
@RequestMapping("/stuSponsor")
public class StuSponsorController extends BaseController {

    private String PREFIX = "/stuSponsor";

    @Autowired
    private StuSponsorService stuSponsorService;

    /**
     * 跳转到主页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/stuSponsor.html";
    }

    /**
     * 新增页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/stuSponsor_add.html";
    }

    /**
     * 编辑页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/stuSponsor_edit.html";
    }

    /**
     * 新增接口
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(StuSponsorParam stuSponsorParam) {
        this.stuSponsorService.add(stuSponsorParam);
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
    public ResponseData editItem(StuSponsorParam stuSponsorParam) {
        this.stuSponsorService.update(stuSponsorParam);
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
    public ResponseData delete(StuSponsorParam stuSponsorParam) {
        this.stuSponsorService.delete(stuSponsorParam);
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
    public ResponseData detail(StuSponsorParam stuSponsorParam) {
        StuSponsor detail = this.stuSponsorService.getById(stuSponsorParam.getStuNumber());
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
    public LayuiPageInfo list(StuSponsorParam stuSponsorParam) {
        return this.stuSponsorService.findPageBySpec(stuSponsorParam);
    }

}


