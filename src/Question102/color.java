package Question102;

public enum color {
    RED(8000),
     YELLOW(1000),
    GREEN(5000);
    private final int millis;

    public int getMillis() {
        return millis;
    }

    color(int millis) {
        this.millis = millis;
    }
}
