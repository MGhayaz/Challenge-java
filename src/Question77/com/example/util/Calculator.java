package Question77.com.example.util;
import Question77.com.example.geometry.Rectangle;
import Question77.com.example.geometry.circle;

public class Calculator {
    public static void main(String[] args) {
    circle cir = new circle(7.3);
    Rectangle rec = new Rectangle(7,7);


    double cirArea = Math.PI * Math.pow(cir.getRadius(), 2);
    double recArea = rec.getLength()*rec.getBreadth();
        System.out.printf("the area of circle is: %f %nthe area of rectangle is: %f",cirArea,recArea);
    }
}
