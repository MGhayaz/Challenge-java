import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int print =  NumberSwaper(num);
        System.out.println("the number is "+ print);
    }

    public static int NumberSwaper(int num) {
        int newNum = 0;
        while (num > 0){
            int digit = num % 10 ;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;

    }
}
