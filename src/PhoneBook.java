import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (contacts.containsKey(lastName)) {
            contacts.get(lastName).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            contacts.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Новиков", "562-895-1452");
        phoneBook.add("Сидоров", "458-658-9874");
        phoneBook.add("Новиков", "147-852-1254");

        List<String> ivanovPhones = phoneBook.get("Новиков");
        System.out.println("Телефоны для Новиков:");
        for (String phone : ivanovPhones) {
            System.out.println(phone);
        }
    }
}
