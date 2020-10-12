/**
 * 详情对话框
 */
var StuSponsorInfoDlg = {
    data: {
        leftBehindChildren: "",
        disableType: "",
        orphan: "",
        ruralDibao: "",
        extremelyPoor: "",
        singleParent: "",
        solderChildren: "",
        causesOfPoverty: "",
        applySponsor: "",
        needSupply: "",
        stuNumber: ""
    }
};

layui.use(['form', 'admin', 'ax','laydate','upload','formSelects'], function () {
    var $ = layui.jquery;
    var $ax = layui.ax;
    var form = layui.form;
    var admin = layui.admin;
































    //获取详情信息，填充表单
    var ajax = new $ax(Feng.ctxPath + "/stuSponsor/detail?stuNumber=" + Feng.getUrlParam("stuNumber"));
    var result = ajax.start();
    form.val('stuSponsorForm', result.data);

    //表单提交事件
    form.on('submit(btnSubmit)', function (data) {
        var ajax = new $ax(Feng.ctxPath + "/stuSponsor/editItem", function (data) {
            Feng.success("更新成功！");
            window.location.href = Feng.ctxPath + '/stuSponsor'
        }, function (data) {
            Feng.error("更新失败！" + data.responseJSON.message)
        });
        ajax.set(data.field);
        ajax.start();

        return false;
    });

    $('#cancel').click(function(){
        window.location.href = Feng.ctxPath + '/stuSponsor'
    });
});