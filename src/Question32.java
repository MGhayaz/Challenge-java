import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Greet();
        Printer(leastCommonMultiple (input(), input() ) );
    }

    public static void Greet() {
        System.out.println("Welcome to Least common multiple makerr");
    }

    public static int input() {
        System.out.print("please enter the number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int leastCommonMultiple(int first, int second) {
            int runner = 1;
            while(true){                                         //runner <= first
                int factor = first * runner;
                if(factor % second == 0){
                    System.out.print("Tool: "+ first +" * " + runner + " = ");
                    return  factor;
                }
                runner++;
            }

    }


    public static void Printer(int sum) {
        System.out.println(sum);
    }
}



