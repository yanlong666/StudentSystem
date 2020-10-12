/**
 * 添加或者修改页面
 */
var StudentTotalInfoDlg = {
    data: {
        stuName: "",
        pstuName: "",
        photoSrc: "",
        stuNumber: "",
        cardNumber: "",
        idCard: "",
        phoneNumber: "",
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
        householdRegisterSelf: "",
        stuType: "",
        stuClass: "",
        schoolNum: "",
        totalScore: "",
        testScore: "",
        graduateSchool: "",
        registerType: "",
        studyType: "",
        admitOrder: "",
        followClass: "",
        accommodation: "",
        studyMode: "",
        migrantWorkersChildren: "",
        countryWorkersChildren: "",
        governmentPurchaseDegree: "",
        enrollmentstatus: "",
        politicalStatus: "",
        hobby: "",
        principalSheet: "",
        healthCondition: "",
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
        onlyChild: "",
        martyrChildren: "",
        healthfulDiet: "",
        putOnRecord: "",
        deleteMember: "",
        ordernumber: ""
    }
};

layui.use(['form', 'admin', 'ax','laydate','upload','formSelects','element'], function () {
    var $ = layui.jquery;
    var $ax = layui.ax;
    var form = layui.form;
    var admin = layui.admin;

 $("#stuNumber").blur(function () {
     var stuPhotoId = $('#stuNumber').val();
     $.post("/mgr/photoId", {photoId:stuPhotoId} , function(){}, "text");
 });

 $("button").click(function () {
     var sign = $("#stuNumber").val();
     var emptyInput = sign == null || sign.length == 0;
     if(emptyInput){
         alert("请先填写学号！");
     }

 });






    //普通图片上传
    var upload = layui.upload;

    upload.render({
        elem: '#photoSrc'
        ,url: '/mgr/upload' //改成您自己的上传接口
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
        ,url: '/mgr/upload' //改成您自己的上传接口
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#filePreview1').attr('src', result); //图片链接（base64）
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
        ,url: '/mgr/upload' //改成您自己的上传接口
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#filePreview2').attr('src', result); //图片链接（base64）
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
        ,url: '/mgr/upload' //改成您自己的上传接口
        ,before: function(obj){
            //预读本地文件示例，不支持ie8
            obj.preview(function(index, file, result){
                $('#filePreview3').attr('src', result); //图片链接（base64）
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










































































































    //表单提交事件
    form.on('submit(btnSubmit)', function (data) {
        var ajax = new $ax(Feng.ctxPath + "/studentTotal/addItem", function (data) {
            Feng.success("添加成功！");
            window.location.href = Feng.ctxPath + '/studentTotal'
        }, function (data) {
            Feng.error("添加失败！" + data.responseJSON.message)
        });
        ajax.set(data.field);
        ajax.start();

        return false;
    });

    $('#cancel').click(function(){
        window.location.href = Feng.ctxPath + '/studentTotal'
    });

});