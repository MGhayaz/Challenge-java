import java.util.Scanner;

public class Question68 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to end series");
        int count = input.nextInt();
        for(int i = 1; i <= count; i++ ){
            System.out.print(fibMaker ( i ) + " " );
        }

    }

    public static int fibMaker(int position) {
        if(position == 1){
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return fibMaker(position - 1) + fibMaker(position - 2);
    }
}
