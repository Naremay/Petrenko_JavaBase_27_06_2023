package ua.hillel.petrenko.homeworks.homework14;

public class Info {

    private final String name;
    private final int day;
    private final int month;
    private final int yearOfBirth;
    private final String email;
    private final String phoneNumber;
    private final int age;

    String surname;
    int weight;
    String pressure;
    int stepsCount;

    private int calculateAge() {
        return 2023 - yearOfBirth;
    }

    Info(String name, String surname, int day, int month, int yearOfBirth, String email, String phoneNumber,
         int weight, String pressure, int stepsCount) {

        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsCount = stepsCount;
        this.age = calculateAge();
    }

    public void printAccountInfo() {
        System.out.println("Ім'я та прізвище: " + name + " " + surname);
        System.out.println("Дата народження: " + day + "." + month + "." + yearOfBirth);
        System.out.println("Вік: " + age + " років");
        System.out.println("Електронна пошта: " + email);
        System.out.println("Номер телефону: " + phoneNumber);
        System.out.println("Вага: " + weight + " кг");
        System.out.println("Тиск: " + pressure + " мм рт. ст.");
        System.out.println("Кількість пройдених за день кроків: " + stepsCount);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }
}
