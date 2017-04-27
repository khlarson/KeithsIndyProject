package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import static java.time.LocalDate.now;

/**
 * A class to represent a location.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "Location")
public class Location {
    @Column(name = "loc_Name")
    private String name;

    @Column(name = "loc_tag")
    private String tag;

    @Column(name = "description")
    private String description;

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "id")
    private int locID;

    //TODO mapp many to many with event location
    @ManyToMany(mappedBy="locations")
    private List<Event> events;
    /**
     * Instantiates a new Location.
     */
    public Location() {
    }

    public Location(String name, String tag, String description, int locID) {
        this.name = name;
        this.tag = tag;
        this.description = description;
        this.locID = locID;
    }

    /**
     * Gets location name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets location name.
     *
     * @param name the first name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets tag.
     *
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets tag.
     *
     * @param tag the tag
     */
    public void setTag(String tag) {
        this.tag = tag;
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
     * Gets locID.
     *
     * @return the locID
     */
    public int getLocID() {
        return locID;
    }

    /**
     * Sets locID.
     *
     * @param locID the locID
     */
    public void setLocID(int locID) {
        this.locID = locID;
    }
}
