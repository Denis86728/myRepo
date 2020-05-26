package Homework3.Problem2;

public class Car implements IStartable, Info {
    private String model;

    private String licensePlate;

    public Car(String model, String licensePlate) {
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public void start() {
        System.out.println("Car " + model + " with license plate " + licensePlate + " please start the engine!");
    }

    public void doSomething() {
        System.out.println("Car " + model + " with license plate " + licensePlate + " please come and get me!");
    }

    public void stop() {
        System.out.println("Car " + model + " with license plate " + licensePlate + " please stop the engine!");
    }

    public void showInfo() {
        System.out.println("The car model is a " + model + " with the license plate " + licensePlate + ".");
    }
}
