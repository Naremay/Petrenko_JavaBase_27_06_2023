package ua.hillel.petrenko.homeworks.homework16;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.linuxVersion();

        System.out.println("--------------------------------");

        IPhones iPhones = new IPhones();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.iosVersion();
    }
}
