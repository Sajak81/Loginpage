package org.personal.loginPage.controller;



import org.personal.loginPage.dao.LoginDao;
import org.personal.loginPage.dao.impl.LoginDaoImpl;
import org.personal.loginPage.modal.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name= "OutputController" , urlPatterns= {"/dashboard"})
public class OutputController extends HttpServlet {
    private final LoginDao loginDao = new LoginDaoImpl();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Login login = new Login();

        req.getRequestDispatcher("/output.jsp").forward(req,resp);
    }
}
