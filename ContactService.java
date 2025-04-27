package contactservice;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    // Add Contact
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID must be unique");
        }
        contacts.put(contact.getContactId(), contact);
    }

    // Delete Contact
    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        contacts.remove(contactId);
    }

    // Update Contact Fields
    public void updateFirstName(String contactId, String newFirstName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setFirstName(newFirstName);
        } else {
            throw new IllegalArgumentException("Contact not found");
        }
    }

    public void updateLastName(String contactId, String newLastName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setLastName(newLastName);
        } else {
            throw new IllegalArgumentException("Contact not found");
        }
    }

    public void updatePhone(String contactId, String newPhone) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setPhone(newPhone);
        } else {
            throw new IllegalArgumentException("Contact not found");
        }
    }

    public void updateAddress(String contactId, String newAddress) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setAddress(newAddress);
        } else {
            throw new IllegalArgumentException("Contact not found");
        }
    }
}
