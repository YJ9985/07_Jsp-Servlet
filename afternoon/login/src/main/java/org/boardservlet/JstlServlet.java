package org.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/jstl")
public class JstlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");

        request.setAttribute("list", list);
        request.setAttribute("condition", true);

        boolean isJstl = "true".equals(request.getParameter("jstl")) ? true:false;

        if (isJstl) {
            request.getRequestDispatcher("jstl.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("scriptlet.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}