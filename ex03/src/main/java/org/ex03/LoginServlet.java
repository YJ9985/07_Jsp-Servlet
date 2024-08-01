package org.ex03;

//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.annotation.WebServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userid = request.getParameter("userid");
        String passwd = request.getParameter("passwd");

        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("아이디값: " + userid + "<br>");
        out.println("비밀번호값: " + passwd + "<br>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request,response);

    }
}