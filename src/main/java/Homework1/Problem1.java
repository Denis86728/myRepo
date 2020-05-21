import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = input.nextInt();
        System.out.println("Enter the second number:");
        int number2 = input.nextInt();
        System.out.println("Enter the third number:");
        int number3 = input.nextInt();
        int sum = number1 * number2 * number3;
        System.out.println("You have:" + sum +"$ in your pocket");
        System.out.println("Thanks. That's all.");
    }
}
