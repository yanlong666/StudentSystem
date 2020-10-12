layui.use(['table', 'admin', 'ax', 'func'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    var func = layui.func;

    /**
     * 管理
     */
    var StuOther = {
        tableId: "stuOtherTable"
    };

    /**
     * 初始化表格的列
     */
    StuOther.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'onlyChild', sort: true, title: '是否为独生子女'},
            {field: 'martyrChildren', sort: true, title: '是否烈士或优抚子女'},
            {field: 'healthfulDiet', sort: true, title: '是否享受营养餐'},
            {field: 'putOnRecord', sort: true, title: '是否建档立卡贫困户在校生'},
            {field: 'stuNumber', hide: true, title: ''},
            {align: 'center', toolbar: '#tableBar', title: '操作'}
        ]];
    };

    /**
     * 点击查询按钮
     */
    StuOther.search = function () {
        var queryData = {};


        table.reload(StuOther.tableId, {
            where: queryData, page: {curr: 1}
        });
    };

    /**
     * 跳转到添加页面
     */
    StuOther.jumpAddPage = function () {
        window.location.href = Feng.ctxPath + '/stuOther/add'
    };

    /**
    * 跳转到编辑页面
    *
    * @param data 点击按钮时候的行数据
    */
    StuOther.jumpEditPage = function (data) {
        window.location.href = Feng.ctxPath + '/stuOther/edit?stuNumber=' + data.stuNumber
    };

    /**
     * 导出excel按钮
     */
    StuOther.exportExcel = function () {
        var checkRows = table.checkStatus(StuOther.tableId);
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
    StuOther.onDeleteItem = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/stuOther/delete", function (data) {
                Feng.success("删除成功!");
                table.reload(StuOther.tableId);
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
        elem: '#' + StuOther.tableId,
        url: Feng.ctxPath + '/stuOther/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: StuOther.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        StuOther.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {

    StuOther.jumpAddPage();

    });

    // 导出excel
    $('#btnExp').click(function () {
        StuOther.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + StuOther.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            StuOther.jumpEditPage(data);
        } else if (layEvent === 'delete') {
            StuOther.onDeleteItem(data);
        }
    });
});
