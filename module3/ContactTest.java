package module3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


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

    @Test
    void contactList_hasNoDuplicatePeople() {
        ArrayList<Contact> contacts = new ArrayList<>(Arrays.asList(
                new Contact("Amy Han", "+1 603 555 0123"),
                new Contact("Amy Smith", "+1 603 555 0456")
        ));

        HashSet<String> uniqueNames = new HashSet<>();
        for (Contact contact : contacts) {
            uniqueNames.add(contact.getName());
        }

        assertEquals(contacts.size(), uniqueNames.size());
    }

}
