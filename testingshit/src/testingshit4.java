import java.util.Scanner;
public class testingshit4 {
    public static void main(String args[]) {
        String question = "What is 1 + 1 ?";
        String choiceOne = "11";
        String choiceTwo = "2";
        String correctAnswer = choiceTwo;
        System.out.println(question);
        System.out.println("Choose one of the following \n" + choiceOne + "\n" + choiceTwo);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(correctAnswer.equals(input))  {
            System.out.println("Congrats that's correct");
            } else {
                System.out.println("That's false.");
            }
        }
    }
