package otus.basic.homeworks.hw6.items;


public class Plate {
    private final int maxQuantityFood;
    private int currentQuantityFood;

    public Plate(int maxQuantityFood) {
        this.maxQuantityFood = maxQuantityFood;
        currentQuantityFood = maxQuantityFood;
    }

    public void setCurrentQuantityFood(int currentQuantityFood) {
        this.currentQuantityFood = currentQuantityFood;
    }

    public int getMaxQuantityFood() {
        return maxQuantityFood;
    }

    public int getCurrentQuantityFood() {
        return currentQuantityFood;
    }

    public void addFood(int quantityFood) {
        if (currentQuantityFood + quantityFood <= maxQuantityFood) {
            currentQuantityFood += quantityFood;
            System.out.println("Еда успешно добавлена");
        } else {
            System.out.println("Еда не добавлена, не хватило места!");
        }
    }

    public boolean removeFood(int quantityFood) {
        return currentQuantityFood - quantityFood >= 0;
    }

}
