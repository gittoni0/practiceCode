import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ContactList {

    private Map<String, Person> contactList;
    private Person contact;

    public ContactList() {
        this.contactList = new HashMap<String, Person>();
    }

    public void addContact(String name) {
        if (!contactList.containsKey(name)) {
            this.contact = new Person(name);
            contactList.put(name, contact);
        }
    }

    public Person getPersonObject(String name) {
        try {
            if (!(this.contactList.get(name) == null)) {
                return this.contactList.get(name);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    public List<Person> getValues() {
        List<Person> values = new ArrayList<Person>();
        for (Person c : contactList.values()) {
            values.add(c);
        }
        return values;
    }

    public void removeContact(String name) {
        if (!(contactList.get(name) == null)) {
            contactList.get(name).remove();
            contactList.remove(name);
        }
    }

    public String ignoreCase(String word) {
        return word.toLowerCase();
    }

    public List<Person> getMatch(String keyword) {
        List<Person> matches = new ArrayList<Person>();
        matches.clear();
        try {
            for (Person c : contactList.values()) {
                if (c.getName().toLowerCase().contains(keyword.toLowerCase()) || c.getAddress().toLowerCase().contains(keyword.toLowerCase())) {
                    matches.add(c);
                }

            }
            Collections.sort(matches);
            return matches;
        } catch (Exception e) {
            return matches;
        }
    }
}
