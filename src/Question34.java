import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime number identification tool \n Please enter the number: ");
        boolean Prime = PrimeIdentifier( input.nextInt() );
        if (Prime){
            System.out.println("Your given input is Prime");
        } else {
            System.out.println("No, Your given input is not Prime");
        }

    }

    public static boolean PrimeIdentifier(int NumInputed) {
        int runner = 2;
        while (runner < NumInputed) {
            if (NumInputed % runner == 0 ){
                return false;
            }
            runner++;
        }
        return true;
    }
}

