package edu.matc.controller.jspControllers;
import edu.matc.persistence.*;
import org.apache.log4j.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

/**
 * Created by student on 5/2/17.
 */

@WebServlet(
        urlPatterns = {"/AboutUsController"}
)
public class AboutUsController extends HttpServlet {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Store photos/names/descriptions in categories
        logger.info("In the doGet()");

        //TODO get all staff members

        MsgsDAO MsgsDao = new MsgsDAO();

        logger.info("about to get msg from tag");
        //TODO set the tag in a 'properties file'
        req.setAttribute("msg", MsgsDao.getMsg(2));
        RequestDispatcher dispatcher = req.getRequestDispatcher("/AboutUs.jsp");
        dispatcher.forward(req, resp);

    }
}
