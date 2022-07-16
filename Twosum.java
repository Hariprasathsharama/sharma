import java.util.Scanner;

/**
 * Twosum
 */
public class Twosum {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();   
        }
        System.out.print("Enter the target");
        int target=s.nextInt();
        s.close();
        int pos1=0,pos2=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]+a[j]==target){
                    pos1=i;
                    pos2=j;
                }
            }
        }
        System.out.print(pos1 + " " + pos2);
    }
}