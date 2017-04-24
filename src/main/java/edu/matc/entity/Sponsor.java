package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

/**
 * A class to represent a location.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "Sponsor")
public class Sponsor {
    @Column(name = "sponsor_Name")
    private String name;

    @Column(name = "websiteURL")
    private String websiteURL;

    @Column(name = "description")
    private String description;

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "id")
    private int sponsorID;

    //TODO ADD facebook and twitter

    /**
     * Instantiates a new Location.
     */
    public Sponsor() {
    }

    public Sponsor(String name, String websiteURL, String description, int sponsorID) {
        this.name = name;
        this.websiteURL = websiteURL;
        this.description = description;
        this.sponsorID = sponsorID;
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
     * Gets websiteURL.
     *
     * @return the websiteURL
     */
    public String getWebsiteURL() {
        return websiteURL;
    }

    /**
     * Sets websiteURL.
     *
     * @param websiteURL the websiteURL
     */
    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
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
     * Gets sponsorID.
     *
     * @return the sponsorID
     */
    public int getSponsorID() {
        return sponsorID;
    }

    /**
     * Sets sponsorID.
     *
     * @param sponsorID the sponsorID
     */
    public void setSponsorID(int sponsorID) {
        this.sponsorID = sponsorID;
    }
}