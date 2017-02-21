package edu.matc.controller;

import edu.matc.persistence.MsgsDAO;
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
        urlPatterns = {"/USERdeleteMsg"}
)

public class DeleteMsg extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MsgsDAO msgDao = new MsgsDAO();

        String comfirmDelete = req.getParameter("comfirmDelete");
        int msgid = Integer.parseInt(req.getParameter("userInput"));


        //TODO add in a conditional to test if user wanting to delete the msg is the user who posted it or admin
        if (comfirmDelete.equals("Conrfim")) {
            logger.info("MSG DELETE CONFIRMED");
            req.setAttribute("msgs", msgDao.deleteMsg(msgid));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/userMsgDeleteSuccess.jsp");
            dispatcher.forward(req, resp);
        } else if (comfirmDelete.equals("?")) {
            logger.info("MSG DELETE AWAITING CONFORMATION");
            req.setAttribute("msgs", msgDao.getMsg(msgid));
            RequestDispatcher dispatcher = req.getRequestDispatcher("/userMsgConfimDelete.jsp");
            dispatcher.forward(req, resp);
        } else {
            logger.info("MSG DELETE ABORTED");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/userMsgAbortDelete.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
