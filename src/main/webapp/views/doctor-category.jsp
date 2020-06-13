<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="zh-CN">
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
<title>医生诊疗</title>
</head>
<body>
<!--添加西医诊断的模态框-->
<div class="modal fade" id="addBox" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">添加西医诊断</h4>
			</div>
			<div class="modal-body">
				<form class="form form-horizontal" id="invoAddModal_form">
					<div class="form-group" style="width: 100%">
						<label  class="col-sm-3 control-label">疾病名称：</label>
						<div class="col-sm-6">
                            <input type="text" class="form-control" name="diseName" id="diseName" placeholder="查询疾病名称" required="required">
						</div>
						<div class="col-sm-2">
							<button type="button" class="btn btn-success" name="searchDisease" id="searchDisease"><i class="icon Hui-iconfont">&#xe709;</i> 查询</button>
						</div>
					</div>
					<div class="form-group" style="width: 100%">
						<label class="col-sm-3 control-label">ICD编码：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="diseaseIcd" id="diseaseIcd" placeholder="ICD编码" required="required">
						</div>
					</div>
					<div class="form-group" style="width: 100%">
						<label  class="col-sm-3 control-label">发病时间：</label>
						<div class="col-sm-6">
							<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss', maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}' })" class="form-control Wdate" id="diseDate" name="diseDate" required="required" placeholder="发病时间">
							<input type="text" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss', minDate:'#F{$dp.$D(\'birth\')}',maxDate:'%y-%M-%d' })" class="form-control Wdate" id="logmax" name="diseDate" style="display:none">
						</div>
					</div>
					<input type="text" id="diseID" value="" hidden>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" id="confirmAdd" class="btn btn-primary">确定</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<!--向处方中添加药品的模态框-->
<div class="modal fade" id="addDrugsToPres" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">添加药品</h4>
			</div>
			<div class="modal-body">
				<form class="form form-horizontal" id="">
					<div class="form-group" style="width: 100%">
						<label  class="col-sm-3 control-label">药品名称：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="drugsName" id="drugsName" placeholder="药品名称" required="required">
						</div>
						<div class="col-sm-2">
							<button type="button" class="btn btn-success" name="searchDrugs" id="searchDrugs"><i class="icon Hui-iconfont">&#xe709;</i> 查询</button>
						</div>
					</div>
					<div class="form-group" style="width: 60%;margin-right: 25%;margin-left: 25%">
						<select class="form-control" id="sel_drugName"></select>
					</div>
					<div class="form-group" style="width: 100%">
						<label class="col-sm-3 control-label">规格：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="drugNum" id="drugFormat" placeholder="规格" required="required">
						</div>
					</div>
					<div class="form-group" style="width: 100%">
						<label class="col-sm-3 control-label">单价：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="drugNum" id="drugPrice" placeholder="单价" required="required">
						</div>
					</div>
					<input type="text" id="drugId" value="" hidden>
					<div class="form-group" style="width: 100%">
						<label class="col-sm-3 control-label">用法：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="drugNum" id="drugUsage" placeholder="用法" required="required">
						</div>
					</div>
					<div class="form-group" style="width: 100%">
						<label class="col-sm-3 control-label">用量：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="drugNum" id="drugDosage" placeholder="用量" required="required">
						</div>
					</div>
					<div class="form-group" style="width: 100%">
						<label class="col-sm-3 control-label">频次：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="drugNum" id="drugFrequency" placeholder="频次" required="required">
						</div>
					</div>
					<div class="form-group" style="width: 100%">
						<label class="col-sm-3 control-label">数量：</label>
						<div class="col-sm-6">
							<input type="text" class="form-control" name="drugNum" id="drugNum" placeholder="数量" required="required">
						</div>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" id="confirmAddDrugs" class="btn btn-primary">确定</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<!--增加处方模态框-->
<div class="modal fade" id="addPresModal" tabindex="-1" role="dialog">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">添加处方</h4>
			</div>
			<div class="modal-body">
				<label class="form-label">处方名称</label>
				<input type="text" id="presName" class="input-text">
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				<button type="button" id="confirmAddPres" class="btn btn-primary">确定</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div>
<!-- /.modal -->

