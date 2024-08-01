package org.ex04;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/cart_save")
public class CartSaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();

        String product = request.getParameter("product");

        HttpSession session = request.getSession();
        ArrayList<String> list = (ArrayList<String>) session.getAttribute("product");

        if (list == null) { 
            list = new ArrayList<String>();
            session.setAttribute("product", list);
        }
        list.add(product);

        out.print("<html><body>");
        out.print("Product 추가");
        out.print("<a href = 'session_product.jsp>상품 선택 페이지</a><br>");
        out.print("</body></html>");

    }
}