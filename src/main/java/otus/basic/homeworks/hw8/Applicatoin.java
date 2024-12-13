package otus.basic.homeworks.hw8;

public class Applicatoin {
    public static void main(String[] args) {
        int[][] matrix;
        int sum = 0;
        try {
            matrix = makeInt(new String[][]{{"1", "4", "33", "333"},
                    {"4", "45", "33", "1"},
                    {"451", "489", "383", "32"},
                    {"18", "48", "38", "5"},});
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    sum += anInt;
                }
            }
        } catch (AppArraySizeException | AppArrayDataException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum);
    }

    public static int[][] makeInt(String[][] matrix) throws AppArraySizeException, AppArrayDataException {
        for (String[] strings : matrix) {
            if (matrix.length != 4 || strings.length != 4) {
                throw new AppArraySizeException("Массив должен быть 4х4");
            }
        }
        int[][] newMatrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    newMatrix[i][j] = Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ячейка с координатами " + i + " " + j + " состоит не только из цифр");
                }

            }
        }
        return newMatrix;
    }
}
