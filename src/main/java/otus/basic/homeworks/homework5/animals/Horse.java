package otus.basic.homeworks.homework5.animals;


public class Horse extends Animals {

    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
        k = 4;
    }

    @Override
    public void isTired() {
        if (isTired) {
            System.out.println("Лошадь устала, она не может больше плавать и бегать!");
        } else {
            System.out.println("У лошади еще много сил!");
        }
    }
}
