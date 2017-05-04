package edu.matc.controller;

import edu.matc.entity.Location;
import edu.matc.entity.User;
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


/**
 * A simple servlet to welcome the user.
 * @author khlarson
 */

@WebServlet(
        urlPatterns = {"/CreateLocation"}
)

public class CreateLocation extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LocationDAO locationDao = new LocationDAO();

        String name = req.getParameter("name");
        String description = req.getParameter("description");
        String tag = req.getParameter("tag");
        String website = req.getParameter("website");
        String address = req.getParameter("address");


        //TODO add validation
        Location location = new Location(name, description, tag, website, address);
        locationDao.addLocation(location);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/AboutUs.jsp");
        dispatcher.forward(req, resp);
    }
}