<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/9/11
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${ctx}/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${ctx}/lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="${ctx}/static/h-ui.admin/css/style.css" />
    <link rel="stylesheet" href="${ctx}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" >
    <!--[if IE 6]>
    <script type="text/javascript" src="${ctx}/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>收费</title>
</head>
<body>
<%--结算界面模态框--%>
<div class="modal fade" id="chargeBox" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">发票信息（交费）</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" id="invoAddModal_form">
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">发票号码</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="invoId" id="invoId" placeholder="发票号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">病历号码</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="medRecnum" id="invo_medRecnum" placeholder="病历号">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">患者姓名</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="patName" id="invo_patName" placeholder="患者姓名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">应收金额</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="invoAmount" id="invoAmount" placeholder="应收金额">
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">实收金额</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="RinvoAmount" placeholder="实收金额">
                            <span id="helpBlock2" class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-5 control-label">支付方式</label>
                        <div class="col-sm-6">
                            <select class="form-control" name="chargeId" id="chargeId" style="width: 140px">
                                <option value="51">现金</option>
                                <option value="52">医保卡</option>
                                <option value="53">银行卡</option>
                                <option value="54">信用卡</option>
                                <option value="55">微信</option>
                                <option value="56">支付宝</option>
                                <option value="57">云闪付</option>
                                <option value="58">其他</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-4 control-label">找零金额</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" id="CinvoAmount" placeholder="找零金额">
                            <span id="helpBlock3" class="help-block"></span>
                            <input type="hidden" id="collrefundTime" name="collrefundTime"
                                   value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime())%>">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" class="btn btn-primary" id="btn_charge">收费</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<div class="page-container">
    <div class="row cl">
        <label class="col-sm-2">患者信息查询</label>
    </div>
    <%--<form action="${ctx}/medi/queryReturnReg" method="post" class="form form-horizontal" id="form-realCharge">--%>
        <div class="row cl">
            <label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>病历号：</label>
            <div class="formControls col-xs-2 col-sm-2">
                <input type="text" class="input-text" value="" placeholder="" id="medRecnum" name="medRecnum" required>
            </div>
            <div class="formControls col-xs-2 col-sm-2">
                <button id="btn_sel_reg" class="btn btn-primary" aria-label="Left Align"><span class="glyphicon glyphicon-search" aria-hidden="true"></span> 查询</button>
            </div>
        </div>
    <%--</form>--%>
    <div class="row cl">
        <label class="col-sm-2">患者信息确认</label>
    </div>
    <div class="row cl">
        <label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>姓名：</label>
        <div class="formControls col-xs-2 col-sm-2">
            <input type="text" class="input-text" value="${queryMedi.get(0).patient.patName}" placeholder="" id="patName" name="patName">
        </div>
        <label class="form-label col-xs-1 col-sm-1">身份证号：</label>
        <div class="formControls col-xs-3 col-sm-3">
            <input type="text" class="input-text" value="${queryMedi.get(0).patient.idcard}" placeholder="" id="idcard" name="idcard">
        </div>
        <label class="form-label col-xs-1 col-sm-1">家庭住址：</label>
        <div class="formControls col-xs-3 col-sm-3">
            <input type="text" class="input-text" value="${queryMedi.get(0).patient.address}" placeholder="" id="address" name="address">
        </div>
    </div>
    <div class="row cl ">
        <label class="col-sm-2">患者挂号信息</label>
    </div>
    <div class="mt-20">
        <table  id="reg-table" class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
            <thead>
                <tr class="text-c">
                    <th width="80">病历号</th>
                    <th width="80">姓名</th>
                    <th width="120">身份证号</th>
                    <th width="80">挂号日期</th>
                    <th width="75">挂号午别</th>
                    <th width="80">看诊科室</th>
                    <th width="60">看诊状态</th>
                    <th width="60">操作</th>
                </tr>
            </thead>
            <tbody></tbody>
        </table>
    </div>
    <div class="row cl">
        <!-- 分页文字信息 -->
        <div class="col-md-9" id="page-info-area"></div>
        <!-- 分页条信息 -->
        <div class="col-md-3" id="page_nav_area"></div>
    </div>
</div>
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${ctx}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${ctx}/static/h-ui.admin/js/H-ui.admin.js"></script>
<!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="${ctx}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${ctx}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="${ctx}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    var totalRecord, currentPage;
    /*点击查询按钮后，拿到分页数据*/
    $("#btn_sel_reg").click(function () {
        ajax_to_page(1);
    });

function ajax_to_page(pageNumber) {
    var medRecnum = Number($("#medRecnum").val());
    $.ajax({
        url: "${ctx}/medi/queryReturnReg",
        data: "pageNumber="+pageNumber+"&medRecnum="+medRecnum,
        type: "GET",
        contentType: 'application/json;charset=utf-8',
        async:false,
        success: function(result) {
            bulid_reg_table(result);
            
            bulid_page_info(result);
            
            bulid_page_nav(result);

            // set_pat_info();

        }

    });
}

