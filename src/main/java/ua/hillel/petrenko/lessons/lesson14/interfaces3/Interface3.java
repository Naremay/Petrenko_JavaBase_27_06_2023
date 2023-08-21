package ua.hillel.petrenko.lessons.lesson14.interfaces3;

public interface Interface3 extends Interface1, Interface2 {

    @Override
    default void methodFromInterface() {
        Interface1.super.methodFromInterface();
        Interface2.super.methodFromInterface();

        System.out.println("Interface3!!!!!!!!!!!!!!!!");
    }
}
