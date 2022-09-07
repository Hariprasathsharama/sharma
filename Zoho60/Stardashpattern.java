package Zoho60;

import java.util.Scanner;

public class Stardashpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int c,space;
        for (int i = 0; i <=2*n-1; i++) {
                if(i<=n-1){
                    c=n-i+1;
                    space=i-1;
                }
                else{
                    c=i-n+2;
                    space=2*n-i-2;
                }
                if(i==n){
                    continue;
                }
                else{
            for (int j = 1; j < c; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <=space; j++) {
                System.out.print("__");
            }
            for (int j = 1; j <c; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
       
    }
}
