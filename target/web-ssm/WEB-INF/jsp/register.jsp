<%--
  Created by IntelliJ IDEA.
  User: Maxci
  Date: 2018/7/1
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../../statics/css/layui.css">
<script src="../../statics/layui.js"></script>
<html>
<head>
    <title>注册</title>
</head>
<body>
<%@include file="header.jsp" %>
<div style="width: 500px;height: 600px;margin: 0 auto;">
    <div style="width: 500px; height: 100px"></div>
    <form class="layui-form" action="/registerPro" method="post">
        <div class="layui-form-item">
            <label class="layui-form-label">注册
            </label>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">姓名:</label>

            <div class="layui-input-inline">
                <input type="text" id="username" name="username" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input">
            </div>
            <div id="confirm3" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">ID:
            </label>
            <div class="layui-input-inline">
                <input type="text" name="ID" id="ID" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input">
            </div>
            <div id="confirm1" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">职业：老师1，学生2
            </label>
            <div class="layui-input-inline">
                <input type="text" name="Occupation" id="Occupation" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input">
            </div>
            <div id="confirm2" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>

<%@include file="footer.jsp" %>
</body>
<script>
    layui.use(['jquery', 'layer'], function () {
        var $ = layui.$
            , layer = layui.layer;
        $('#username').blur(function () {
            var name = $('#username').val();
            if (name === "") {
                document.getElementById("confirm3").innerHTML = "请输入用户名";
                return;
            }

        });
    });
    //Demo
    layui.use('form', function () {
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function (data) {
            return true;
        });
    });
</script>
</html>
