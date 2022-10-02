package lesson7;

import java.net.Socket;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat murzic = new Cat("Murzic");
        murzic.run(150);
        murzic.swim(5);
        Dog sharic = new Dog("Sharick");
        sharic.run(505);
        sharic.swim(3);
        ArrayList<String> animal = new ArrayList<>();
        Dog rex = new Dog("Rex");
        rex.swim(9);

        System.out.println("Was created " + Dog.getDogCount() + " dogs");
        System.out.println("Was created " + Cat.getCatCount() + " cats");
        System.out.println("Total animals:" + (Cat.getCatCount() + Dog.getDogCount()));
    }
}
