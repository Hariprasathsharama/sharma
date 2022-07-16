/**
 * Add_matrix
 */
import java.util.*;
public class Add_matrix {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number for row and column");
        int n=s.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int c[][]=new int[n][n];
        
        for (int i = 0; i < n ;i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < n ;i++) {
            for (int j = 0; j < n; j++) {
                b[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(" "+c[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
       
    }
}