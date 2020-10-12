layui.use(['table', 'admin', 'ax', 'func'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    var func = layui.func;

    /**
     * 管理
     */
    var StuRegister = {
        tableId: "stuRegisterTable"
    };

    /**
     * 初始化表格的列
     */
    StuRegister.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'stuType', sort: true, title: '学生类别'},
            {field: 'stuClass', sort: true, title: '班级'},
            {field: 'schoolNum', sort: true, title: '省内学校代码'},
            {field: 'totalScore', sort: true, title: '入学总分'},
            {field: 'testScore', sort: true, title: '中考文化课成绩'},
            {field: 'graduateSchool', sort: true, title: '原毕业院校'},
            {field: 'registerType', sort: true, title: '学生来源'},
            {field: 'studyType', sort: true, title: '入学方式'},
            {field: 'admitOrder', sort: true, title: '中招序号'},
            {field: 'followClass', sort: true, title: '随班就读'},
            {field: 'accommodation', sort: true, title: '是否住宿生'},
            {field: 'studyMode', sort: true, title: '就读方式'},
            {field: 'migrantWorkersChildren', sort: true, title: '是否随迁子女'},
            {field: 'countryWorkersChildren', sort: true, title: '是否进城务工随迁子女'},
            {field: 'governmentPurchaseDegree', sort: true, title: '是否由政府购买学位'},
            {field: 'enrollmentstatus', sort: true, title: '学籍变更备注'},
            {field: 'stuNum', hide: true, title: ''},
            {align: 'center', toolbar: '#tableBar', title: '操作'}
        ]];
    };

    /**
     * 点击查询按钮
     */
    StuRegister.search = function () {
        var queryData = {};


        table.reload(StuRegister.tableId, {
            where: queryData, page: {curr: 1}
        });
    };

    /**
     * 跳转到添加页面
     */
    StuRegister.jumpAddPage = function () {
        window.location.href = Feng.ctxPath + '/stuRegister/add'
    };

    /**
    * 跳转到编辑页面
    *
    * @param data 点击按钮时候的行数据
    */
    StuRegister.jumpEditPage = function (data) {
        window.location.href = Feng.ctxPath + '/stuRegister/edit?stuNum=' + data.stuNum
    };

    /**
     * 导出excel按钮
     */
    StuRegister.exportExcel = function () {
        var checkRows = table.checkStatus(StuRegister.tableId);
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
    StuRegister.onDeleteItem = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/stuRegister/delete", function (data) {
                Feng.success("删除成功!");
                table.reload(StuRegister.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("stuNum", data.stuNum);
            ajax.start();
        };
        Feng.confirm("是否删除?", operation);
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + StuRegister.tableId,
        url: Feng.ctxPath + '/stuRegister/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: StuRegister.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        StuRegister.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {

    StuRegister.jumpAddPage();

    });

    // 导出excel
    $('#btnExp').click(function () {
        StuRegister.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + StuRegister.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            StuRegister.jumpEditPage(data);
        } else if (layEvent === 'delete') {
            StuRegister.onDeleteItem(data);
        }
    });
});
