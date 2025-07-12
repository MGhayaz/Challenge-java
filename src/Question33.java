import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        // Business law and ethics ka Assigment karne jaroun 😥, InComplete tha ye!! shamme complete kara 😎
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please enter your number");
        int first = input.nextInt();
        System.out.println("Please enter your number");
        int second = input.nextInt();
        int GCD = GCD(first, second);
        System.out.println("the GCD Is "+ GCD);
       // int least = LeastFinder(first, second);

    }

    public static int GCD(int number1, int number2) {
        int GCD = 1;
         int least = LeastFinder(number1, number2);
         int runner = 2;
         while (runner <= least){
             if (number1 % runner == 0 && number2 % runner == 0){
                 GCD = runner;
             }
                runner++;
         }

        return GCD;
    }

    public static int LeastFinder(int NumberA, int NumberB ) {
        return Math.min(NumberA, NumberB);
    }
}
