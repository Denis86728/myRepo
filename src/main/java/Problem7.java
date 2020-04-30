import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNumber = input.nextInt();
        count++;
        System.out.println("Please enter the second number");
        int secondNumber = input.nextInt();
        count++;
        System.out.println("Please enter the third number");
        int thirdNumber = input.nextInt();
        count++;
        System.out.println("Please enter the fourth number");
        int fourthNumber = input.nextInt();
        count++;
        System.out.println("Please enter the fifth number");
        int fifthNumber = input.nextInt();
        count++;
        System.out.println("Please enter the sixth number");
        int sixthNumber = input.nextInt();
        count++;
        System.out.println("Please enter the s number");
        int seventhNumber = input.nextInt();
        count++;
        int eightNumber = input.nextInt();
        count++;
        int ninthNumber = input.nextInt();
        count++;
        int tenthNumber = input.nextInt();
        count++;

        int largest = firstNumber;
        if(secondNumber >= largest){
            largest = secondNumber;
        }
        if(thirdNumber >= largest){
            largest = thirdNumber;
        }
        if(fourthNumber >= largest){
            largest = fourthNumber;
        }
        if(fifthNumber >= largest){
            largest = fifthNumber;
        }
        if(sixthNumber >= largest){
            largest = sixthNumber;
        }
        if(seventhNumber >= largest){
            largest = seventhNumber;
        }
        if(eightNumber >= largest){
            largest = eightNumber;
        }
        if(ninthNumber >= largest){
            largest = ninthNumber;
        }
        if(tenthNumber >= largest){
            largest = tenthNumber;
        }
        System.out.println("The count is:" + count);
        System.out.println("The largest number is:" + largest);


    }
}
