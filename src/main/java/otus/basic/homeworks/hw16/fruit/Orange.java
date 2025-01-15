package otus.basic.homeworks.hw16.fruit;

public class Orange extends Fruit {
    public Orange(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                '}';
    }
}
