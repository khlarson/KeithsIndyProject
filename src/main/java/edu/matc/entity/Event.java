package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

/**
 * A class to represent a Event.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "id")
    private int eventid;

    @Column(name = "eventName")
    private String eventName;

    @Column(name = "description")
    private String description;

    @Column(name="category")
    private String category;

    @Column(name="photo")
    private String photo;

    /**
     * Instantiates a new Event.
     */
    public Event() {
    }

    /**
     * Instantiates a new User.
     *
     * @param eventName   the event name
     * @param description    the description
     * @param category    the category
     * @param photo    the location of the photo

     */
    public Event(String eventName, String description, String category, String photo) {
        this.eventName = eventName;
        this.description = description;
        this.category = category;
        this.photo = photo;
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
     * Gets eventName.
     *
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets eventName.
     *
     * @param eventName the eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
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

    /**
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets photo.
     *
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Sets photo.
     *
     * @param photo the photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

}

