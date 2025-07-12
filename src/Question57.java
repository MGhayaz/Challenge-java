import java.util.Scanner;

public class Question57 {
    public static void main(String[] args) {
        System.out.print("welcome to month identifier\nPlease enter the month name: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        String monthName = switch (userInput){
            case 1  -> "January";
            case 2  -> "February";
            case 3  -> "March";
            case 4  -> "April";
            case 5  -> "May";
            case 6  -> "June";
            case 7  -> "July";
            case 8  -> "August";
            case 9  -> "September";
            case 10  -> "October";
            case 11  -> "November";
            case 12  -> "December";
            default -> "Invalid month entered";
        };
        System.out.println("The month is " + monthName);
    }
}
