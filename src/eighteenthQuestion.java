import java.util.Scanner;
// create a program that determine whether the given year is leap year or not
public class eighteenthQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year identifier\nPlease enter the four digit year number. eg 2016:  ");
        double year = input.nextDouble();
        if ( year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ){
            System.out.println("Yes it is leap year");
        } else {
            System.out.println(" No it's not leap year");
        }
    }
}
