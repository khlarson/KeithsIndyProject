/**
package edu.matc.persistence;

import edu.matc.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import java.util.*;

import static org.junit.Assert.*;
*/
/**
 * Created on 9/13/16.
 *
 * @author khlarson
 */
/**
public class UserDaoTest {

    UserDao dao;
    User user;
    @Before
    public void setup() {
        dao = new UserDao();

        user = new User("test", "user", 5, getLocalDate("1993-04-11"));
    }

    @Test
    public void getAllUsers() throws Exception {
        List<User> users = dao.getAllUsers();
        assertTrue(users.size() > 0);
    }

    @Test
    public void getUser() throws Exception {
        int userid = user.getUserid();

        assertTrue(userid == 5);
    }

    @Test
    public void addUser() throws Exception {
        int id = dao.addUser(user);

        assertNotEquals(0, id);
        User insertedUser = dao.getUser(id);
        assertEquals(insertedUser.getFirstName(), user.getFirstName());
    }


    @Test
    public void deleteUser() throws Exception {
        int id = dao.addUser(user);
        dao.deleteUser(id);
        User deletedUser = dao.getUser(id);
        assertNull(deletedUser);
    }

    @Test
    public void updateUser() throws Exception {
        int id = dao.addUser(user);
        String nameOne = user.getFirstName();
        dao.updateUser(user);
        String nameTwo = user.getFirstName();

        assertNotEquals(nameOne, nameTwo);
    }


    private LocalDate getLocalDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate) ;
        return date ;
    }

}
*/