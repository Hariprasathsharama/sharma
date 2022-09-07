package Zoho60;

import java.util.Scanner;

public class NumberxrevPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                int len=n-i+1;
                if(i==j || j==len){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
}
