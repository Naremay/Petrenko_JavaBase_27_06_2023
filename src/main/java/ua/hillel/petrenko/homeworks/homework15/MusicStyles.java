package ua.hillel.petrenko.homeworks.homework15;

public abstract class MusicStyles {

    String nameBand;
    public MusicStyles(String nameBand) {
        this.nameBand = nameBand;
    }

    abstract void playMusic();

}
