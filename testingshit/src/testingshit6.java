import java.util.Scanner;
public class testingshit6 {
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the meal price?");
        double listedMealPrice = scanner.nextDouble();
        System.out.println("What is the tip rate?");
        double tipRate = scanner.nextDouble();
        System.out.println("What is the tax rate?");
        double taxRate = scanner.nextDouble();
        double total = calculateTotalMealPrice(listedMealPrice,tipRate,taxRate);
        System.out.println("Your total price is " + total);
        System.out.println("How many diners are splitting the bill?");
        int diners = scanner.nextInt();
        double pricePerDiner = total / diners;
        System.out.println("Each diner will pay " + pricePerDiner);
    }
}
