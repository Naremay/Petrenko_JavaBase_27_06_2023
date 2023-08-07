package ua.hillel.petrenko.homeworks.homework13;

public class Burger {
    String bun;
    String meatType;
    String meat;
    String cheese;
    String lettuce;
    String mayonnaise;

    Burger(String bun, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;

        System.out.println("Склад звичайного бургеру: " + this.bun + ", " + this.meat + ", " + this.cheese + ", "
                + this.lettuce + ", " + this.mayonnaise + ".");
    }

    Burger(String bun, String meat, String cheese, String lettuce) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;

        System.out.println("Склад дієтичного бургеру: " + this.bun + ", " + this.meat + ", " + this.cheese + ", "
                + this.lettuce + ".");
    }

    Burger(String bun, String meatType, String meat, String cheese, String lettuce, String mayonnaise) {
        this.bun = bun;
        this.meatType = meatType;
        this.meat = meat;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.mayonnaise = mayonnaise;

        System.out.println("Склад бургеру з подвійним м'ясом: " + this.bun + ", " + this.meatType + " " + this.meat
                + ", " + this.cheese + ", " + this.lettuce + ", " + this.mayonnaise + ".");
    }
}