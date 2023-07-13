package ua.hillel.petrenko.homeworks.homework4;

public class Volume {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 8;

        int length = (a + b + c) * 4;
        int volume = a * b * c;

        System.out.println("Сумарна довжина всіх сторін паралелепіпеда = " + length + " см");
        System.out.println("Об'єм паралелепіпеда = " + volume + " см^3");
    }
}
