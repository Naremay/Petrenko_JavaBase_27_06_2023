package ua.hillel.petrenko.homeworks.homework9;

public class Rugby {
    public static void main(String[] args) {

        // Працюємо з першою командою, створюємо масив
        int[] team1 = new int[25];

        // Заповнення випадковими числами від 18 до 40
        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (18 + Math.random() * 23);
        }

        // Вивід
        System.out.print("Вік першої команди: ");
        for (int i = 0; i < team1.length; i++) {
            if (i == team1.length - 1) {
                System.out.print(team1[i] + "\n");
            } else {
                System.out.print(team1[i] + ", ");
            }
        }

        // Шукаємо і виводимо середнє арифметичне для першої команди
        int sumTeam1 = 0;
        for (int i = 0; i < team1.length; i++) {
            sumTeam1 += team1[i];
        }
        int averageTeam1 = sumTeam1 / 25;
        System.out.println("Середній рік гравців першої команди: " + averageTeam1);


        // Працюємо з другою командою, створюємо масив
        int[] team2 = new int[25];

        // Заповнення випадковими числами від 18 до 40
        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (18 + Math.random() * 23);
        }

        // Вивід
        System.out.print("\nВік другої команди: ");
        for (int i = 0; i < team2.length; i++) {
            if (i == team2.length - 1) {
                System.out.print(team2[i]);
            } else {
                System.out.print(team2[i] + ", ");
            }
        }

        // Шукаємо і виводимо середнє арифметичне для другої команди
        int sumTeam2 = 0;
        for (int i = 0; i < team2.length; i++) {
            sumTeam2 += team2[i];
        }
        int averageTeam2 = sumTeam2 / 25;
        System.out.println("\nСередній рік гравців другої команди: " + averageTeam2);
    }
}
