package Aboutarrays;

import java.util.Scanner;


public class Rotatearrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }        
        int num=s.nextInt();
        s.close();
        int k;
        for (int i = 1; i <= num; i++) {
            int last=a[n-1];
            
            for (k = n-1; k >0; k--) {
                a[k]=a[k-1];
            }
            a[0]=last;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    
}
