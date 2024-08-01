<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <h1>EL 문법의 scope 확인용 페이지</h1>

    <h2>Request Scope</h2>
    <p>${request}</p>
    <p><%= request.getAttribute("request")%></p>

    <h2>Session Scope</h2>
    <p>${session}</p>

    <h2>Application Scope</h2>
    <p>${application}</p>

    <h1>Page Scope</h1>
    <%
        pageContext.setAttribute("page", "this is JSP page Scope");
    %>
    <p>${page}</p>

</body>
</html>
