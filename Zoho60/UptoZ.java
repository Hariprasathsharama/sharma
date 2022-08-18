package Zoho60;

import java.util.Scanner;

public class UptoZ {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        int start=(int)(c);
        s.close();
     
        if(start >='a' && start<='z' ){
            System.out.print("For small letter");
        for (int i = start; i <= 'z'; i++) {
            System.out.print(" "+ (char)(i));
        }
    }
    else{
        System.out.print("For capital letter");
        
        for (int i = start; i <='Z'; i++) {
            System.out.print(" "+(char)(i));
        }
    }
}
}
