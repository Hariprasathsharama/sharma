import java.util.Scanner;

public class Bitoperatorswap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Before swap");
        System.out.println(a+" "+b);
         a=a^b;
         b=a^b;
         a=a^b;
         System.out.println("After swap");
         System.out.println(a+" "+b);
        s.close();
    }
}
