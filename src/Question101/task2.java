package Question101;

public class task2 extends Thread{
    private final String taskname;

    public task2(String taskname) {
        this.taskname = taskname;
    }
    public void run() {
        System.out.println(taskname + " thread start running");
        for (int i = 0; i <3 ; i++) {
            System.out.println(".........");
        }
        System.out.printf("Task %s ended \n", taskname );
    }
}
