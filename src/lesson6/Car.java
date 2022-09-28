package lesson6;

public class Car {
    public void start() {
        this.startElectricity();
        this.startCommand();
        this.startFuelSystem();
    }

    private static String startElectricity() {
        return "The electricity start";
    }

    private static String startCommand() {
        return "The command start";
    }

    private static String startFuelSystem() {
        return "The FuelSystem start";
    }


}
