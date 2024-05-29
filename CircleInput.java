import java.util.Scanner;

class Circle {
    double r;
    public double calcArea(){
        return Math.PI*r*r;
    }
    public void disArea(){
        System.out.println("This area of the Circle is :" + calcArea());
    }
}
public class CircleInput {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Enter the radius of the circle: ");
        circle.r = a.nextDouble();
        circle.disArea();

    }
    
}
