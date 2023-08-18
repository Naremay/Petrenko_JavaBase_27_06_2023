package ua.hillel.petrenko.homeworks.homework15;

public class PopMusic extends MusicStyles {

    public PopMusic(String nameBand) {
        super(nameBand);
    }

    @Override
    void playMusic() {
        System.out.println("Гурт " + nameBand + " грає поп-музику");
    }
}
