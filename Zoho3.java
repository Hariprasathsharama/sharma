import java.util.Scanner;

public class Zoho3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }  
        s.close();     
        int max=0,pos=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
                pos=i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(i!=pos){
                System.out.print(2*a[i]);
            }
        }
    }
}
