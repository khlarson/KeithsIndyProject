package edu.matc.controller;
import edu.matc.api.Googlemaps;
import edu.matc.entity.Event;
import edu.matc.entity.Location;
import edu.matc.persistence.EventDAO;
import edu.matc.persistence.LocationDAO;
import org.apache.log4j.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author khlarson
 */

@WebServlet(
        urlPatterns = {"/CreateEvent"}
)

public class CreateEvent extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        log.info("Entered The create event servlet");
        System.out.println("test**********************************************");
        LocationDAO locationDAO = new LocationDAO();
        EventDAO eventDAO = new EventDAO();

        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String tag = req.getParameter("tag");
        String approxomateTime = req.getParameter("approxomateTime");
        String adminCreated = "1";
        String adminApproved = "1";
        String [] locations = req.getParameterValues("location");
        List<Location> locationObjects = new ArrayList<>();
        log.info("*********************LocationId list:" + locations);

        System.out.println("test Locations**********************************************" + locations);

        for (String id: locations) {
            System.out.println("In the locations id loop**********************************************" + id);
            int loc_id = Integer.parseInt(id);
            locationObjects.add(locationDAO.getLocation(loc_id));
        }

        //list locations
        Googlemaps gmaps = new Googlemaps();

        //setup first map
        String map = gmaps.makeMap(locationObjects);

        //TODO add validation
        Event event = new Event(name, description, tag, approxomateTime, adminCreated, adminApproved, map, locationObjects);
        eventDAO.addEvent(event);
        //send event to a select locations
        RequestDispatcher dispatcher = req.getRequestDispatcher("/AboutUs.jsp");
        dispatcher.forward(req, resp);
    }
}
