package Question100;

public class threadstate {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("thread creation");
        testTask tt = new testTask();
        System.out.println(tt.getState());
        tt.start();
        System.out.println("thread is waiting or blocked "+ tt.getState());
        tt.join();
        Thread.sleep(3000);
        System.out.println(tt.getState());


        
    }
}
