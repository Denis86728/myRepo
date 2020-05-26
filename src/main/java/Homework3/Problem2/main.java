package Homework3.Problem2;

import org.apache.commons.lang3.RandomStringUtils;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Oliver", RandomStringUtils.randomAlphanumeric(12));
        Person person2 = new Person("Clementine", RandomStringUtils.randomAlphanumeric(12));

        Camera camera1 = new Camera("Cannon", RandomStringUtils.randomNumeric(5));
        Camera camera2 = new Camera("Sony", RandomStringUtils.randomNumeric(5));

        Car car1 = new Car("VW",
            (RandomStringUtils.randomAlphabetic(2) + "-" + RandomStringUtils.randomAlphanumeric(2) + "-"
                + RandomStringUtils.randomAlphabetic(3)));

        Car car2 = new Car("Ford",
            (RandomStringUtils.randomAlphabetic(2) + "-" + RandomStringUtils.randomAlphabetic(2) + "-"
                + RandomStringUtils.randomAlphabetic(3)));

        person1.showInfo();
        person2.showInfo();

        System.out.println(" ");

        camera1.showInfo();
        camera1.start();
        camera1.doSomething();
        camera1.stop();
        System.out.println(" ");

        camera2.showInfo();
        System.out.println(" ");

        //extra steps
        System.out.println(person1.getName() + " has a " + camera1.getModel() + " camera.");
        System.out.println(person2.getName() + " has a " + camera2.getModel() + " camera.");
        System.out.println(" ");

        car1.showInfo();
        car1.start();
        car1.doSomething();
        car1.stop();
        System.out.println(" ");
        car2.showInfo();


    }
}
