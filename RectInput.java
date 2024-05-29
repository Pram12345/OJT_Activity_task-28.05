import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;
public double calcArea() {
        return length * breadth;
    }
    public void disArea() {
        System.out.println("The area of the rectangle is: " + calcArea());
    }
}
public class RectInput {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); 
        Rectangle rect = new Rectangle();
        System.out.println("Enter the length of the rectangle: ");
        rect.length = a.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        rect.breadth = a.nextDouble();
        rect.disArea();  
    }
}
