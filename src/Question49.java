public class Question49 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and Averaging operator for 2D Array");
        int[][] Arr = ArrayUtilityClass.Array2DInputUnit();
        arraySum(Arr);

    }

    public static void arraySum(int[][] Arr) {
        int rowRunner = 0;
        int sum = 0;
        while (rowRunner < Arr.length) {
            int colRunner = 0;
            while (colRunner < Arr[rowRunner].length) {
                sum = sum + Arr[rowRunner][colRunner];
                colRunner++;
            }
            rowRunner++;
        }
        int totalElements = Arr.length * Arr[(0)].length;
        double average = (double) sum / totalElements;
        System.out.println("The Sum of given elements in 2D Array are as follows: " + sum);
        System.out.println("The Average of given elements in 2D Array are as follows: " + average);
    }


}
