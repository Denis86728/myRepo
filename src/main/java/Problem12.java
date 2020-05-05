import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {

    public static double Average(int notes[], int max){
        int sum = 0;
        double average = 0.0;
        for(int i= 1; i<max; i++){
            sum = sum + notes[i];
            average = (double)sum/(double)i;

        }
        return average;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] notes = new int[20];
        int sum = 0;
        System.out.println("Enter 20 grades: ");

            for (int i = 1; i < 21; i++) {
                notes[i] = input.nextInt();
                if (notes[i] < 0) {
                    System.out.println("This is not a grade.");
                }
                if (notes[i] > 10) {
                    System.out.println("This is not a grade.");
                }
                if (notes[i] == -1) {
                    break;
                }
                System.out.println(Average(notes, i));
            }
        }

    }

