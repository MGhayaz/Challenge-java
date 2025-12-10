package Question103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newSingleThreadExecutor();
        threadClass task = new threadClass();
        exe.submit(task);
        exe.shutdown();
    }
}
