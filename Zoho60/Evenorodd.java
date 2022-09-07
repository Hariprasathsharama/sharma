package Zoho60;

import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
        s.close();
    }
}
