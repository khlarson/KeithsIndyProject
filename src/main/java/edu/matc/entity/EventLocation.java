package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

/**
 * A class to represent a EventLocation.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "eventLocations")
public class EventLocation {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int eventLocationid;

    @Column(name = "eventid")
    private int eventid;

    @Column(name = "locationid")
    private int locationid;

    /**
     * Instantiates a new EventLocation.
     */
    public EventLocation() {
    }

    /**
     * Instantiates a new User.
     *
     * @param eventid    the event id
     * @param locationid the description
     */

    public EventLocation(int eventid, int locationid) {
        this.eventid = eventid;
        this.locationid = locationid;
    }

    /**
     * Gets eventLocationid.
     *
     * @return the eventLocationid
     */
    public int getEventLocationid() {
        return eventLocationid;
    }

    /**
     * Sets eventLocationid.
     *
     * @param eventLocationid the eventLocationid
     */
    public void setEventLocationid(int eventLocationid) {
        this.eventLocationid = eventLocationid;
    }

    /**
     * Gets eventid.
     *
     * @return the eventid
     */
    public int getEventid() {
        return eventid;
    }

    /**
     * Sets eventid.
     *
     * @param eventid the eventid
     */
    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    /**
     * Gets locationid.
     *
     * @return the locationid
     */
    public int getLocationid() {
        return locationid;
    }

    /**
     * Sets locationid.
     *
     * @param locationid the locationid
     */
    public void setLocationid(int locationid) {
        this.locationid = locationid;
    }
}