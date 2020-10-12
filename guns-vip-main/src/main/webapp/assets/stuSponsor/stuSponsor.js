layui.use(['table', 'admin', 'ax', 'func'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    var func = layui.func;

    /**
     * 管理
     */
    var StuSponsor = {
        tableId: "stuSponsorTable"
    };

    /**
     * 初始化表格的列
     */
    StuSponsor.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'leftBehindChildren', sort: true, title: '是否为留守儿童'},
            {field: 'disableType', sort: true, title: '残疾类型'},
            {field: 'orphan', sort: true, title: '是否孤儿'},
            {field: 'ruralDibao', sort: true, title: '是否农村低保'},
            {field: 'extremelyPoor', sort: true, title: '是否农村特困救助供养'},
            {field: 'singleParent', sort: true, title: '是否单亲'},
            {field: 'solderChildren', sort: true, title: '是否军人子女'},
            {field: 'causesOfPoverty', sort: true, title: '家庭是否有其他重大致贫因素'},
            {field: 'applySponsor', sort: true, title: '是否需要申请资助'},
            {field: 'needSupply', sort: true, title: '是否享受一补'},
            {field: 'stuNumber', hide: true, title: ''},
            {align: 'center', toolbar: '#tableBar', title: '操作'}
        ]];
    };

    /**
     * 点击查询按钮
     */
    StuSponsor.search = function () {
        var queryData = {};


        table.reload(StuSponsor.tableId, {
            where: queryData, page: {curr: 1}
        });
    };

    /**
     * 跳转到添加页面
     */
    StuSponsor.jumpAddPage = function () {
        window.location.href = Feng.ctxPath + '/stuSponsor/add'
    };

    /**
    * 跳转到编辑页面
    *
    * @param data 点击按钮时候的行数据
    */
    StuSponsor.jumpEditPage = function (data) {
        window.location.href = Feng.ctxPath + '/stuSponsor/edit?stuNumber=' + data.stuNumber
    };

    /**
     * 导出excel按钮
     */
    StuSponsor.exportExcel = function () {
        var checkRows = table.checkStatus(StuSponsor.tableId);
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
    StuSponsor.onDeleteItem = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/stuSponsor/delete", function (data) {
                Feng.success("删除成功!");
                table.reload(StuSponsor.tableId);
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
        elem: '#' + StuSponsor.tableId,
        url: Feng.ctxPath + '/stuSponsor/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: StuSponsor.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        StuSponsor.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {

    StuSponsor.jumpAddPage();

    });

    // 导出excel
    $('#btnExp').click(function () {
        StuSponsor.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + StuSponsor.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            StuSponsor.jumpEditPage(data);
        } else if (layEvent === 'delete') {
            StuSponsor.onDeleteItem(data);
        }
    });
});
