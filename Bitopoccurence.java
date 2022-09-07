import java.util.Scanner;

public class Bitopoccurence {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        
        int k=0; 
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            k=k^a[i];
        }
        System.out.print(k);
        s.close();
    }
}
