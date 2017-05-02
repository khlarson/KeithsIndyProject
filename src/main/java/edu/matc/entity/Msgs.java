package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import static java.time.LocalDate.now;



//TODO userid will have to be attained from the current session

/**
 * A class to represent a msg.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "Msgs")
public class Msgs {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "msg_id")
    private int msg_id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "tag")
    private String tag;

    @Column(name = "date_time", columnDefinition="DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date_time;

    /**
     * Instantiates a new Msg.
     */
    public Msgs() {
    }

    /**
     * Instantiates a new User.
     *
     * @param user_id    the user_id
     * @param content    the content
     * @param tag    the tag
     */
    public Msgs(int user_id, String title, String content, String tag) {
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.tag = tag;
    }

    /**
     * Gets msgid.
     *
     * @return the msgid
     */
    public int getMsg_id() {
        return msg_id;
    }

    /**
     * Sets msgid.
     *
     * @param msg_id the msgid
     */
    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * Sets userid.
     *
     * @param user_id the userid
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    /**
     * Gets content
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets tag
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
     *
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets tag
     *
     * @param tag the tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getDate_time() {
        return date_time;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
