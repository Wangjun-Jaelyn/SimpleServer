package com.wangj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServerLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/plain; charset=utf-8");
        PrintWriter out = resp.getWriter();
//        out.println("<html><head><title>Login message</title></head>");
//        out.println("<body>");
        out.println("username: "+username);
        out.println(" password: "+password);
//        out.println("</body>");
//        out.println("</html>");
        out.flush();
    }
}
