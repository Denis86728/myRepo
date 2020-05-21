import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third number:");
        int thirdNumber = input.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        int average = (firstNumber * secondNumber * thirdNumber) / 3;
        int product = firstNumber * secondNumber * thirdNumber;
        int smallest = firstNumber;
        int greatest = firstNumber;

        if(secondNumber <= smallest){
            smallest = secondNumber;
        }
        if(thirdNumber <= smallest){
            smallest = thirdNumber;
        }

        if(secondNumber >= greatest){
            greatest = secondNumber;
        }
        if(thirdNumber >= greatest){
            greatest = thirdNumber;
        }

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is:" + average);
        System.out.println("The product of the numbers is:" + product);
        System.out.println("The smallest of the numbers is:" + smallest);
        System.out.println("The greatest of the numbers is:" + greatest);
    }
}
