import java.util.Scanner;

public class Question61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("welcome to table maker\nPlease enter your number: ");
        int table = input.nextInt();
        for (int runner = 1; runner <= 10; runner++) {
            System.out.println(table + " X " + runner + " = " + (table*runner) );
        }

    }
}
