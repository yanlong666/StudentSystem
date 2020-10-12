layui.use(['table', 'admin', 'ax', 'func'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;
    var func = layui.func;

    /**
     * 管理
     */
    var StudentTotal = {
        tableId: "studentTotalTable"
    };

    /**
     * 初始化表格的列
     */
    StudentTotal.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'stuName', sort: true, title: '姓名'},
            {field: 'pstuName', sort: true, title: '曾用名'},
            // {field: 'photoSrc', sort: true, title: '个人照片',minWidth: 120},
            {field: 'stuNumber', sort: true, title: '学号'},
            {field: 'cardNumber', sort: true, title: '一卡通号',minWidth: 120},
            {field: 'idCard', sort: true, title: '证件号码',minWidth: 120},
            {field: 'phoneNumber', sort: true, title: '联系电话',minWidth: 120},
            {field: 'birth', sort: true, title: '出生日期',minWidth: 120},
            {field: 'gender', sort: true, title: '性别'},
            {field: 'nation', sort: true, title: '民族'},
            {field: 'bloodType', sort: true, title: '血型'},
            {field: 'householdRegisterType', sort: true, title: '户籍类别',minWidth: 120},
            {field: 'youthLeagueDate', sort: true, title: '入团日期',minWidth: 120},
            {field: 'youthLeagueNum', sort: true, title: '团员发展编号', minWidth: 140},
            {field: 'residenceAddr', sort: true, title: '户籍地址',minWidth: 120},
            {field: 'currentAddr', sort: true, title: '现居住地',minWidth: 120},
            // {field: 'householdRegisterFront', sort: true, title: '户口本首页', minWidth: 140},
            // {field: 'householdRegisterMain', sort: true, title: '户口本主页', minWidth: 140},
            // {field: 'householdRegisterSelf', sort: true, title: '户口本本人页', minWidth: 140},
            {field: 'stuType', sort: true, title: '学生类别',minWidth: 120},
            {field: 'stuClass', sort: true, title: '班级'},
            {field: 'schoolNum', sort: true, title: '省内学校代码', minWidth: 140},
            {field: 'totalScore', sort: true, title: '入学总分',minWidth: 120},
            {field: 'testScore', sort: true, title: '中考文化课成绩', minWidth: 140},
            {field: 'graduateSchool', sort: true, title: '原毕业院校', minWidth: 140},
            {field: 'registerType', sort: true, title: '学生来源',minWidth: 120},
            {field: 'studyType', sort: true, title: '入学方式',minWidth: 120},
            {field: 'admitOrder', sort: true, title: '中招序号',minWidth: 120},
            {field: 'followClass', sort: true, title: '随班就读',minWidth: 120},
            {field: 'accommodation', sort: true, title: '是否住宿生',minWidth: 140},
            {field: 'studyMode', sort: true, title: '就读方式',minWidth: 120},
            {field: 'migrantWorkersChildren', sort: true, title: '是否随迁子女', minWidth: 140},
            {field: 'countryWorkersChildren', sort: true, title: '是否进城务工随迁子女', minWidth: 200},
            {field: 'governmentPurchaseDegree', sort: true, title: '是否由政府购买学位', minWidth: 200},
            {field: 'enrollmentstatus', sort: true, title: '学籍变更备注', minWidth: 140},
            {field: 'politicalStatus', sort: true, title: '政治面貌',minWidth: 120},
            {field: 'hobby', sort: true, title: '特长'},
            {field: 'principalSheet', sort: true, title: '主页地址',minWidth: 120},
            {field: 'healthCondition', sort: true, title: '健康状况',minWidth: 120},
            {field: 'leftBehindChildren', sort: true, title: '是否为留守儿童', minWidth: 160},
            {field: 'disableType', sort: true, title: '残疾类型',minWidth: 120},
            {field: 'orphan', sort: true, title: '是否孤儿',minWidth: 120},
            {field: 'ruralDibao', sort: true, title: '是否农村低保', minWidth: 140},
            {field: 'extremelyPoor', sort: true, title: '是否农村特困救助供养', minWidth: 240},
            {field: 'singleParent', sort: true, title: '是否单亲',minWidth: 120},
            {field: 'solderChildren', sort: true, title: '是否军人子女', minWidth: 160},
            {field: 'causesOfPoverty', sort: true, title: '家庭是否有其他重大致贫因素', minWidth: 260},
            {field: 'applySponsor', sort: true, title: '是否需要申请资助', minWidth: 200},
            {field: 'needSupply', sort: true, title: '是否享受一补', minWidth: 140},
            {field: 'onlyChild', sort: true, title: '是否为独生子女', minWidth: 170},
            {field: 'martyrChildren', sort: true, title: '是否烈士或优抚子女',minWidth: 200},
            {field: 'healthfulDiet', sort: true, title: '是否享受营养餐', minWidth: 200},
            {field: 'putOnRecord', sort: true, title: '是否建档立卡贫困户在校生', minWidth: 250},
            // {field: 'deleteMember', sort: true, title: '删除'},
            {field: 'ordernumber', hide: true, title: ''},
            {align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 200}
        ]];
    };

    /**
     * 点击查询按钮
     */
    StudentTotal.search = function () {
        var queryData = {};


        table.reload(StudentTotal.tableId, {
            where: queryData, page: {curr: 1}
        });
    };

    /**
     * 跳转到添加页面
     */
    StudentTotal.jumpAddPage = function () {
        window.location.href = Feng.ctxPath + '/studentTotal/add'
    };

    /**
     * 跳转到编辑页面
     *
     * @param data 点击按钮时候的行数据
     */
    StudentTotal.jumpEditPage = function (data) {
        window.location.href = Feng.ctxPath + '/studentTotal/edit?ordernumber=' + data.ordernumber
    };

    /**
     * 导出excel按钮
     */
    StudentTotal.exportExcel = function () {
        var checkRows = table.checkStatus(StudentTotal.tableId);
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
    StudentTotal.onDeleteItem = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/studentTotal/delete", function (data) {
                Feng.success("删除成功!");
                table.reload(StudentTotal.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("ordernumber", data.ordernumber);
            ajax.start();
        };
        Feng.confirm("是否删除?", operation);
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + StudentTotal.tableId,
        url: Feng.ctxPath + '/studentTotal/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: StudentTotal.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        StudentTotal.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {

        StudentTotal.jumpAddPage();

    });

    // 导出excel
    $('#btnExp').click(function () {
        StudentTotal.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + StudentTotal.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            StudentTotal.jumpEditPage(data);
        } else if (layEvent === 'delete') {
            StudentTotal.onDeleteItem(data);
        }
    });
});
