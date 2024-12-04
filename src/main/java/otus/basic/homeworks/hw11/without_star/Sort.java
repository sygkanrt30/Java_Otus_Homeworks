package otus.basic.homeworks.hw11.without_star;

public class Sort {
    public static void bubbleSort(int[] array) {
        boolean needSort;
        do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needSort = true;
                }
            }
        } while (needSort);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0 || low >= high)
            return;
        int middle = low + (high - low) / 2;
        int support = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < support) {
                i++;
            }
            while (array[j] > support) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
}
