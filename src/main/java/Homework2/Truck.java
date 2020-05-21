package Homework2;

public class Truck extends Car {
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice(int salesPrice){
        if(weight > 2000){
            return super.getSalePrice() - 0.1 * super.getSalePrice();
        }
        else{
            return super.getSalePrice() - 0.2 * super.getSalePrice();
        }

    }
}
