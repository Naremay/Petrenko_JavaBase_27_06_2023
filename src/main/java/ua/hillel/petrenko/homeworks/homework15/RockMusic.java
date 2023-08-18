package ua.hillel.petrenko.homeworks.homework15;

public class RockMusic extends MusicStyles {

    public RockMusic(String nameBand) {
        super(nameBand);
    }

    @Override
    void playMusic() {
        System.out.println("Гурт " + nameBand + " грає рок-музику");
    }
}
