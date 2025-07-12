import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        System.out.print("welcome to maxmin number finder\nPlease enter the Array length: ");
        Scanner input = new Scanner(System.in);
        int ArrSize = input.nextInt();
        int[] ArrayNum = new int[ArrSize];
        int indexRunner = 0;
        while (indexRunner < ArrayNum.length) {
            System.out.print("Please enter the element no " + (indexRunner + 1) + " ");
            ArrayNum[indexRunner] = input.nextInt();
            indexRunner++;
        }
        int max = ArrayNum[0];
        int min = ArrayNum[0];
        indexRunner = 1;
        while (indexRunner < ArrSize) {
            if (ArrayNum[indexRunner] > max) {
                max = ArrayNum[indexRunner];
            }
            if (ArrayNum[indexRunner] < min) {
                min = ArrayNum[indexRunner];

            }
            indexRunner++;
        }
        System.out.println("the maximum number is array list is " + max);
        System.out.println("the minimum number is array list is " + min);
    }
}
