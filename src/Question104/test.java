package Question104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(3);
        multiThread task1 = new multiThread("Alpha");
        multiThread task2 = new multiThread("Bravo");
        multiThread task3 = new multiThread("Charlie");
        multiThread task4 = new multiThread("deatch");

        exe.submit(task1);
        exe.submit(task2);
        exe.submit(task3);
        exe.submit(task4);
        exe.shutdown();

        if(!exe.awaitTermination(6000, TimeUnit.SECONDS)){ exe.shutdownNow();}
    }
}
