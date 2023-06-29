package com.jihwan.huchamjal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pass = req.getParameter("password");
        String tel = req.getParameter("tel");
        String addr = req.getParameter("addr");

        System.out.println("암호화된 비밀번호"+pass);
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        session.setAttribute("name", name);
        session.setAttribute("pass", pass);
        session.setAttribute("tel", tel);
        session.setAttribute("addr", addr);

        resp.sendRedirect("order");

    }
}
