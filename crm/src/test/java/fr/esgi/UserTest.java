package fr.esgi;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void should_valid_nominal() {
        User user = new User("test", "test", 20);
        assertTrue(user.isValid());
    }

    @Test
    public void should_not_valid_firstname_empty() {
        User user = new User("", "test", 20);
        assertFalse(user.isValid());
    }

    @Test
    public void should_not_valid_firstname_null() {
        User user = new User(null, "test", 20);
        assertFalse(user.isValid());
    }

    @Test
    public void should_not_valid_lastname_empty() {
        User user = new User("test", "", 20);
        assertFalse(user.isValid());
    }

    @Test
    public void should_not_valid_lastname_null() {
        User user = new User("test", null, 20);
        assertFalse(user.isValid());
    }

    @Test
    public void should_not_valid_age_null() {
        User user = new User("test", "test", null);
        assertFalse(user.isValid());
    }

    @Test
    public void should_not_valid_age_too_low() {
        User user = new User("test", "test", 6);
        assertFalse(user.isValid());
    }

    @Test
    public void should_not_valid_age_too_high() {
        User user = new User("test", "test", 80);
        assertFalse(user.isValid());
    }
}
