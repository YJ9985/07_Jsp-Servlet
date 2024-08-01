<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <h1>JSTL을 사용한 페이지</h1>

    <h2>조건 처리</h2>
    <c:if test="${condition}">
        <p>전달 받은 조건은 TRUE!</p>
    </c:if>
    <c:if test="${!condition}">
        <p>전달 받은 조건은 FALSE</p>
    </c:if>

    <h2>리스트 컬렉션 출력하기</h2>
    <ul>
        <c:forEach var="item" items="${list}">
            <li>${item}</li>
        </c:forEach>
    </ul>
</body>
</html>
