package fr.esgi;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class NotationTest {

    @Mock
    User user;

    @Test
    public void should_add_note_nominal() {
        Mockito.when(this.user.isValid()).thenReturn(true);
        Notation notation = new Notation(this.user, 16);
        assertTrue(notation.canAddNote());
    }

    @Test
    public void should_not_add_note_user_not_valid() {
        Mockito.when(this.user.isValid()).thenReturn(false);
        Notation notation = new Notation(this.user, 16);
        assertFalse(notation.canAddNote());
    }

    @Test
    public void should_not_add_note_too_low() {
        Mockito.when(this.user.isValid()).thenReturn(true);
        Notation notation = new Notation(this.user, -1);
        assertFalse(notation.canAddNote());
    }

    @Test
    public void should_not_add_note_too_high() {
        Mockito.when(this.user.isValid()).thenReturn(true);
        Notation notation = new Notation(this.user, 22);
        assertFalse(notation.canAddNote());
    }
}
