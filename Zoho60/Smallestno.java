package Zoho60;
import java.util.*;
public class Smallestno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Minimum number is="+min);
        s.close();
    }
}
