package edu.matc.controller.jspControllers;

import edu.matc.persistence.MsgsDAO;
import edu.matc.persistence.SponsorDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import org.apache.log4j.Logger;

/**
 * Created by student on 4/18/17.
 */
@WebServlet(
        urlPatterns = {"/SponsorController"}
)
public class SponsorController extends HttpServlet {
    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("In the doGet()");
        //get instance of each DAO needed
        SponsorDAO sponsorDAO = new SponsorDAO();
        MsgsDAO MsgsDao = new MsgsDAO();

        //get sponsors
        req.setAttribute("sponsors", sponsorDAO.getAllSponsors());
        //Set page
        //TODO set the tag in a 'properties file'
        req.setAttribute("msg", MsgsDao.getMsgByTag("EventsCategoryWelcome"));

    }
}
