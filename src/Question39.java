import java.util.Scanner;

public class Question39 {
    public static void main (String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print(" Welcome to pattern printer \n please enter your max colum number : ");
        int inpute = input.nextInt();
        PatternfirstPrinter(inpute);
        PatternsecondPrinter(inpute);
       PatternThirdPrinter(inpute);
    }

    public static void PatternfirstPrinter(int MaxRow) {
        int rows = 0;
        while (rows < MaxRow){
            System.out.print("C ");
            int column = 0 ;
            while ( column < rows ) {
                System.out.print("R ");
                column++;
            } System.out.println();
            rows++;
        }
    }

    public static void PatternsecondPrinter(int Max) {
        System.out.println(" here is your second pattern");
        int rows = Max;
        while (rows > 0){
            int column = 0 ;
            while ( column <  rows ) {
                System.out.print("R ");
                column++;
            } System.out.println();
            rows--;
        }

    }

    public static void PatternThirdPrinter( int MaxNum) {
        int rows = MaxNum;
        while ( rows  > 0 ){
            int column = 0 ;
            while (column <  (rows - 1) ) {
                System.out.print("  ");
                column++;
            }
            int i = 0;
            while ( i <= (MaxNum - rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
            }

        }
    }


