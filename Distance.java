import java.util.Scanner;

public class Distance {
    double x1;
    double x2;
    double y1;
    double y2;

    public double calcDistance(){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    public void display(){
        System.out.println("The distance between two points : "+calcDistance());
    }


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Distance dis = new Distance();
        System.out.print("Enter value of x coordinate for point 1 :");
        dis.x1 = a.nextDouble();
        System.out.print("Enter value of y coordinate for point 1 :");
        dis.y1 = a.nextDouble();
        System.out.println("Enter value of x coordinate for point 2: ");
        dis.x2 = a.nextDouble();
        System.out.println("Enter value of y coordinate for point 2: ");
        dis.y2 = a.nextDouble();

        dis.display();

        //double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
       // System.out.println("The distance between two points : "+distance);
    }
}
