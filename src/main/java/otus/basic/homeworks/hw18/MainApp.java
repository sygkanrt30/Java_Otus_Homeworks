package otus.basic.homeworks.hw18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainApp {
    public static void main(String[] args) {
        var printABC = new PrintABC();
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            service.execute(() -> {
                printABC.printA();
                printABC.printB();
                printABC.printC();
            });
        }
        service.shutdown();
    }
}
