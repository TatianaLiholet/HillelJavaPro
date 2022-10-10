package lesson9.task2.barier;

import lesson9.task2.barier.Barrier;

public class Treadmill extends Barrier {
    int length = 25;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String overcome() {
        return "treadmill";

    }
}
