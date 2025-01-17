package otus.basic.homeworks.hw16.fruit;

public class Apple extends Fruit {
    public Apple(int weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
