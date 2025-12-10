package Question105;

import java.sql.SQLOutput;
import java.util.concurrent.*;

public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(1);
        callableThread th1 = new callableThread(5);
        callableThread th2 = new callableThread(3);
        callableThread th3 = new callableThread(4);

        Future<Integer> future = exe.submit(th1);
        Future<Integer> future2 = exe.submit(th2);
        Future<Integer> future3 = exe.submit(th3);
        System.out.println(future.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
        exe.shutdown();


    }
}
