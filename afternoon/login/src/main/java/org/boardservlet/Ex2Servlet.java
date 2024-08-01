package org.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ex2")
public class Ex2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("msg1", "럭키비키!");
        request.setAttribute("msg2", "내일은 럭키비키!");

        List<String> lunchList = new ArrayList<>();
        lunchList.add("소고기");
        lunchList.add("치킨");
        lunchList.add("와플");

        request.setAttribute("lunchList", lunchList);
        request.setAttribute("condition", true);

        boolean isCondition = "true".equals(request.getParameter("condition")) ? true : false;

        if (isCondition) {
            request.getRequestDispatcher("msg1").forward(request, response);
        } else {
            request.getRequestDispatcher("msg2").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}