import java.util.Random;
import java.util.RandomAccess;

public class Problem10 {

    public static void main(String[] args) {
        int[] counts = new int[10];
        for(int i = 0; i < 10; i++){
            counts[i] = (0);
        }

        int[] bonus = new int[15];
        Random random = new Random();
        for(int i = 0; i < 15; i++){
            bonus[i] = random.nextInt(10);
            System.out.print("\t" + bonus[i]);
        }

        int[] bestScores = new int[5];
        for(int i = 0; i < 5; i++){
            bestScores[i] = random.nextInt(5);
            System.out.println("\n" + bestScores[i]);
        }
    }
}
