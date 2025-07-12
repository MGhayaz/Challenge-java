import java.util.Scanner;

public class ArrayUtilityClass {
    public static int[] ArrayInputUnit (){
        System.out.print("Please enter the Array length: ");
        Scanner input = new Scanner(System.in);
        int ArrSize = input.nextInt();
        int[] ArrayNum = new int[ArrSize];
        int indexRunner = 0;
        while (indexRunner < ArrayNum.length) {
            System.out.print("Please enter the element no for " + (indexRunner + 1) + " : ");
            ArrayNum[indexRunner] = input.nextInt();
            indexRunner++;
        }
        return ArrayNum;
    }
    public static int[] [] Array2DInputUnit () {
        System.out.print("Please enter the Array row size: ");
        Scanner input = new Scanner(System.in);
        int ArrRowSize = input.nextInt();
        System.out.print("Please enter the Array column size: ");
        int ArrColSize = input.nextInt();

        int[][] ArrayNum = new int[ArrRowSize][ArrColSize];
        int indexRowRunner = 0;
        while (indexRowRunner < ArrRowSize) {
            int indexColumnRunner = 0;
            while (indexColumnRunner < ArrColSize) {
                System.out.print("Please enter the row no for " + (indexRowRunner + 1) + " : " + "and column no for " +
                        (indexColumnRunner + 1) + " : ");
                ArrayNum[indexRowRunner][indexColumnRunner] = input.nextInt();
                indexColumnRunner++;
            }
            indexRowRunner++;
        }

        return ArrayNum;
    }

        public static void displayArray(int[] numArr) {
        int runner = 0;
        while (runner < numArr.length){
            System.out.println(numArr[runner] + "  with indexNumber : "+ runner);
            runner++;
        }
    }

}
