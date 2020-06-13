<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <<jsp:forward page="/medirec"></jsp:forward> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="${ctx}/favicon.ico" >
<link rel="Shortcut Icon" href="${ctx}/favicon.ico" />
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
<!--/meta 作为公共模版分离出去-->

<title>现场挂号</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">
	<form action="" method="post" class="form form-horizontal" id="form-member-add">
		<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>发票号：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" class="input-text" value="" placeholder="" id="invoId" name="invoId">
                <span id="helpBlock12" class="help-block"></span>
			</div>
			<div class="formControls col-xs-2 col-sm-2">
				<button class="btn btn-info" type="button" id="btn_add_pat" aria-label="Left Align">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>  挂号</button>
			</div>
			<div class="formControls col-xs-2 col-sm-2">
				<button class="btn btn-warning" type="button" id="btn_clear_pat" aria-label="Left Align">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>  清空</button>
			</div>			
			<label class="form-label col-xs-5 col-sm-5"></label>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1">挂号信息</label>
			<label class="form-label col-xs-11 col-sm-11"></label>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>病历号：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" class="input-text" value="" placeholder="" id="medRecnum" name="medRecnum">
				<span id="helpBlock4" class="help-block"></span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>姓名：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" class="input-text" value="" placeholder="" id="patName" name="patName">
                <span id="helpBlock11" class="help-block"></span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>性别：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box">
					<select class="select" id="gender" name="gender">
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>年龄：</label>
			<div class="formControls col-xs-1 col-sm-1">
				<input type="text" class="input-text" value="" placeholder="" id="age" name="age">
				<span id="helpBlock5" class="help-block"></span>
			</div>
			<div class="formControls col-xs-1 col-sm-1">
				<span class="select-box">
					<select class="select" id="ageType" name="ageType">
						<option value="岁">岁</option>
						<option value="月">月</option>
						<option value="日">日</option>
					</select>
				</span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1">出生日期：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" onfocus="WdatePicker({ maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}' })" class="input-text Wdate" id="birth" name="birth">
				<input type="text" onfocus="WdatePicker({ minDate:'#F{$dp.$D(\'birth\')}',maxDate:'%y-%M-%d' })" class="input-text Wdate" id="logmax" name="birth" style="display:none">
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>身份证号：</label>
			<div class="formControls col-xs-3 col-sm-3">
				<input type="text" class="input-text" value="" placeholder="" id="idcard" name="idcard">
				<span id="helpBlock2" class="help-block"></span>
			</div>
			<label class="form-label col-xs-1 col-sm-1">家庭住址：</label>
			<div class="formControls col-xs-3 col-sm-3">
				<input type="text" class="input-text" value="" placeholder="" id="address" name="address">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>结算类别：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box">
					<select class="select" id="settleType" name="settleType">
						<option value="1">自费</option>
						<option value="2">市医保</option>
					</select>
				</span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>看诊日期：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',minDate:'#F{$dp.$D(\'logmin1\')||\'%y-%M-%d\'}' })" class="input-text Wdate" id="consultDate">
                <span id="helpBlock13" class="help-block"></span>
				<input type="text" onfocus="WdatePicker({ dateFmt:'yyyy-MM-dd',maxDate:'#F{$dp.$D(\'consultDate\')}',minDate:'%y-%M-%d' })" id="logmin1" class="input-text Wdate" style="display:none">
				<input type="hidden" id="regTime" name="regTime"
					   value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime())%>">
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>午别：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box">
					<select class="select" id="noonBreak" name="noonBreak" required="required">
						<option value="上午">上午</option>
						<option value="下午">下午</option>
					</select>
				</span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>挂号科室：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box">
					<select class="select" id="sel_dep"></select>
                    				<span id="helpBlock10" class="help-block"></span>
				</span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>号别：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box">
					<select class="select" id="sel_rank" ></select>
                    				<span id="helpBlock9" class="help-block"></span>
				</span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>看诊医生：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box">
					<select class="select" id="sel_doc"></select>
                    				<span id="helpBlock8" class="help-block"></span>
				</span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>初始号额：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" class="input-text" value="" placeholder="" id="regLimit" name="regLimit">
                <span id="helpBlock7" class="help-block"></span>
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>已用号额：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" class="input-text" value="" placeholder="" id="prePat" name="prePat">
                <span id="helpBlock6" class="help-block"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1">病历本</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="checkbox" class="input-checkbox" value="" placeholder="" id="ynMedrec" name="ynMedrec">
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>应收金额：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<input type="text" class="input-text" value="" placeholder="" id="regFee" name="regFee">
			</div>
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>收费方式：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box">
					<select class="select" name="conId" id="conId">
						<option value="51">现金</option>
						<option value="52">医保卡</option>
						<option value="53">银行卡</option>
						<option value="54">信用卡</option>
						<option value="55">微信</option>
						<option value="56">支付宝</option>
						<option value="57">云闪付</option>
						<option value="58">其他</option>
					</select>
				</span>
			</div>

