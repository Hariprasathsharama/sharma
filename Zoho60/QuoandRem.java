package Zoho60;

import java.util.Scanner;

public class QuoandRem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the divisor");
        int n=s.nextInt();
        System.out.println("Enter the dividend");
        int no=s.nextInt();
        System.out.println("quotient of no=" + n/no);
        System.out.println("Remainder of no="+ n%no);
        s.close();
    }
}
