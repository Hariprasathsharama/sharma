import java.util.*;
public class Alternate_Sorting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int temp=0;
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(i==0 || i%2==0){
                for (int j = i+1; j < a.length; j++) {
                    if(a[i]<a[j+1]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;

                    }
                }
             }
            else{
                for (int j = i+1; j < a.length; j++) {
                    if(a[i]>a[j]){
                        temp=a[i];
                        a[j]=a[i];
                        a[i]=temp;

                    }
                }
            }
    
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        s.close();
    }

}