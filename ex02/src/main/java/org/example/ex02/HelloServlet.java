package org.example.ex02;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "MyServlet", urlPatterns = {"/xxx", "/yyy"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet 요청");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello Servlet!</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 호출");
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("init 호출");
    }
}

