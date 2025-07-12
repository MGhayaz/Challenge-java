public class Question66 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int[] arr = ArrayUtilityClass.ArrayInputUnit();
        int sum = 0 ;
        for (int number : arr) {
            if (number < 0) {
                continue;
            }
            sum = sum + number;
        }
        System.out.println("The sum of all positive numbers is "+ sum);

    }
}
