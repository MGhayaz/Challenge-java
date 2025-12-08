package Question101;

public class test {
    public static void main(String[] args) {
        task1 t1 = new task1("AA");
        task2 t2 = new task2("BB");
        task3 t3 = new task3("CC");
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("EXIT");

    }
}
