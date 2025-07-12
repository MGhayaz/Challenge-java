import java.util.Scanner;

public class EighthQuestion {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Hi, Please enter the Value of A");
        int A = Input.nextInt();
        System.out.println("Hi, Please enter the Value of B");
        int B = Input.nextInt();
        int add = A+B;
        int subtract = A-B;
        int product = A*B;
        int divide = A/B;
        int remainder = A%B;
        System.out.println("The Sum of Given Values Are: "+add);
        System.out.println("The difference of Given Values Are: "+subtract);
        System.out.println("The Product of Given Values Are: "+product);
        System.out.println("The Divided Values of Given numbers Are: "+divide);
        System.out.println("The Remainder(Module) of Given Values Are: "+remainder);









    }
}