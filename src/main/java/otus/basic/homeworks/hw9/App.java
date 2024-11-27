package otus.basic.homeworks.hw9;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", 29));
        workers.add(new Worker("Anthony", 33));
        workers.add(new Worker("JJ", 43));
        workers.add(new Worker("James", 40));
        workers.add(new Worker("Collins", 28));
        workers.add(new Worker("Stephen", 37));


    }

    public static Worker youngestWorker(ArrayList<Worker> arr) {
        Worker youngestWorker = null;
        int min = Integer.MAX_VALUE;
        for (Worker worker : arr) {
            int a = worker.getAge();
            if (a < min) {
                youngestWorker = worker;
                min = a;
            }
        }
        return youngestWorker;
    }

    public static boolean isUpAverageAge(ArrayList<Worker> arr, int minAverageAge) {
        int sum = 0;
        for (Worker worker : arr) {
            sum += worker.getAge();
        }
        return (sum / arr.size()) > minAverageAge;
    }

    public static ArrayList<Worker> filterByAge(ArrayList<Worker> arr, int minAge) {
        ArrayList<Worker> workers = new ArrayList<>();
        for (Worker worker : arr) {
            if (worker.getAge() >= minAge) {
                workers.add(worker);
            }
        }
        return workers;
    }

    public static ArrayList<String> getNames(ArrayList<Worker> arr) {
        ArrayList<String> names = new ArrayList<>();
        for (Worker worker : arr) {
            names.add(worker.getName());
        }
        return names;
    }

    public static void changeList(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, n);
        }
    }

    public static void increaseList(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, (arr.get(i) + n));
        }
    }

    public static ArrayList<Integer> makeSequence(int min, int max) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arr.add(i);
        }
        return arr;
    }

    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int el : arr) {
            if (el > 5) {
                sum += el;
            }
        }
        return sum;
    }


}
