package lesson7;

public class Cat extends Animal {
    private String name;
    private static int catCount;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int lengths) {
        if (lengths <= 200) {
            System.out.println(name + " run " + lengths + " m");
        } else System.out.println("The distance is to big for cat");

    }

    @Override
    public void swim(int lengths) {
        System.out.println(name + ": I can't swim, I am a cat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
