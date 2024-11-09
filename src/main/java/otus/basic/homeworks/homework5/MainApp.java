package otus.basic.homeworks.homework5;

import otus.basic.homeworks.homework5.animals.Cat;
import otus.basic.homeworks.homework5.animals.Dog;
import otus.basic.homeworks.homework5.animals.Horse;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1, 0, 100);
        Dog dog = new Dog("John", 2, 2, 200);
        Horse horse = new Horse("Meg", 5, 1, 400);
        System.out.println(cat.run(60) + " секунд");
        System.out.println(cat.run(40) + " секунд");
        cat.isTired();
        System.out.println();
        System.out.println(dog.run(60)  + " секунд");
        System.out.println(dog.swim(70) + " секунд");
        dog.isTired();
        System.out.println();
        System.out.println(horse.run(80)  + " секунд");
        System.out.println(horse.swim(80) + " секунд");
        horse.isTired();
        cat.info();
        System.out.println();
        dog.info();
        System.out.println();
        horse.info();
    }
}
