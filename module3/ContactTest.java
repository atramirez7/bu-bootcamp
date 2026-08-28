package module3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {

    private Contact contact;

    @BeforeEach
    void setUp() {
        contact = new Contact("Amy Han", "+1 603 555 0123");
    }

    @Test
    void getName_returnsCorrectName() {
        assertEquals("Amy Han", contact.getName());
    }

    @Test
    void getPhone_returnsCorrectPhone() {
        assertEquals("+1 603 555 0123", contact.getPhone());
    }
    @Test
    void toString_containsBothFields() {
        assertTrue(contact.toString().contains("Amy Han"));
        assertTrue(contact.toString().contains("+1 603 555 0123"));
    }

    @Test
    void toString_containsName() {
        assertTrue(contact.toString().contains("Amy Han"));
    }

    @Test
    void toString_containsPhone() {
        assertTrue(contact.toString().contains("555 0123"));
    }

}
