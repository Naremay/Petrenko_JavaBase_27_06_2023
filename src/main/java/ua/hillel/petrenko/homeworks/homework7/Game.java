package ua.hillel.petrenko.homeworks.homework7;

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11); // загадане число
        System.out.println(randomNumber + " (для перевірки роботи коду)");

        int attempts = 3; // кількість спроб
        int attemptCount = 0; // рахуємо спроби
        int userValue = -1; // число від користувача

        System.out.println("Вгадайте число від 0 до 10. Ви маєте " + attempts + " спроби.");

        do {
            System.out.print("\nСпроба " + (attemptCount + 1) + ".\nВведіть число: ");

            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();

                if (userValue >= 0 && userValue <= 10) { // спроба буде зарахована у тому випадку, якщо число буде від 0 до 10
                    attemptCount++;

                    if (userValue == randomNumber) {
                        System.out.println("Вітаю! Ви вгадали.");
                        break;
                    } else if (attemptCount == attempts) {
                        System.out.println("Яка невдача, спроби закінчилися. Загадане число було: " + randomNumber);
                    } else if (userValue < randomNumber) {
                        System.out.println("Загадане число більше.");
                    } else {
                        System.out.println("Загадане число менше.");
                    }

                } else {
                    System.out.println("Введіть число від 0 до 10.");
                }

            } else {
                System.out.println("Вам потрібно ввести ціле число!");
            }
            scanner.nextLine();

        } while (attemptCount < attempts);
    }
}
