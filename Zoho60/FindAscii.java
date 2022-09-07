package Zoho60;

import java.util.Scanner;

public class FindAscii {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        s.close();
        System.out.print((int)(c));
    }
}
