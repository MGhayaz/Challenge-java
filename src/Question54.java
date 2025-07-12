import java.util.Scanner;

public class Question54 {
    // Odd or Even
    public static void main(String[] args) {
        System.out.print("Welcome to odd and even identifier\nPlease enter your number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        System.out.println( "Your number is " + OddEvenFinder ( userInput ) );

    }

    public static String OddEvenFinder(int input) {
        String result;
        String  even = "Even";
        String odd = "Odd";
        result = input % 2 == 0 ? even : odd;
        return result;

    }
}
