import java.util.Scanner;
// create a program that determines whether the number is odd or even
public class sisteenthQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("Your number is even");
        } else if (number == 0) {
            System.out.println("Your number is zero");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