<div>
<table class="table">
	<tr>
		<td width="25%"  id="pati-la">
			<div class="row" style="height: 50px">
				<%--<strong>患者选择：</strong><button type="button" class="btn btn-success radius r"><i class="Hui-iconfont">&#xe68f;</i></button>--%>
				<nav class="breadcrumb" style="height: 45px;width: 330px"><strong>患者选择：</strong>
					<a class="btn btn-success radius r" style="line-height:1.6em;margin-bottom:1px" onclick="flush()" title="刷新" >
						<i class="Hui-iconfont">&#xe68f;</i>
					</a>
				</nav>
			</div>
			<div class="pull-right" style="width: 100%">
				<strong>患者名：</strong><input class="input-text radius" style="width: 70%" id="search">
				<div class="btn-group">
					<button type="button" class="btn btn-primary radius" id="btn-simple-search"><i class="icon Hui-iconfont">&#xe709;</i></button>
				</div>
			</div >
			<!-- Nav tabs -->
			<ul id="myTab" class="nav nav-tabs">
				<li  class="active"><a href="#self" data-toggle="tab">本人</a></li>
				<li><a href="#dept" data-toggle="tab">科室</a></li>
			</ul>

			<!-- Tab panes -->
			<div id="myTabContent" class="tab-content" >
				<div class="tab-pane fade in active" id="self"><br>
					<label class="text-r">待诊患者</label>
					<%--<div class="table-responsive" style="height: 260px">--%>
						<table id="doc-table2" class="table table-responsive table-hover">
							<thead>
							<tr class="text-c">
								<th>病历号</th>
								<th>姓名</th>
								<th>年龄</th>
							</tr>
							</thead>
							<tbody>
							</tbody>
						</table>
					<%--</div>--%>
					<br>
					<label class="text-r">已诊患者</label>
					<%--<div class="table-responsive" style="height: 260px">--%>
						<table id="doc-table1" class="table table-responsive table-hover">
							<thead>
							<tr class="text-c">
								<th>病历号</th>
								<th>姓名</th>
								<th>年龄</th>
							</tr>
							</thead>
							<tbody>
							</tbody>
						</table>
					<%--</div>--%>
				</div>
				<div class="tab-pane fade" id="dept"><br>
					<label class="text-r">待诊患者</label>
					<div class="table-responsive" style="height: 260px">
						<table id="dept-table2" class="table" style="height: 240px">
							<thead>
							<tr class="text-c">
								<th>病历号</th>
								<th>姓名</th>
								<th>年龄</th>
							</tr>
							</thead>
							<tbody>

							</tbody>
						</table>
					</div>
					<br>
					<label class="text-r">已诊患者</label>
					<div class="table-responsive">
						<table id="dept-table1" class="table-responsive" style="height: 240px">
							<thead>
							<tr class="text-c">
								<th>病历号</th>
								<th>姓名</th>
								<th>年龄</th>
							</tr>
							</thead>
							<tbody>


							</tbody>
						</table>
					</div>
				</div>
			</div>
		</td>
		<td style="width: 75%">
			<div >
				<div class="row cl">
					<div class="col-xs-1  col-sm-2">
						<button id="btn-hidden" value="false" class="btn btn-primary btn-sm radius">隐藏患者栏</button>
					</div>
					<label id="label-info" class="col-xs-1 col-sm-5"></label>
				</div><br>
				<%--<form  id="form-article-add">--%>
					<div>
						<ul id="sbTab" class="nav nav-tabs">
							<li role="presentation" class="active"><a href="#mediRecord" data-toggle="tab">病历首页</a></li>
							<li><a href="#mDrug" data-toggle="tab">成药处方<span class="c-red">*</span></a></li>
							<li role="presentation"><a href="#myCheck" data-toggle="tab">检查申请</a></li>
							<li><a href="#myExam" data-toggle="tab">检验申请</a></li>
							<li><a href="#myConfirm" data-toggle="tab">门诊确诊<span class="c-red">*</span></a></li>
							<li><a href="#manage" data-toggle="tab">处置申请<span class="c-red">*</span></a></li>
							<li><a href="#cDrug" data-toggle="tab">草药处方<span class="c-red">*</span></a></li>
							<li><a href="#feeFind" data-toggle="tab">费用查询<span class="c-red">*</span></a></li>
						</ul>
						<!-- Tab panes -->
						<div id="sbTabContent" class="tab-content">
							<div role="tabpanel" class="tab-pane fade in active" id="mediRecord"><br>
								<div class="row cl">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
									<button type="button" class="btn btn-primary" id="saveInfo"><i class="icon Hui-iconfont">&#xe60c;</i> 暂存</button>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
									<button type="button" class="btn btn-success" id="submitInfo"><i class="icon Hui-iconfont">&#xe6e1;</i> 提交</button>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
									<button type="button" class="btn btn-warning" id="clearInfo"><i class="icon Hui-iconfont">&#xe609;</i> 清空所有</button>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
									<button type="button" class="btn btn-primary" id="flushThis"><i class="icon Hui-iconfont">&#xe68f;</i> 刷新</button>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
								</div><br>
								<label class="control-label" style="color: #2aabd2">病史内容：</label><br>
								<form action="" method="post" class="form form-horizontal" id="form-medi-add">
									<div class="row cl">
										<label class="form-label col-xs-1 col-sm-1" style="text-align: right">主诉</label>
										<textarea class="form-control" id="complaints" name="complaints" style="width: 80%" rows="1" required="required"></textarea>
									</div><br>
									<div class="row cl">
										<label class="form-label col-xs-1 col-sm-1" style="text-align: right">现病史</label>
										<textarea class="form-control" id="curmedHis" name="curmedHis" style="width: 80%" rows="1"></textarea>
									</div><br>
									<%--<div class="row cl">
										<label class="form-label col-xs-1 col-sm-1" style="text-align: right">现病治疗情况</label>
										<textarea class="form-control" id="complaints" name="complaints" style="width: 80%" rows="2"></textarea>
									</div><br>--%>
									<div class="row cl">
										<label class="form-label col-xs-1 col-sm-1" style="text-align: right">既往史</label>
										<textarea class="form-control" id="pasHis" name="pasHis" style="width: 80%" rows="2"></textarea>
									</div><br>
									<div class="row cl">
										<label class="form-label col-xs-1 col-sm-1" style="text-align: right">过敏史</label>
										<textarea class="form-control" id="allergyHis" name="allergyHis" style="width: 80%" rows="2"></textarea>
									</div><br>
									<div class="row cl">
										<label class="form-label col-xs-1 col-sm-1" style="text-align: right">体格检查</label>
										<textarea class="form-control" id="phyExam" name="phyExam" style="width: 80%" rows="2"></textarea>
									</div><br>
								</form>
								<label class="control-label" style="color: #2aabd2">评估\诊断：</label><br>
								<div class="panel panel-default" style="width: 84%;margin: auto">
									<div class="panel-heading" style="font-size: 1.3em">西医诊断
										<button type="button" class="btn-link" id="delDise" style="margin-left: 80%;font-size: 1em">删除</button>
										<button type="button" class="btn-link" id="addDise" style="font-size: 1em">添加</button>
									</div>

									<table class="table" id="dise-m-table">
										<thead>
										<tr class="text-l">
											<th width="8%" class="text-c"><input type="checkbox"></th>
											<th width="8%">ICD编码</th>
											<th width="40%">名称</th>
											<th width="18%">发病时间</th>
										</tr>
										</thead>
										<tbody>
										</tbody>
									</table>
								</div>
							</div>
							<div role="tabpanel" class="tab-pane fade" id="mDrug"><br>
                                <mark>病史内容：</mark><label id="label-medi" class="control-label" style="color: #2aabd2"> </label><br>
                                <div class="row cl">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <button type="button" class="btn btn-primary" id="addPres"> 增方</button>&emsp;&emsp;
                                    <button type="button" class="btn btn-success" id="delPres">删方</button>&emsp;&emsp;
                                    <button type="button" class="btn btn-warning" id="openPres">开立</button>&emsp;&emsp;
                                    <button type="button" class="btn btn-primary" id="cancelPres">作废</button>&emsp;&emsp;
                                    <button type="button" class="btn btn-primary" id="refresh"> 刷新</button>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                                    <button type="button" class="btn btn-primary" id="addDrug"> 増药</button>&emsp;
                                    <button type="button" class="btn btn-primary" id="delDrug"> 删药</button>&emsp;
                                </div><br>
                                <div class="row cl">
                                    <table>
                                        <tr>
                                            <td>
                                                <div class="panel panel-default" style="margin-left: 2%">
                                                    <div class="panel-heading" style="font-size: 1.3em">门诊处方</div>
                                                    <table class="table-hover" id="presTable">
                                                        <thead>
                                                        <tr>
                                                            <th></th>
                                                            <th>名称</th>
                                                            <th>状态</th>
                                                        </tr>
                                                        </thead>
                                                        <tbody>
                                                        <%--<tr>
                                                            <td><input type="checkbox"></td>
                                                            <td>支气管哮喘</td>
                                                            <td>暂存</td>
                                                        </tr>--%>
                                                        </tbody>
                                                    </table>


                                                </div>
                                            </td>
                                            <td>
                                                <div class="panel panel-default" style="margin-right: 2%">
                                                    <div class="panel-heading" style="font-size: 1.3em">处方明细</div>
                                                    <table class="table-hover"  id="prescriptionTable">
                                                        <thead>
                                                        <tr>
                                                            <th><input type="checkbox"></th>
                                                            <th>药品名称</th>
                                                            <th>规格</th>
                                                            <th>单价</th>
                                                            <th>用法</th>
                                                            <th>用量</th>
                                                            <th>频次</th>
                                                            <th>数量</th>
                                                        </tr>
                                                        </thead>
                                                        <tbody>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="row cl">
                                    <div>
                                        <ul id="presTab" class="nav nav-tabs">
                                            <li class="active"><a href="#prescription" data-toggle="tab">处方模板</a></li>
                                            <li><a href="#" data-toggle="tab">常用药品<span class="c-red">*</span></a></li>
                                            <li><a href="#" data-toggle="tab">建议方案<span class="c-red">*</span></a></li>
                                            <li><a href="#" data-toggle="tab">历史处方<span class="c-red">*</span></a></li>
                                        </ul>
                                        <div id="presTabContent" class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade in active" id="prescription">
                                                <table class="table">
                                                    <tr>
                                                        <td width="32%">
                                                            <div class="panel panel-default" style="margin-right: 2%">
                                                                <div class="pull-right" style="width: 100%;margin-top: 2%">
                                                                    <strong>名称：</strong><input class="input-text radius" id="prescripName" style="width: 70%" >
                                                                    <div class="btn-group">
                                                                        <button type="button" class="btn btn-primary radius" id="searchModel"><i class="icon Hui-iconfont">&#xe709;</i></button>
                                                                    </div>
                                                                </div >
                                                                <table class="table-hover" id="presModel">
                                                                    <thead>
                                                                    <tr>
                                                                        <th width="70%">模板名称</th>
                                                                        <th>使用范围</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </td>
                                                        <td>
                                                            <div class="panel panel-default" style="margin-right: 2%">
                                                                <div class="panel-heading" style="font-size: 1.3em">模板明细
                                                                    <button type="button" class="btn-link" id="useModel" style="font-size: 1em;float: right">使用该模板</button>
                                                                </div>
                                                                <table class="table-hover" id="presModeldetail">
                                                                    <thead>
                                                                    <tr>
                                                                        <%--<th><input type="checkbox"></th>--%>
                                                                        <th>药品名称</th>
                                                                        <th>规格</th>
                                                                        <th>单位</th>
                                                                        <th>用法</th>
                                                                        <th>用量</th>
                                                                        <th>频次</th>
                                                                    </tr>
                                                                    </thead>
                                                                    <tbody>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>

							</div>
                            <%--<div role="tabpanel" class="tab-pane fade" id="myCheck">

							</div>
							<div class="tab-pane fade" id="myExam">

							</div>
							<div class="tab-pane fade" id="myConfirm">

							</div>
							<div class="tab-pane fade" id="manage">

							</div>
							<div class="tab-pane fade" id="cDrug">
							</div>
							<div class="tab-pane fade" id="feeFind">

							</div>--%>

						</div>
					</div>
				<%--</form>--%>
			</div>
		</td>
	</tr>
