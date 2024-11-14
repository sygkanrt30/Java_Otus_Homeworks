package otus.basic.homeworks.hw6.items;


public class Cat {
    private boolean isFull;
    private final int quantityOfFood;

    public Cat(int quantityOfFood) {
        this.quantityOfFood = quantityOfFood;
        isFull = false;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getQuantityOfFood() {
        return quantityOfFood;
    }

    public void eat(int quantityOfFood) {
        if (quantityOfFood >= this.quantityOfFood) {
            System.out.println("Кот покушал, он сыт!");

            isFull = true;
        } else {
            System.out.println("Кот не покушал, ему не хватает еды в миске!");
            isFull = false;
        }
    }

}
