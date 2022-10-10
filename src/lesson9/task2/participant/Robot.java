package lesson9.task2.participant;

import lesson9.task2.participant.Participant;

public class Robot implements Participant {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public boolean run() {
        if(treadmill.getLength() > 40 ){
            System.out.println(name + " is not passed" + " the " + treadmill.overcome());
            return false;
        } else  System.out.println(name + " passed" + " the " + treadmill.overcome());
        return true;
    }

    @Override
    public void jump() {
        System.out.println(name + " jump" + " the " + wall.overcome());
        wall.overcome();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
