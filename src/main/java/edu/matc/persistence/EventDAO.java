package edu.matc.persistence;

import edu.matc.entity.Event;
import edu.matc.entity.Location;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 4/18/17.
 */
public class EventDAO {

    /**
     * add a event
     *
     * @param event
     * @return the id of the inserted record
     */
    public void addEvent(Event event) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction();
            session.save(event);
            tx.commit();
        }
        catch (HibernateException e) {
            if (null!=tx) {
                tx.rollback() ;
            }
            //log.error("HibernateException:" + e);
        }
        finally {
            session.close() ;
        }
    }

    //TODO return all events with matching ids
    //public List<Event> getEventsById(int eventid) {
        //List<Event> events = new ArrayList<Event>();
        //Session session = SessionFactoryProvider.getSessionFactory().openSession();
        //events = session.createCriteria(Event.class, eventid).list();
        //session.close();
        //return events;
    //}


    public void deleteEvent(Event event, Location location){

        event.getLocations().remove(location);

    }

}
