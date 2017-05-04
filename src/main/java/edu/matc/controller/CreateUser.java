package edu.matc.controller;

import edu.matc.entity.User;
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
        urlPatterns = {"/CreateUser"}
)

public class CreateUser extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();

        String userName = req.getParameter("userName");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String passwordConfirmed = req.getParameter("passwordConfirmed");

        System.out.println(password);
        System.out.println(passwordConfirmed);

        log.info("1: ******************************** " + password);
        log.info("2: ******************************** " + passwordConfirmed);
        if (password.equals(passwordConfirmed)) {
            User user = new User(userName, firstName, lastName, email, password);
            userDao.addUser(user);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/AboutUs.jsp");
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/createUserFailed.jsp");
            dispatcher.forward(req, resp);
        }
    }
}