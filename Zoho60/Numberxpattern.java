package Zoho60;

import java.util.Scanner;

public class Numberxpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
    
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i==j || j==n-i+1){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
