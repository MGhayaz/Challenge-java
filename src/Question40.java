import java.util.Scanner;
// khudse banaya
public class Question40 {
    public static void main(String[]args){
        ArrayOperator();
    }
    public static void ArrayOperator(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the array size : ");
        int numberSize = input.nextInt();
        int[] MyArr = new int[numberSize];
        int IndexRunner = 0;
        double sum = 0;

        while (IndexRunner < numberSize){
            System.out.print("Please enter the array element no "+ (IndexRunner+1) + " :");
            MyArr[IndexRunner] = input.nextInt();
            sum += MyArr[IndexRunner];

            IndexRunner++;
        }
        double Average =  sum / numberSize;
        System.out.println("The sum of all input values/elements are as follows : "+ sum);
        System.out.println("The average of all input/elements are as follows : "+ Average);
    }
}
