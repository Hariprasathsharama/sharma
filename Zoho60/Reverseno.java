package Zoho60;

import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        while(n>0){
            int r=n%10;
             rev=rev*10+r;
             n=n/10;
        }
        System.out.print(rev);
        s.close();
    }
}
