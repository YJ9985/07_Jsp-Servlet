<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>SCOPE CHECK</h1>

<h2>Request Scope</h2>
<p>${request}</p>

<h2>Session Scope</h2>
<p>${session =! null ? session : "없어요"}</p>

<h2>Application Scope</h2>
<p>${application =! null ? application : "아녀 원래 없어여"}</p>

<h2>Page Scope</h2>
<p>${page}</p>

</body>
</html>
