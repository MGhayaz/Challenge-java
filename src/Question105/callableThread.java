package Question105;

import java.util.concurrent.Callable;

public class callableThread implements Callable<Integer> {
    private final int input ;
    public callableThread(int input) {
        this.input = input;
    }
    @Override
    public Integer call() {
        int result = 1;
        for (int i = 1; i <=input ; i++) {
            result = result * i;
        }
        return result;
    }
}
