import java.util.Scanner;

public class Question21 {
    // intro to bit operators {AND}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int number1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int number2 = input.nextInt();
        int result = number1 & number2;
        System.out.print("your result: "+ result);

    }
}
