package Homework3.Problem2;

public class Person implements Info {
    private String name;

    private String CNP;

    public Person(String name, String CNP){
        this.name = name;
        this.CNP = CNP;
    }

    public void showInfo() {
        System.out.println("My name is " + name + " and I have the following CNP " + CNP + ".");
    }

    public String getName() {
        return name;
    }
}

