package Question82;

public class ArrayOperations {
   private  int [] arr ;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public    class Statistics{
        double  mean(){
            double sum = 0;
            for(int number : arr){
                sum += number;
            }

            return sum / arr.length;
        }
        double median(){
            return 0;
        }

    }
}
