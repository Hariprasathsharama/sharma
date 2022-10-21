package Aboutarrays;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenpos {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int[] a=new int[n];
     int[] b=new int[n];
     for (int i = 0; i < n; i++) {
        a[i]=s.nextInt();
     }   
     n=a.length;
     Arrays.sort(a);
     int j=n-1,k=0,i=0;
     while(i<j){
        b[k++]=a[j--];
        b[k++]=a[i++];
     }
     if(n%2!=0){
        b[k++]=a[i];
     }
     for (int l =k-1; l >=0; l--) {
        System.out.print(b[l]);
     }
     s.close();
    }
}
