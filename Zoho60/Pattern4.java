package Zoho60;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = n-i+1; j>=1; j--) {
                System.out.print(" "+(n-i+1));
            }
            System.out.println();
        }        
    }
}
