
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../../statics/css/layui.css">
<script src="../../statics/layui.js"></script>
<html>
<head>
    <title>更改作业</title>
</head>
<body>
<%@include file="header.jsp" %>
<div style="width: 500px;height: 600px;margin: 0 auto;">
    <div style="width: 500px; height: 100px"></div>
    <form class="layui-form" action="/updateSucc" method="post">
        <div class="layui-form-item">
            <label class="layui-form-label">更改左右
            </label>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">学生ID:</label>

            <div class="layui-input-inline">
                <input type="text" id="s_id" name="s_id" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input"  charset=UTF-8>
            </div>
            <div id="confirm3" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">作业ID:</label>

            <div class="layui-input-inline">
                <input type="text" id="h_id" name="h_id" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input"  charset=UTF-8>
            </div>
            <div id="confirm2" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">作业标题:</label>

            <div class="layui-input-inline">
                <input type="text" id="title" name="title" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input">
            </div>
            <div id="confirm4" class="layui-form-mid layui-word-aux"></div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">作业内容:
            </label>
            <div class="layui-input-inline">
                <input type="text" name="content" id="content" required lay-verify="required" placeholder=""
                       autocomplete="off" class="layui-input">
            </div>
            <div id="confirm1" class="layui-form-mid layui-word-aux"></div>
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

    layui.use('form', function () {
        var form = layui.form;
        //监听提交
        form.on('submit(formDemo)', function (data) {
            return true;
        });
    });
</script>
</html>
