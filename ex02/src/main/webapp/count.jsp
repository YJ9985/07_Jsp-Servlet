<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오전 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Count</title>
</head>
<body>
<h1>방문자수 설정하기 화면</h1>
<%! int count; %>
<%
    count++;
        application.setAttribute("countVale", count);
%>
현재 방문자수 : <%= count %>

</body>
</html>
