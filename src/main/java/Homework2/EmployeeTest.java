package Homework2;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Mark", "John", 2000);
        Employee employee2 = new Employee("Heinz", "Willmark", 1950);

        employee1.getInfo();

        System.out
            .println("The yearly salary for " + employee1.getLast_name() + " is " + employee1.getYearlySalary() + "$");
        System.out.println("The 10% raise for " + employee1.getLast_name() + " is " + employee1.give10Raise() + "$");
        System.out.println(
            "The new yearly salary for " + employee1.getLast_name() + " is " + employee1.getYearlySalaryAfterRaise()
                + "$");

        System.out.println(" ");

        employee2.getInfo();

        System.out
            .println("The yearly salary for " + employee2.getLast_name() + " is " + employee2.getYearlySalary() + "$");
        System.out.println("The 10% raise for " + employee2.getLast_name() + " is " + employee2.give10Raise() + "$");
        System.out.println(
            "The new yearly salary for " + employee2.getLast_name() + " is " + employee2.getYearlySalaryAfterRaise()
                + "$");

    }
}
