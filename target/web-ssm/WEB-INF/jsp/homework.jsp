
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../../statics/css/layui.css">
<link rel="stylesheet" href="../../statics/css/board.css">
<script src="../../statics/layui.js"></script><html>
<head>
    <title>作业</title>
</head>
<body>
<%@include file="header.jsp"%>
<div class="layui-container" style="height: 800px;">

    <div style="height: 50px"></div>
    <div class="chunk">
        <table summary="">
            <tbody><tr>
                <th width="100">id</th>
                <th width="200" class="main-post">标题</th>
                <th width="500" class="main-post">内容</th>
            </tr>

            <c:forEach items="${homeworkList}" var="h">
                <tr>
                    <td class="id"><var>${h.id}</var></td>
                    <td class="title"><var>${h.homeworkTitle}</var></td>
                    <td class="content"><var>${h.homeworkContent}</var></td>

                </tr>
            </c:forEach>



            </tbody></table>
    </div>

</div>

<%@include file="footer.jsp"%>
</body>
</html>
