package Zoho60;
import java.util.*;
public class Oddpos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[20];
        for (int i = 1; i <= n; i++) {
            a[i]=s.nextInt();
        }
        s.close();
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                System.out.print(a[i]+" ");
            }
        }        
    }
}
