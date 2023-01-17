import java.util.Scanner;

public class testingshit3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("playing current song");
            System.out.println("Do you want to stop?");
            String userInput = input.next();
            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing different");
    }
}
