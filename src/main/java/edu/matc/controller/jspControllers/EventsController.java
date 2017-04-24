package edu.matc.controller.jspControllers;
import edu.matc.entity.EventTypes;
import edu.matc.entity.Msgs;
import edu.matc.persistence.*;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.annotation.WebServlet;

/**
 * Created by khlarson on 4/18/17.
 */
@WebServlet(
        urlPatterns = {"/EventsController"}
)
public class EventsController extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Store photos/names/descriptions in categories
        //call return method

        logger.info("In the doGet()");

        EventTypesDAO eventTypeDAO = new EventTypesDAO();
        MsgsDAO MsgsDao = new MsgsDAO();

        req.setAttribute("eventTypes", eventTypeDAO.getAllEventTypes());
        //TODO set the tag in a 'properties file'
        req.setAttribute("msg", MsgsDao.getMsgByTag("EventsCategoryWelcome"));



    }
}