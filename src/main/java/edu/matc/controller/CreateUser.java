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

        logger.info("In the doGet()");
        logger.warn("In the doGet() - This is a warning");
        UserDao userData = new UserDao();

        //TODO will need to add addUser param
        req.setAttribute("users", userData.addUser());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/userSearchResults.jsp");
        dispatcher.forward(req, resp);
    }
}