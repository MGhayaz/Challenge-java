package Question87;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        divide();
    }
    public static void divide(){
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome\nPlease enter first number: ");
        int a = input.nextInt();
        System.out.print("Please enter second number: ");
        int b = input.nextInt();
        try{
            int result = a/b;
            System.out.printf("The division of %d by %d is %d", a ,b, result);
        } catch(ArithmeticException AreEx){
            if ( AreEx.getMessage().equals("/ by zero") ){
                System.out.println("Exception " + AreEx.getMessage() + " Please enter valid input");
            } else{ throw AreEx; }
        }
    }


}
