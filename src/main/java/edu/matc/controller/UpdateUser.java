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
 *
 * @author khlarson
 */

@WebServlet(
        urlPatterns = {"/updateUser"}
)

public class UpdateUser extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");
        logger.warn("In the doGet() - This is a warning");
        UserDao userDao = new UserDao();

        User user = new User();

        //TODO will need to add param to update user
        req.setAttribute("users", userDao.updateUser(user));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/userSearchResults.jsp");
        dispatcher.forward(req, resp);
    }
}
