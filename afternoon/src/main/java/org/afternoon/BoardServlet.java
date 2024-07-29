package org.afternoon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("board.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String post = request.getParameter("post");
        RequestDispatcher dispatcher;

        if (post != null) {
            response.setContentType("text/html;charset=UTF-8");
            request.setAttribute("post", post);
            dispatcher = request.getRequestDispatcher("boardDetail.jsp");
        } else {
            dispatcher = request.getRequestDispatcher("board.jsp");
        }
        dispatcher.forward(request, response);

    }
}