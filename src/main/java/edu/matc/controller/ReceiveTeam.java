package edu.matc.controller;

import edu.matc.persistence.LocationDAO;
import edu.matc.persistence.TeamDAO;
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
        urlPatterns = {"/ReceiveTeam"}
)

public class ReceiveTeam extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");

        TeamDAO teamDAO = new TeamDAO();
        logger.info("SEARCH Team INITIALIZED");
        req.setAttribute("Team", teamDAO.getTeam());


        RequestDispatcher dispatcher = req.getRequestDispatcher("/CreateNewEvent.jsp");
        dispatcher.forward(req, resp);
    }
}