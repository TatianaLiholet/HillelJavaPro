package lesson9;

import lesson9.task1.AreaOfFigures;
import lesson9.task1.Circle;
import lesson9.task1.Square;
import lesson9.task1.Triangle;
import lesson9.task2.barier.Barrier;
import lesson9.task2.barier.Treadmill;
import lesson9.task2.participant.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Square square = new Square(2);
        Triangle triangle = new Triangle(2.5, 3.5);

        ArrayList <AreaOfFigures> arrayListFigures = new ArrayList<>();
        arrayListFigures.add(circle1);
        arrayListFigures.add(square);
        arrayListFigures.add(triangle);

       double sum = 0;

        for (AreaOfFigures figures : arrayListFigures) {
            sum += figures.square();
            }
        System.out.println("Sum is " + sum);























        System.out.println("Task two");

        Participant murzic = new Cat("murzic");
        Participant felix = new Cat("felix");
        Participant roma = new Human("roma");
        Participant tanya = new Human("tanya");
        Participant citripio = new Robot("citripio");
        Robot RD2 = new Robot("RD2");



        ArrayList <Participant> arrayListPerticipent = new ArrayList<>();
        arrayListPerticipent.add(murzic);
        arrayListPerticipent.add(felix);
        arrayListPerticipent.add(roma);
        arrayListPerticipent.add(tanya);
        arrayListPerticipent.add(citripio);
        arrayListPerticipent.add(RD2);


        for (Participant participant : arrayListPerticipent) {
                if (participant.run() == true){
                    participant.jump();
                }
            }
        }
}


