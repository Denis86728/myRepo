import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius sphere:");
        double r = scanner.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow (r, 3);
        System.out.println(volume);


    }
}
