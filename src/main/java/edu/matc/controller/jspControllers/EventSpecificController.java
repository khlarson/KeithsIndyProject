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
        urlPatterns = {"/EventSpecificController"}
)
public class EventSpecificController extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");

        //get instance of each DAO needed
        EventDAO eventDAO = new EventDAO();
        MsgsDAO MsgsDao = new MsgsDAO();

        //get category id from previous page. (Events.jsp)
        String eventid = req.getParameter("eventid");
        int id = Integer.parseInt(eventid);

        //req.setAttribute("event", eventDAO.getEventById(id));

        //Set page
        //TODO set the tag in a 'properties file'
        req.setAttribute("msg", MsgsDao.getMsgByTag("EventsCategoryWelcome"));

    }


}
