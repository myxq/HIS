<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2019/9/15
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<link rel="stylesheet" href="${ctx}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="${ctx}/static/css/bootstrap-table.css">
<link rel="stylesheet" type="text/css" href="${ctx}/static/css/login.css"/>
<!--[if lte IE 9]>
<script type="text/javascript" src="/lib/html5shiv.js"></script>
<script type="text/javascript" src="/lib/respond.min.js"></script>
<![endif]-->
<script src="${ctx}/lib/jquery/1.9.1/jquery.min.js"></script>
<script src="${ctx}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${ctx}/static/bootstrap-3.3.7-dist/js/bootstrap-table.js"></script>
<script src="${ctx}/static/js/login.js"></script>
<link rel="shortcut icon" href="${ctx}/favicon.ico" >
<!--[if IE 6]>
<script type="text/javascript" src="/lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>东软云医院HIS管理平台</title>
</head>
<body>
<div id="myCarousel" class="carousel slide">
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
        <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>
    <div class="carousel-inner">
        <div class="item active" style="background:#496999">
            <img src="${ctx}/static/images/slide1.png" alt="第一张">
        </div>
        <div class="item" style="background:#63546e">
            <img src="${ctx}/static/images/slide2.png" alt="第二张">
        </div>
        <div class="item" style="background:#181969">
            <img src="${ctx}/static/images/slide3.png" alt="第三张">
        </div>
        <div class="item" style="background:#1f1f6e">
            <img src="${ctx}/static/images/slide4.png" alt="第四张">
        </div>
        <div class="item" style="background:#181259">
            <img src="${ctx}/static/images/slide5.png" alt="第五张">
        </div>
    </div>
    <a class="carousel-control left" href="#myCarousel"
       data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
    <a class="carousel-control right" href="#myCarousel"
       data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
</div>
<div class="tab1">
    <div class="container">
        <h1 class="tab-h2">东软云医院HIS管理平台</h1>
        <p class="tab-p">用心呵护您的健康！</p>
    </div>
</div>
<div class="tab1">
    <div class="container">
        <div class="row">
            <div class="col-md-8 col">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            通知
                        </h3>
                    </div>
                    <div class="panel-body">
                        <table id="tb_departments"></table>
                    </div>
                </div>
            </div>
            <div class="col-md-4 col">
                <section>
                    <h3>用户登录</h3>
                    <br>
                    <form id="login-box"  class="form-horizontal">
                        <div id="tip" style="color:red;"></div>
                        <div class="form-group">
                            <div class="col-md-3">
                                <label class="control-label" for="tiku">职&nbsp;&nbsp;&nbsp;&nbsp;务</label>
                            </div>
                            <div class="col-md-9">
                                <select name="userType" class="form-control" id="userType">
                                    <option value="3">医生</option>
                                    <option value="2">挂号收费员</option>
                                    <option value="1">医院管理员</option>
                                    <option value="0">超级管理员</option>
                                </select>
                            </div>
                        </div>
                        <br>
                        <div class="form-group">
                            <div class="col-md-3">
                                <label  class="control-label" for="username">用户名</label>
                            </div>
                            <div class="col-md-9">
                                <input type="text" name="username" class="form-control" id="username" placeholder="请输入用户名" required="required">
                            </div>
                        </div>
                        <br>
                        <div class="form-group">
                            <div class="col-md-3">
                                <label class="control-label" for="userpass">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
                            </div>
                            <div class="col-md-9">
                                <input type="password" name="password" class="form-control" id="password" placeholder="请输入密码" required="required">
                            </div>
                        </div>
                        <br>
                        <div class="form-group">
                            <div class="col-md-4 col-md-offset-4">
                                <input type="button" id="login" value="登录" class="btn btn-primary btn-block">
                            </div>
                        </div>
                    </form>
                </section>
            </div>
        </div>
    </div>
</div>
<footer id="footer">
    <div class="container">
        <div class="row">
            <div class="col-md-1 col"></div>
            <div class="col-md-6 col">
                <p>校址：辽宁省沈阳市和平区文化路三巷11号 | 邮编：110819 </p>
                <p>电子邮箱： 3208308785@qq.com  | 电话：********</p>
            </div>
            <div class="col-md-5 col">
                <p>关于我们 | 联系我们</p>
                <p>版权©.东北大学 版权所有.</p>
            </div>

        </div>
    </div>
</footer>

<script language="javascript">
    if(top.location!==self.location){
        top.location.href=self.location.href;
    }
</script>
<script type="text/javascript">
    $("#login").on("click",function () {
        var data = {"userType":$("#userType").val(),"username":$("#username").val(),"password":$("#password").val()};
        $.ajax({
            url:"${ctx}/login",
            type:"POST",
            data:JSON.stringify(data),
            contentType: 'application/json;charset=utf-8',
            cache:false,
            dataType:'json',
            success:function (result) {
                if (result.code == 1000){
                    window.location.href = "${ctx}/views/index.jsp?";
                }else if (result.code == 2000){
                    alert("登录失败！");
                }
            }
        })
    })
</script>
</body>
</html>
