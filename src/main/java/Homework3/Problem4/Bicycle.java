package Homework3.Problem4;

public class Bycicle extends Vehicle {
    private int maxNoOfGears;

    public Bycicle(String brand, String model, int maxNoOfGears, int price) {
        super(brand, model, price);
        this.maxNoOfGears = maxNoOfGears;
    }

    public int getMaxNoOfGears() {
        return maxNoOfGears;
    }

    public void setMaxNoOfGears(int maxNoOfGears) {
        this.maxNoOfGears = maxNoOfGears;
    }

    @Override
    public String toString() {
        return "The bycicle has a number of " + maxNoOfGears + " gears.";
    }
}
