import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
    Greet();
    printer(Input(), Input());
    }

    public static void Greet() {
        System.out.println("Welcome to Table Maker");
    }

    public static int Input() {
        System.out.print("Please enter the number: ");
        Scanner numbertaker = new Scanner(System.in);
        return numbertaker.nextInt();
    }

    public static void printer(int inputedNumber, int nthnumber ) {
        int multiplicant = 1;
        while (multiplicant <= nthnumber ){
            System.out.println(inputedNumber + " x " +multiplicant + " = "+ (inputedNumber*multiplicant)  );
            multiplicant++;
        }
    }


















}
//        Greetings();
//        Inpute();
//
//
//    }
//
//    public static void PrintMultiplication(int num) {
//        int multiplicand = 1;
//        while ( multiplicand <= 10){
//            System.out.println(num + " X "+ multiplicand + " = "+ (num*multiplicand) );
//            multiplicand++;
//
//        }
//
//    }
//
//    public static void Inpute () {
//        Scanner Input = new Scanner(System.in);
//        int firstnumber = Input.nextInt();
//        PrintMultiplication(firstnumber);
//    }
//
//    public static void Greetings() {
//        System.out.print("Welcome boss\nPlease enter the number: ");
//    }
//
//}
