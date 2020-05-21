package Homework2;

public class Sedan extends Car {
    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice(){
        if(length > 20){
            return super.getSalePrice() - (super.getSalePrice() * 0.05);
        }
        else{
            return super.getSalePrice() - (super.getSalePrice() * 0.01);
        }
    }
}