<%--			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>本次挂号ID：</label>--%>
<%--			<div class="formControls col-xs-2 col-sm-2">--%>
				<input type="text" value="" id="registId" name="registId" hidden="true">
<%--			</div>--%>
			<input type="text" value="" id="newMednum" name="newMednum" hidden="true">
		</div>	
	</form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${ctx}/static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="${ctx}/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本--> 
<script type="text/javascript" src="${ctx}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${ctx}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="${ctx}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="${ctx}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="${ctx}/lib/jquery.validation/1.14.0/messages_zh.js"></script>

<%--页面初始化时调用--%>
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});

	ajax_queryMaxNum();

	ajax_queryMaxMedNum();

	ajax_queryDeparment();

	ajax_queryRegID();

});
/*查询可用的发票号码*/
function ajax_queryMaxNum() {
	$.ajax({
		url:"${ctx}/invo/querymaxnum",
		async:false,
		type:"GET",
		success:function(result){
			$("#invoId").val(result);
		}
	});
}
/*查询可用病历号码*/
function ajax_queryMaxMedNum() {
	$.ajax({
		url:"${ctx}/medi/querymaxmednum",
		async:false,
		type:"GET",
		success:function(result){
			$("#medRecnum").val(result);
			$("#newMednum").val(result);
		}
	});
}
/*查询科室*/
function ajax_queryDeparment() {
	$.ajax({
		url:"${ctx}/dep/querydepartment",
		type:"POST",
		async:false,
		dataType:'json',
		success:function(result){
			$("#sel_dep").empty();
			$("#sel_dep").append('<option value="' + '">' + "请选择" + '</option>');
			$.each(result,function (key,val) {
				$("#sel_dep").append('<option value="' + val['depId'] + '">' + val['depName'] + '</option>');
			});
		}
	});
}
//查询可用挂号id
function ajax_queryRegID() {
	$.ajax({
		url:"${ctx}/regist/queryregid",
		type:"GET",
		success:function(result){
			$("#registId").val(result);
			// alert($("#registId").val())
		}
	});

}
</script> 
<%--用户点击选择时调用--%>
<script type="text/javascript">
	/*根据所选的科室查询科室医生*/
	$("#sel_dep").change(function () {
		var data = {"docDepid":$("#sel_dep").val()};
		$.ajax({
			url:"${ctx}/doc/querydocwithdep",
			type:"POST",
			async:false,
			contentType: 'application/json;charset=utf-8',
			dataType :'json',
			data:JSON.stringify(data),
			success:function(result){
				$("#sel_doc").empty();
				$("#sel_doc").append('<option value="' + '">' + "请选择" + '</option>');
				$.each(result,function (key,val) {
					$("#sel_doc").append('<option value="' + val['docId'] + '">' + val['docName'] + '</option>');
				});
			}
		});
	});
	/*根据所选医生查询号别、挂号限额及挂号费用等信息*/
	$("#sel_doc").change(function () {
		ajax_querydoc();
		ajax_queryprepat()
	});

	/*清空*/
	$("#btn_clear_pat").click(function () {
		$("#patName").val('');
		$("#age").val('');
		$("#birth").val('');
		$("#idcard").val('');
		$("#address").val('');
		$("#consultDate").val('');
		$("#sel_rank").empty();
		$("#sel_doc").empty();
		$("#regLimit").val('');
		$("#prePat").val('');
		$("#regFee").val('');
	});

// 查询医生的号别、挂号费用和限额
function ajax_querydoc() {
    var data = {"docId":$("#sel_doc").val()};
    $.ajax({
        url:"${ctx}/doc/querydoc",
        type:"POST",
		async:false,
        contentType: 'application/json;charset=utf-8',
        dataType :'json',
        data:JSON.stringify(data),
        success:function(result){
            $("#sel_rank").empty();
            var regRankid = result.registRank.regRankid;
            var rankName = result.registRank.rankName;
            $("#sel_rank").append('<option value="' + regRankid + '">' + rankName + '</option>');
            $("#regLimit").val(result.registRank.regLimit);
            $("#regFee").val(result.registRank.regFee);
        }
    });
}
//查询医生的已用号额
function ajax_queryprepat() {
	var data = {"rDocid":$("#sel_doc").val()};
	$.ajax({
		url:"${ctx}/regist/queryprepat",
		type:"POST",
		async:false,
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		data:JSON.stringify(data),
		success:function(result){
			$("#prePat").val(result)
		}
	});
}
	//根据患者的病历号查询患者的基本信息
	$("#medRecnum").blur(function () {
		if(!validate_medRecnum()){
			return false;
		}
		$("#patName").val('');
		$("#age").val('');
		$("#birth").val('');
		$("#idcard").val('');
		$("#address").val('');
		//根据病历号查询患者的基本信息
		var data = {"medRecnum":$("#medRecnum").val()};
		$.ajax({
			url:"${ctx}/medi/queryinfo",
			type:"POST",
			async:false,
			cache:false,
			contentType: 'application/json;charset=utf-8',
			dataType :'json',
			data:JSON.stringify(data),
			success:function (result) {
				$("#patName").val(result.patient.patName);
				$("#gender").val(result.patient.gender);
				$("#age").val(result.patient.age);
				$("#ageType").val(result.patient.ageType);
				$("#birth").val(result.patient.birth);
				$("#idcard").val(result.patient.idcard);
				$("#address").val(result.patient.address);
			}
		})

	});
