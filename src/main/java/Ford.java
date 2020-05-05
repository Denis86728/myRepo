public class Ford extends Car {

    int weight;

    int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int weight, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.weight = weight;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }

}

