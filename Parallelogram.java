import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int j;
        for (int i = 1; i <= n; i++) {
            for ( j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for ( j = 1; j <= n; j++) {
                if (i==1 || i==n ||j==1 || j==n) {
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
           
            
            System.out.println();
        }
    }
}
