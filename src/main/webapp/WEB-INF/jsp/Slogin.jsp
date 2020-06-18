<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<link rel="stylesheet" href="../../statics/css/layui.css">
<script src="../../statics/layui.js"></script>

<html>
<head>
    <title>学生登录</title>
</head>
<body>
<%@include file="header.jsp" %>

<div style="width: 500px;height: 600px;margin: 0 auto;">
    <div style="width: 500px; height: 200px"></div>
    <label class="layui-form-label">学生登陆</label>
    <form class="layui-form" action="/SloginSuccess" method="post">
        <div class="layui-form-item">
            <label class="layui-form-label">ID:</label>
            <div class="layui-input-inline">
                <input type="text" name="username" id="username" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input">
            </div>
            <div id="checkUN" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户名:</label>
            <div class="layui-input-inline">
                <input type="text" name="password" id="password" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" id="submit" lay-submit lay-filter="formDemo">登录</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>
<%@include file="footer.jsp" %>
</body>
<script>
    layui.use(['form'], function(){
        var form = layui.form;
        form.on('submit(formDemo)', function(){
            return true;
        });
    });


</script>
</html>
