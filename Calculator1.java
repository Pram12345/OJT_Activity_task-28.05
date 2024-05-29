import java.util.Scanner;
public class Calculator1 {
    double num1;
    double num2;
    String x;
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Calculator1 objCal = new Calculator1();
        System.out.print("Choose your action (Addition[+], Subtraction[-], Multiplication[*], Division[/]): ");
        objCal.x = a.nextLine();

        switch (objCal.x) {
            case "+": 
                System.out.print("enter your first number: ");
                objCal.num1 = a.nextDouble();
                System.out.print("enter your second number: ");
                objCal.num2 = a.nextDouble();
                System.out.println("Your Addition is: " + (objCal.num1+objCal.num2));                 
                break;
            case "-":
                System.out.print("enter your first number: ");
                objCal.num1 = a.nextDouble();
                System.out.print("enter your second number: ");
                objCal.num2 = a.nextDouble();
                System.out.println("Your Subtraction is: " + (objCal.num1-objCal.num2));
                break;
            case "*":
                System.out.print("enter your first number: ");
                objCal.num1 = a.nextDouble();
                System.out.print("enter your second number: ");
                objCal.num2 = a.nextDouble();
                System.out.println("Your Multiplication is: " + (objCal.num1*objCal.num2));
                break;
            case "/":
                System.out.print("enter your first number: ");
                objCal.num1 = a.nextDouble();
                System.out.print("enter your second number:");
                objCal.num2 = a.nextDouble();
                if(objCal.num2 == 0) {
                    System.out.println("error");
                }
                else{
                    System.out.println("Your Division is: " + (objCal.num1/objCal.num2));
                }
                break;
            default:
                System.out.println("Invalid Action");
                break;
        }
    }
}