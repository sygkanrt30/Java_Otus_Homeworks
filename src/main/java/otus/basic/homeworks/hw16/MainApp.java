package otus.basic.homeworks.hw16;

import otus.basic.homeworks.hw16.fruit.Apple;
import otus.basic.homeworks.hw16.fruit.Fruit;
import otus.basic.homeworks.hw16.fruit.Orange;

public class MainApp {
    public static void main(String[] args) {
        Box<Fruit> boxAllTypeFruits = new Box<>();
        Box<Apple> boxApples = new Box<>();
        Box<Orange> boxOranges = new Box<>();
        Apple apple1 = new Apple(15);
        Apple apple2 = new Apple(5);
        Apple apple3 = new Apple(30);
        Orange orange1 = new Orange(20);
        Orange orange2 = new Orange(34);
        Orange orange3 = new Orange(18);
        boxAllTypeFruits.addFruit(apple1, orange1);
        for (Fruit fruit : boxAllTypeFruits.getContent()) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        boxApples.addFruit(apple2, apple3);
        for (Fruit fruit : boxApples.getContent()) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        boxOranges.addFruit(orange2, orange3);
        for (Fruit fruit : boxOranges.getContent()) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        System.out.println(boxAllTypeFruits.compare(boxApples));
        System.out.println(boxAllTypeFruits.compare(boxOranges));
        boxApples.pourOver(boxAllTypeFruits);
        for (Fruit fruit : boxAllTypeFruits.getContent()) {
            System.out.print(fruit + " ");
        }
    }
}
