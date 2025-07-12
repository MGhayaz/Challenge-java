public class Question43 {
    // array series sorted checking mechanism
    public static void main(String[] args) {
        int[] ArrNum = ArrayUtilityClass.ArrayInputUnit();

        boolean ascend = ascending(ArrNum);
        boolean descending = descending(ArrNum);
        if (ascend || descending){
            System.out.println("Your array series is sorted");
        } else {
            System.out.println("Your array series is not sorted");
        }
    }
    public static boolean ascending(int[] ArrInput){
        int indexRunner =0;
        while (indexRunner < (ArrInput.length - 1) ){
            if (ArrInput[indexRunner] > ArrInput[(indexRunner+1)] ){
                return false;
            }
            indexRunner++;

        }
        return true;
    }
    public static boolean descending(int[] ArrInput){
        int indexRunner =0;
        while (indexRunner < (ArrInput.length - 1) ){
            if (ArrInput[indexRunner] < ArrInput[ (indexRunner + 1 ) ] ){
                return false;
            }
            indexRunner++;

        }
        return true;
    }
}
