package edu.matc.controller;

import edu.matc.persistence.UserDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * A simple servlet to welcome the user.
 * @author khlarson
 */

@WebServlet(
        urlPatterns = {"/createUser"}
)

public class CreateUser extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();

        String userName = req.getParameter("userName");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String passwordConfirmed = req.getParameter("passwordConfirmed");

        if (password.equals(passwordConfirmed)) {
            user = new User(userName, firstName, lastName, email, password);
            req.setAttribute("users", userDao.addUser(user));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/UserHome.jsp");
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/createUserFailed.jsp");
            dispatcher.forward(req, resp);
        }
    }
}