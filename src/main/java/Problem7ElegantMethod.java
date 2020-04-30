import java.util.Arrays;
import java.util.Scanner;

public class Problem7ElegantMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numbers:");
        int largest = input.nextInt();

        for (int counter = 0; counter < 9; counter++) {
            System.out.println("Enter your numbers:");
            int number = input.nextInt();
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
