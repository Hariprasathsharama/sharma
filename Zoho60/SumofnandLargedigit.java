package Zoho60;

import java.util.Scanner;

public class SumofnandLargedigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int max=0,sum=0;
        while (n>0) {
            int r=n%10;
            sum=sum+r;
            if(r>max){
                max=r;
            }
            n=n/10;
        }
        System.out.println(sum+" "+max);
    }
}
