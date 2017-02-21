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
        urlPatterns = {"/ADMINreceiveUser"}
)

public class ReceiveUser extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");

        UserDao userDao = new UserDao();

        String inputType = req.getParameter("inputType");
        String userInput = req.getParameter("userInput");

        if (inputType.equals("searchid")) {
            logger.info("SEARCH USER BY ID INITIALIZED");
            int userid = Integer.parseInt(userInput);
            req.setAttribute("users", userDao.getUser(userid));
        } else {
            logger.info("SEARCH ALL USERS INITIALIZED");
            req.setAttribute("users", userDao.getAllUsers());
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/userSearchResults.jsp");
        dispatcher.forward(req, resp);
    }
}