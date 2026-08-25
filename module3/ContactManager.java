import java.util.*;

public class ContactManager {

    public static void main(String[] args) {

        HashMap<String, Contact> contacts = new HashMap<>();

        // Step 4: add contacts here
        contacts.put("Ada Lovelace", new Contact("Ada Lovelace", "+1 617 555 0101"));
        contacts.put("Amy Han", new Contact("Amy Han", "+1 603 555 0123"));
        contacts.put("Zeth Hopper", new Contact("Zeth Hopper", "+1 747 555 0147"));
        contacts.put("Mike Johnson", new Contact("Mike Johnson", "+1 781 555 0164"));
        contacts.put("Oscar Peterson", new Contact("Oscar Peterson", "+1 978 555 0182"));

        // Step 5: look up a contact
        Contact contact = contacts.get("Ada Lovelace");
        if (contact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(contact);
        }

        contact = contacts.get("Unknown Contact");
        if (contact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(contact);
        }

        // Extra: Remove a contact
        Contact contactToRemove = contacts.remove("Mike Johnson");
        if (contactToRemove != null) {
            System.out.println("Removed contact: " + contactToRemove);
        } else {
            System.out.println("Contact not found for removal.");
        }

        // Step 6: print sorted list
        ArrayList<Contact> sorted = new ArrayList<>(contacts.values());
        sorted.sort((a, b) -> a.getName().compareTo(b.getName()));

        System.out.println("=== All Contacts ===");
        for (Contact sortedContact : sorted) {
            System.out.println(sortedContact);
        }
    }
}
