import java.util.Scanner;

public class Question72 {
    double RadiusInMM;

    Question72(double RadiusInMM){
        this.RadiusInMM = RadiusInMM;
    }
    public double areaMaker(double radius){
        return Math.PI* (Math.pow(radius,2));
    }
    public double circumferenceMaker(double radius){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "the area of circle with radius "+RadiusInMM+" in mm2 is "+ areaMaker(RadiusInMM) +
                " and the circumference in mm is "+circumferenceMaker(RadiusInMM);
    }
    public static void main(String[] args) {
        System.out.print("Welcome, please enter the radius for circle in mm: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        Question72 circle = new Question72(radius);
        System.out.println(circle);

    }
//    public static void main(String[] args) {
//        System.out.print("Welcome to Circle Calculator\nPlease enter the radius of circle: ");
//        System.out.println();
//        Scanner input = new Scanner(System.in);
//        int radius = input.nextInt();
//        if (radius <=0 ){
//            System.out.println("Not possible");
//        }
//        else{
//            areaMaker(radius);
//            circumferenceMaker(radius);
//            input.close();
//        }
//
//    }
//    public static void areaMaker(int radius){
//        double result = Math.PI* (Math.pow(radius,2));
//        System.out.printf("the area of circle with radius %d is %.2f cm^2 %n" , radius, result);
//    }
//    public static void circumferenceMaker(int radius){
//        double result =  2*Math.PI*radius;
//        System.out.printf("the circumference of circle with radius %d is %.2f cm %n",radius,result );
//
//
//    }
}
