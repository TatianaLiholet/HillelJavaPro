package lesson9.task1;

import java.util.Scanner;

public class Triangle implements AreaOfFigures {
     double side;
     double height;


    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double square() {
        double areaForTriangle= (side * height) / 2;
        System.out.println("areaForTriangle " + areaForTriangle);
        return areaForTriangle;

    }
}
