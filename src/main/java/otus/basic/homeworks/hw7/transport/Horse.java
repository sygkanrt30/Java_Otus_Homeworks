package otus.basic.homeworks.hw7.transport;

import otus.basic.homeworks.hw7.TypeOfArea;

public class Horse implements CurrentTransport {
    private final int maxPower;
    private int power;

    public Horse(int power) {
        maxPower = power;
        this.power = maxPower;
    }

    public int getPower() {
        return maxPower;
    }

    @Override
    public boolean drive(TypeOfArea typeOfArea) {
        if (typeOfArea.equals(TypeOfArea.SWAMP)) {
            System.out.println("Лошадь увязла!");
            return false;
        }
        if (power > 0) {
            if (power * 30 >= 1000) {
                System.out.println("Лошадь проскакала " + (power * 30 / 1000) + " километров");
            } else {
                System.out.println("Лошадь проскакала " + (power * 30) + " метров");
            }
            power = 0;
            return true;
        }
        System.out.println("У лошади нет сил двигаться!");
        return false;
    }
}
