package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {

        Date date1 = new Date();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day:");

        int day = input.nextInt();
        date1.setDay(day);
        System.out.println("Enter the month:");
        int month = input.nextInt();
        date1.setMonth(month);
        System.out.println("Enter the year:");
        int year = input.nextInt();
        date1.setYear(year);

        date1.displayDate();

    }
}
