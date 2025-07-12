import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {
        int[] inputArr = ArrayUtilityClass.ArrayInputUnit();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your RadarInput: ");
        int radarInput = input.nextInt();
        int occ = occurrence(inputArr , radarInput);
        int[] LatestArr = deleteNum(inputArr, radarInput, occ);
        System.out.println("here is your new array");
        ArrayUtilityClass.displayArray(LatestArr);
    }
    public static int  occurrence(int[] oldArr, int radarInput){
        int runner = 0;
        int occ = 0;
        while (runner < oldArr.length) {
            if (oldArr[runner] == radarInput) {
                occ++;
            }
            runner++;
        }
        return occ;
    }
    public static int[] deleteNum(int[] oldArr, int radarInput, int occ) {
            if (occ == 0){
                return oldArr;
            }
        int newSize = oldArr.length - occ;
        int [] LatestArr = new int [newSize] ;

       int oldIndexRunner = 0 , newIndexRunner = 0;
       while(oldIndexRunner < oldArr.length){
           if (oldArr[oldIndexRunner] != radarInput ){
               LatestArr[newIndexRunner] = oldArr[oldIndexRunner];
               newIndexRunner++;
           }
           oldIndexRunner ++;
       }

       return LatestArr;
    }
}
