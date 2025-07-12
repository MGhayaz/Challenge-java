import java.util.Scanner;

public class Question62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number");
        int num = input.nextInt();
        System.out.println("your number is " + (IsPrime(num) ? "Prime" : "not prime"));
    }

    public static boolean IsPrime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
