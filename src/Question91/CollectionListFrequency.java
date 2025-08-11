package Question91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionListFrequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3);
        System.out.println(Frequency(list));

    }
    public static int Frequency(List<Integer> list){
        return Collections.frequency(list,2);
        // takes list as first argument, then takes the number which we looks to count frequency, returns the count


    }
}
