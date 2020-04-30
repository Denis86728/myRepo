import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        String quit = "quit";
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 20 grades:");
            for (int i = 0; i < 19; i++) {
                int[] array = new int[i];
                array[i] = input.nextInt();
                System.out.println(Arrays.toString(array));

            }
    }
}
