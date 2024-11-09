package otus.basic.homeworks.homework5.animals;


public class Cat extends Animals {

    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void isTired() {
        if (isTired) {
            System.out.println("Кот устал, он не может больше бегать!");
        } else {
            System.out.println("У кота еще много сил!");
        }
    }

    public int swim(int distance) {
        System.out.println("Коты не умеют плавать!");
        return -1;
    }
}
