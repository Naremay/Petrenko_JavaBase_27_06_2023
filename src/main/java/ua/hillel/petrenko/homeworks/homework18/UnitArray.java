package ua.hillel.petrenko.homeworks.homework18;

public class UnitArray {

    // якщо арифметичне рахує правильно, то масив не пустий = 2.0
    // якщо null = -1
    // якщо масив/матриця пустий = -2
    // якщо матриця не квадратна = -3
    // якщо матриця квадратна = 3

    public static double averageArray(int[] array) {

        if (array == null) {
            return -1;
        }

        if (array.length == 0) {
            return -2;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length; // 2
    }

    public static int checkMatrix(int[][] matrix) {

        if (matrix == null) {
            return -1;
        }

        if (matrix.length == 0) {
            return -2;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                return -3;
            }
        }
        return matrix.length; // 3
    }
}