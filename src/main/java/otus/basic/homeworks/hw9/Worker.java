package otus.basic.homeworks.hw9;


public class Worker {
    private final String name;
    private final int age;

    public Worker(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
