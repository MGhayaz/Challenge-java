import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number ");
        int number = input.nextInt();
        boolean armstrong =  isArmstrong(number);

        if (armstrong){
            System.out.println("yes, your given number is Armstrong");
        } else {
            System.out.println(" no, your number is not an armstrong");
        }
    }

    public static boolean isArmstrong(int input) {
        int NoOfdigits = NoOfDigit(input);
        int  inputCopy = input;
            int finalnum = 0;
            while ( input > 0){
                int LastDigit = input % 10;
                input /= 10;
                finalnum += pow(  LastDigit, NoOfdigits);
            }
       return finalnum == inputCopy;

    }

    public static int pow( int num1 , int num2 ) {
        int results = 1;
        int runner = 0;
        while ( runner <  num2){
            results *= num1;
            runner++;
        }
        return results;

    }
    public static int NoOfDigit(int num) {
        int digits = 0;
        while ( num > 0) {
            digits++;
            num /=10 ;

        }
        return digits;

    }
}
