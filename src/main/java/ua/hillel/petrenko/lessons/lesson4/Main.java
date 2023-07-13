package ua.hillel.petrenko.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
// Просте обрахування
//        System.out.println(12 + 5);
//        System.out.println(12 - 5);
//        System.out.println(12 * 5);
//        System.out.println(12 / 5);

// Вносимо змінні
//        int a = 10;
//        int b = 5;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);

// Кастування
//        int a = 10;
//        int b = 3;
//
//        System.out.println(10.0 / 3);
//        System.out.println((double) a / b);
//        System.out.println(a / (double) b);
//        System.out.println((double) a / (double) b);

// Залишок від ділення
//        System.out.println(10 % 4); // 10 / 4 = 2. 2 * 4 = 8. 10 - 8 = 2
//        System.out.println(10 % 3); // 1
//        System.out.println(10 % 6); // 4
//        System.out.println(10 % 1); // 0
//        System.out.println(10 % 2); // 0
//        System.out.println(10 % 3); // 1
//        System.out.println(10 % 4); // 2
//        System.out.println(10 % 5); // 0
//        System.out.println(10 % 6); // 4
//        System.out.println(10 % 7); // 3
//        System.out.println(10 % 8); // 2
//        System.out.println(10 % 9); // 1
//        System.out.println(10 % 10); // 0

// Змінення значення змінної
//        int a = 10;

//        a = a + 5; // 15
//        a += 5; // 15
//        a -= 5; // 5
//        a *= 5; // 50
//        a /= 5; // 2
//        a %= 5; // 0

//        System.out.println(a);


// Префіксний та постфіксний інкремент (++) та декремент (--)
//        int a = 10;

//        a = a + 1;
//        a += 1;
//        a++;

//        System.out.println(a++); // 10
//        System.out.println(a); // 11
//
//        System.out.println(++a); // 11
//        System.out.println(a); // 11

//        int a = 10;
//        int b = 5;
//
//        int result = ++a - b++ - a++ + ++a; // 11 - 5 - 11 + 13
//
//        System.out.println("result = " + result); // 8
//        System.out.println("a = " + a); // 13
//        System.out.println("b = " + b); // 6


//        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
//        Розрахувати:
//        1. для кожного працівника суму зарплати за 10 років
//        2. відняти 5% податок
//        3. порахувати середнє арифметичне за трьома сумами за 10 років
//        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
//        середнє арифм.

//        int a = 700;
//        int b = 2000;
//        int c = 3500;
//
//        int countMonth10Years = 10 * 12;
//
//
//        int salary1 = a * countMonth10Years;
//        int salary2 = b * countMonth10Years;
//        int salary3 = c * countMonth10Years;
//
//        System.out.println(salary1);
//        System.out.println(salary2);
//        System.out.println(salary3);
//
//        double tax = 0.95;
//
//        int salary1WithoutTax = (int) (salary1 * tax);
//        int salary2WithoutTax = (int) (salary2 * tax);
//        int salary3WithoutTax = (int) (salary3 * tax);
////        double salary3WithoutTax = salary3 * tax;
//
//        System.out.println("salary1 without tax = " + salary1WithoutTax);
//        System.out.println("salary2 without tax = " + salary2WithoutTax);
//        System.out.println("salary3 without tax = " + salary3WithoutTax);
//
//        double sum = salary1WithoutTax + salary2WithoutTax + salary3WithoutTax;
//        double avg = sum / 3;
//
//        System.out.println("sum = " + sum);
//        System.out.println("avg = " + avg);
//
///// Методи /////
//        System.out.println(Math.PI);
//
// модуль (все)
//        System.out.println(Math.abs(5.8));
//        System.out.println(Math.abs(-5));
//
// до степеня (дабл)
//        System.out.println();
//        System.out.println(Math.pow(3, 2));
//        System.out.println(Math.pow(3.5, 2.2));
//        System.out.println(Math.pow(5, 3));
//
// корінь (дабл)
//        System.out.println();
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.sqrt(3.96));
//
// округлення (дабл, флоат)
//        System.out.println();
//        System.out.println(Math.round(10.499999));
//        System.out.println(Math.round(10.5));
//
// шукає найменший параметр
//        System.out.println();
//        System.out.println(Math.min(1, 10));
//        System.out.println(Math.min(-1, -2));
//        System.out.println(Math.min(100, 10));
//
// шукає найбільший параметр
//        System.out.println();
//        System.out.println(Math.max(10, 100));

// рандом
//        System.out.println(Math.random()); // 0.0 - 0.9999999999999999999;
//
//        від [0 - 10], множимо на 1 більше
//        System.out.println((int) (Math.random() * 11)); // 0.9999999 * 10 = 9.9999999 -> 9
//        якщо раунд можна використовувати просто 10
//        System.out.println(Math.round(Math.random() * 10)); // 0.9999999 * 10 = 9.9999999 -> 10

//        від [15 - 35]
//        System.out.println((int) (15 + Math.random() * 21));
//        але краще використовувати змінні і формулу
//        int min = 15;
//        int max = 35;
//        System.out.println((int) (Math.random() * (max - min + 1) + min));
    }
}
