import java.util.Scanner;

//Password Checker
public class Question59 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please enter your password: ");
            password = input.next();
        } while (InvalidPassword(password));
        System.out.println("ThankYou");
    }
    public static boolean InvalidPassword (String password){
        return password.length() < 6;
    }


// my build check if preset pass If entered
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome");
//        int pass = 1234;
//        int password;
//        do {
//            System.out.print("Please enter password: ");
//            password = input.nextInt();
//        } while (pass != password);
//        System.out.println("out");
//    }
}