function bulid_reg_table(result) {
//    先清空
    $("#reg-table tbody").empty();
    var regInfo = result.extend.pageInfo.list;
    $("#patName").val(regInfo[0].patient.patName);
    $("#idcard").val(regInfo[0].patient.idcard);
    $("#address").val(regInfo[0].patient.address);
    $.each(regInfo,function (index,item) {
        var medRecnumTd = $("<td class=\"text-c\"></td>").append(item.patient.pMedrecnum);
        var patNameTd = $("<td class=\"text-c\"></td>").append(item.patient.patName);
        var idcardTd = $("<td class=\"text-c\"></td>").append(item.patient.idcard);
        var regTimeTd = $("<td class=\"text-c\"></td>").append(item.patient.patRegists[0].regist.regTime);
        // alert(item.patient.patRegists[0].regist.regTime);
        var regTimenoonBreakTd = $("<td class=\"text-c\"></td>").append(new Date(item.patient.patRegists[0].regist.regTime).getHours()>12 ? "下午" : "上午");
        var depNameTd = $("<td class=\"text-c\"></td>").append(item.patient.patRegists[0].regist.doctor.department.depName);

        //获得挂号状态，进行转换
        var Regstate = Number(item.patient.patRegists[0].prRegstate);
        var prRegstate;
        if (Regstate === 1){
            prRegstate = "未看诊";
        }else if (Regstate === 2){
            prRegstate = "已看诊";
        }else{
            prRegstate = "已退号";
        }
        var prRegstateTd = $("<td class=\"text-c\"></td>").append(prRegstate);
        var returnRegBtn = $("<button></button>").addClass("btn btn-primary btn-sm return_btn")
            .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("退号");

        //    为退号按钮添加属性表示患者的挂号id
        returnRegBtn.attr("returnReg_id", item.patient.patRegists[0].regist.registId);
        returnRegBtn.attr("returnReg_state", item.patient.patRegists[0].prRegstate);
        returnRegBtn.attr("returnReg_idcard", item.patient.idcard);
        var btnTd = $("<td class=\"text-c\"></td>").append(returnRegBtn);
        $("<tr></tr>").append(medRecnumTd).append(patNameTd).append(idcardTd)
            .append(regTimeTd).append(regTimenoonBreakTd).append(depNameTd)
            .append(prRegstateTd).append(btnTd).appendTo("#reg-table tbody");
    })
}
function bulid_page_info(result) {
    $("#page-info-area").empty();
    $("#page-info-area").append(
        "当前" + result.extend.pageInfo.pageNum + "页，总" +
        result.extend.pageInfo.pages + "页，共" +
        result.extend.pageInfo.total + "条记录");
    totalRecord = result.extend.pageInfo.total;

    //更新患者挂号信息后，需返回显示当前页
    currentPage = result.extend.pageInfo.pageNum;
}
function bulid_page_nav(result) {

    //page_nav_area
    $("#page_nav_area").empty();
    var ul = $("<ul></ul>").addClass("pagination");

    //构建元素
    var firstPageLi = $("<li></li>").append(
        $("<a></a>").append("首页").attr("href", "#"));
    var prePageLi = $("<li></li>").append(
        $("<a></a>").append("&laquo;"));
    if (result.extend.pageInfo.hasPreviousPage == false) {
        firstPageLi.addClass("disabled");
        prePageLi.addClass("disabled");
    } else {
        //为元素添加翻页事件
        firstPageLi.click(function() {
            ajax_to_page(1);
        });
        prePageLi.click(function() {
            ajax_to_page(result.extend.pageInfo.pageNum - 1);
        });
    }
    var nextPageLi = $("<li></li>").append(
        $("<a></a>").append("&raquo;"));
    var lastPageLi = $("<li></li>").append(
        $("<a></a>").append("末页").attr("href", "#"));
    if (!result.extend.pageInfo.hasNextPage) {
        nextPageLi.addClass("disabled");
        lastPageLi.addClass("disabled");
    } else {
        nextPageLi.click(function() {
            ajax_to_page(result.extend.pageInfo.pageNum + 1);
        });
        lastPageLi.click(function() {
            ajax_to_page(result.extend.pageInfo.pages);
        });
    }

    //页码1，2，3，4
    ul.append(firstPageLi).append(prePageLi);
    $.each(result.extend.pageInfo.navigatepageNums, function(index,item) {
        var numLi = $("<li></li>").append($("<a></a>").append(item));
        if (result.extend.pageInfo.pageNum === item) {
            numLi.addClass("active");
        }
        numLi.click(function() {
            ajax_to_page(item);
        });
        ul.append(numLi);
    });
    ul.append(nextPageLi).append(lastPageLi);

    //把ul加入到nav
    var navEle = $("<nav></nav>").append(ul);
    navEle.appendTo("#page_nav_area");
}

    $(document).on("click", ".return_btn", function() {
        var registId = $(this).attr("returnReg_id");
        // alert("registId"+registId);
        var Regstate = $(this).attr("returnReg_state");
        // alert("Regstate"+Regstate);
        var prRegstate = 3;
        var prIdcard = $(this).attr("returnReg_idcard");
        if (Regstate==1){
            if (confirm("确认退号吗？")){
                var data = {"prIdcard":prIdcard,"prRegid":registId,"prRegstate":prRegstate};
                $.ajax({
                    url:"${ctx}/patreg/returnReg",
                    type:"POST",
                    // async:false,
                    dataType:"json",
                    contentType: 'application/json;charset=utf-8',
                    data:JSON.stringify(data),
                    success:function (result) {
                        // alert(currentPage);
                        if ( result.code === 2000){
                            alert("退号失败！");
                        }else if (result.code === 1000){
                            alert("退号成功！");
                            ajax_to_page(currentPage);
                        }
                    }
                })
            }
        }else if (Regstate==2){
            alert("已看诊，无法退号");
        }else {
            alert("已退号，无法二次退号");
        }
    });
</script>
<script type="text/javascript">

</script>