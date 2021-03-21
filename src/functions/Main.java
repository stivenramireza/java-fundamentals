package functions;
import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press [ENTER] to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    public static double calculateEmployeeSalary(int hoursPerWeek, double moneyPerHour, int vacationDays) {
        if (hoursPerWeek < 0 || moneyPerHour < 0 || vacationDays < 0) return -1;
        double unpaidTime = vacationDays * moneyPerHour * 8;
        return (hoursPerWeek * moneyPerHour * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        // Calling functions
        System.out.println("Welcome to your new job");

        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted!");

        // Parameters
        calculateTotalMealPrice(15, .2, .08);
        calculateTotalMealPrice(25, .18, .08);

        // Return types
        double groupTotalMealPrice = calculateTotalMealPrice(100, .2, .05);
        System.out.println(groupTotalMealPrice);

        double individualMealPrice = groupTotalMealPrice / 5;
        System.out.println(individualMealPrice);

        // Built-in functions
        double result = Math.pow(2, 5);
        System.out.println(result);

        // Challenge (salary calculator)
        double employeeYearlySalary = calculateEmployeeSalary(40, 15, 8);
        System.out.println(employeeYearlySalary);
    }

}
