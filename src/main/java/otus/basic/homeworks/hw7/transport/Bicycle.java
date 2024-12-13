package otus.basic.homeworks.hw7.transport;

import otus.basic.homeworks.hw7.TypeOfArea;

public class Bicycle implements CurrentTransport {
    @Override
    public boolean drive(TypeOfArea typeOfArea) {
        if (typeOfArea.equals(TypeOfArea.SWAMP)) {
            System.out.println("Велосипед увяз!");
            return false;
        }
        System.out.println("Человек доехал на велосипеде до нужного места!");
        return true;
    }
}
