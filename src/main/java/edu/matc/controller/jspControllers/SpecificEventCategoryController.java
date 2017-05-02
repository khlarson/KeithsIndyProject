package edu.matc.controller.jspControllers;

//import edu.matc.api.googlemaps;
import edu.matc.persistence.EventDAO;
import edu.matc.persistence.EventTypesDAO;
import edu.matc.persistence.MsgsDAO;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by student on 4/18/17.
 */

@WebServlet(
        urlPatterns = {"/SpecificEventCategoryController"}
)
public class SpecificEventCategoryController extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");

        //get instance of each DAO needed
        EventTypesDAO eventTypeDAO = new EventTypesDAO();
        MsgsDAO MsgsDao = new MsgsDAO();
        EventDAO eventDAO = new EventDAO();

        //get category id from previous page. (Events.jsp)
        String category = req.getParameter("category");
        int categoryid = Integer.parseInt(category);

        //Grab all events within category
        req.setAttribute("eventType", eventTypeDAO.getEventById(categoryid));

        //Grab all events within category
        //req.setAttribute("events", eventDAO.getEventsById(categoryid));

        //Set page
        //TODO set the tag in a 'properties file'
        req.setAttribute("msg", MsgsDao.getMsgByTag("EventsCategoryWelcome"));

    }


}
