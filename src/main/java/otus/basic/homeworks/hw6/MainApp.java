package otus.basic.homeworks.hw6;


import otus.basic.homeworks.hw6.items.Cat;
import otus.basic.homeworks.hw6.items.Plate;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat(14),
                new Cat(11),
                new Cat(9),
                new Cat(42),
                new Cat(5)
        };
        Plate plate = new Plate(76);
        int food = plate.getCurrentQuantityFood();
        for (Cat cat : cats) {
            cat.eat(food);
            food -= cat.getQuantityOfFood();
            plate.setCurrentQuantityFood(food);
        }
    }
}
