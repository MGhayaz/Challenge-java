package Question102;

public class trafficSignal {
    public static void main(String[] args) throws InterruptedException {
        light red = new light(color.RED);
        light yellow = new light(color.YELLOW);
        light green = new light(color.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();




    }
}
