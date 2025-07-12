import java.util.Scanner;

public class Question58 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number1: ");
        int Num1 = input.nextInt();
        System.out.print("Please enter your number2: ");
        int Num2 = input.nextInt();
        System.out.print("Please enter the  operation character: ");
        String operator = input.next();
        double output = switch(operator){
            case "+" -> Num1+Num2;
            case "-" -> Num1-Num2;
            case "*" -> Num1*Num2;
            case "/" -> Num1/Num2;
            default -> -1;
        };
        System.out.println(output);
    }
}
