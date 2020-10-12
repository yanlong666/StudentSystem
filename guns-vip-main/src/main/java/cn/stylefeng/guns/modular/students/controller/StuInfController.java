package cn.stylefeng.guns.modular.students.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuInf;
import cn.stylefeng.guns.modular.students.model.params.StuInfParam;
import cn.stylefeng.guns.modular.students.service.StuInfService;
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
 * @Date 2020-10-09 11:56:50
 */
@Controller
@RequestMapping("/stuInf")
public class StuInfController extends BaseController {

    private String PREFIX = "/stuInf";

    @Autowired
    private StuInfService stuInfService;

    /**
     * 跳转到主页面
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/stuInf.html";
    }

    /**
     * 新增页面
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/stuInf_add.html";
    }

    /**
     * 编辑页面
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/stuInf_edit.html";
    }

    /**
     * 新增接口
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(StuInfParam stuInfParam) {
        this.stuInfService.add(stuInfParam);
        return ResponseData.success();
    }

    /**
     * 编辑接口
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/editItem")
    @ResponseBody
    public ResponseData editItem(StuInfParam stuInfParam) {
        this.stuInfService.update(stuInfParam);
        return ResponseData.success();
    }

    /**
     * 删除接口
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(StuInfParam stuInfParam) {
        this.stuInfService.delete(stuInfParam);
        return ResponseData.success();
    }

    /**
     * 查看详情接口
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(StuInfParam stuInfParam) {
        StuInf detail = this.stuInfService.getById(stuInfParam.getStuNumber());
        return ResponseData.success(detail);
    }

    /**
     * 查询列表
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @ResponseBody
    @RequestMapping("/list")
    public LayuiPageInfo list(StuInfParam stuInfParam) {
        return this.stuInfService.findPageBySpec(stuInfParam);
    }

}


