package edu.matc.persistence;

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
public class SponsorDAO {

    private final Logger log = Logger.getLogger(this.getClass());

    /** Return a list of all sponsors
     *
     * @return All sponsors
     */
    public List<Sponsor> getAllSponsors() {
        List<Sponsor> sponsors = new ArrayList<Sponsor>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        log.info("prepare to search criteria");
        sponsors = session.createCriteria(Sponsor.class).list();
        log.info("sponsors list: " + sponsors);
        session.close();
        return sponsors;
    }

    /**
     * retrieve a user given their id
     *
     * @param id the user's id
     * @return user
     */
    public Sponsor getSponsor(int id) {
        //add try catch HibernateException he and e + log
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Sponsor sponsor = (Sponsor) session.get(Sponsor.class, id);
        session.close();
        return sponsor;
    }

    /**
     * add a sponsor
     *
     * @param sponsor
     * @return the id of the inserted record
     */
    public int addSponsor(Sponsor sponsor) {
        int id = 0 ;
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction();
            id = (int) session.save(sponsor);
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
     * delete a user by id
     * @param id the user's id
     * @return the id of the deleted record
     */
    public void deleteSponsor(int id) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Sponsor sponsor = (Sponsor) session.get(Sponsor.class, id);
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(sponsor);
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
    }

    /**
     * Update the user
     * @param sponsor
     */
    public void updateSponsor(Sponsor sponsor) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession() ;
        Transaction tx = null ;
        try {
            tx = session.beginTransaction() ;
            session.update(sponsor) ;
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
