package lesson7;

public class Dog extends Animal {
    private String name;
    private static int dogCount;


    public Dog(String name) {
        this.name = name;
        dogCount++;
    }

    @Override
    public void run(int lengths) {
        if (lengths <= 500) {
            System.out.println(name + " run " + lengths + " m");
        } else System.out.println("The distance is to big for dog");

    }

    @Override
    public void swim(int lengths) {
        if (lengths <= 10) {
            System.out.println(name + " swim " + lengths + " m");
        } else System.out.println("The distance is to big for dog");
    }

    public static int getDogCount() {
        return dogCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
