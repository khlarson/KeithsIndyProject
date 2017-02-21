package edu.matc.controller;

import edu.matc.entity.Msgs;
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
 * @author khlarson
 */

@WebServlet(
        urlPatterns = {"/USERcreateMsg"}
)

public class CreateMsg extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MsgsDAO msgDao = new MsgsDAO();

        //Will need to get userid from current session
        String userid = "?";
        String content = req.getParameter("content");
        String tag = req.getParameter("tag");

        Msgs msg = new Msgs(userid, content, tag);
        req.setAttribute("msgs", msgDao.addMsg(msg));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addMsgSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
