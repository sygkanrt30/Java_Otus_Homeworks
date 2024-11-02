package otus.basic.homeworks.homework4;


public class User {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final int yearOfBirth;
    private final String email;

    public User(String surname, String name, String patronymic, int yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void getInformation() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("e-mail: " + email);
    }

}
