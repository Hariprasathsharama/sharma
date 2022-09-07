package Zoho60;
import java.util.*;
public class Arrayssortoddeven {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n+1];
        int temp=0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(i==0 || i%2==0){
                for (int j = i+1; j < n; j++) {
                    if(a[i]<a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;

                    }
                }
             }
            else{
                for (int j = i+1; j < n; j++) {
                    if(a[i]>a[j]){
                        temp=a[i];
                        a[j]=a[i];
                        a[i]=temp;

                    }
                }
            }
    
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        s.close();
    }

}

