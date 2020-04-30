import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = input.nextInt();


        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " is larger");
        }
        else{
            if(firstNumber == secondNumber){
                System.out.println("These numbers are equal");
            }
            else {
                System.out.println(secondNumber + " is larger");
            }
        }
    }
}
