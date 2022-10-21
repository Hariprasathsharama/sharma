package Aboutarrays;
import java.util.Scanner;
import java.util.Arrays;
public class Multiplicationofmatrix {
   

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter for matrix 1");
        System.out.println("Enter the row");
        int row = s.nextInt();
        System.out.println("Enter the columns");
        int col = s.nextInt();
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter for matrix 2");
        System.out.println("Enter the row");
        int row2 = s.nextInt();
        System.out.println("Enter the columns");
        int col2 = s.nextInt();
        int b[][] = new int[row2][col2];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < col2; j++) {
                b[i][j] = s.nextInt();
            }

        }
s.close();
        int c[][] = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int j2 = 0; j2 < a.length; j2++) {
                    c[i][j] += a[i][j2] * b[j2][j];
                }
            }
        }
        System.out.println("The multiplication of matrix is");
        for (int[] i : c) {
            System.out.println(Arrays.toString(i));
        }
      
    }

}


