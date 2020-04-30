import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        problem1();
//        problem2();
//        problem3();
//        problem4();
//        problem5();
//        problem6();
//        problem7();
//        problem7ElegantMethod();
//        problem8();
//        problem9();
//        problem11();

    }

    public static void problem1(){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = input.nextInt();
        System.out.println("Enter the second number:");
        int number2 = input.nextInt();
        System.out.println("Enter the third number:");
        int number3 = input.nextInt();
        int sum = number1 * number2 * number3;
        System.out.println("The sum is:" + sum);
    }

    public static void problem2(){

        Scanner fahrenheitInput = new Scanner(System.in);

        System.out.println("Enter the fahrenheit temperature:");
        int Fahrenheit = fahrenheitInput.nextInt();
        int Celsius = (int) ((5.0 / 9.0) * (Fahrenheit - 32));
        System.out.println("The conversion from fahrenheit to celsius is:" + Celsius);
    }

    public static void problem3(){

        Scanner print = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        double firstNumber = print.nextDouble();
        System.out.println("Please enter the second number");
        double secondNumber = print.nextDouble();
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double division = (firstNumber) / secondNumber;
        System.out.println(
            "The sum is: " + sum + " the difference is: " + difference + " the product is: " + product + " and the division is: "
                + division);
    }

    public static void problem4(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = input.nextInt();


        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " is larger");
        }
        else{
            if(firstNumber == secondNumber){
                System.out.println("These numbers are equal");
            }
            else {
                System.out.println(secondNumber + " is larger");
            }
        }
    }

    public static void problem5(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third number:");
        int thirdNumber = input.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        int average = (firstNumber * secondNumber * thirdNumber) / 3;
        int product = firstNumber * secondNumber * thirdNumber;
        int smallest = firstNumber;
        int greatest = firstNumber;

        if(secondNumber <= smallest){
            smallest = secondNumber;
        }
        if(thirdNumber <= smallest){
            smallest = thirdNumber;
        }

        if(secondNumber >= greatest){
            greatest = secondNumber;
        }
        if(thirdNumber >= greatest){
            greatest = thirdNumber;
        }

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is:" + average);
        System.out.println("The product of the numbers is:" + product);
        System.out.println("The smallest of the numbers is:" + smallest);
        System.out.println("The greatest of the numbers is:" + greatest);
    }

    public static void problem6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();

        if(firstNumber%secondNumber == 0){
            System.out.println(firstNumber + " is the multiple of the second number");
        }
        else{
            System.out.println("First number is not divisible of the second number");
        }

    }

    public static void problem7(){
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

    public static void problem7ElegantMethod(){
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

    public static void problem8(){
        System.out.println("\nN\t10*N\t100*N\t1000*N");

        for (int i = 1; i < 6; i++) {

            int firstRow = i;
            System.out.println(firstRow + "\t" + firstRow*10 + "\t\t" + firstRow*100 + "\t\t" + firstRow * 1000);
        }

    }

    public static void problem9(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius sphere:");
        double r = scanner.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow (r, 3);
        System.out.println(volume);

    }

    public static void problem11(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String uppercase = scanner.nextLine().toUpperCase();
        System.out.println(uppercase+uppercase.toLowerCase());

    }

}
