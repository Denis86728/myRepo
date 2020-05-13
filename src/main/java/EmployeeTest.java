import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the first name for the employee:");
        String firstName1 = input1.nextLine();
        employee1.setFirst_name(firstName1);

        System.out.println("Please enter the last name for the employee:");
        String secondName1 = input1.nextLine();
        employee1.setLast_name(secondName1);

        System.out.println("Please enter the salary for the employee:");
        int salary1 = input1.nextInt();
        employee1.setMonthly_salary(salary1);
        employee1.getInfo();

        System.out.println("");
        System.out.println("The yearly salary for " + employee1.getLast_name() + " is " + employee1.getYearlySalary() + "$");
        System.out.println("The 10% raise for " + employee1.getLast_name() + " is "  + employee1.give10Raise() + "$");
        System.out.println("The new yearly salary for " + employee1.getLast_name() + " is " + employee1.getYearlySalaryAfterRaise() + "$");

        System.out.println(" ");

        System.out.println("Please enter the first name for the second employee:");
        String firstName2 = input2.nextLine();
        employee2.setFirst_name(firstName2);

        System.out.println("Please enter the last name for the second employee:");
        String secondName2 = input2.nextLine();
        employee2.setLast_name(secondName2);

        System.out.println("Please enter the salary for the second employee:");
        int salary2 = input2.nextInt();
        employee2.setMonthly_salary(salary2);
        employee2.getInfo();
        System.out.println("The yearly salary for " + employee2.getLast_name() + " is " + employee2.getYearlySalary() + "$");
        System.out.println("The 10% raise for " + employee2.getLast_name() + " is "  + employee2.give10Raise() + "$");
        System.out.println("The new yearly salary for " + employee2.getLast_name() + " is " + employee2.getYearlySalaryAfterRaise() + "$");


    }
}
