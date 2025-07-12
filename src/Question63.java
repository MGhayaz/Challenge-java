public class Question63 {
    public static void main(String[] args) {
        int[] arr = ArrayUtilityClass.ArrayInputUnit();
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("The maximum number in the array is "+ max);
    }
}
