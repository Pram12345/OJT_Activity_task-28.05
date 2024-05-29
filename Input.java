import java.util.Scanner;
 class person{
    String name;
    int age;
    public  void get() {
        System.out.println("your name is" + name + "age is " +  age);
    }
}

public class Input {

    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);
        person p1 = new person();
        System.out.println("Enter  your  name : ");
        p1.name = a.nextLine();
        System.out.println("Enter your age : ");
        p1.age = a.nextInt();

        p1.get();

        



    }
    
}
