/**
 * 详情对话框
 */
var StuInfInfoDlg = {
    data: {
        stuName: "",
        pstuName: "",
        stuNumber: "",
        classNumber: "",
        cardNumber: "",
        idCard: "",
        phoneNumber: "",
        photoSrc: "",
        birth: "",
        gender: "",
        nation: "",
        bloodType: "",
        householdRegisterType: "",
        youthLeagueDate: "",
        youthLeagueNum: "",
        residenceAddr: "",
        currentAddr: "",
        householdRegisterFront: "",
        householdRegisterMain: "",
        householdRegisterSelf: ""
    }
};

layui.use(['form', 'admin', 'ax','laydate','upload','formSelects'], function () {
    var $ = layui.jquery;
    var $ax = layui.ax;
    var form = layui.form;
    var admin = layui.admin;






















    //普通图片上传
    var upload = layui.upload;
    upload.render({
        elem: '#photoSrc'
        ,url: Feng.ctxPath + '/system/upload' //改成您自己的上传接口
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#filePreview').attr('src', result); //图片链接（base64）
            });
        }
        ,done: function(res){
            var ajax = new $ax(Feng.ctxPath + "/system/updateAvatar", function (data) {
                Feng.success(res.message);
            }, function (data) {
                Feng.error("修改失败!" + data.responseJSON.message + "!");
            });
            ajax.set("fileId", res.data.fileId);
            ajax.start();
        }
        ,error: function(){
            Feng.error("上传文件失败！");
        }
    });


    //渲染时间选择框
    var laydate = layui.laydate;
    laydate.render({
        elem: '#birth' //指定元素
    });















    //渲染时间选择框
    var laydate = layui.laydate;
    laydate.render({
        elem: '#youthLeagueDate' //指定元素
    });













    //普通图片上传
    var upload = layui.upload;
    upload.render({
        elem: '#householdRegisterFront'
        ,url: Feng.ctxPath + '/system/upload' //改成您自己的上传接口
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#filePreview').attr('src', result); //图片链接（base64）
            });
        }
        ,done: function(res){
            var ajax = new $ax(Feng.ctxPath + "/system/updateAvatar", function (data) {
                Feng.success(res.message);
            }, function (data) {
                Feng.error("修改失败!" + data.responseJSON.message + "!");
            });
            ajax.set("fileId", res.data.fileId);
            ajax.start();
        }
        ,error: function(){
            Feng.error("上传文件失败！");
        }
    });



    //普通图片上传
    var upload = layui.upload;
    upload.render({
        elem: '#householdRegisterMain'
        ,url: Feng.ctxPath + '/system/upload' //改成您自己的上传接口
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#filePreview').attr('src', result); //图片链接（base64）
            });
        }
        ,done: function(res){
            var ajax = new $ax(Feng.ctxPath + "/system/updateAvatar", function (data) {
                Feng.success(res.message);
            }, function (data) {
                Feng.error("修改失败!" + data.responseJSON.message + "!");
            });
            ajax.set("fileId", res.data.fileId);
            ajax.start();
        }
        ,error: function(){
            Feng.error("上传文件失败！");
        }
    });



    //普通图片上传
    var upload = layui.upload;
    upload.render({
        elem: '#householdRegisterSelf'
        ,url: Feng.ctxPath + '/system/upload' //改成您自己的上传接口
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#filePreview').attr('src', result); //图片链接（base64）
            });
        }
        ,done: function(res){
            var ajax = new $ax(Feng.ctxPath + "/system/updateAvatar", function (data) {
                Feng.success(res.message);
            }, function (data) {
                Feng.error("修改失败!" + data.responseJSON.message + "!");
            });
            ajax.set("fileId", res.data.fileId);
            ajax.start();
        }
        ,error: function(){
            Feng.error("上传文件失败！");
        }
    });

    //获取详情信息，填充表单
    var ajax = new $ax(Feng.ctxPath + "/stuInf/detail?stuNumber=" + Feng.getUrlParam("stuNumber"));
    var result = ajax.start();
    form.val('stuInfForm', result.data);

    //表单提交事件
    form.on('submit(btnSubmit)', function (data) {
        var ajax = new $ax(Feng.ctxPath + "/stuInf/editItem", function (data) {
            Feng.success("更新成功！");
            window.location.href = Feng.ctxPath + '/stuInf'
        }, function (data) {
            Feng.error("更新失败！" + data.responseJSON.message)
        });
        ajax.set(data.field);
        ajax.start();

        return false;
    });

    $('#cancel').click(function(){
        window.location.href = Feng.ctxPath + '/stuInf'
    });
});