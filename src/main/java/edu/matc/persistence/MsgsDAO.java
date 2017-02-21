package edu.matc.persistence;

import edu.matc.entity.Msgs;
import edu.matc.entity.Sponsor;
import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by khlarson on 2/2/16.
 */
public class MsgsDAO {

    private final Logger log = Logger.getLogger(this.getClass());


    //TODO why is this msgs unknown
    /** Return a list of all msgs
     *
     * @return All msgs
     */
    public List<Msgs> getAllMsgs() {
        List<Msgs> msgs = new ArrayList<Msgs>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        msgs = session.createCriteria(msgs.class).list();
        session.close();
        return msgs;
    }

    /**
     * retrieve a msg given its id
     *
     * @param id the msg's id
     * @return msg
     */
    public Msgs getMsg(int id) {
        //add try catch HibernateException he and e + log
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Msgs msg = (Msgs) session.get(Msgs.class, id);
        session.close();
        return msg;
    }


    //TODO this needs to be a list
    /**
     * retrieve a msg given its tag
     *
     * @param tag the msg's tag
     * @return msg
     */
    public Msgs getMsgByTag(String tag) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Msgs msg = (Msgs) session.get(Msgs.class, tag);
        session.close();
        return msg;
    }

    /**
     * add a msg
     *
     * @param msg
     * @return the id of the inserted record
     */
    public int addMsg(Msgs msg) {
        int id = 0 ;
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction();
            id = (int) session.save(msg);
            tx.commit();
        }
        catch (HibernateException e) {
            if (null!=tx) {
                tx.rollback() ;
            }
            log.error("HibernateException:" + e);
        }
        finally {
            session.close() ;
        }
        return id ;
    }


    /**
     * delete a msg by id
     * @param id the msg's id
     */
    public void deleteMsg(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Msgs msg = (Msgs) session.get(Msgs.class, id);
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(msg);
            tx.commit();
        }
        catch (HibernateException e) {
            if (null!=tx) {
                tx.rollback() ;
            }
            log.error("HibernateException:" + e);
        }
        finally {
            session.close() ;
        }
        //TODO add a return value (int)
    }

    /**
     * Update the msg
     * @param msg
     */
    public void updateMsg(Msgs msg) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction() ;
            session.update(msg) ;
            tx.commit() ;
        }
        catch (HibernateException e) {
            if (null != tx) {
                tx.rollback() ;
            }
            log.error("HibernateException:" + e);
        }
        finally {
            session.close() ;
        }
    }



}