</script>
<%--校验表单，提交数据--%>
<script type="text/javascript">
/*校验病历号*/
function validate_medRecnum() {
    var rmedRecnum = $("#medRecnum").val();
    var regmedRecnum = new RegExp("^\\d{6}$");
    if (!regmedRecnum.test(rmedRecnum)) {
        $("#medRecnum").parent().addClass("has-error");
        $("#medRecnum").next("span").text("请输入六位数字的病历号");
        return false;
    } else {
        $("#medRecnum").parent().addClass("has-success");
        $("#medRecnum").next("span").text("");
    }
    return true;
}
/*校验身份证号*/
function isIdCardNo(num){
    var len = num.length;
    var re;
    if (len === 15) {
        re = new RegExp(/^(\d{6})?(\d{2})(\d{2})(\d{2})(\d{2})(\w)$/);
    }else if (len === 18) {
        re = new RegExp(/^(\d{6})?(\d{4})(\d{2})(\d{2})(\d{3})(\w)$/);
    }else {
        // alert("输入的数字位数不对。");
        $("#idcard").parent().addClass("has-error");
        $("#idcard").next("span").text("输入的数字位数不对");
        return false;
    }
    if(!re.test(num)){
        // alert("身份证最后一位只能是数字和字母。");
        $("#idcard").parent().addClass("has-error");
        $("#idcard").next("span").text("身份证最后一位只能是数字和字母");
        return false;
    }
    return true;
}
/*校验年龄*/
function validate_age() {
    var rage = $("#age").val();
    var regage = new RegExp("^(?:[1-9][0-9]?|1[01][0-9]|120)$");
    if (!regage.test(rage)) {
        $("#age").parent().addClass("has-error");
        $("#age").next("span").text("请输入正确的年龄");
        return false;
    } else {
        $("#age").parent().addClass("has-success");
        $("#age").next("span").text("");
    }
    return true;
}
/*校验已用号额是否大于初始号额*/
function validate_limit() {
    var regLimit = Number($("#regLimit").val());
    var prePat = Number($("#prePat").val());
    if (regLimit < prePat){
        alert("号额已满");
        return false;
    }
    return true;
}
/*校验必填项*/
function ajax_force() {
    if ($("#invoId").val().length == 0){
        alert("invoId");
        $("#invoId").parent().addClass("has-error");
        $("#invoId").next("span").text("必填项");
        return false;
    }else {
        $("#invoId").parent().addClass("has-success");
        $("#invoId").next("span").text();
    }
    if ($("#medRecnum").val().length === 0){
        $("#medRecnum").parent().addClass("has-error");
        $("#medRecnum").next("span").text("必填项");
        return false;
    }else {
        $("#medRecnum").parent().addClass("has-success");
        $("#medRecnum").next("span").text();
    }
    if ($("#patName").val().length === 0){
        $("#patName").parent().addClass("has-error");
        $("#patName").next("span").text("必填项");
        return false;
    }else {
        $("#patName").parent().addClass("has-success");
        $("#patName").next("span").text();
    }
    if ($("#age").val().length === 0){
        $("#age").parent().addClass("has-error");
        $("#age").next("span").text("必填项");
        return false;
    }else {
        $("#age").parent().addClass("has-success");
        $("#age").next("span").text();
    }
    if ($("#idcard").val().length === 0){
        $("#idcard").parent().addClass("has-error");
        $("#idcard").next("span").text("必填项");
        return false;
    }else {
        $("#idcard").parent().addClass("has-success");
        $("#idcard").next("span").text();
    }
    if ($("#consultDate").val().length === 0){
        $("#consultDate").parent().addClass("has-error");
        $("#consultDate").next("span").text("必填项");
        return false;
    }else {
        $("#consultDate").parent().addClass("has-success");
        $("#consultDate").next("span").text();
    }
    if ($("#sel_dep").val().length === 0){
        $("#sel_dep").parent().addClass("has-error");
        $("#sel_dep").next("span").text("必填项");
        return false;
    }else {
        $("#sel_dep").parent().addClass("has-success");
        $("#sel_dep").next("span").text();
    }
    if ($("#sel_rank").val().length === 0){
        $("#sel_rank").parent().addClass("has-error");
        $("#sel_rank").next("span").text("必填项");
        return false;
    }else {
        $("#sel_rank").parent().addClass("has-success");
        $("#sel_rank").next("span").text();
    }
    if ($("#sel_doc").val().length === 0){
        $("#sel_doc").parent().addClass("has-error");
        $("#sel_doc").next("span").text("必填项");
        return false;
    }else {
        $("#sel_doc").parent().addClass("has-success");
        $("#sel_doc").next("span").text();
    }
    if ($("#regLimit").val().length === 0){
        $("#regLimit").parent().addClass("has-error");
        $("#regLimit").next("span").text("必填项");
        return false;
    }else {
        $("#regLimit").parent().addClass("has-success");
        $("#regLimit").next("span").text();
    }
    if ($("#prePat").val().length === 0){
        $("#prePat").parent().addClass("has-error");
        $("#prePat").next("span").text("必填项");
        return false;
    }else {
        $("#prePat").parent().addClass("has-success");
        $("#prePat").next("span").text();
    }
    if ($("#regFee").val().length === 0){
        $("#regFee").parent().addClass("has-error");
        $("#regFee").next("span").text("必填项");
        return false;
    }else {
        $("#regFee").parent().addClass("has-success");
        $("#regFee").next("span").text();
    }

    return true;
}

    $("#btn_add_pat").click(function () {
        //检验身份证号
        var idCard = $("#idcard").val();
        if (!isIdCardNo(idCard)){
            // alert("idCard");
            return false;
        }
		//校验病历号
		if (!validate_medRecnum()) {
            // alert("medrecnum");
			return false;
		}

		//校验年龄
        if (!validate_age()){
            // alert("age");
            return false;
        }

		//校验已用号额是否大于初始号额
		if (!validate_limit()){
            // alert("limit");
			return false;
		}

		//校验必填项
        if (!ajax_force()){
            // alert("force");
            return false;
        }

        //提交表单数据

        if ($("#medRecnum").val() !== $("#newMednum").val()){
            ajax_add_patient();
        }

        ajax_add_regist();

		ajax_add_patregist();

		ajax_addreg_invo();


    });

