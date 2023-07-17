package ua.hillel.petrenko.homeworks.homework6;

import java.util.Scanner;

public class Teams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення назви першої команди
        System.out.print("Введіть назву першої команди: ");
        String firstTeamName = scanner.nextLine();

        // Введення кількості фрагів для 5-ти гравців першої команди
        System.out.print("Введіть кількість фрагів для 1-го гравця команди " + firstTeamName + ": ");
        int firstPlayerScore1 = 1;
        if (scanner.hasNextInt()) {
            firstPlayerScore1 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 2-го гравця команди " + firstTeamName + ": ");
        int firstPlayerScore2 = 1;
        if (scanner.hasNextInt()) {
            firstPlayerScore2 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 3-го гравця команди " + firstTeamName + ": ");
        int firstPlayerScore3 = 1;
        if (scanner.hasNextInt()) {
            firstPlayerScore3 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 4-го гравця команди " + firstTeamName + ": ");
        int firstPlayerScore4 = 1;
        if (scanner.hasNextInt()) {
            firstPlayerScore4 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 5-го гравця команди " + firstTeamName + ": ");
        int firstPlayerScore5 = 1;
        if (scanner.hasNextInt()) {
            firstPlayerScore5 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }
        scanner.nextLine();

        // Введення назви другої команди
        System.out.print("\nВведіть назву другої команди: ");
        String secondTeamName = scanner.nextLine();

        // Введення кількості фрагів для 5-ти гравців другої команди
        System.out.print("Введіть кількість фрагів для 1-го гравця команди " + secondTeamName + ": ");
        int secondPlayerScore1 = 1;
        if (scanner.hasNextInt()) {
            secondPlayerScore1 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 2-го гравця команди " + secondTeamName + ": ");
        int secondPlayerScore2 = 1;
        if (scanner.hasNextInt()) {
            secondPlayerScore2 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 3-го гравця команди " + secondTeamName + ": ");
        int secondPlayerScore3 = 1;
        if (scanner.hasNextInt()) {
            secondPlayerScore3 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 4-го гравця команди " + secondTeamName + ": ");
        int secondPlayerScore4 = 1;
        if (scanner.hasNextInt()) {
            secondPlayerScore4 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        System.out.print("Введіть кількість фрагів для 5-го гравця команди " + secondTeamName + ": ");
        int secondPlayerScore5 = 1;
        if (scanner.hasNextInt()) {
            secondPlayerScore5 = scanner.nextInt();
        } else {
            System.out.println("Помилка! У наступний раз введіть число.");
            System.exit(0);
        }

        // Рахуємо середнє арифметичне кожної команди
        double firstTeamAverageScore = (double) (firstPlayerScore1 + firstPlayerScore2 + firstPlayerScore3 + firstPlayerScore4 + firstPlayerScore5) / 5;
        double secondTeamAverageScore = (double) (secondPlayerScore1 + secondPlayerScore2 + secondPlayerScore3 + secondPlayerScore4 + secondPlayerScore5) / 5;

        // Порівнюємо результати і шукаємо переможця
        String winner;
        double result;
        if (firstTeamAverageScore > secondTeamAverageScore) {
            result = firstTeamAverageScore;
            System.out.println("\nПеремогла команда " + firstTeamName + ", що набрала " + result + " фрагів.");
        } else if (firstTeamAverageScore < secondTeamAverageScore) {
            result = secondTeamAverageScore;
            System.out.println("\nПеремогла команда " + secondTeamName + ", що набрала " + result + " фрагів.");
        } else {
            winner = "нічия";
            result = secondTeamAverageScore; // нема різниці чий брати результат
            System.out.println("\nПеремогла " + winner + ", обидві команди набрали " + result + " фрагів. Молодці.");
        }

    }
}
