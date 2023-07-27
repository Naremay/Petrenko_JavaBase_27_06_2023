package ua.hillel.petrenko.lessons.lesson8;

public class Homework8 {
    public static void main(String[] args) {

        // У Японії числа 4 та 9 вважаються нещасливими.
        // Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
        // Напишіть функцію, яка виводить усі номери таких шатлів.


        // version 1

//        int counter = 0;
//        for (int i = 1000; counter <= 1000; i++) {
//            String numberStr = String.valueOf(i);
//            if (numberStr.contains("4") || numberStr.contains("9")) {
//                continue;
//            }
//            System.out.println(i);
//            counter++;
//        }
//
//        System.out.println("counter = " + --counter);



        // version 2
//        int counter = 0;
//        for (int i = 1; counter < 100; i++) {
//            boolean ok = true;
//            int number = i;
//            while (number > 0) {
//                int result = number % 10;
//                if (result == 4 || result == 9) {
//                    ok = false;
//                    break;
//                }
//                number = number / 10;
//            }
//            if (ok) {
//                System.out.println("shuttle number: " + i);
//                counter++;
//            }
//        }
//        System.out.println("counter = " + counter);


    }
}
