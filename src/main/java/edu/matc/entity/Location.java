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
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "location_id")
    private int location_ID;

    @Column(name = "name")
    private String name;

    @Column(name = "tag")
    private String tag;

    @Column(name = "description")
    private String description;

    @Column(name = "website")
    private String website;
    @Column(name = "address")
    private String address;

    @ManyToMany(mappedBy="locations")
    private List<Event> events;

    /**
     * Instantiates a new Location.
     */
    public Location() {
    }

    public Location(String name, String description, String tag, String website, String address) {
        this.name = name;
        this.tag = tag;
        this.description = description;
        this.website = website;
        this.address = address;
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
     * Gets website.
     *
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets website.
     *
     * @param website the website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets location_ID.
     *
     * @return the location_ID
     */
    public int getLocation_ID() {
        return location_ID;
    }

    /**
     * Sets locationID.
     *
     * @param location_ID the locationID
     */
    public void setLocation_ID(int location_ID) {
        this.location_ID = location_ID;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
