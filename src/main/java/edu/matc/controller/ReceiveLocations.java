package edu.matc.controller;

import edu.matc.persistence.LocationDAO;
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
        urlPatterns = {"/ReceiveLocations"}
)

public class ReceiveLocations extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");

        LocationDAO locationDAO = new LocationDAO();
        logger.info("SEARCH ALL Locations INITIALIZED");
        req.setAttribute("locations", locationDAO.getAllLocation());


        RequestDispatcher dispatcher = req.getRequestDispatcher("/CreateNewEvent.jsp");
        dispatcher.forward(req, resp);
    }
}