package com.controller;

import com.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServletController2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>\n" +
                "  <head>\n" +
                "    <title>second dynamic page)))</title>\n" +
                "  </head>\n" +
                "  <body>\n");
        writer.println("hello from servlet 2");
        writer.println("<input type=\"text\" value=\"\"/>");
        writer.println("  </body>\n" +
                "</html>");

    }
}
