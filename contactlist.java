import java.util.LinkedList;
import java.util.List;

//one person has only one contact
public class ContactList {
    List<Contact> contacts;
    private int size;

    ContactList() {
        contacts = new LinkedList<>();
    }

    public ContactList(List<Contact> contacts) {
        this.contacts = contacts;
    }

    void addContact(Contact contact) {
        contacts.add(contact);
    }

    public boolean isEmpty() {
        return contacts.isEmpty();
    }

    public void addFirst(long id, String name, String phonenumber, String nickname, String email) {
        size++;
    }

    public int getSize() {
        return size;
    }

    public void insert(long id, String name, String phonenumber, String nickname,String email) {
        if (this.isEmpty()) {
            this.addFirst(id, name, phonenumber, nickname,email);
        } else {
            while (contacts != null && !contacts.isEmpty()) {
                this.insert(id, name, phonenumber, nickname,email);
            }
            size++;
        }
    }

    public Contact search(long id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return (Contact) contacts;
            }
        }
        return (Contact) contacts; // Contact not found
    }

    public int printAll() {
        if (isEmpty()) {
            return Integer.MIN_VALUE; // List is empty
        } else {
            while (contacts != null) {
                System.out.print(contacts);
            }
        }
        return 0;
    }

    public boolean deleteContactByName(long id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                contacts.remove(contact);
                return true; // Contact deleted successfully
            }
        }
        return false; // Contact not found
    }
}
