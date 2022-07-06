import java.util.*;
public class Largestno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int i,temp=0;
        s.close();
        int a[]=new int[n];
        for ( i = 0; i < n ;i++) {
            a[i]=s.nextInt();
        }
        
        for (i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i]>a[j]){
                    temp=a[i];
                 a[i]=a[j]; 
                 a[j]=temp;
                }
            }
        }
        System.out.println("The largest element in array"+ a[n-1]);
        s.close();        
    }



}
