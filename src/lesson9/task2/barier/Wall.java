package lesson9.task2.barier;

import lesson9.task2.barier.Barrier;

public class Wall extends Barrier {
    int height = 16;

    @Override
    public String overcome() {
        return " wall";
    }
}
