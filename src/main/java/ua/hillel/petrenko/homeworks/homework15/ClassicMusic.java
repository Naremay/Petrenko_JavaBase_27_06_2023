package ua.hillel.petrenko.homeworks.homework15;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String nameBand) {
        super(nameBand);
    }

    @Override
    void playMusic() {
        System.out.println(nameBand + " грає класичну музику");
    }
}
