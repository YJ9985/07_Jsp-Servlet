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
import java.util.Enumeration;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        Enumeration<String> enu = request.getParameterNames();

        while(enu.hasMoreElements()) {
            String name = enu.nextElement();
            String value = request.getParameter(name);
            out.print(name + " : " + value + "<br>");
        }
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request, response);

    }
}