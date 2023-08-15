package ua.hillel.petrenko.homeworks.homework14;

public class Main {
    public static void main(String[] args) {
        Info user1 = new Info ("Алія", "Коршенко", 11, 03, 2003, "alia_kor@gmail.com",
                "+380634418###", 72, "125/85", 5000);
        Info user2 = new Info ("Дмитро", "Судак", 02, 12, 1996,  "dmsdk@gmail.com",
                "+380934311###", 84, "120/80", 7800);
        Info user3 = new Info ("Клавдія", "Шерц", 29, 10, 1988,  "klar@ukr.net",
                "+380954322###", 65, "120/80", 9000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

//        user2.stepsCount = 10000;
//        user2.weight = 87;
//        user3.surname = "Церш";
//        user3.pressure = "125/85";

        user2.setStepsCount(10000);
        user2.setWeight(87);
        user3.setSurname("Церш");
        user3.setPressure("125/85");

        System.out.println("(!!!) Змінені дані (!!!)\n");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

    }
}
