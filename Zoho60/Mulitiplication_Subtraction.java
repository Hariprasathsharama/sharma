package Zoho60;

import java.util.Scanner;

public class Mulitiplication_Subtraction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  table number");
        int no=s.nextInt();
        System.out.println("Enter number of table");
        int n=s.nextInt();
        s.close();
        System.out.println("Multiplication table for the number"+ no);
        for (int i = 1; i <=n; i++) {
            System.out.println(i + "*" + no + "=" + i*no);
        }
        System.out.println("subtraction table for the number"+ no);
        for (int i = 1; i <=n; i++) {
            System.out.println(i + "-" + no + "=" + (i-no));
        }
    }
    
}
