
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Person implements Comparable<Person> {

    private String name;
    private Set<String> numbers;
    private String address;

    public Person(String name) {
        this.name = name;
        this.numbers = new HashSet<String>();
    }

    public String getName() {
        return this.name;
    }

    public String ignoreCase(String word) {
        return word.trim().toLowerCase();
    }

    public void addNumber(String number) {
        this.numbers.add(number);
    }

    public String getNumber() {
        String numberList = "";
        try {
            for (String n : this.numbers) {
                numberList += "\n " + n;
            }
            return numberList;
        } catch (Exception e) {
            return null;
        }
    }

    public void addAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        //try {
            return this.address;
       // } catch (Exception e) {
       //     return null;
       // }
    }

    public void remove() {
        this.address = null;
        this.numbers = null;
        this.name = null;
    }

    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    public String toString() {
        if (this.getAddress() == null) {
            return " address unknown" + "\n  phone numbers: " + this.getNumber();
        } else if (this.getNumber() == null || this.getNumber() == "") {
            return " address: " + this.getAddress() + "\n  phone number not found";
        } else {
            return " address: " + this.getAddress() + "\n  phone numbers: " + this.getNumber();
        }
    }
}
