import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i-1; j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if(j==1 || i==n  || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
