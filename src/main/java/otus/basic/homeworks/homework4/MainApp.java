package otus.basic.homeworks.homework4;


public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Соловьев", "Иван", "Максимович", 2006, "@@@@@@@@@@"),
                new User("Соловьев", "Никита", "Максимович", 1967, "@@@@@@@@@@"),
                new User("Соловьев", "Петр", "Максимович", 1988, "@@@@@@@@@@"),
                new User("Соловьев", "Сергей", "Максимович", 2000, "@@@@@@@@@@"),
                new User("Соловьев", "Николай", "Максимович", 1982, "@@@@@@@@@@"),
                new User("Соловьев", "Ян", "Максимович", 2021, "@@@@@@@@@@"),
                new User("Соловьев", "Иван", "Максимович", 1992, "@@@@@@@@@@"),
                new User("Соловьев", "Дмитрий", "Максимович", 1970, "@@@@@@@@@@"),
                new User("Соловьев", "Владимир", "Максимович", 1975, "@@@@@@@@@@"),
        };
        for (User user : users) {
            if (2024 - user.getYearOfBirth() > 40) {
                user.getInformation();
                System.out.println();
            }
        }
        Box box = new Box("коричневый", 100, 50, 40);

        box.open();
        box.putItemInBox("Меч");
        box.takeItemOutBox();
        box.putItemInBox("Мяч");
        box.changeColor("зеленый");
        box.close();
        box.getInformation();

    }
}
