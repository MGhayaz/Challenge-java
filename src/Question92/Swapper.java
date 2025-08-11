package Question92;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swapper {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(100,9,8,7,7,6,5,4,3,2,1);
        List <String> stringlist = Arrays.asList("Apple", "banana","Guava", "Jamun");
        swap(list);
        System.out.println(list);
        swap(stringlist);
        System.out.println(stringlist);

    }

    public static <E> void swap(List <E> list) {
         Collections.swap( list, 0,3); // takes list then ask two index numbers to make them swap . (0)100 is replaced with (8)3


    }

}
