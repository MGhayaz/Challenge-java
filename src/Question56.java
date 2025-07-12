import java.util.Scanner;

public class Question56 {
    public static void main(String[] args) {
        System.out.print("Welcome to student marks grade tool\nplease enter student score: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        String High = "High";
        String Moderate = "Moderate";
        String Low = "Low";
        if(userInput <= 100 && userInput > 0 ){
            String grade =  userInput >= 80 ? High : (userInput >= 50 ? Moderate : Low );
            System.out.println("the grade category of student is "+ grade);
        } else{
            System.out.println("Invalid Percentage entered");
        }

    }
}
