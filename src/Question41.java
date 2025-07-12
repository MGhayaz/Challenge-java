import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        ArrayIO();

    }

    public static void ArrayIO() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of your array: ");
        int ArrSize = input.nextInt();
        int[] Array = new int[ArrSize];
        int indexRunner = 0;
        int RepeatCount = 0;
        while (indexRunner < ArrSize) {
            System.out.print("Please enter the element no: " + (indexRunner + 1) + " ");
            int ElementInput = input.nextInt();
            Array[indexRunner] = ElementInput;
            indexRunner++;
        }
        System.out.print("Please enter your RadarInput To Check: ");
        int RadarInput = input.nextInt();
        indexRunner = 0;
        while (indexRunner < ArrSize) {
            if (Array[indexRunner] == RadarInput) {
                RepeatCount++;
            }
            indexRunner++;
        }

        if (RepeatCount > 0) {
            System.out.println("the element " + RadarInput + " is repeated " + RepeatCount + " Times");
        } else {
            System.out.println("radar input no found in array list");
        }


//        indexRunner = 0;
//        while (indexRunner < ArrSize) {
//            if (Array[indexRunner] == RadarInput) {
//                RepeatCount++;
//            }
//            indexRunner++;
//        }
//        if (RepeatCount > 0) {
//            System.out.println("yes, The element " + RadarInput + " is repeated " + RepeatCount + " Times");
//        } else {
//            System.out.println("RadarInput not found in array");
//        }
//    }
    }
}
