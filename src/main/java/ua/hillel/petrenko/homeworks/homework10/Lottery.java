package ua.hillel.petrenko.homeworks.homework10;

public class Lottery {
    public static void main(String[] args) {

        // Числа від організатора
        int[] organizer = new int[7];

        // Заповнення випадковими числами від 0 до 9
        for (int i = 0; i < organizer.length; i++) {
            organizer[i] = (int) (Math.random() * 10);
        }

        // Сортування (бульбашка)
        for (int i = 0; i < organizer.length - 1; i++) {
            for (int j = 0; j < organizer.length - 1 - i; j++) {
                if (organizer[j] > organizer[j + 1]) {
                    int temp = organizer[j];
                    organizer[j] = organizer[j + 1];
                    organizer[j + 1] = temp;
                }
            }
        }

        // Вивід
        System.out.print("Відсортвані числа, які загадав організатор лотереї: ");
        for (int i = 0; i < organizer.length; i++) {
            if (i == organizer.length - 1) {
                System.out.println(organizer[i]);
            } else {
                System.out.print(organizer[i] + ", ");
            }
        }


        // Числа від гравця
        int[] player = new int[7];

        // Заповнення випадковими числами від 0 до 9
        for (int i = 0; i < player.length; i++) {
            player[i] = (int) (Math.random() * 10);
        }

        // Сортування (бульбашка)
        for (int i = 0; i < player.length - 1; i++) {
            for (int j = 0; j < player.length - 1 - i; j++) {
                if (player[j] > player[j + 1]) {
                    int temp = player[j];
                    player[j] = player[j + 1];
                    player[j + 1] = temp;
                }
            }
        }

        // Вивід
        System.out.print("Відсортвані числа, які загадав гравець: ");
        for (int i = 0; i < player.length; i++) {
            if (i == player.length - 1) {
                System.out.println(player[i]);
            } else {
                System.out.print(player[i] + ", ");
            }
        }


        // Шукаємо збіги
        System.out.print("Збіги у комірках (в дужках числа): ");
        int counter = 0;
        for (int i = 0; i < organizer.length; i++) {
            if (organizer[i] == player[i]) {
                counter++;
                if (counter > 1) {
                    System.out.print(", ");
                }
                System.out.print(i + "(" + organizer[i] + ")");
            }
        }

        if (counter == 0) {
            System.out.print("0");
        }
        System.out.println("\nКількість збігів: " + counter);

    }
}
