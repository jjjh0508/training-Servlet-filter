package com.jihwan.huchamjal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order")
public class orderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");
        String pass = (String) session.getAttribute("pass");
        String tel = (String) session.getAttribute("tel");
        String addr = (String) session.getAttribute("addr");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println(name+"님 환영합니다.\n");
        out.println("<a href=orderhucam>주문하기</a>");
        out.flush();
        out.close();
    }

}
