import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if(i==j || j==1 || i==n){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
