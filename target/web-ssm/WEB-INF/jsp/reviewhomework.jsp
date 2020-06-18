
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../../statics/css/layui.css">
<link rel="stylesheet" href="../../statics/css/board.css">
<script src="../../statics/layui.js"></script><html>
<head>
    <title>审批作业</title>
</head>
<body>
<%@include file="header.jsp"%>
<div class="layui-container" style="height: 800px;">

    <div style="height: 50px"></div>
    <div class="chunk">
        <table summary="">
            <tbody><tr>
                <th width="100">学生ID</th>
                <th width="100" class="main-post">作业ID</th>
                <th width="200" class="main-post">作业题目</th>
                <th width="400" class="main-post">作业内容</th>
            </tr>

            <c:forEach items="${studentHomeworkList}" var="sh">
                <tr>
                    <td class="s_id"><var>${sh.studentId}</var></td>
                    <td class="h_id"><var>${sh.homeworkId}</var></td>
                    <td class="h_title"><var>${sh.homeworkTitle}</var></td>
                    <td class="h_content"><var>${sh.homeworkContent}</var></td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
    </div>

</div>

<%@include file="footer.jsp"%>
</body>
</html>
