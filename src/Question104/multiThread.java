package Question104;

public class multiThread extends Thread{
    private final String name;

    public multiThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("task %s and count %s\n",name,i);
        }
    }
}
