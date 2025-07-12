import java.sql.SQLOutput;
import java.util.Scanner;

public class Question74 {
    int random;

    Question74() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guessUnit(int guessInput) {
        return guessInput - random;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to guessing game for 1-100");
        Question74 game100 = new Question74();
        Scanner input = new Scanner(System.in);
        int guessInput;
        int guessUnitResult;
        do {
            System.out.print("Please enter number: ");
            guessInput = input.nextInt();
            guessUnitResult = game100.guessUnit(guessInput);
            if (guessUnitResult == 0) {
                System.out.println("You have guessed right");
            } else if (guessUnitResult < 0) {
                System.out.println("guess higher");
            } else {
                System.out.println("guess lower");
            }
        } while (guessUnitResult != 0);

    }

// my code with no recurring input system
//    static int random = (int)Math.ceil(Math.random() * 10);
//    int userInput;
//    public Question74(int userInput){
//      this.userInput = userInput;
//    }
//    public String toString(){
//        return userInput == random ? "You guessed it right":"Wrong answer";
//
//    }
//    public static void main(String[] args) {
//        System.out.println("Welcome to number guessing game between 1 to 10");
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the number: ");
//        int userInput = input.nextInt();
//        Question74 obj = new Question74(userInput);
//        System.out.println(obj);
//        System.out.printf("Real number was %d" ,random);
//    }
}
