layui.use(['table', 'admin', 'ax', 'func'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    var func = layui.func;

    /**
     * 管理
     */
    var StuInf = {
        tableId: "stuInfTable"
    };

    /**
     * 初始化表格的列
     */
    StuInf.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'stuName', sort: true, title: '姓名'},
            {field: 'pstuName', sort: true, title: '曾用名'},
            {field: 'stuNumber', hide: true, title: '学号'},
            {field: 'classNumber', sort: true, title: '班级'},
            {field: 'cardNumber', sort: true, title: '一卡通号'},
            {field: 'idCard', sort: true, title: '证件号码'},
            {field: 'phoneNumber', sort: true, title: '联系电话'},
            {field: 'photoSrc', sort: true, title: '个人照片'},
            {field: 'birth', sort: true, title: '出生日期'},
            {field: 'gender', sort: true, title: '性别'},
            {field: 'nation', sort: true, title: '民族'},
            {field: 'bloodType', sort: true, title: '血型'},
            {field: 'householdRegisterType', sort: true, title: '户籍类别'},
            {field: 'youthLeagueDate', sort: true, title: '入团日期'},
            {field: 'youthLeagueNum', sort: true, title: '团员发展编号'},
            {field: 'residenceAddr', sort: true, title: '户籍地址'},
            {field: 'currentAddr', sort: true, title: '现居住地'},
            {field: 'householdRegisterFront', sort: true, title: '户口本首页'},
            {field: 'householdRegisterMain', sort: true, title: '户口本主页'},
            {field: 'householdRegisterSelf', sort: true, title: '户口本本人页'},
            {align: 'center', toolbar: '#tableBar', title: '操作'}
        ]];
    };

    /**
     * 点击查询按钮
     */
    StuInf.search = function () {
        var queryData = {};


        table.reload(StuInf.tableId, {
            where: queryData, page: {curr: 1}
        });
    };

    /**
     * 跳转到添加页面
     */
    StuInf.jumpAddPage = function () {
        window.location.href = Feng.ctxPath + '/stuInf/add'
    };

    /**
    * 跳转到编辑页面
    *
    * @param data 点击按钮时候的行数据
    */
    StuInf.jumpEditPage = function (data) {
        window.location.href = Feng.ctxPath + '/stuInf/edit?stuNumber=' + data.stuNumber
    };

    /**
     * 导出excel按钮
     */
    StuInf.exportExcel = function () {
        var checkRows = table.checkStatus(StuInf.tableId);
        if (checkRows.data.length === 0) {
            Feng.error("请选择要导出的数据");
        } else {
            table.exportFile(tableResult.config.id, checkRows.data, 'xls');
        }
    };

    /**
     * 点击删除
     *
     * @param data 点击按钮时候的行数据
     */
    StuInf.onDeleteItem = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/stuInf/delete", function (data) {
                Feng.success("删除成功!");
                table.reload(StuInf.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("stuNumber", data.stuNumber);
            ajax.start();
        };
        Feng.confirm("是否删除?", operation);
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + StuInf.tableId,
        url: Feng.ctxPath + '/stuInf/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: StuInf.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        StuInf.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {

    StuInf.jumpAddPage();

    });

    // 导出excel
    $('#btnExp').click(function () {
        StuInf.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + StuInf.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            StuInf.jumpEditPage(data);
        } else if (layEvent === 'delete') {
            StuInf.onDeleteItem(data);
        }
    });
});
