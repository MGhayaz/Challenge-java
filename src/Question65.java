import java.util.Scanner;

public class Question65 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter command");
            String userInput = input.next();
            // .equals har object ke paaas rehta jo ek inbuild jvm method jisme koi value like exit diye,
            // toh unne check karta object aur coated value same hai ya nahi
              // equalIgnoreCase bi ek method hai jo case type like small, capital ku ignore karke value check karta,
            // chota deke bada enter kare toh v chalta
            if (userInput.equalsIgnoreCase("EXIT") ) {
                    break;
            }
        }
        System.out.println("Success");
    }

}
