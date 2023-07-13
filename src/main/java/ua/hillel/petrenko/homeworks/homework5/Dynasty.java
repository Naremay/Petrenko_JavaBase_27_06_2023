package ua.hillel.petrenko.homeworks.homework5;

public class Dynasty {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int horsemanLi = 46;
        int totalNumberWarriorsLi = 860;

        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;
        double totalNumberWarriorsMin = totalNumberWarriorsLi * 1.5;

        int totalAttackLi = (warriorLi + archerLi + horsemanLi) * totalNumberWarriorsLi;
        int totalAttackMin = (warriorMin + archerMin + horsemanMin) * (int) totalNumberWarriorsMin;

        System.out.println("Загальний показник атаки династії Лі: " + totalAttackLi);
        System.out.println("Загальний показник атаки династії Мінь: " + totalAttackMin);
    }
}
