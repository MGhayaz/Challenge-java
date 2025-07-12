import java.util.Scanner;

public class Question22 {
    // intro to bit operators {OR}
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Number 1 please");
        int number1 = Input.nextInt();

        System.out.print("Number 2 please");
        int number2 = Input.nextInt();

        int result = number1 | number2;
        System.out.print(" Answer: "+ result);

    }
}
