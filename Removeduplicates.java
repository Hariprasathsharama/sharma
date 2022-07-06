import java.util.*;
public class Removeduplicates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]) {
                    a[j]=0;
                }
            }
        }
        s.close();
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0) {
                System.out.print(a[i]);
            }
        }
    }
}
