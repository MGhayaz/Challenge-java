import java.util.Scanner;

public class Question69 {
    //palindrome with recursion
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome\nPlease enter your name");
        String userStr = input.next();
        System.out.println(
                "your name is" + (palindrome(userStr) ? " Palindrome"
                                                        : " Not a palindrome")
        );
    }
    public static boolean palindrome(String userStr) {
        if (userStr.length() <= 1) {
            return true;
        }
        int lastPos = userStr.length() - 1;
        if(userStr.charAt(0) != userStr.charAt(lastPos)){
                return false;
        }
        String newStr = userStr.substring(1, lastPos);
        return palindrome(newStr);
    }
}
