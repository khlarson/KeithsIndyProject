package edu.matc.persistence;

import edu.matc.entity.Event;
import edu.matc.entity.Location;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 4/18/17.
 */
public class EventDAO {

    //TODO return all events with matching ids
    public List<Event> getEventsByCategory(int eventCategoryID) {
        List<Event> events = new ArrayList<Event>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        events = session.createCriteria(Event.class, eventCategoryID).list();
        session.close();
        return events;
    }


    public void deleteEvent(Event event, Location location){

        event.getLocations().remove(location);

    }

}
