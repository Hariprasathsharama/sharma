import java.util.Scanner;

/**
 * Halfpizza
 */
public class Halfpizza {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        for (int i = 1; i <= 2*n-1; i++) {
            int c;
                if(i>n){
                    c=2*n-i;
                    
                }
                else{
                    c=i;
                  
                }
            for (int j = 1; j <=c; j++) {
                System.out.print("*");
            }
            for (int j = n-i; j >=1; j--) {
                System.out.print("  ");;
            }
            for (int j = 1; j <=c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}