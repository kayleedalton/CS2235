import java.util.Scanner;
public class testingshit5 {
    public static void calculateMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total is " + result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the meal price?");
        double listedMealPrice = scanner.nextDouble();
        System.out.println("What is the tip rate?");
        double tipRate = scanner.nextDouble();
        System.out.println("What is the tax rate?");
        double taxRate = scanner.nextDouble();
        calculateMealPrice(listedMealPrice,tipRate,taxRate);
    }
}
