package Zoho60;

import java.util.Scanner;

public class Reversesub {
static int Reverse(int no){
    int rev=0;
while (no>0) {
 int r=no%10;
  rev=rev*10+r;
  no=no/10;  
}
return rev;
}
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    s.close();
    System.out.println(n-Reverse(n));
    

 }   
}
