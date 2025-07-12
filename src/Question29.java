import java.util.Scanner;

// 😭 boht koshish ke baad aaya
public class Question29 {
    public static void main(String[] args) {
        Greet();
        Print( oddNumber(Input()) ) ;

    }

    public static void Greet(){
        System.out.println("Welcome to odd number tool");

    }

    public static int Input() {
        System.out.print("Please enter the number : ");
        Scanner Inpute = new Scanner(System.in);
        return Inpute.nextInt();
    }

    public static int oddNumber(int inpute) {
        int sum = 0;
        int localserialnumber= 1;
        while (localserialnumber <= inpute){
            sum += localserialnumber;
            localserialnumber += 2;
        }
                return sum ;
    }

    public static void Print(int sum) {
        System.out.println(sum);
    }
}
//        Greeting();
//        Scanner Input = new Scanner(System.in);
//        System.out.print("Please enter your number: ");
//        int userInputNthNumber = Input.nextInt();
//       int sum = SumOfOddNumbers(userInputNthNumber);
//        System.out.println("Odd Number Till "+ userInputNthNumber + " are "+ sum );
//
//    }
//
//    public static int SumOfOddNumbers(int numberByUser) {
//        int sum = 0;
//        int localSerialNumber = 1;
//        while (localSerialNumber <= numberByUser) {
//            sum += localSerialNumber;
//            localSerialNumber += 2;
//
//        }
//
//        return sum;
//    }
//
//    public static void Greeting() {
//        System.out.println("Hello Boss");
//    }
//}
