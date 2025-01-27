package otus.basic.homeworks.hw18;

public class PrintABC {
    private static final Object MONITOR = new Object();
    private char letter = 'A';

    public void printA() {
        synchronized (MONITOR) {
            try {
                while (letter != 'A') {
                    MONITOR.wait();
                }
                System.out.print(letter);
                letter = 'B';
                MONITOR.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printB() {
        synchronized (MONITOR) {
            try {
                while (letter != 'B') {
                    MONITOR.wait();
                }
                System.out.print(letter);
                letter = 'C';
                MONITOR.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void printC() {
        synchronized (MONITOR) {
            try {
                while (letter != 'C') {
                    MONITOR.wait();
                }
                System.out.print(letter);
                letter = 'A';
                MONITOR.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
