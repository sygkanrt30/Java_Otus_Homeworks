package otus.basic.homeworks.hw18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainApp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            service.execute(() -> {
                printA();
                printB();
                printC();
            });
        }
        service.shutdown();
    }

    public static synchronized void printA() {
        System.out.print("A");
    }

    public static synchronized void printB() {
        System.out.print("B");
    }

    public static synchronized void printC() {
        System.out.print("C");
    }
}