/*添加新患者*/
function ajax_add_patient() {
	var data = {"patName":$("#patName").val(), "idcard":$("#idcard").val(), "gender":$("#gender").val(), "age":$("#age").val(), "ageType":$("#ageType").val(), "birth":$("#birth").val(), "pMedrecnum":$("#medRecnum").val(), "address":$("#address").val()};
	$.ajax({
		url:"${ctx}/patient/addpatient",
		type:"POST",
		async:false,
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		data:JSON.stringify(data),
		success:function(result){
			// alert("ajax_add_patient-1");
		}
	})
}

/*保存患者挂号信息*/
function ajax_add_regist() {
	var temp = 0;
	if($("#ynMedrec").prop("checked")){
		temp = 1;
	}else {
		temp = 0;
	}
	// alert($("#ynMedrec").prop("checked"));
	// alert(temp);
	var data = {"registId":$("#registId").val(),"rDocid":$("#sel_doc").val(), "ynMedrec":temp, "consultDate":$("#consultDate").val(), "settleType":$("#settleType").val(), "noonBreak":$("#noonBreak").val(), "regTime":$("#regTime").val()};
	$.ajax({
		url:"${ctx}/regist/addreg",
		type:"POST",
		async:false,
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		data:JSON.stringify(data),
		success:function(result){
			// alert("ajax_add_regist-2");
		}
	})
}

/*保存患者挂号对应信息*/
function ajax_add_patregist() {
	var data = {"prRegid":$("#registId").val(),"prIdcard":$("#idcard").val()};
	$.ajax({
		url:"${ctx}/patreg/addpatreg",
		type:"POST",
		async:false,
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		data:JSON.stringify(data),
		success:function(result){
			// alert("ajax_add_patregist-3");
		}
	})
}

/*保存挂号账单信息*/
function ajax_addreg_invo() {
	var data = {"invoId":$("#invoId").val(),"invoAmount":$("#regFee").val(),"collrefundTime":$("#regTime").val()};
	$.ajax({
		url:"${ctx}/invo/saveinvo",
		type:"POST",
		async:false,
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		data:JSON.stringify(data),
		success:function (result) {
			alert("挂号成功！");
			window.location.reload();
		}
	})
}

</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>