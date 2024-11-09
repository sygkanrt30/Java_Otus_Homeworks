package otus.basic.homeworks.homework5.animals;


public class Horse extends Animals {

    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void isTired() {
        if (isTired) {
            System.out.println("Лошадь устала, она не может больше плавать и бегать!");
        } else {
            System.out.println("У лошади еще много сил!");
        }
    }

    @Override
    public int swim(int distance) {
        endurance -= distance * 4;
        if (endurance <= 0) {
            isTired = true;
            return -1;
        } else {
            return speedSwim / distance;
        }
    }
}
