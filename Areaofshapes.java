import java.util.Scanner;

public class Areaofshapes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length");
        int l=s.nextInt();
        System.out.println("Enter the breadth");
        int b=s.nextInt();
        System.out.println("Enter radius");
        float r=s.nextInt();
        System.out.println("Enter the height");
        float h=s.nextInt();
        System.out.println("Area of squre=" + l*l);
        System.out.println("Area of rectangle="+ l*b);
        System.out.println("Area of cylinder="+ (2*22*(r+h))/7);
        s.close();
    }
}
