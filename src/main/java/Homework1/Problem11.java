import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String uppercase = scanner.nextLine().toUpperCase();
        System.out.println(uppercase+uppercase.toLowerCase());
    }
}
