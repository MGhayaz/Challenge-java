package Question101;

public class task3 extends Thread{

    private final String taskname;

    public task3(String taskname) {
        this.taskname = taskname;
    }

    public void run() {
        System.out.println(taskname +" thread start running");
        for (int i = 0; i < 3; i++) {
            System.out.println(".........");
        }
        System.out.printf("Task %s ended \n", taskname );
    }
}
