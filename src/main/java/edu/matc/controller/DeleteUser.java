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
        urlPatterns = {"/ADMINdeleteUser"}
)

public class DeleteUser extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");
        logger.warn("In the doGet() - This is a warning");


        UserDao userDao = new UserDao();

        String comfirmDelete = req.getParameter("comfirmDelete");
        int userid = Integer.parseInt(req.getParameter("userInput"));

        if (comfirmDelete.equals("Conrfim")) {
            logger.info("USER DELETE CONFIRMED");

            //TODO make "deleteUser()" Return a value
            req.setAttribute("users", userDao.deleteUser(userid));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/adminUserDeleteSuccess.jsp");
            dispatcher.forward(req, resp);
        } else if (comfirmDelete.equals("?")) {
            logger.info("USER DELETE AWAITING CONFORMATION");
            req.setAttribute("users", userDao.getUser(userid));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/adminUserConfimDelete.jsp");
            dispatcher.forward(req, resp);
        } else {
            logger.info("USER DELETE ABORTED");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/adminUserAbortDelete.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
