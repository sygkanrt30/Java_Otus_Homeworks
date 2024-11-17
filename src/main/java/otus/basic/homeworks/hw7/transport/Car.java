package otus.basic.homeworks.hw7.transport;

import otus.basic.homeworks.hw7.TypeOfArea;

public class Car implements CurrentTransport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    @Override

    public boolean drive(TypeOfArea typeOfArea) {
        if (typeOfArea.equals(TypeOfArea.SWAMP) || typeOfArea.equals(TypeOfArea.FOREST)) {
            System.out.println("Машина не проедет здесь!");
            return false;
        } else if (typeOfArea.equals(TypeOfArea.PLAIN) && fuel > 0) {
            System.out.println("Автомобиль проехал " + (fuel * 8) + " км");
            fuel = 0;
            return true;
        }
        System.out.println("В машине закончился бензин!");
        return false;
    }
}
