package Zoho60;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
      
        s.close();
        if(c>='a' && c<='z'){
            int n=(int)(c)-(int)('a') + 1;
        for (int i = 0; i <n; i++) {
            for (int j = n-i; j >=1; j--) {
                System.out.print((char)(c-i));
            }
            System.out.println();
        }
    }
    else{
        int n=(int)(c)-(int)('A') + 1;
        for (int i = 0; i <n; i++) {
            for (int j = n-i; j >=1; j--) {
                System.out.print((char)(c-i));
            }
            System.out.println();
        }
    }
    
    }
}
