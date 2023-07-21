package ua.hillel.petrenko.homeworks.homework8;

public class Shuttles {
    public static void main(String[] args) {

        int counter = 1;
        for (int i = 0; ; i++) {
            // умова здатна перевіряти числа в діапазоні від 0 до 1399
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 100 == 4 || i / 100 == 9 || (i / 10) % 10 == 4 || (i / 10) % 10 == 9) {
                continue;
            }
            System.out.println("Номер для " + counter + " космічного шатлу = " + i);
//            System.out.println(i);  // для перевірки
            counter++;

            if (counter == 101) {
                break;
            }
        }
//        System.out.println("Кількість номерів: " + counter); // теж для перевірки було
    }
}
