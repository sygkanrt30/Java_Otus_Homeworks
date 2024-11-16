package otus.basic.homeworks.hw6.items;


public class Cat {
    private boolean full;
    private final int quantityOfFood;

    public Cat(int quantityOfFood) {
        this.quantityOfFood = quantityOfFood;
        full = false;
    }

    public boolean isFull() {
        return full;
    }

    public int getQuantityOfFood() {
        return quantityOfFood;
    }

    public void eat(int quantityOfFood) {
        if (quantityOfFood >= this.quantityOfFood) {
            System.out.println("Кот покушал, он сыт!");

            full = true;
        } else {
            System.out.println("Кот не покушал, ему не хватает еды в миске!");
            full = false;
        }
    }

}
