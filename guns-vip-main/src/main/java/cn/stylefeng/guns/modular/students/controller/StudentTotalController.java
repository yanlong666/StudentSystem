package cn.stylefeng.guns.modular.students.controller;

import cn.stylefeng.guns.base.pojo.page.LayuiPageInfo;
import cn.stylefeng.guns.modular.students.entity.StudentTotal;
import cn.stylefeng.guns.modular.students.model.params.StudentTotalParam;
import cn.stylefeng.guns.modular.students.service.StudentTotalService;
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
 * @Date 2020-10-10 13:07:55
 */
@Controller
@RequestMapping("/studentTotal")
public class StudentTotalController extends BaseController {

    private String PREFIX = "/studentTotal";

    @Autowired
    private StudentTotalService studentTotalService;

    /**
     * 跳转到主页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/studentTotal.html";
    }

    /**
     * 新增页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/studentTotal_add.html";
    }

    /**
     * 编辑页面
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/studentTotal_edit.html";
    }

    /**
     * 新增接口
     *
     * @author yl 
     * @Date 2020-10-10
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(StudentTotalParam studentTotalParam) {
        this.studentTotalService.add(studentTotalParam);
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
    public ResponseData editItem(StudentTotalParam studentTotalParam) {
        this.studentTotalService.update(studentTotalParam);
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
    public ResponseData delete(StudentTotalParam studentTotalParam) {
        this.studentTotalService.delete(studentTotalParam);
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
    public ResponseData detail(StudentTotalParam studentTotalParam) {
        StudentTotal detail = this.studentTotalService.getById(studentTotalParam.getOrdernumber());
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
    public LayuiPageInfo list(StudentTotalParam studentTotalParam) {
        return this.studentTotalService.findPageBySpec(studentTotalParam);
    }

}