</table>
	<input type="text" value="" id="prescriptionID" hidden>
</div>
<!--_footer 作为公共模版分离出去-->
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
<!--/_footer 作为公共模版分离出去-->
<script type="text/javascript">
/*	$(function () {
		$("#myTab a:first").tab('show');
	});*/
	$('#sbTab a').click(function (e) {
		e.preventDefault();
		$(this).tab('show')
	});
</script>
<script type="text/javascript">
	var info = '';//患者信息栏的信息
	var registId = 0; //医生选择的患者的挂号ID
	var mediNum = 0; //医生选择的患者的病历号

	$(function () {
		//查询患者
		ajax_queryDocPatient();
		var prescripName = $("#prescripName").val();
		searchPresModel(prescripName);
	});

	/*为动态创建的表中每一行绑定单击事件，获取该行的数据*/
	$(document).on("click",".Nvisit",function () {
		var td = $(this).find("td");
		var medRecnum = td.eq(0).html();
		var patName = td.eq(1).html();
		var age = td.eq(2).html();
		registId = td.eq(4).html();//获取被选择的患者挂号ID
		if (td.eq(3).html() == 71){
			var gender = "男";
		}else if (td.eq(3).html() == 72){
			var gender = "女";
		}

		info = "病历号："+medRecnum+"  姓名："+patName+"  年龄："+age+"  性别："+gender;
		mediNum = medRecnum;
		//先清空
		$("#label-info").html('');
		$("#label-info").html(info);
	});

	/*添加西医诊断*/
	$("#addDise").click(function () {
		$("#addBox").modal({
			backdrop: 'static'
		});
        $("#diseName").val('');
        $("#diseaseIcd").val('');
        $("#diseDate").val('');
	});

	/*隐藏或显示患者栏*/
	$("#btn-hidden").click(function () {
		if ($("#btn-hidden").html()=="显示患者栏"){
			$("#btn-hidden").html("");
			$("#btn-hidden").html("隐藏患者栏");
		}else if($("#btn-hidden").html()=="隐藏患者栏"){
			$("#btn-hidden").html("");
			$("#btn-hidden").html("显示患者栏");
		}
		$("#pati-la").toggle();
	});

    /*根据疾病名称查询ICD编码*/
	$("#searchDisease").click(function () {
		var word = $("#diseName").val();
		console.log(word);
		if (word !== ''){
            searchDiseaseName(word);
        }else {
		    alert("请输入疾病名称");
        }

	});

	/*添加疾病到西医诊断中*/
    $("#confirmAdd").click(function () {
        var checkBoxTd = $("<td id='checkBoxTd'  class=\"text-c\" width='8%'></td>").append($("<input type=\"checkbox\" name='dise-c-info'>"));
        var diseaseIcdTd = $("<td id='diseaseIcdTd' name='diseaseIcdTd' width='8%'></td>").append($("#diseaseIcd").val());
        var diseaseNameTd = $("<td id='diseaseNameTd' name='diseaseNameTd' width='40%'></td>").append($("#diseName").val());
        var diseaseDateTd = $("<td id='diseaseDateTd' name='diseaseDateTd' width='18%'></td>").append($("#diseDate").val());
        var diseIDTd = $("<td id='diseIDTd' name='diseIDTd' hidden></td>").append($("#diseID").val());
        $("<tr></tr>").append(checkBoxTd).append(diseaseIcdTd).append(diseaseNameTd)
            .append(diseaseDateTd).append(diseIDTd).appendTo("#dise-m-table tbody");
        $("#addBox").modal('hide');
    });

    /*删除西医诊断*/
    $("#delDise").click(function () {
       var checkedBoxs = $("#dise-m-table tbody").find('input:checked');
       if (checkedBoxs.length == 0){
           alert("请至少选择一项要删除的西医诊断");
       }else {
          $("input[name='dise-c-info']:checked").each(function () {
              index = $(this).parents("tr").index();  // 获取checkbox所在行的顺序
              $("table#dise-m-table tbody").find("tr:eq("+index+")").remove();
          })
       }

    });

    /*判断医生是否选择了待诊患者*/
	$("#mediRecord").click(function () {
		if (registId == 0 || mediNum == 0){
			alert("请选择待诊患者！");
		}
	});

	/*暂存患者病历信息*/
	$("#saveInfo").click(function () {

	});

	/*保存患者病历信息*/
	$("#submitInfo").click(function () {
		if ($("#dise-m-table tbody").children().size() === 0){
			alert("请添加西医诊断");
		}else if ($("#complaints").val() === ''){
			alert("请填写病历信息")
		}else {
			var rows = $("#dise-m-table tbody").children();
			//提交西医诊断
			$(rows).each(function () {
				var diseaseName = $(this).find("[name='diseaseNameTd']").html();
				var diseID = $(this).find("[name='diseIDTd']").html();
				var diseaseDate = $(this).find("[name='diseaseDateTd']").html();
				var diaMedinum = mediNum;
				var diaRegid = registId;
				var data = {"diseaseName":diseaseName,"diseID":diseID,"diseaseDate":diseaseDate,"diaMedinum":diaMedinum,"diaRegid":diaRegid};
				submitDia(data);
			});
			submitMedi();
			changeRstate();
			changePstate();
			ajax_queryDocPatient();
			$("#label-medi").html('');
			$("#label-medi").html($("#complaints").val());
            var items = $("#form-medi-add").find("textarea");
            $(items).each(function () {
                $(this).val('');
            })
            alert("提交成功");
		}
	});

	/*清空所有患者病历信息*/
	$("#clearInfo").click(function () {
		var items = $("#form-medi-add").find("textarea");
		$(items).each(function () {
			$(this).val('');
		})
        $("#dise-m-table tbody").empty();
	});

	/*刷新当前*/
	$("#flushThis").click(function () {

	});




	/*增加处方*/
	$("#addPres").click(function () {
		$("#addPresModal").modal({
			backdrop: 'static'
		});
	});
	$("#confirmAddPres").click(function () {
		var checkBoxTd = $("<td></td>").append($("<input type=\"checkbox\" name='prescriptionName'>"));
		var presNameTd = $("<td></td>").append($("#presName").val());
		var stateTd = $("<td></td>").append("暂存");
		$("<tr></tr>").addClass("thisPres").append(checkBoxTd).append(presNameTd).append(stateTd).appendTo("#presTable tbody");
		queryPresID();
		$("#addPresModal").modal('hide');
	});

	/*删除处方*/
	$("#delPres").click(function () {
		var checkedBoxs = $("#presTable tbody").find('input:checked');
		if (checkedBoxs.length == 0){
			alert("请选择处方");
		}else {
			$("input[name='prescriptionName']:checked").each(function () {
				// 获取checkbox所在行的顺序
				index = $(this).parents("tr").index();
				$("table#presTable tbody").find("tr:eq("+index+")").remove();
			});
		}
	});

	/*点击查询，搜索处方模板*/
	$("#searchModel").click(function () {
		var prescripName = $("#prescripName").val();
		searchPresModel(prescripName);
	});

	/*点击模板表中模板名，显示模板明细*/
	var modelDetail = 0;
	$(document).on("click",".model",function () {
		var td = $(this).find("td");
		var prescripModid = td.eq(2).html();
		// console.log(prescripModid);
		var data = {"prescripModid":prescripModid};
		$.ajax({
			url:"${ctx}/presModDetail/searchmoddetail",
			type:'POST',
			async:false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(data),
			dataType:'json',
			success:function (result) {
				$("#presModeldetail tbody").empty();
				modelDetail = result.extend.presModelDetailList;
				console.log(modelDetail);
				$.each(modelDetail,function (index, item) {
					var drugNameTd = $("<td></td>").append(item.drugs.drugName);
					var drugFormatTd = $("<td></td>").append(item.drugs.drugFormat);
					var drugUnitTd = $("<td></td>").append(item.drugs.drugUnit);
					var usageTd = $("<td></td>").append(item.usage);
					var dosageTd = $("<td></td>").append(item.dosage);
					var frequencyTd = $("<td></td>").append(item.frequency);
					var drugPriceTd = $("<td hidden></td>").append(item.drugs.drugPrice);
					var numberTd = $("<td hidden></td>").append(item.number);
					var drugIdTd = $("<td hidden></td>").append(item.drugs.drugId);

					$("<tr></tr>").addClass("modDet").append(drugNameTd).append(drugFormatTd)
							.append(drugUnitTd).append(usageTd).append(dosageTd).append(frequencyTd)
							.append(drugPriceTd).append(numberTd).append(drugIdTd).appendTo("#presModeldetail tbody");
				})
			}
		})
	});

	/*将模板添加到处方中*/
	$("#useModel").click(function () {
		if (modelDetail != 0){
			// $("#prescriptionTable tbody").empty();
			$.each(modelDetail,function (index, item) {
				var chackBoxTd = $("<td></td>").append($("<input type=\"checkbox\" name='prescrip'>"));
				var drugNameTd = $("<td name='drugNameTd'></td>").append(item.drugs.drugName);
				var drugFormatTd = $("<td name='drugFormatTd'></td>").append(item.drugs.drugFormat);
				var drugUnitTd = $("<td name='drugUnitTd'></td>").append(item.drugs.drugUnit);
				var usageTd = $("<td name='usageTd'></td>").append(item.usage);
				var dosageTd = $("<td name='dosageTd'></td>").append(item.dosage);
				var frequencyTd = $("<td name='frequencyTd'></td>").append(item.frequency);
				var drugPriceTd = $("<td name='drugPriceTd'></td>").append(item.drugs.drugPrice);
				var numberTd = $("<td name='numberTd'></td>").append(item.number);
				var drugIdTd = $("<td hidden name='drugidTd'></td>").append(item.drugs.drugId);
				$("<tr></tr>").addClass("prescription").append(chackBoxTd).append(drugNameTd).append(drugFormatTd)
						.append(drugPriceTd).append(usageTd).append(dosageTd).append(frequencyTd)
						.append(numberTd).append(drugIdTd).appendTo("#prescriptionTable tbody");
			})
		}
	});

	/*向处方中添加药品*/
	$("#addDrug").click(function () {
/*		if ($("#presTable tbody").find()){
			alert("请先添加处方");
		}else {*/
			$("#addDrugsToPres").modal({
				backdrop: 'static'
			});
		// }
	});

	/*模糊查询药品信息并显示在下拉列表中*/
	$("#searchDrugs").click(function () {
		var t_drugName = $("#drugsName").val();
		// if (t_drugName != null && t_drugName != ''){
		var data = {"drugName":t_drugName};
		$.ajax({
			url:"${ctx}/drug/searchDrugname",
			type:'POST',
			async:false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(data),
			dataType:'json',
			success:function (result) {
				var obj = result.extend.drugsList;
				console.log(obj);
				$("#sel_drugName").empty();
				$("#sel_drugName").append('<option value="' + '">' + "请选择" + '</option>');
				$.each(obj,function (index, item) {
					$("#sel_drugName").append('<option value="' + item.drugId + '">' + item.drugName + '</option>');
				})
			}
		})
	});

	/*根据用户选择的药品名称，查询对应的药品信息*/
	$("#sel_drugName").change(function () {
		var data = {"drugId":$("#sel_drugName").val()};
		$.ajax({
			url:"${ctx}/drug/querydruginfo",
			type:"POST",
			async:false,
			contentType: 'application/json;charset=utf-8',
			dataType :'json',
			data:JSON.stringify(data),
			success:function(result){
				$("#drugsName").val(result.extend.drug.drugName);
				$("#drugFormat").val(result.extend.drug.drugFormat);
				$("#drugPrice").val(result.extend.drug.drugPrice);
				$("#drugId").val(result.extend.drug.drugId);
			}
		});
	});

	/*确认添加药品信息*/
	$("#confirmAddDrugs").click(function () {
		var chackBoxTd = $("<td></td>").append($("<input type=\"checkbox\" name='prescrip'>"));
		var drugNameTd = $("<td name='drugNameTd'></td>").append($("#drugsName").val());
		var drugFormatTd = $("<td name='drugFormatTd'></td>").append($("#drugFormat").val());
		var drugPriceTd = $("<td name='drugPriceTd'></td>").append($("#drugPrice").val());
		var usageTd = $("<td name='usageTd'></td>").append($("#drugUsage").val());
		var dosageTd = $("<td name='dosageTd'></td>").append($("#drugDosage").val());
		var frequencyTd = $("<td name='frequencyTd'></td>").append($("#drugFrequency").val());
		var numberTd = $("<td name='numberTd'></td>").append($("#drugNum").val());
		var drugIdTd = $("<td name='drugidTd' hidden></td>").append($("#drugId").val());
		$("<tr></tr>").addClass("prescription").append(chackBoxTd).append(drugNameTd).append(drugFormatTd)
				.append(drugPriceTd).append(usageTd).append(dosageTd).append(frequencyTd)
				.append(numberTd).appendTo("#prescriptionTable tbody");
		$("#addDrugsToPres").modal('hide');
	});

	/*删除处方中药品*/
	$("#delDrug").click(function () {
		var checkedBoxs = $("#prescriptionTable tbody").find('input:checked');
		if (checkedBoxs.length == 0){
			alert("请从处方中至少选择一项要删除的药品");
		}else {
			$("input[name='prescrip']:checked").each(function () {
				// 获取checkbox所在行的顺序
				index = $(this).parents("tr").index();
				$("table#prescriptionTable tbody").find("tr:eq("+index+")").remove();
			});
		}
	});


	/*处方开立，提交表单信息*/
	$("#openPres").click(function () {
		addTopres();
		addTopresDet();
        $("#prescriptionTable tbody").empty();
        $("#presTable tbody").empty();
        alert("开立成功");
	});

