import java.util.Scanner;
// already made by me in 59
public class Question60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        int num =5, guess;
        do{
            System.out.print("Enter number to guess: ");
            guess = input.nextInt();
        } while(guess != num);
        System.out.println("Right one");
    }
}
