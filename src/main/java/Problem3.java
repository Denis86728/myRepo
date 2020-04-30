import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner print = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double firstNumber = print.nextDouble();
        System.out.println("Please enter the second number");
        double secondNumber = print.nextDouble();
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double division = (firstNumber) / secondNumber;
        System.out.println(
            "The sum is: " + sum + " the difference is: " + difference + " the product is: " + product + " and the division is: "
                + division);
    }

}
