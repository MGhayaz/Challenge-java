import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner Inputee = new Scanner(System.in);
        System.out.println("Welcome to compound interest !");
        System.out.print("Hi, Please enter the principal amount: ");
        double A = Inputee.nextDouble();
        System.out.print("Hi, Please enter the Value of rate of interest: ");
        double B = Inputee.nextDouble();
        System.out.print("Hi, Please enter the time in years: ");
        double C = Inputee.nextDouble();

        double z = A * Math.pow((1 + B/100),C);
        System.out.println(z);

    }
}
