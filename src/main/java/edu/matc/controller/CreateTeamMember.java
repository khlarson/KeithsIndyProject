package edu.matc.controller;

import edu.matc.entity.Location;
import edu.matc.entity.Team;
import edu.matc.entity.User;
import edu.matc.persistence.LocationDAO;
import edu.matc.persistence.TeamDAO;
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
        urlPatterns = {"/CreateTeamMember"}
)

public class CreateTeamMember extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TeamDAO teamDAO = new TeamDAO();

        String name = req.getParameter("name");
        String title = req.getParameter("title");
        String bio = req.getParameter("bio");

        //TODO upload photo and add it to image folder
        String photo = req.getParameter("photo");

        //TODO add validation
        Team team = new Team(name, title, bio, photo);
        teamDAO.addTeam(team);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/AboutUs.jsp");
        dispatcher.forward(req, resp);
    }
}
