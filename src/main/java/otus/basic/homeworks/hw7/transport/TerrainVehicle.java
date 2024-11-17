package otus.basic.homeworks.hw7.transport;

import otus.basic.homeworks.hw7.TypeOfArea;

public class TerrainVehicle implements CurrentTransport {
    private int fuel;

    public TerrainVehicle(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public boolean drive(TypeOfArea typeOfArea) {
        if (fuel > 0) {
            System.out.println("Вездеход проехал " + (fuel * 9) + " км");
            fuel = 0;
            return true;
        }
        System.out.println("У вездехода закончился бензин!");
        return false;
    }
}
