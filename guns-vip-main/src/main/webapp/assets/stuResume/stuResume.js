layui.use(['table', 'admin', 'ax', 'func'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    var func = layui.func;

    /**
     * 管理
     */
    var StuResume = {
        tableId: "stuResumeTable"
    };

    /**
     * 初始化表格的列
     */
    StuResume.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'politicalStatus', sort: true, title: '政治面貌'},
            {field: 'hobby', sort: true, title: '特长'},
            {field: 'principalSheet', sort: true, title: '主页地址'},
            {field: 'healthCondition', sort: true, title: '健康状况'},
            {field: 'stuNumber', hide: true, title: ''},
            {align: 'center', toolbar: '#tableBar', title: '操作'}
        ]];
    };

    /**
     * 点击查询按钮
     */
    StuResume.search = function () {
        var queryData = {};


        table.reload(StuResume.tableId, {
            where: queryData, page: {curr: 1}
        });
    };

    /**
     * 跳转到添加页面
     */
    StuResume.jumpAddPage = function () {
        window.location.href = Feng.ctxPath + '/stuResume/add'
    };

    /**
    * 跳转到编辑页面
    *
    * @param data 点击按钮时候的行数据
    */
    StuResume.jumpEditPage = function (data) {
        window.location.href = Feng.ctxPath + '/stuResume/edit?stuNumber=' + data.stuNumber
    };

    /**
     * 导出excel按钮
     */
    StuResume.exportExcel = function () {
        var checkRows = table.checkStatus(StuResume.tableId);
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
    StuResume.onDeleteItem = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/stuResume/delete", function (data) {
                Feng.success("删除成功!");
                table.reload(StuResume.tableId);
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
        elem: '#' + StuResume.tableId,
        url: Feng.ctxPath + '/stuResume/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: StuResume.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        StuResume.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {

    StuResume.jumpAddPage();

    });

    // 导出excel
    $('#btnExp').click(function () {
        StuResume.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + StuResume.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            StuResume.jumpEditPage(data);
        } else if (layEvent === 'delete') {
            StuResume.onDeleteItem(data);
        }
    });
});
