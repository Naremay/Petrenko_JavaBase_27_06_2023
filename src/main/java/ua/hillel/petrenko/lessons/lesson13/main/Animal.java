package ua.hillel.petrenko.lessons.lesson13.main;

// абстрактний метод, всередні такого методу можна не писати якісь умови
public abstract class Animal {

    String name;
    int age;

    abstract void run();

    void demoMethod() {
        System.out.println("default");
    }
}
