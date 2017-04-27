package edu.matc.persistence;

import edu.matc.entity.EventTypes;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 4/20/17.
 */
public class EventTypesDAO {


    public List<EventTypes> getAllEventTypes(){
        //add try catch HibernateException he and e + log
        List<EventTypes> eventTypes = new ArrayList<EventTypes>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        eventTypes = session.createCriteria(EventTypes.class).list();
        session.close();
        return eventTypes;
    }

    public EventTypes getEventCategoryById(int id){
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        EventTypes eventType = (EventTypes) session.get(EventTypes.class, id);
        session.close();
        return eventType;
    }
}
