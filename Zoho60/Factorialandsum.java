package Zoho60;

import java.util.Scanner;

public class Factorialandsum {
    static void  Factorial(int n){
        int f=1;
        for (int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println("factorial of number "+f);
        int sum=0;
        while(f>0){
            int r=f%10;
            sum=sum+r;
            f=f/10;
        }
        System.out.println("Sum of the factorial "+sum);
    }

    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     Factorial(n);   
     s.close();
    }
}
