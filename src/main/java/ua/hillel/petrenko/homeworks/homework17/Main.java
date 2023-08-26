package ua.hillel.petrenko.homeworks.homework17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    static void runApp() {
        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        DrinksMachine drinksMachine = null;

        while (true) {
            System.out.println();
            System.out.println("Введіть назву напою зі списку: " + Arrays.toString(drinksMachines) + " або [EXIT], щоб " +
                    "припинити замовлення.");
            String userValue = scanner.nextLine().toUpperCase();

            if (userValue.equals("EXIT")) {
                break;
            }

            boolean ind = false;
            for (DrinksMachine drinkType : drinksMachines) {
                if (userValue.equals(drinkType.toString())) {
                    drinksMachine = drinkType;
                    ind = true;
                    break;
                }
            }

            if (!ind) {
                System.out.println("Напій не знайдено.");
                continue;
            }


            switch (drinksMachine) {
                case COFFEE: {
                    Drinks.makeDrink(DrinksMachine.COFFEE);
                    break;
                }
                case TEA: {
                    Drinks.makeDrink(DrinksMachine.TEA);
                    break;
                }
                case LEMONADE: {
                    Drinks.makeDrink(DrinksMachine.LEMONADE);
                    break;
                }
                case MOJITO: {
                    Drinks.makeDrink(DrinksMachine.MOJITO);
                    break;
                }
                case MINERAL_WATER: {
                    Drinks.makeDrink(DrinksMachine.MINERAL_WATER);
                    break;
                }
                case COCA_COLA: {
                    Drinks.makeDrink(DrinksMachine.COCA_COLA);
                    break;
                }
            }
        }

        Drinks.total();
    }
}
