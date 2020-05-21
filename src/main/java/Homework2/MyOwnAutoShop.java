package Homework2;

public class MyOwnAutoShop {

    public static void main(String[] args) {
        Car car = new Car(150, 50000.0, "Red");
        Truck truck = new Truck(160, 35000.0, "Yellow", 2500);
        Truck truck2 = new Truck(155, 52000.0, "Black", 1900);
        Ford ford = new Ford(160, 60000.0, "White", 1500, 5);
        Sedan sedan = new Sedan(165, 58000.0, "Pink", 18);
        Sedan sedan2 = new Sedan(153, 60000.0, "Green", 21);

        System.out.println("My car price is: " + car.getSalePrice());
        System.out.println("My truck price is: " + truck.getSalePrice());
        System.out.println("My second truck price is: " + truck2.getSalePrice());
        System.out.println("My ford price is: " + ford.getSalePrice());
        System.out.println("My sedan price is: " + sedan.getSalePrice());
        System.out.println("My sedan2 price is: " + sedan2.getSalePrice());

    }
}
