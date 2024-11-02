package otus.basic.homeworks.homework4;


public class Box {
    private String color;
    private final int width;
    private final int height;
    private final int lenght;
    private String item;
    private boolean isOpened;

    public Box(String color, int lenght, int width, int height) {
        this.color = color;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.isOpened = false;
    }

    public void getInformation() {
        System.out.println("Цвет коробки " + color + "\nПараметры: " + "\nдлина: " + lenght + "см\nширина: " + width + "см\nвысота: " + height + "см");
        if (isOpened) {
            System.out.println("На данный момент коробка открыта,");
        } else {
            System.out.println("На данный момент коробка закрыта,");
        }
        if (item != null) {
            System.out.println("в коробке лежит " + item + ".");
            System.out.println();
        } else {
            System.out.println("в коробке ничего не лежит.");
            System.out.println();
        }
    }

    public void open() {
        isOpened = true;
        System.out.println("Коробка открыта");
        System.out.println();
    }

    public void close() {
        isOpened = false;
        System.out.println("Коробка закрыта");
        System.out.println();
    }

    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Цвет изменен на " + newColor);
        System.out.println();
    }

    public void takeItemOutBox() {
        if (isOpened) {
            if (item != null) {
                System.out.println("Предмет " + item + " вытащен из коробки");
                System.out.println();
                item = null;
            } else {
                System.out.println("В коробке нет предметов!");
                System.out.println();
            }
        } else {
            System.out.println("Коробку нужно открыть!");
            System.out.println();
        }
    }

    public void putItemInBox(String newItem) {
        if (isOpened) {
            if (item != null) {
                System.out.println("В коробке уже есть предмет " + item + ", сначала его нужно вытащить!");
                System.out.println();
            } else {
                item = newItem;
                System.out.println("Предмет " + newItem + " лежит в коробке");
                System.out.println();
            }
        } else {
            System.out.println("Коробку нужно открыть!");
            System.out.println();
        }
    }
}
