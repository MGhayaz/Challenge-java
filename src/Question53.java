import java.util.Scanner;

public class Question53 {

    // MinimumTernary
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();
        Question53 Ternary = new Question53();
        int smallResult =  Ternary.smallestNum ( num1 , num2 );
        System.out.println( "the smallest number is " + smallResult );

    }

    public  int smallestNum( int num1 , int num2) {
        return num1 < num2 ? num1 : num2;
    }
}
