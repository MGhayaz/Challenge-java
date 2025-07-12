import java.util.Scanner;

public class Question25 {
    // intro to bit operators {left swift operator}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = input.nextInt();

        int result = number1<<1;
        System.out.println(" the Answer: "+ result);
    }
}
