package Question103;

public class threadClass extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
