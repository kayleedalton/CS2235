import java.util.Scanner;

public class testingshit2 {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if (inputtedNum < 5) {
            // Print out
            System.out.println("You will have good luck!");
        } else {
            // Print out
            System.out.println("You will have bad luck!");

        }
    }
}
