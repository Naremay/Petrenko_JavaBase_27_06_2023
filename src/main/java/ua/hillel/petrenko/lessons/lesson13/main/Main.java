package ua.hillel.petrenko.lessons.lesson13.main;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();  = зробити об'єкт з абстр. класс не можна

        Cat cat = new Cat();
        Dog dog = new Dog();

        demoWorkAbstract(cat);
        demoWorkAbstract(dog);

//        cat.run();
//        dog.run();

    }
    static void demoWorkAbstract(Animal animal) {
        animal.run();
        if (animal instanceof Cat) { // instanceof належить
            ((Cat) animal).meow(); // якщо так = робимо кастування
        }
        if (animal instanceof Dog) {
            System.out.println("DOG!!!!!!!!!!!!!!1");
        }
    }
    }
