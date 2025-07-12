import java.util.Scanner;

public class Question26 {
    // intro to bit operators {right swift operator}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kripya apnam number dalein: ");
        int number1 = input.nextInt();
        int result = number1>>1;
        System.out.println("Answer is: "+ result);
    }
}
