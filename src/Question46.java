public class Question46 {
    public static void main(String[] args) {
        int[] inputArr = ArrayUtilityClass.ArrayInputUnit();
        boolean IsPalindrome = InputReverse(inputArr);
        if( IsPalindrome){
            System.out.println("Your Array is Palindrome");
        } else {
            System.out.println("No, It's different");
        }


    }

    public static boolean InputReverse(int[] inputArr) {
        int old = inputArr.length;
        int[] ReverseArr = new int[old];
        int Reindex = 0;

        while (old > 0) {
            ReverseArr[Reindex] = inputArr[old - 1];
            Reindex++;
            old--;
        }
        int index = 0;
        while (index < inputArr.length){
            if (inputArr [index] != ReverseArr[index]){
                return false;
            }
            index++;
        }

        return true;



    }
}

