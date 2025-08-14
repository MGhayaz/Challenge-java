package Question97;

public class test {
    public static void main(String[] args) {
        EnumFromCh96 day = EnumFromCh96.SATURDAY;

        for(EnumFromCh96 index : EnumFromCh96.values()){
            System.out.println(index.dayAnalizer());
        }

        System.out.println();
    }
}
