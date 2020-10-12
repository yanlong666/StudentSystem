package cn.stylefeng.guns.modular.students.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StuRegister;
import cn.stylefeng.guns.modular.students.model.params.StuRegisterParam;
import cn.stylefeng.guns.modular.students.service.StuRegisterService;
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
 * @Date 2020-10-09 17:52:17
 */
@Controller
@RequestMapping("/stuRegister")
public class StuRegisterController extends BaseController {

    private String PREFIX = "/stuRegister";

    @Autowired
    private StuRegisterService stuRegisterService;

    /**
     * 跳转到主页面
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/stuRegister.html";
    }

    /**
     * 新增页面
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/stuRegister_add.html";
    }

    /**
     * 编辑页面
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/stuRegister_edit.html";
    }

    /**
     * 新增接口
     *
     * @author yl 
     * @Date 2020-10-09
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(StuRegisterParam stuRegisterParam) {
        this.stuRegisterService.add(stuRegisterParam);
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
    public ResponseData editItem(StuRegisterParam stuRegisterParam) {
        this.stuRegisterService.update(stuRegisterParam);
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
    public ResponseData delete(StuRegisterParam stuRegisterParam) {
        this.stuRegisterService.delete(stuRegisterParam);
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
    public ResponseData detail(StuRegisterParam stuRegisterParam) {
        StuRegister detail = this.stuRegisterService.getById(stuRegisterParam.getStuNum());
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
    public LayuiPageInfo list(StuRegisterParam stuRegisterParam) {
        return this.stuRegisterService.findPageBySpec(stuRegisterParam);
    }

}


