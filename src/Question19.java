import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the marks: ");
        int marks = Input.nextInt();
        if ( 90 < marks && marks <= 99){
            System.out.println(" your Grade is A");
        }
        else if (75 < marks && marks < 90){
            System.out.println("your Grade is B");
        }
        else if (60 < marks && marks < 75){
            System.out.println("your Grade is C");
        }
        else if (30 < marks && marks < 60){
            System.out.println("your Grade is D");
        }
        else if ( 0 <= marks && marks < 30 ){
            System.out.println("your Grade is F");
        }
        else if (marks == 100){
            System.out.println("your Grade is O");
        }
        else if (marks > 100 || marks < 0){
            System.out.println("Incorrect marks entered");
        }


    }
}
