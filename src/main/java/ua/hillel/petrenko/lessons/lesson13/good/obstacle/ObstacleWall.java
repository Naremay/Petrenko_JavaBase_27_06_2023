package ua.hillel.petrenko.lessons.lesson13.good.obstacle;

import ua.hillel.petrenko.lessons.lesson13.good.participant.Participant;

public class ObstacleWall extends Obstacle {

    @Override
    public void start(Participant participant) {
        System.out.println(participant.getName() + " start jump");
    }

}
