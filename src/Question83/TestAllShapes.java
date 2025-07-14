package Question83;

public class TestAllShapes {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        Square sqr = new Square(5);
        System.out.printf ( "the area of circle and square is %f %f "
                , cir.calculateArea(), sqr.calculateArea());
    }



}
