package Aboutarrays;

import java.util.Scanner;

public class Rotatearrayscomplex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        int r=s.nextInt();
        int index=a.length-r,k=0;
        int b[]=new int[n];
        for (int i = 0; i < index; i++) {
            b[k++]=a[index-i-1];
        }
        for (int i = a.length-1; i >= index; i--) {
            b[k++]=a[i];
        }        
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[a.length-i-1]);
        }
        s.close();
    }
}
