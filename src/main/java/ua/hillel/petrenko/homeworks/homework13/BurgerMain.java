package ua.hillel.petrenko.homeworks.homework13;

public class BurgerMain {
    public static void main(String[] args) {

        Burger standartBurger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        Burger dietBurger = new Burger("булочка", "м'ясо", "сир", "зелень");
        Burger doubleMeatBurger = new Burger("булочка", "подвійне", "м'ясо", "сир", "зелень",
                "майонез");

    }
}
