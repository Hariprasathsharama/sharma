package Zoho60;

import java.util.Scanner;

public class Pyramidno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int k=1;
        for (int i = 1; i < n/2; i++) {
            for (int j = n/2; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+k++);
            }
            System.out.println();
        }
    }
}
