import java.util.Scanner;

public class Question38 {
    public static void main (String [] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = input.nextInt();
        boolean isTrue = NumberIdentifier(number);
        if (isTrue){
            System.out.println("yes, your number is palindrome");
        } else {
            System.out.println("No, your input is not an palindrome");
        }

    }

    public static boolean NumberIdentifier(int input) {
        int NewNum = 0;
        int inputCopy = input;
        while (input > 0) {
            int digit = input % 10;
            NewNum = NewNum * 10 + digit;
            input /= 10;
        }
        return inputCopy == NewNum;

    }
}
