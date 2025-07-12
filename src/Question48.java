import java.util.Scanner;

public class Question48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Arr2D = ArrayUtilityClass.Array2DInputUnit();
        System.out.print("Please enter your RadarInput: ");
        int radarInput = input.nextInt();
        ArrCheckUnit(radarInput, Arr2D);

    }

    public static void ArrCheckUnit(int radarInput, int[][] Arr2D) {
        int rowRunner = 0;
        boolean Isfound = false;

        while (rowRunner < Arr2D.length) {
            int columnRunner = 0;

            while (columnRunner < Arr2D[rowRunner].length) {

                if (Arr2D[rowRunner][columnRunner] == radarInput) {
                    System.out.println(radarInput + " is found at row no " + (rowRunner + 1) + ", column no " +
                            (columnRunner + 1));
                    Isfound = true;
                }

                columnRunner++;
            }
            rowRunner++;
        }
        if (!Isfound) {
            System.out.println("Radar Number not found");
        }
    }
}
