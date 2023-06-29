package com.jihwan.huchamjal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/orderhucamjar")
public class OrderhucamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");

        String chicken = req.getParameter("chicken");
        String[] toppings = req.getParameterValues("topping");
        String review = req.getParameter("chicken");

        StringBuilder sb = new StringBuilder();
        for (String toppoig: toppings) {
            sb.append(toppoig);
        }
        SimpleDateFormat sip = new SimpleDateFormat("MM dd HH mm");
        Date orderDate = new Date();
        String orderTime = URLEncoder.encode(sip.format(orderDate),"UTF-8");

        Cookie timeCookie = new Cookie("orderTime",orderTime);

        timeCookie.setMaxAge(60*60*24);
        resp.addCookie(timeCookie);
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<!doctype html>");
        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");
        out.println("<h3>"+name+"님 주문내역\n");
        out.print("<br/>");
        out.println("주문메뉴 "+chicken+"\n 주문 토핑\n");
        out.print("<br/>");
        out.print(" "+sb);
        out.print("<br/>");
        out.println(" 리뷰 이벤트"+review+"</h3>\n");
        out.print("<br/>");
        out.print("</body>");
        out.print("</html>");

        out.flush();
        out.close();

    }
}
