public class Question67 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int[] arr = ArrayUtilityClass.ArrayInputUnit();
        for(int num : arr){
            if(num % 2 != 0){
                continue;
            }
            System.out.print(num + " ");
        }
    }
}
