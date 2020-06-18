
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" href="../../statics/css/layui.css">
<!-- 引入 Bootstrap -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- 包括所有已编译的插件 -->
<script src="../../statics/js/bootstrap.min.js"></script>
<script src="../../statics/layui.js"></script>
<html>
<head>
    <title>学生界面</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="layui-container">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
        <legend>
            <span class="layui-badge">欢迎同学，请选择你要的服务</span></legend>
    </fieldset>

    <div style="height: 20px"></div>
    <div class="layui-row layui-col-space10" style="height: 1200px">
        <div class="layui-col-md9">
            <div class="grid-demo grid-demo-bg1">
                <fieldset class="layui-elem-field" style="height: 540px;">
                    <legend>
                        <a href="/submithomerwork">提交作业</a><br/>
                        <a href="/homework">查看作业</a><br/>
                        <a href="/reviewhomework">查看提交作业</a><br/>
                        <a href="/updatehomework">更新作业</a><br/>
                    </legend>
                </fieldset>
            </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
<script>

</script>
</html>
