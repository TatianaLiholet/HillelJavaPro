package lesson9.task1;

import java.util.Scanner;

public class Square implements AreaOfFigures {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double square() {
        double areaForSquare = Math.pow(side, 2);
        System.out.println("areaForSquare " + areaForSquare);
      return areaForSquare;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
