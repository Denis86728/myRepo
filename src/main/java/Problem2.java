import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner fahrenheitInput = new Scanner(System.in);

        System.out.println("Enter the fahrenheit temperature:");
        int Fahrenheit = fahrenheitInput.nextInt();
        int Celsius = (int) ((5.0 / 9.0) * (Fahrenheit - 32));
        System.out.println("The conversion from fahrenheit to celsius is:" + Celsius);
    }

}