/*查询患者*/
function ajax_queryDocPatient() {
	$.ajax({
		url:"${ctx}/patreg/querydocpatient",
		type:'POST',
		async:false,
		contentType: 'application/json;charset=utf-8',
		dataType:'json',
		success:function (result) {
			build_docTable1(result);
		}
	})
}

/*查询科室的待诊患者和已诊患者*/
function ajax_queryDepPatient() {
	$.ajax({
		url:"${ctx}/patreg/querydeppatient",
		type:'POST',
		async:false,
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		success:function (result) {
			build_docTable2(result);
		}
	})
}

/*构建医生的待诊患者与已诊患者表*/
function build_docTable1(result) {
	//先清空表格
	$("#doc-table1 tbody").empty();
	$("#doc-table2 tbody").empty();
	var obj = result.extend.docPatients;
	build_table(obj);
}

/*构建医生的待诊患者与已诊患者表*/
function build_docTable2(result) {
	//先清空表格
	$("#dept-table1 tbody").empty();
	$("#dept-table2 tbody").empty();
	var obj = result.extend.docPatients;
	build_table(obj);
}

/*创建表格*/
function build_table(obj) {
/*    console.log(obj);
    if (obj.length===0){
        var infoTd = $("<td class=\"text-c\"></td>").append('暂无数据');
        $("<tr></tr>").addClass("mytr").append(infoTd).appendTo("#doc-table1 tbody");
        $("<tr></tr>").addClass("mytr").append(infoTd).appendTo("#doc-table2 tbody");
    }else{*/
        $.each(obj,function (index, item) {
            var medRecnumTd = $("<td id='pMedrecnumtd' class=\"text-c\"></td>").append(item.patient.pMedrecnum);
            var patNameTd = $("<td class=\"text-c\"></td>").append(item.patient.patName);
            var genderTd = $("<td class=\"text-c\" hidden></td>").append(item.patient.gender);
            var registIdTd = $("<td class=\"text-c\" hidden></td>").append(item.regist.registId);

            var ageTd = $("<td id='agetd' class=\"text-c\"></td>").append(item.patient.age).append(item.patient.ageType);
            if (item.prRegstate === 2 ){
                $("<tr></tr>").addClass("mytr").append(medRecnumTd).append(patNameTd).append(ageTd).append(genderTd).append(registIdTd).appendTo("#doc-table1 tbody");
            }else if (item.prRegstate === 1){
                $("<tr></tr>").addClass("Nvisit").append(medRecnumTd).append(patNameTd).append(ageTd).append(genderTd).append(registIdTd).appendTo("#doc-table2 tbody");
            }
        })
    /*}*/

}

