package ua.hillel.petrenko.homeworks.homework17;

public enum DrinksMachine {

    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL_WATER("Мінеральна вода"),
    COCA_COLA("КокаКола");

    private String drinkType;

    DrinksMachine(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getDrinkType() {
        return drinkType;
    }
}
