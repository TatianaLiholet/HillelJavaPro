package lesson9.task1;

import java.util.Scanner;

public class Circle implements AreaOfFigures {
    private int radiusforCircle;




    public Circle(int radiusforCircle) {
        this.radiusforCircle = radiusforCircle;
    }

    @Override
    public double square() {
        double areaForCircle = (3.14 * Math.pow( radiusforCircle, 2));
        System.out.println("areaForCircle " + areaForCircle);
        return areaForCircle;
    }



    public int getRadiusforCircle() {
        return radiusforCircle;
    }

    public void setRadiusforCircle(int radiusforCircle) {
        this.radiusforCircle = radiusforCircle;
    }


}