/*刷新页面*/
function flush() {
	ajax_queryDocPatient();
}

/*查询疾病信息*/
function searchDiseaseName(obj){
    var data = {"diseaseName":obj};
    // console.log(data);
    $.ajax({
        url:"${ctx}/dise/searchDise",
        type:'POST',
        async:false,
        data:JSON.stringify(data),
        contentType: 'application/json;charset=utf-8',
        dataType :'json',
        success:function (result) {
            // console.log(result);
            $.each(result,function (index, item) {
                $("#diseaseIcd").val(item.diseaseIcd);
                $("#diseID").val(item.id);
            });

        }
    });


}

/*提交病历内容*/
function submitMedi() {
	var complaints = $("#complaints").val();
	var curmedHis = $("#curmedHis").val();
	var pasHis = $("#pasHis").val();
	var allergyHis = $("#allergyHis").val();
	var phyExam = $("#phyExam").val();
	var data = {"medRecnum":mediNum,"complaints":complaints,"curmedHis":curmedHis,"pasHis":pasHis,"allergyHis":allergyHis,"phyExam":phyExam};
	$.ajax({
		url:"${ctx}/medi/submitinfo",
		type:'POST',
		async:false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(data),
		dataType :'json',
		success:function (result) {

		}
	})
}
/*提交西医诊断*/
function submitDia(data) {
	$.ajax({
		url:"${ctx}/diag/submitdia",
		type:'POST',
		async:false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(data),
		dataType :'json',
		success:function (result) {

		}
	})
}
/*更该就诊状态*/
function changeRstate() {
	var data = {"registId":registId,"visitState":2};
	$.ajax({
		url:"${ctx}/regist/changeRstate",
		type:'POST',
		async:false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(data),
		dataType :'json',
		success:function (result) {

		}
	})
}
function changePstate() {
	var data = {"prRegid":registId};
	$.ajax({
		url:"${ctx}/patreg/changePstate",
		type:'POST',
		async:false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(data),
		dataType :'json',
		success:function (result) {

		}
	})
}


