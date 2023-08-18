package ua.hillel.petrenko.lessons.lesson13.good.obstacle;

import ua.hillel.petrenko.lessons.lesson13.good.participant.Participant;

public class ObstaclePool extends Obstacle {

    @Override
    public void start(Participant participant) {
        if (participant != null) {
            System.out.println(participant.getName() + " swim");
        }
    }
}
