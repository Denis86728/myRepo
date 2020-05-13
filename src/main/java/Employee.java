public class Employee {

    String first_name;

    String last_name;

    double monthly_salary;

    public Employee(String first_name, String last_name, double monthly_salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.monthly_salary = monthly_salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getMonthly_salary() {
        if (monthly_salary <= 0) {
            return monthly_salary = 0.0;
        }
        return monthly_salary;
    }

    public void setMonthly_salary(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public void getInfo() {
        System.out.println(
            "The salary for " + getFirst_name() + getLast_name() + " employee is " + getMonthly_salary() + "$");

    }

    public double getYearlySalary() {
        return getMonthly_salary() * 12;
    }

    public double give10Raise() {
        return getMonthly_salary() * 10 / 100;
    }

    public double getYearlySalaryAfterRaise() {
        return getYearlySalary() + give10Raise() * 12;
    }

}
