package Question99;

public class task2 extends Thread{
    private final int input ;
    public task2(int input) {
        this.input = input;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.printf("Hello from thread %d \n", input);
        }


    }
}
