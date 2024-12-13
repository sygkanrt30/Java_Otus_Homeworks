package otus.basic.homeworks.hw1;

import java.util.Scanner;

public class HomeworkApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5:");
        int method = scanner.nextInt();
        int a = generateInt(0, 10000);
        int b = generateInt(0, 10000);
        int c = generateInt(0, 10000);
        if (method == 1) {
            greetings();
        } else if (method == 2) {
            checkSign(a, b, c);
            System.out.println("a:" + a + "\n" + "b:" + b + "\n" + "c:" + c);
        } else if (method == 3) {
            int n = generateInt(0, 30);
            selectColor(n);
        } else if (method == 4) {
            compareNumbers(a, b);
            System.out.println("a:" + a + "\n" + "b:" + b);
        } else if (method == 5) {
            int increment = generateInt(1, 3) - 1;
            if (increment == 0) {
                addOrSubtractAndPrint(a, b, false);
                System.out.println("a:" + a + "\n" + "b:" + b);
            } else {
                addOrSubtractAndPrint(a, b, true);
                System.out.println("a:" + a + "\n" + "b:" + b);
            }

        } else {
            System.out.println("Число вышло за границы диапазона");
        }

    }

    public static void greetings() {
        System.out.print("Hello" + "\n" + "World" + "\n" + "from" + "\n" + "Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");

        }
    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

    public static int generateInt(int min, int max) {
        return min + (int) (Math.random() * max - min);
    }
}
