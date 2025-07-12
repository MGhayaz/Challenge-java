import java.util.Scanner;

public class Question55 {
    // remove negative
    public static void main(String[] args) {
        System.out.print("Please enter your number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int Corrector = ( - userInput);
        int result = userInput < 0 ? Corrector : userInput;
        System.out.println("the absolute value of given number is |"+ result + "|");
    }
}
