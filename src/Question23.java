import java.util.Scanner;

public class Question23 {
    // intro to bit operators {XOR}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number 1: ");
        int number1 = input.nextInt();
        System.out.print("Please enter the number 2: ");
        int number2 = input.nextInt();
        int result = number1 ^ number2;
        System.out.println("Answer: "+ result);
    }
}
