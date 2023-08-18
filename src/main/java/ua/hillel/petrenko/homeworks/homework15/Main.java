package ua.hillel.petrenko.homeworks.homework15;

public class Main {
    public static void main(String[] args) {

        PopMusic popMusic = new PopMusic("New Kids on the Block");
        RockMusic rockMusic = new RockMusic("Linkin Park");
        ClassicMusic classicMusic = new ClassicMusic("Оркестр");

        MusicStyles [] musicStyles = {popMusic, rockMusic, classicMusic};

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }

    }
}
