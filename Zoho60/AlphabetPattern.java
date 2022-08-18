package Zoho60;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        int n=s.nextInt();
        s.close();
        if(n>5 && c=='E' || c=='e'){
            System.out.print("please enter row and character inside the range");
        }
        else{
        for (int i = 0; i <n; i++) {
            for (int j = n-i; j >=1; j--) {
                System.out.print((char)(c-i));
            }
            System.out.println();
        }
    }
    }
}
