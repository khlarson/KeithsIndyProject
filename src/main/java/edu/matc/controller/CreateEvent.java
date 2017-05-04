package edu.matc.controller;

import edu.matc.api.Googlemaps;
import edu.matc.entity.Event;
import edu.matc.entity.Location;
import edu.matc.entity.User;
import edu.matc.persistence.EventDAO;
import edu.matc.persistence.LocationDAO;
import edu.matc.persistence.UserDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


/**
 * A simple servlet to welcome the user.
 * @author khlarson
 */

@WebServlet(
        urlPatterns = {"/CreateEvent"}
)

public class CreateEvent extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        EventDAO eventDAO = new EventDAO();

        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String tag = req.getParameter("tag");
        String approxomateTime = req.getParameter("approxomateTime");
        String adminCreated = "1";
        String adminApproved = "1";
        List<Location> locations = req.getParameterValues("location");

        //list locations
        Googlemaps gmaps = new Googlemaps();

        String map = gmaps.makeMap(locations);
        //setup first map


        //TODO add validation
        Event event = new Event(name, description, tag, approxomateTime, adminCreated, adminApproved, map, locations);
        eventDAO.addEvent(event);
        //send event to a select locations
        RequestDispatcher dispatcher = req.getRequestDispatcher("/AboutUs.jsp");
        dispatcher.forward(req, resp);
    }
}
