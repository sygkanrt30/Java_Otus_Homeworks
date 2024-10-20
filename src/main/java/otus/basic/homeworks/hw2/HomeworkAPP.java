package otus.basic.homeworks.hw2;

import java.util.Arrays;
import java.util.Scanner;


public class HomeworkAPP {
    public static void main(String[] args) {
        int[] universalArr = {1, 3, 4, 5, 6, 7};
        int[] ans = reverseARR(universalArr);
        System.out.println(Arrays.toString(ans));
//-------------------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1, если нужно проверка на возрастание, или введите 2, если нужна проверка на убывание: ");
        int typeOfProgress = scanner.nextInt();
        boolean res = progressArr(universalArr, typeOfProgress);
        System.out.println(res);
//-------------------------------------------------
        boolean result = findPointInARR(universalArr);
        System.out.println(result);
//-------------------------------------------------
        int[] answer = sumALlArr(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 8, 3, 4, 5, 6, 7, 8, 5}, new int[]{0, 2, 3, 5}, new int[]{11, 8, 3, 4, 15, 1, 1, 1, 11}, new int[]{1, 8, 3, 4, 5, 6, 7, 8, 6, 9, 1});
        System.out.println(Arrays.toString(answer));
    }

    public static int[] sumALlArr(int[]... arr) {
        int[] biggestArr = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > biggestArr.length) {
                biggestArr = arr[i];
            }
        }
        biggestArr = biggestArr.clone();
        Arrays.fill(biggestArr, 0);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                biggestArr[j] += arr[i][j];
            }
        }
        return biggestArr;
    }


    public static boolean findPointInARR(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
            rightSum = 0;
        }
        return false;
    }

    public static int[] reverseARR(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - i - 1];
        }
        return arr1;
    }

    public static boolean progressArr(int[] arr, int typeOfProgress) {
        if (typeOfProgress == 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    return false;
                }
            }
        } else if (typeOfProgress == 2) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }
            }
        } else
            return false;
        return true;
    }
}