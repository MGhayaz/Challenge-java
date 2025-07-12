import javax.print.attribute.standard.Fidelity;
import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the end number for fib series: ");
        int number = input.nextInt();
        FibMaker(number);

    }

    public static void FibMaker(int Input) {
        int first = 0, second = 1;
        if (Input < 0) return ;
        System.out.print("0, ");
        if (Input == 0) return ;
        System.out.print("1, ");
        while (first + second <= Input) {
            int third = first + second;
            System.out.print( third + ", ");
            first = second;
            second = third;
        }

    }

//        Scanner input = new Scanner(System.in);
//        System.out.println(" welcome to fibonacci number series \n please enter the max fib number ");
//
//        FibMaker(input.nextInt() );
//    }
//
//    public static  void  FibMaker(int LastNum) {
//        int first = 0, second = 1;
//        if (LastNum < 0) return;
//
//        if (LastNum == 0 ) {
//            System.out.println(0);
//        }
//
//        System.out.println("The fib series are as follows: ");
//        System.out.print(first + "," + second);
//        while ( first + second <= LastNum){
//            int  next = first + second;
//            System.out.print("," + next );
//            first = second;
//            second = next;
//
//
//        }
//    }
}
