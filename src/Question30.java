import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Welcome();
        printer(factorialMaker(inputEngine()));

    }

    public static long inputEngine() {
        System.out.println("Please enter the Number");
        Scanner input = new Scanner(System.in);
        return input.nextLong();
    }

    public static void Welcome() {
        System.out.println("Welcome to factorial maker ");
    }

    public static long factorialMaker(long inputFromUser) {
        if (inputFromUser < 2) {
            return 1;
        }
        long factorial = 1;
        int runner = 2;
        while (runner <= inputFromUser) {
            factorial *= runner;
            runner++;
        }
        return factorial;
    }
    public static void printer(long printFact) {
        System.out.println(printFact);
    }
}
//     Greeting();
//     long printfactorial =  FactorialMaker(Input());
//     Result(printfactorial);
//    }
//    public static long Input() {
//        Scanner Input = new Scanner(System.in);
//        return Input.nextLong();
//    }
//    public static long  FactorialMaker(long num){
//        if (num < 2){
//            return 1;
//        }
//        long fact = 1;
//        int i = 2;
//        while( i <= num){
//            fact *= i;
//            i++;
//        }
//        return fact;
//    }
//    public static void Greeting() {
//        System.out.print("Welcome to factoral maker\nplease enter your number: ");
//    }
//
//    public static void  Result (long answer) {
//        System.out.println("The Factorial of given number is " + answer);
//
//    }
//    }

