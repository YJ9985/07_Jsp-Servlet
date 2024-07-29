<%@ page import="java.rmi.RemoteException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
// 에러가 발생하면 내가 지정한 페이지로 이동할 것을 지정하는 명령어
<%@ page errorPage="error.jsp" %>
<%
    //에러 발생시키기
    throw new RuntimeException("테스트 예외 발생");

%>