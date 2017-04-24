package edu.matc.persistence;

import edu.matc.entity.EventLocation;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;

/**
 * Created by student on 4/24/17.
 */
public class EventLocationDAO {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * add a eventLocation
     *
     * @param eventLocation
     * @return the id of the inserted record
     */
    public int addEventLocation(EventLocation eventLocation) {
        int id = 0 ;
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction();
            id = (int) session.save(eventLocation);
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
     * delete a eventLocation by id
     * @param id the eventLocation's id
     * @return the id of the deleted record
     */
    public int deleteEventLocation(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        EventLocation eventLocation = (EventLocation) session.get(EventLocation.class, id);
        int cachedid = id;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(eventLocation);
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
     * Update the eventLocation
     * @param eventLocation
     */
    public void updateEventLocation(EventLocation eventLocation) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null ;
        try {
            tx = session.beginTransaction() ;
            session.update(eventLocation) ;
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
