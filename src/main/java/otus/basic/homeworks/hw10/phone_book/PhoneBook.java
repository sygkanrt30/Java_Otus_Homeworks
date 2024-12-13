package otus.basic.homeworks.hw10.phone_book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class PhoneBook {
    private final Map<String, HashSet<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }

    public void find(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name));
        } else {
            System.out.println("There are no registered numbers for this name");
        }
    }

    public boolean containsPhoneNumber() {
        return !phoneBook.isEmpty();
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }
}
