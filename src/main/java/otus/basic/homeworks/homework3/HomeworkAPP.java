package otus.basic.homeworks.homework3;


public class HomeworkAPP {
    public static void main(String[] args) {
        int[][] arr2d = {{-1, 2, 1, 5, 6}, {4, -2, 5, 1, 7}, {3, 1, -72, 2, 9}, {1, 2, 4, 7, 6}, {1, 3, 4, 5, 57}};
        int[][] arr2dCopy = {{-1, 2, 1, 5, 6}, {4, -2, 5, 1, 7}, {3, 1, -72, 2, 9}, {1, 2, 4, 7, 6}, {1, 3, 4, 5, 57}};
        System.out.println(sumOfPositiveElements(arr2d));
//-------------------------------------------------------------
        printSquare(5);
//-------------------------------------------------------------
        int[][] resultArr = zeroDiagonals(arr2dCopy);
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j < resultArr[i].length; j++) {
                System.out.print(resultArr[i][j] + " ");
            }
            System.out.println(" ");
        }
//-------------------------------------------------------------
        System.out.println(findMax(arr2d));
//-------------------------------------------------------------
        System.out.println(sumSecondString(arr2d));
    }

    public static int sumSecondString(int[][] arr2d) {
        int sum = 0;
        if (arr2d.length < 2) {
            return -1;
        }
        for (int i = 0; i < arr2d[1].length; i++) {
            sum += arr2d[1][i];
        }
        return sum;
    }

    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumOfPositiveElements(int[][] arr2d) {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] > 0) {
                    sum += arr2d[i][j];
                }
            }
        }
        return sum;
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1) {
                    System.out.print("*  \n");
                } else
                    System.out.print("*  ");
            }
        }
    }

    public static int[][] zeroDiagonals(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i == j || i + j == arr2D.length - 1) {
                    arr2D[i][j] = 0;
                }
            }
        }
        return arr2D;
    }

}
