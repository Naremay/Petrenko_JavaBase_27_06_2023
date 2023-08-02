package ua.hillel.petrenko.homeworks.homework11;

import java.util.Scanner;

public class Transpon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int M = 1; // рядок
        int N = 1; // стовпець
        boolean ind = false; // для перевірки індикатор

        // Число від користувача для рядків
        do {
            System.out.print("Задайте кількість рядків: ");
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                ind = true;

                if (M < 0) {
                    System.out.println("Введіть додатнє число!\n");
                    ind = false;
                    scanner.nextLine();
                }

            } else {
                System.out.println("Помилка! У наступний раз введіть ціле число.\n");
                scanner.nextLine();
            }
        } while (!ind);
        scanner.nextLine();

        // Число від користувача для стовпців
        ind = false;
        do {
            System.out.print("Задайте кількість стовпців: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                ind = true;

                if (N < 0) {
                    System.out.println("Введіть додатнє число!\n");
                    ind = false;
                    scanner.nextLine();
                }
            } else {
                System.out.println("Помилка! У наступний раз введіть ціле число.\n");
                scanner.nextLine();
            }
        } while (!ind);

        // Створюємо матриці
        int[][] array1 = new int[M][N];
        int[][] array2 = new int[N][M];

        // Заповнення випадковими числами
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }

        // Виведення початкової матриці
        System.out.println("\nBEFORE");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        // Транспонування матриці
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array2[j][i] = array1[i][j];
            }
        }

        // Виведення транспонованої матриці
        System.out.println("\nAFTER");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
