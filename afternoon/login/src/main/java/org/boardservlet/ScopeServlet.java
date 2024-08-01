package org.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/scope")
public class ScopeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("request","리퀘스트 스코프에 저장한 데이터");

        //Session Scope
        HttpSession session = request.getSession();
        session.setAttribute("session", "세션 스코프에 저장한 데이터");

        //Application Scope
        ServletContext context = getServletContext();
        context.setAttribute("application", "어플리케이션 스코프에 저장한 데이터");

        //체이닝을 이요한 메서드 간결화
        request.getRequestDispatcher("scope.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}