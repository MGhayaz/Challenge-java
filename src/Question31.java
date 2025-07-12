import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
    Greet();
    Printer (sumOfDigit ( input () )) ;
    }

    public static void Greet() {
        System.out.println("Welcome to sun of digit maker");
    }

    public static int input(){
        System.out.print("please enter the number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt() ;
    }

    public static int sumOfDigit(int input)  {
        int TotalSumOfDigits = 0;
        while (input > 0){
            TotalSumOfDigits = TotalSumOfDigits + (input % 10);
            input /= 10;

        }
        return TotalSumOfDigits;
    }

    public static void Printer(int sum) {
        System.out.println(sum);
    }
}
