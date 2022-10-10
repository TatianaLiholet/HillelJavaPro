package lesson9.task2.participant;

import lesson9.task2.barier.Barrier;
import lesson9.task2.barier.Treadmill;
import lesson9.task2.barier.Wall;

public interface Participant {
    Wall wall = new Wall();
    Treadmill treadmill = new Treadmill();

    boolean run();

    void jump();



}
