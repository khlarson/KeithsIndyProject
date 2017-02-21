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
 * @author khlarson
 */

@WebServlet(
        urlPatterns = {"/USERcreateMsg"}
)

public class CreateMsg extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MsgsDao msgDao = new MsgsDao();

        String content = req.getParameter("content");
        String content = req.getParameter("content");
        String tag = req.getParameter("tag");

        msg = new Msgs(userid, content, tag, email, password);
        req.setAttribute("msgs", msgDao.addMsg(msg));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addMsgSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
