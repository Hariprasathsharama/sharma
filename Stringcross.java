import java.util.Scanner;

public class Stringcross {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         s.close();
         String str[]=new String[n];
         for (int i = 0; i < n; i++) {
            str[i]=s.next();
         }
       
         for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < i; j++) {
                if(i==j){
                    System.out.print(str[i]);
                }
            }
         }
    }
}
