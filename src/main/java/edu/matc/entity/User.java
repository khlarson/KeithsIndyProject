package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import static java.time.LocalDate.now;

/**
 * A class to represent a user.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name = "submission_date", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date submission_date;

    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName   the first name
     * @param lastName    the last name
     * @param userName    the username
     * @param email    the email
     * @param password    the password
     */
    public User(String userName, String firstName, String lastName, String email, String password) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    /**
     * Gets username.
     *
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets userName.
     *
     * @param userName the username
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets user_id.
     *
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * Sets user_id.
     *
     * @param user_id the user_id
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * Gets email
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets password
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets email
     *
     * @param password the email
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public Date getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(Date submission_date) {
        this.submission_date = submission_date;
    }
}
