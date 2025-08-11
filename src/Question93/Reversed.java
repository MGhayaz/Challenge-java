package Question93;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversed {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("My name is " , "Antony Gausalvise");

        System.out.println(list.reversed()); // method one just to showcase without permanent transformation of list

        Collections.reverse(list);
        System.out.println(list); // method 2 which transforms the list further

    }
}
