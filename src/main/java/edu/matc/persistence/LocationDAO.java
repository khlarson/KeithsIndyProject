package edu.matc.persistence;

import edu.matc.entity.Location;
import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khlarson on 2/2/16.
 */
public class LocationDAO {

    private final Logger log = Logger.getLogger(this.getClass());

    /** Return a list of all locations
     *
     * @return All location
     */
    public List<Location> getAllLocation() {
        List<Location> locations = new ArrayList<Location>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        locations = session.createCriteria(Location.class).list();
        session.close();
        return locations;
    }

    /**
     * retrieve a location given its id
     *
     * @param id the locations's id
     * @return location
     */
    public Location getLocation(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Location location = (Location) session.get(Location.class, id);
        session.close();
        return location;
    }

    /**
     * add a location
     *
     * @param location
     * @return the id of the inserted record
     */
    public int addLocation(Location location) {
        int id = 0 ;
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction();
            id = (int) session.save(location);
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
     * delete a location by id
     * @param id the location's id
     * @return the id of the deleted record
     */
    public int deleteLocation(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Location location = (Location) session.get(User.class, id);
        int cachedid = id;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(location);
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
        return id;
    }

    /**
     * Update the user
     * @param location
     */
    public void updateLocation(Location location) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction() ;
            session.update(location) ;
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