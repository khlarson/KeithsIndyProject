package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

//TODO add a auto time grab "now()?" to get the date of each msg

//TODO find a way to handle userid (foriegn key)

/**
 * A class to represent a msg.
 *
 * @author //khlarson
 */
@Entity
@Table(name = "msgs")
public class Msgs {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "msgid")
    private int msgid;

    @Column(name = "userid")
    private int userid;

    @Column(name = "content")
    private String content;

    @Column(name = "tag")
    private String tag;


    /**
     * Instantiates a new Msg.
     */
    public Msgs() {
    }

    /**
     * Instantiates a new User.
     *
     * @param msgid   the msgid
     * @param userid    the userid
     * @param content    the content
     * @param tag    the tag
     */
    public Msgs(int msgid, int userid, String content, String tag) {
        this.msgid = msgid;
        this.userid = userid;
        this.content = content;
        this.tag = tag;
    }

    /**
     * Gets msgid.
     *
     * @return the msgid
     */
    public int getMsgid() {
        return msgid;
    }

    /**
     * Sets msgid.
     *
     * @param msgid the msgid
     */
    public void setMsgid(int msgid) {
        this.msgid = msgid;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
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
}
