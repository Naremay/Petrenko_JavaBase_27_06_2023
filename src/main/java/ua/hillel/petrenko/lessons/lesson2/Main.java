package ua.hillel.petrenko.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
/*
        byte age;
        age = 35;
        byte age = 35;

        short shortVariable = 32000;
        int intVariable = 2147000000;

// with long use l in end
        long longVariable = 21470000000000L;

// значення змінюються, спочатку 22, але потім отримаємо 29
        System.out.println(age);

        age = 22;

        System.out.println(age);

        age = 29;

// плаваюча точка, в кінці теж треба f/d
        float floatVariable = 1.123456789123456789F;
        double doubleVariable = 1.123456789123456789;
        System.out.println(floatVariable);
        System.out.println(doubleVariable);

// рядок тільки з одним символом
        char charA1 = 'A';
        char charA2 = 65;
// юнікод
        char charA3 = '\u0041';

        System.out.println(charA1);
        System.out.println(charA2);
        System.out.println(charA3);

// тру фолс
        boolean isOK = true;
        boolean isOK2 = false;

        System.out.println(isOK);
        System.out.println(isOK2);

// постійна змінна
        final double PI_VALUE;
        PI_VALUE = 3.14;

        System.out.println(PI_VALUE);

// перетворення одного типу даних в інший
        byte byteVariable = 55;
        double doubleTest = byteVariable;

        System.out.println(byteVariable);
        System.out.println(doubleTest);


        char chA = 'A';
        int intA = chA;

        System.out.println(chA);
        System.out.println(intA);

// ручне кастування
        int intAge = 351231232;
        byte byteAge = (byte) intAge; ///

        System.out.println(intAge);
        System.out.println(byteAge);

        int intAge2 = byteAge; ///
        System.out.println(intAge2);


        double doubleVariable = 13.999999;
        int intVariable = (int) doubleVariable; // будет 13

        System.out.println(intVariable);
*/

// рядок без обмежень
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        String str4 = "Best";

        int number = 555;

        String str = str1 + " " + str2 + " " + number + " " + str3 + " " + str4 + 1 + 1;
        System.out.println(str);


        double longitude = 0.116773;
        double latitude = 51.510357;
        char specSymbol = '\u00B0';
        char specSymbol2 = '\'';
        System.out.println("Longitude: - " + longitude + " Latitude: " + latitude);
        System.out.println("\"DMS Lat\": 51" + specSymbol + " 30" + specSymbol2 + " 37.2852'' N   DMS Long: 0° 7' 0.3828'' W");


    }
}
