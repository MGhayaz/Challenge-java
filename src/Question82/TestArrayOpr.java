package Question82;

public class TestArrayOpr {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[] {1,3,5,9});
        ArrayOperations.Statistics stats = opr.new Statistics();
    }
}
