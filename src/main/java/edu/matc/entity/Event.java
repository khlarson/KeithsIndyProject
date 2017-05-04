package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import static java.time.LocalDate.now;

/**
 * A class to represent a Event.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "event_id")
    private int event_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name="tag")
    private String tag;

    @Column(name="approxomateTime")
    private String approxomateTime;

    @Column(name="adminCreated")
    private String adminCreated;

    @Column(name="adminApproved")
    private String adminApproved;

    @Column(name="map")
    private String map;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="Event_Location",
            joinColumns={@JoinColumn(name="event_id")},
            inverseJoinColumns={@JoinColumn(name="location_id")})

    private List<Location> locations;


    /**
     * Instantiates a new Event.
     */
    public Event() {
    }

    /**
     * Instantiates a new User.
     *
     * @param name   the event name
     * @param description    the description
     * @param tag    the tag
     * @param map    the location of the map

     */
    public Event(String name, String description, String tag, String approxomateTime, String adminApproved, String adminCreated, String map, List<Location> locations) {
        this.name = name;
        this.description = description;
        this.tag = tag;
        this.approxomateTime = approxomateTime;
        //TODO change adminCreated to user_id
        this.adminCreated = adminCreated;
        this.adminApproved = adminApproved;
        this.map = map;
        this.locations = locations;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    /**
     * Gets eventid.
     *
     * @return the eventid
     */
    public int getEvent_id() {
        return event_id;
    }

    /**
     * Sets eventid.
     *
     * @param event_id the eventid
     */
    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the eventName
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getApproxomateTime() {
        return approxomateTime;
    }

    public void setApproxomateTime(String approxomateTime) {
        this.approxomateTime = approxomateTime;
    }

    public String getAdminCreated() {
        return adminCreated;
    }

    public void setAdminCreated(String adminCreated) {
        this.adminCreated = adminCreated;
    }

    public String getAdminApproved() {
        return adminApproved;
    }

    public void setAdminApproved(String adminApproved) {
        this.adminApproved = adminApproved;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}

