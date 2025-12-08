package Question100;

public class testTask extends Thread{

    @Override
    public void run() {
        System.out.println("thread start running");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(".........");
        }
    }
}
