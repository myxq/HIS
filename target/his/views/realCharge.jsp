<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
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
    <form action="${ctx}/medi/queryWithMedi" method="post" class="form form-horizontal" id="form-realCharge">
    <div class="row cl">
        <label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>病历号：</label>
        <div class="formControls col-xs-2 col-sm-2">
            <input type="text" class="input-text" value="${queryMedi.get(0).patient.pMedrecnum}" placeholder="" id="medRecnum" name="medRecnum" required>
        </div>
        <div class="formControls col-xs-2 col-sm-2">
            <button class="btn btn-primary" type="submit" aria-label="Left Align"><span class="glyphicon glyphicon-search" aria-hidden="true"></span> 查询</button>
        </div>
    </div>
    </form>
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
        <label class="col-sm-2">患者消费信息</label>
    </div>
    <div class="mt-20">
        <table class="table table-border table-bordered table-bg table-hover table-sort table-responsive">
            <thead>
                <tr class="text-c">
                    <th width="25">
                        <input type="checkbox" name="" value="">
                    </th>
                    <th width="80">病历号</th>
                    <th width="80">姓名</th>
                    <th width="80">项目名称</th>
                    <th width="80">单价</th>
                    <th width="75">数量</th>
                    <th width="120">开立时间</th>
                    <th width="60">状态</th>
                </tr>
            </thead>
            <form action="" method="post" class="form form-horizontal" id="form-getCharge" name="form_getCharge">
                <tbody>
                    <c:forEach items="${queryMedi}" var="obj">
                        <tr class="text-c">
                            <td width="25">
                                <input type="checkbox" class="check_item" name="" value="">
                            </td>
                            <td width="80">${obj.patient.pMedrecnum}</td>
                            <td width="80">${obj.patient.patName}</td>
                            <td width="80">${obj.patient.patRegists.get(0).feeDetail.drugs.get(0).drugName}</td>
                            <td width="80">${obj.patient.patRegists.get(0).feeDetail.drugs.get(0).drugPrice}</td>
                            <td width="75">${obj.patient.patRegists.get(0).feeDetail.fdDrugnum}</td>
                            <td width="120">${obj.patient.patRegists.get(0).feeDetail.fdOpentime}</td>
                            <td width="60">
                                    <c:choose>
                                        <c:when test="${obj.patient.patRegists.get(0).prRegstate eq 3}">已开立</c:when>
                                        <c:otherwise>未开立</c:otherwise>
                                    </c:choose>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </form>
        </table>
    </div><br>
    <div class="row cl">
        <button class="btn btn-info" id="charge_model_btn" aria-label="Left Align">
            <span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span>  收费结算</button>
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
<script src="${ctx}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $("#charge_model_btn").click(function () {
        $("#chargeBox").modal({
            backdrop: 'static'
        });

        var p_name = null;
        var p_medNum = 0;
        var d_price = 0;
        var d_num = 0;
        var count = 0;


        $.each($(".check_item:checked"),function () {
            p_medNum = $(this).parents("tr").find("td:eq(1)").text();
            p_name = $(this).parents("tr").find("td:eq(2)").text();
            d_price = $(this).parents("tr").find("td:eq(4)").text();
            d_num = $(this).parents("tr").find("td:eq(5)").text();
            count += d_num * d_price;
        });

        count = Number(count).toFixed(2);
        $("#invo_medRecnum").val(p_medNum);
        $("#invo_patName").val(p_name);
        $("#invoAmount").val(count);

        $.ajax({
            url:"${ctx}/invo/querymaxnum",
            type:"GET",
            success:function(result){
                $("#invoId").val(result);
            }

        })
    });

    $("#RinvoAmount").change(function () {
        var need_pay = Number($("#invoAmount").val());
        var real_pay = Number($("#RinvoAmount").val());
        $("#CinvoAmount").val((real_pay-need_pay).toFixed(2));
    });

    function validate_add_form(){
       //校验实际付款金额
        var rinvoAmount = $("#RinvoAmount").val();
        var regRinvoAmount = new RegExp("^[0-9]+(.[0-9]{0,2})?$");
        if (!regRinvoAmount.test(rinvoAmount)){
            $("#RinvoAmount").parent().addClass("has-error");
            $("#RinvoAmount").next("span").text("请输入最多不超过两位小数有效付款数");
            return false;
        }else {
            $("#RinvoAmount").parent().addClass("has-success");
            $("#RinvoAmount").next("span").text("");
        }

        //校验找零金额
        var cinvoAmount = $("#CinvoAmount").val();
        var regCinvoAmount = /(^[0-9]+(.[0-9]{0,2})?$)/;
        if (!regCinvoAmount.test(cinvoAmount)){
            $("#CinvoAmount").parent().addClass("has-error");
            $("#CinvoAmount").next("span").text("请检查付款金额");
            return false;
        }else {
            $("#CinvoAmount").parent().addClass("has-success");
            $("#CinvoAmount").next("span").text("");
        }
        return true;
    }

    $("#btn_charge").click(function () {
        //校验数据
        if (!validate_add_form()){
            return false;
        }

        //提交表单数据
        var data = {"invoId":$("#invoId").val(),"invoAmount":$("#invoAmount").val(),"collrefundTime":$("#collrefundTime").val(),"chargeId":$("#chargeId").val()};
        $.ajax({
            url:"${ctx}/invo/saveinvo",
            type:"POST",
            contentType: 'application/json;charset=utf-8',
            dataType :'json',
            data:JSON.stringify(data),
            success:function (result) {
                // alert(result.msg);
                //关闭模态框
                $("#chargeBox").modal('hide');
            }
        })
    });

    $("#btn-hidden").click(function () {

    })

</script>
</body>
</html>