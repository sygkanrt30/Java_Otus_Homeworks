package otus.basic.homeworks.homework5.animals;

public abstract class Animals {
    private final String name;
    protected final int speedRun;
    protected final int speedSwim;
    protected int endurance;
    protected boolean isTired;

    public Animals(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
        isTired = false;
    }

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + speedRun + " м/c");
        System.out.println("Скорость плавания: " + speedSwim + " м/c");
        System.out.println("Выносливость: " + endurance + " ед.");
    }

    public abstract void isTired();

    public int run(int distance) {
        endurance -= distance;
        if (endurance <= 0) {
            isTired = true;
            return -1;
        } else {
            return distance / speedRun;
        }
    }

    public abstract int swim(int distance);
}
