package Question99;

public class task1 extends Thread{
    protected int input ;
    public task1(int input) {
        this.input = input;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.printf("Hello from thread %d \n", input);
        }


    }
}
