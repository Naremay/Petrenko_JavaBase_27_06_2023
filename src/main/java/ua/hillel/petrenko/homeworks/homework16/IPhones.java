package ua.hillel.petrenko.homeworks.homework16;

public class IPhones implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("iPhone call");
    }

    @Override
    public void sms() {
        System.out.println("iPhone sms");
    }

    @Override
    public void internet() {
        System.out.println("iPhone internet");
    }

    @Override
    public void iosVersion() {
        System.out.println("New version iOS for iPhone");
    }
}
