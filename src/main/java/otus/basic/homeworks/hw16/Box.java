package otus.basic.homeworks.hw16;

import otus.basic.homeworks.hw16.fruit.Fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Box<T extends Fruit> {
    private final List<T> content;

    public Box() {
        content = new ArrayList<>();
    }

    public List<T> getContent() {
        return content;
    }

    public void addFruit(T... fruits) {
        Collections.addAll(content, fruits);
    }

    public int weight() {
        int w = 0;
        for (T t : content) {
            w += t.getWeight();
        }
        return w;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.weight() == box.weight();
    }

    public void pourOver(Box<? super T> boxWithFruits) {
        for (T t : content) {
            boxWithFruits.addFruit(t);
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }
}
