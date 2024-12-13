package otus.basic.homeworks.hw10;


import otus.basic.homeworks.hw10.phone_book.PhoneBook;

public class App {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("CJ", "991-833-34-43");
        phoneBook.add("CJ", "991-844-34-43");
        phoneBook.add("MJ", "991-833-34-43");
        phoneBook.add("Collins", "991-833-34-43");
        phoneBook.add("JJ", "991-833-345-4");
        phoneBook.add("Dug", "991-83453-34-4553");
        phoneBook.add("Dug", "991-83453-34-453");
        phoneBook.add("Dug", "991-83453-344-453");
        System.out.println(phoneBook);
        phoneBook.find("Dug");
        System.out.println(phoneBook.containsPhoneNumber());


    }
}
