public class Question47 {
    public static void main(String[] args){
        int[] firstArr = ArrayUtilityClass.ArrayInputUnit();
        int[] secondArr = ArrayUtilityClass.ArrayInputUnit();
        int [] mergedArr = merge(firstArr , secondArr);
            ArrayUtilityClass.displayArray(mergedArr);
    }
    public static int[] merge(int[] firstArr , int[] secondArr){
        int newSize = firstArr.length + secondArr.length;
        int[] mergedArr = new int[newSize];
        int firstRunner = 0 , secondRunner  = 0, MergeRunner = 0 ;
        while ( firstRunner < firstArr.length || secondRunner < secondArr.length){
            if ( secondRunner == secondArr.length||
                    firstRunner < firstArr.length &&
                            firstArr[firstRunner] < secondArr[secondRunner]){
                mergedArr[MergeRunner] = firstArr[firstRunner];
                firstRunner++;
                MergeRunner++;
            } else {
                mergedArr[MergeRunner] = secondArr[secondRunner];
                MergeRunner++;
                secondRunner++;
            }


        }
        return mergedArr;
    }
}
