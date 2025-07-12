import java.util.Scanner;
// create a program that determines the greatest number among all
public class seventeenthQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        float onenumber = input.nextFloat();
        System.out.print("Please enter the second number: ");
        float secondnumber = input.nextFloat();
        System.out.print("Please enter the third number: ");
        float thirdnumber = input.nextFloat();
        if (onenumber >= secondnumber && onenumber >= thirdnumber){
            System.out.print("The first given number is greatest among all which is: " + onenumber );
        } else if (secondnumber >= onenumber && secondnumber >= thirdnumber){
            System.out.print("The second given number is greatest among all which is:  "+ secondnumber);
        } else if (thirdnumber >= onenumber && thirdnumber >= secondnumber) {
            System.out.print("The third given number is greatest among all which is: " + thirdnumber);
        }



    }
}
