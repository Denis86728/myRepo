package Homework3.Problem2;

public class Camera implements Info, IStartable {
    private String model;

    private String serialNumber;

    public Camera(String model, String serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public void start() {
        System.out.println(model + " camera with serial number " + serialNumber + " has started!");
    }

    public void doSomething() {
        System.out.println(model + " camera with serial number " + serialNumber + " please, take a photo!");
    }

    public void stop() {
        System.out.println(model + " camera with serial number " + serialNumber + " has stopped!");
    }

    public void showInfo() {
        System.out.println("I have a " + model + " camera with serial number " + serialNumber + ".");
    }

    public String getModel() {
        return model;
    }
}
