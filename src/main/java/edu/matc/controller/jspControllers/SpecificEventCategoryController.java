package edu.matc.controller.jspControllers;

import edu.matc.entity.Event;
import edu.matc.persistence.EventDAO;
import edu.matc.persistence.EventLocationDAO;
import edu.matc.persistence.EventTypesDAO;
import edu.matc.persistence.MsgsDAO;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
        //page will display a welcome msg
            //from *MsgsDAO* obtained by passing correct tag

        //TODO Issue
        //page will display events
            //Each Event must be:
            //of the right category
            //Have a its name and description from the *EventDAO*
            //Have a cooresponding list of locations obtained through *EventLocationDAO*


        //get instance of each DAO needed
        EventTypesDAO eventTypeDAO = new EventTypesDAO();
        MsgsDAO MsgsDao = new MsgsDAO();
        EventDAO eventDAO = new EventDAO();
        EventLocationDAO eventLocationDAO = new EventLocationDAO();

        //get category id from previous page. (Events.jsp)
        //TODO find a better way then a form to pass a param
        String category = req.getParameter("category");
        int categoryid = Integer.parseInt(category);

        //Grab all events within category
        req.setAttribute("events", eventDAO.getEventsByCategory(categoryid));

        //match all eventlocations with event
        //...
        //pass locations to a map?

        //Set page
        //TODO set the tag in a 'properties file'
        req.setAttribute("msg", MsgsDao.getMsgByTag("EventsCategoryWelcome"));

    }


}
