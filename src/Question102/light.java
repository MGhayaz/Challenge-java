package Question102;

public class light extends Thread {

    private final color lightColor;

    public light(color lightColor) {
        this.lightColor = lightColor;
    }

    @Override
    public void run() {
        System.out.printf("\n %s is active", lightColor);
        try {
            Thread.sleep(lightColor.getMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n %s is inactive", lightColor);
    }

}
