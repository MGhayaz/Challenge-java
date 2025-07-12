import java.util.Scanner;
 // create a program that determines is a number is positive, negative or zero.
public class fivteenthQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
       int number = input.nextInt();
       if (number > 0 ) {
           System.out.println("Your number is Positive");
       }    else if (number == 0) {
           System.out.println("Your number is Zero which is neither positive nor negative");
       }  else{
           System.out.println("Your number is Negative");
       }

    }
}
