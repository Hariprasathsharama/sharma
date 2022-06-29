import java.util.*;
/**
 * Binaryno
 */
public class Binaryno {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int r=0,i=0,count=0;
        int []a=new int[10];
        while(n!=0){
            r=n%2;
            
            a[i]=r;
            count++;
            i++;
            n=n/2;
        }
        for(i=1;i<=count;i++){
            System.out.print(a[count-i]);
        }
        
    }
}