import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();

        if(firstNumber%secondNumber == 0){
            System.out.println(firstNumber + " is the multiple of the second number");
        }
        else{
            System.out.println("First number is not divisible of the second number");
        }

    }
}
