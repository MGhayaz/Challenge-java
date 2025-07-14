package Question83;

public class Square extends Shape{
    private int side;

    public int getSide() {
        return side;
    }

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double result = Math.pow(side,2);
        return result;
    }
}
