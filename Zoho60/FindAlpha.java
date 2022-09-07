package Zoho60;

import java.util.Scanner;

public class FindAlpha {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        char ch=s.next().charAt(0);
        s.close();
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("It is alphabet");

        }
        else{
            System.out.println("not a alphabet");
        }
    }
}
