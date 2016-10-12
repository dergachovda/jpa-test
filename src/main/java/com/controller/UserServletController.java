package com.controller;

import com.dao.UserDAO;
import com.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       req.setAttribute("name", "Nastya");
//        List<User> userList = new ArrayList<User>(Arrays.asList(new User("name1", 1), new User("name2", 2)));
        UserDAO userDAO = new UserDAO();
        req.setAttribute("userList", userDAO.getUserList());
        req.getRequestDispatcher("users.jsp").forward(req, resp);
    }
}
