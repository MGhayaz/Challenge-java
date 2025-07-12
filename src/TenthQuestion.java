import java.util.Scanner;

public class TenthQuestion {
    public static void main(String[] args) {
        Scanner Inputee = new Scanner(System.in);
        System.out.println("Welcome to Rectangle PERIMETER MAKER!");
        System.out.print("Hi, Please enter the Length: ");
        int A = Inputee.nextInt();
        System.out.print("Hi, Please enter the Value of breadth: ");
        int B = Inputee.nextInt();
        int z = 2*A+2*B;


        System.out.println("The perimeterr of rectangle: "+z);

    }
}