/*查询处方模板*/
function searchPresModel(name) {
	var data = {"prescripName":name};
	console.log(data);
	$.ajax({
		url:"${ctx}/presmodel/searchpresmodel",
		type:'POST',
		async:false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(data),
		dataType:'json',
		success:function (result) {
			$("#presModel tbody").empty();
			var obj = result.extend.presModelList;
			$.each(obj,function (index, item) {
				var prescripNameTd = $("<td></td>").append(item.prescripName);
				var prescripModidTd = $("<td hidden></td>").append(item.prescripModid);
				var usageRange;
				if (item.usageRange === 1){
					usageRange = "个人";
				}else if (item.usageRange === 2){
					usageRange = "科室";
				}else if (item.usageRange === 3){
					usageRange = "全院";
				}
				var usageRangeTd = $("<td class=\"text-c\"></td>").append(usageRange);
				$("<tr></tr>").addClass("model").append(prescripNameTd).append(usageRangeTd).append(prescripModidTd).appendTo("#presModel tbody");
			})
		}
	})
}
/*查询处方ID*/
function queryPresID() {
	$.ajax({
		url:"${ctx}/prescrip/querypresID",
		async:false,
		type:"GET",
		success:function(result){
			$("#prescriptionID").val(result);
		}
	});
}
/*保存患者处方*/
function addTopres() {
	var presID = $("#prescriptionID").val();
	var rows = $("#presTable tbody").children();
	var data;
	$(rows).each(function () {
		var presName = $(this).find("[name='presName']").html();
		data = {"prescriptionId":presID,"pRegid":registId,"prescripName":presName,"openDocid":'',"openTime":'',"prescripState":1};
	});
	$.ajax({
		url:"${ctx}/prescrip/addtopres",
		type:'POST',
		async:false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		success:function (result) {

		}
	})
}

/*保存患者处方明细*/
function addTopresDet() {
	var presID = $("#prescriptionID").val();
	var rows = $("#prescriptionTable tbody").children();
	var data;
	$(rows).each(function () {
		var drugid = $(this).find("[name='drugidTd']").html();
		var drugNum = $(this).find("[name='numberTd']").html();
		var usage = $(this).find("[name='usageTd']").html();
		var dosage = $(this).find("[name='dosageTd']").html();
		var frequency = $(this).find("[name='frequencyTd']").html();
		data = {"prescriptionId":presID,"drugid":drugid,"drugNum":drugNum,"usage":usage,"dosage":dosage,"frequency":frequency};
		addtodet(data);
	});
}
function addtodet(data) {
	$.ajax({
		url:"${ctx}/presDet/addtopreDet",
		type:'POST',
		async:false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		dataType :'json',
		success:function (result) {

		}
	})
}
/*保存患者处方明细*/
</script>
</body>
</html>
