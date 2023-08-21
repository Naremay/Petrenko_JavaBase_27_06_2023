package ua.hillel.petrenko.homeworks.homework16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android call");
    }

    @Override
    public void sms() {
        System.out.println("Android sms");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }

    @Override
    public void linux() {
        System.out.println("New version LinuxOS for Android");
    }
}
