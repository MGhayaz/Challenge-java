public class Question50 {
    // diagonal
    public static void main(String[] args) {
        int[][] Arr = ArrayUtilityClass.Array2DInputUnit();
        boolean IsValid = conditionChecker(Arr);
        int sum ;
        if (IsValid) {
            if (Arr.length % 2 == 0) {
                sum = diagonalEvenSumMaker(Arr);
            } else {
                sum = diagonalOddSumMaker(Arr);
            }
            System.out.println("and the sum of diagonal numbers given in 2D array are as follows: " + sum);
        } else {
            System.out.println("the size of rows and columns in given array are not equal");

        }


    }

    public static int diagonalEvenSumMaker(int[][] Arr) {
        int rowRunner = 0;
        int sum = 0;
        while (rowRunner < Arr.length) {
            int columRunner = 0;
            while (columRunner < Arr[rowRunner].length) {
                if (rowRunner + columRunner == (Arr.length - 1) || rowRunner == columRunner) {
                    System.out.println("the diagonal numbers are " + Arr[rowRunner][columRunner]);
                    sum = sum + Arr[rowRunner][columRunner];
                }
                columRunner++;
            }
            rowRunner++;
        }

        return sum;
    }

    public static int diagonalOddSumMaker(int[][] Arr) {
        int rowRunner = 0;
        int sum = 0;
        while (rowRunner < Arr.length) {
            int columRunner = 0;
            while (columRunner < Arr[rowRunner].length) {
                if (rowRunner + columRunner == Arr.length - 1 || rowRunner == columRunner) {
                    System.out.println("the diagonal numbers are " + Arr[rowRunner][columRunner]);
                    sum = sum + Arr[rowRunner][columRunner];
                }
                columRunner++;
            }
            rowRunner++;
        }

        return sum;
    }

    public static boolean conditionChecker(int[][] Arr) {
        int expectedLength = Arr[0].length;
        int runner = 1;
        while (runner < Arr.length) {
            if (Arr.length != expectedLength) {
                return false;
            }
            runner++;

        }
        return Arr.length == expectedLength;
    }

}
