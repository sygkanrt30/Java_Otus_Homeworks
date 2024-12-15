package otus.basic.homeworks.hw14;


public class App {
    public static void main(String[] args) {
        long start, end;
        double[] arr = new double[100_000_000];
        start = System.currentTimeMillis();
        makeArray(arr);
        end = System.currentTimeMillis();
        System.out.println(((end - start)) + " millisecond");
        System.out.println("---------------------");
        start = System.currentTimeMillis();
        makeArrayWithTreads(arr);
        end = System.currentTimeMillis();
        System.out.println(((end - start)) + " millisecond");
    }

    public static void makeArray(double[] arr) {
        for (int i = 0; i < arr.length / 4; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void makeArrayWithTreads(double[] arr) {
        int quater = arr.length / 4;
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < quater; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);

            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = quater; i < quater * 2; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = quater * 2; i < quater * 3; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = quater * 3; i < quater * 4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
