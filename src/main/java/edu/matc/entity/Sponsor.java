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
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "sponsor_id")
    private int sponsor_ID;

    @Column(name = "name")
    private String name;

    @Column(name = "website")
    private String website;

    @Column(name = "twitter")
    private String twitter;

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "description")
    private String description;

    @Column(name = "photo")
    private String photo;


    //TODO ADD facebook and twitter

    /**
     * Instantiates a new Location.
     */
    public Sponsor() {
    }

    public Sponsor(String name, String website, String twitter, String facebook, String description, String photo) {
        this.name = name;
        this.website = website;
        this.twitter = twitter;
        this.facebook = facebook;
        this.description = description;
        this.photo = photo;
    }

    public int getSponsor_ID() {
        return sponsor_ID;
    }

    public void setSponsor_ID(int sponsor_ID) {
        this.sponsor_ID = sponsor_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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
}