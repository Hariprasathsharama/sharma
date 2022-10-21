package Aboutarrays;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        
      
        for (int i = 0; i < n; i++) {
            int len=n-i-1;
            for (int j = 0; j < n; j++) {
                if(i==j || j==len){
                    System.out.print(str.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
s.close();
            System.out.println();
        }
    }

    public static Pattern compile(String emailRegex) {
        return null;
    }

    public Object matcher(String email) {
        return null;
    }
    }

