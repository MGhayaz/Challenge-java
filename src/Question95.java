import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question95 {
    public static void main(String[] args) {
        Set<Character> sets = new HashSet<>();
        System.out.print("Please enter input: ");
        Scanner input = new Scanner(System.in);
        String user = input.next();
        for(char q :user.toCharArray( )){
            sets.add(q);
        }
        System.out.println("Apke String mai "+sets.size()+ " Elements unique hain, woh hain"+sets);

    }
}
