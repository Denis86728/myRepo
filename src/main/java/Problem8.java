import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        System.out.println("\nN\t10*N\t100*N\t1000*N");

        for (int i = 1; i < 6; i++) {

            int firstRow = i;
            System.out.println(firstRow + "\t" + firstRow*10 + "\t\t" + firstRow*100 + "\t\t" + firstRow * 1000);
        }

    }
}
