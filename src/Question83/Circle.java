package Question83;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double result = Math.PI * ( Math.pow(radius, 2) );
        return result;
    }
}
