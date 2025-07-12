import java.util.Scanner;

public class Question24 {
    // intro to bit operators {compliment or Not operator}
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = Input.nextInt();
        int result = ~number1 ;
        System.out.println("result is: "+ result);

    }
}
