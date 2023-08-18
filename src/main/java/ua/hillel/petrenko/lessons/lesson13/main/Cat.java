package ua.hillel.petrenko.lessons.lesson13.main;
// extends = нащадок
public class Cat extends Animal {
// перевизначення абстр. методу саме для кота, робимо реалізацію
    @Override
    void run() {
        System.out.println("Cat run");
    }

    void meow() {
        System.out.println("Cat meow");
    }
}
