import java.util.Scanner;
public class testingshit7 {
    public static double employeeSalaryCalculator(double payPerHour, double hoursWorkedPerWeek, int daysOff) {
        double yearlySalary = payPerHour * hoursWorkedPerWeek * 52;
        double realSalary = yearlySalary - (daysOff * payPerHour);
        return realSalary;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your hourly wage?");
        double payPerHour = scanner.nextDouble();
        System.out.println("How many hours do you work per week?");
        double hoursWorkedPerWeek = scanner.nextDouble();
        System.out.println("How many unpaid days off did you have?");
        int daysOff = scanner.nextInt();
        double realSalary = employeeSalaryCalculator(payPerHour, hoursWorkedPerWeek, daysOff);
        System.out.println("Your yearly salary is " + realSalary);
    }
}
