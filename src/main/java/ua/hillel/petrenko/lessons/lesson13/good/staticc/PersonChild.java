package ua.hillel.petrenko.lessons.lesson13.good.staticc;

public class PersonChild extends Person {

//    @Override це неможливо для статик, адже це поведінка всього класу
    static void staticMethod() {
        System.out.println("PersonChild static method");
    }

    @Override
    void nonStaticMethod() {
        System.out.println("PersonChild non static method");
    }
}
