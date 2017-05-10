package edu.matc.persistence;
import edu.matc.entity.Team;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khlarson on 2/2/16.
 */
public class TeamDAO {

    private final Logger log = Logger.getLogger(this.getClass());

    /** Return a list of all team
     *
     * @return All team
     */
    public List<Team> getTeam() {
        System.out.println("In the getTeam function");
        //add try catch HibernateException he and e + log
        List<Team> team = new ArrayList<Team>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        team = session.createCriteria(Team.class).list();
        session.close();
        log.info("Team list: " + team);
        return team;
    }

    /**
     * retrieve a user given their id
     *
     * @param id the team member's id
     * @return team
     */
    public Team getTeamMember(int id) {
        //add try catch HibernateException he and e + log
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Team team = (Team) session.get(Team.class, id);
        session.close();
        return team;
    }

    /**
     * add a team
     *
     * @param team
     * @return the id of the inserted record
     */
    public int addTeam(Team team) {
        int id = 0 ;
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction();
            id = (int) session.save(team);
            tx.commit();
        }
        catch (HibernateException e) {
            if (null!=tx) {
                tx.rollback() ;
            }
            log.error("HibernateException:" + e);
        }
        finally {
            session.close() ;
        }
        return id ;
    }

    /**
     * delete a team member by id
     * @param id the member's id
     * @return the id of the deleted record
     */
    public void deleteTeam(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Team team = (Team) session.get(Team.class, id);
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(team);
            tx.commit();
        }
        catch (HibernateException e) {
            if (null!=tx) {
                tx.rollback() ;
            }
            log.error("HibernateException:" + e);
        }
        finally {
            session.close() ;
        }
    }

    /**
     * Update the team
     * @param team
     */
    public void updateTeam(Team team) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction() ;
            session.update(team) ;
            tx.commit() ;
        }
        catch (HibernateException e) {
            if (null != tx) {
                tx.rollback() ;
            }
            log.error("HibernateException:" + e);
        }
        finally {
            session.close() ;
        }
    }
}