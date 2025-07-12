public class Question45 {
    //reverseArray
    public static void main(String[] args) {
        int[] inputArr = ArrayUtilityClass.ArrayInputUnit();
       int [] ReversedArr = InputReverse(inputArr);
       if (inputArr ==ReversedArr){
           System.out.println("inputArray and Reversed Array were Same");
       } else {
           ArrayUtilityClass.displayArray(ReversedArr);
       }

    }

    public static int[] InputReverse(int[] inputArr) {
        int old = inputArr.length;
        int[] ReverseArr = new int[old];
        int Reindex = 0;
        while (old > 0) {
            ReverseArr[Reindex] = inputArr[old - 1];
            Reindex++;
            old--;
        }
        return ReverseArr;

    }
}
