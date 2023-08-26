package ua.hillel.petrenko.homeworks.homework17;

public class Drinks {

    public static final double COFFEE_PRICE = 20;
    public static final double TEA_PRICE = 15.5;
    public static final double LEMONADE_PRICE = 27.5;
    public static final double MOJITO_PRICE = 40;
    public static final double MINERAL_WATER_PRICE = 10;
    public static final double COCA_COLA_PRICE = 15;

  static int numberOfDrinks = 0;
  static double totalCost = 0;

    static void makeDrink(DrinksMachine drink) {

        switch (drink) {
            case COFFEE:
                makeCoffee();
                totalCost += Drinks.COFFEE_PRICE;
                break;
            case TEA:
                makeTea();
                totalCost += Drinks.TEA_PRICE;
                break;
            case LEMONADE:
                makeLemonade();
                totalCost += Drinks.LEMONADE_PRICE;
                break;
            case MOJITO:
                makeMojito();
                totalCost += Drinks.MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                makeMineralWater();
                totalCost += Drinks.MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                makeCocaCola();
                totalCost += Drinks.COCA_COLA_PRICE;
                break;
        }
        numberOfDrinks++;
    }

    static void makeCoffee() {
        System.out.println("Подамо каву. Щось ще?");
    }

    static void makeTea() {
        System.out.println("Подамо чай. Щось ще?");
    }

    static void makeLemonade() {
        System.out.println("Подамо лимонад. Щось ще?");
    }

    static void makeMojito() {
        System.out.println("Подамо мохіто. Щось ще?");
    }

    static void makeMineralWater() {
        System.out.println("Подамо мінеральну воду. Щось ще?");
    }

    static void makeCocaCola() {
        System.out.println("Подамо кока-колу. Щось ще?");
    }

    static void total() {

        System.out.println("\nЗагальна кількість напоїв: " + numberOfDrinks);

        System.out.println("Загальна сума: " + totalCost + " грн");
    }
}
