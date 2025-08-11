package Question90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sharper", "Monkey", "Gun", "Kite", "Ball","Apple");
        System.out.println(list);
        ListSort(list);
        System.out.println(list);

    }
    public static void ListSort(List<String> list){
        Collections.sort(list);
        Collections.reverse(list);


    }
}
