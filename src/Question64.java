import java.util.Scanner;

public class Question64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome");
        int[] arr = ArrayUtilityClass.ArrayInputUnit();
        System.out.print("Please enter RadarInput number: ");
        int radarInput = input.nextInt();
        Radar(arr, radarInput);


    }

    public static void Radar(int[] arr, int radarInput) {
        int repeatCount = 0;
        for (int num : arr) {
            if (num == radarInput) {
                repeatCount++;
            }
        }
        if (repeatCount == 0) {
            System.out.println("RadarInput not found");
        } else {
            System.out.println("RadarInput found " + repeatCount + " times");
        }

    }
}
