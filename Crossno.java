import java.util.Scanner;

public class Crossno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="india";
        int n=str.length();
        s.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n; j++) {
                if(i==j){
                    System.out.print(str.charAt(i));
                }
               if(j==n-i-1){
                System.out.print(str.charAt(j));
               }
            }
            System.out.println();
        }
    }
}
