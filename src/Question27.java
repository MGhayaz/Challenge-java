import java.util.Scanner;

public class Question27 {
    // check if a given number is even or odd using bitwise operation
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number; ");
        int number = input.nextInt();
        if ((number & 1) == 1){
            System.out.println("your number is odd");
        }
        else {
            System.out.println("Your number is even");
        }
    }
}
