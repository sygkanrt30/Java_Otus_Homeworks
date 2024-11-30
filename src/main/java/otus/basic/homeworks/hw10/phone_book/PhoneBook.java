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
        int k = 0;
        for (Map.Entry<String, HashSet<String>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry.getValue());
                k++;
            }
        }
        if (k == 0) {
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
