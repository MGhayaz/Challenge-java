import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please enter the age: ");
        int age = Input.nextInt();
        if (1 < age && age <= 13){
            System.out.println("Welcome child");
        }
        else if ( 14 <= age && age <= 20){
            System.out.println("Welcome Teen");
        }
        else if  ( 21 <= age && age <= 60) {
            System.out.println("Welcome adult");
        }
        else if  ( 61 <= age && age <= 99) {
            System.out.println("Welcome Senior");
        }
        else if (age >100) {
            System.out.println("Welcome Rare human");
        }
        else if (0 < age && age < 1 ) {
                System.out.println("Welcome baby");
        }
        else {
            System.out.println("Incorrect age entered");
            }

        }
    }

