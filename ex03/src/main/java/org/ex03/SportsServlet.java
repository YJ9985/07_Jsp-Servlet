package org.ex03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SportsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String[] sports = request.getParameterValues("sports");
        String sex = request.getParameter("sex");

        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        for(String sport : sports) {
            out.println("좋아하는 운동: " + sport + "<br/>");
        }
        out.println("성별: " + sex + "<br/>");
        out.println("</body></html>");

    }
}