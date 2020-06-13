$(function(){
    $('#myCarousel').carousel({
        interval:3000
    });
    $('#tb_departments').bootstrapTable({
        /*url: 'advicelist_01.json',   //请求后台的URL（*）
        method: 'get',      //请求方式（*）
        striped: false,      //是否显示行间隔色
        cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        //pagination: true,     //是否显示分页（*）
        sortable: false,      //是否启用排序
        sortOrder: "asc",     //排序方式
        sidePagination: "server",   //分页方式：client客户端分页，server服务端分页（*）
        pageNumber:1,      //初始化加载第一页，默认第一页
        pageSize: 10,      //每页的记录行数（*）
        pageList: [10, 25, 50, 100],  //可供选择的每页的行数（*）
        minimumCountColumns: 2,    //最少允许的列数*/
        clickToSelect: true,    //是否启用点击选中行
        height: 310,      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "ID",      //每一行的唯一标识，一般为主键列

        columns: [{
            field: 'title',
            title: '主题',
            width:200,
            align : 'left',
            halign : 'center',
            formatter: function ( value,row, index) {
                return "<a style='color:blue'href='findAdvicecontent.action?adviceid=" + row.adviceid + "' target='_blank'>"+row.title+"</a>";
            }
        }, {
            field: 'creatTime',
            title: '发布时间',
            width:40,
            align : 'center',
            halign : 'center'
        }]
    });
});