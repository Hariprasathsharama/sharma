import java.util.*;
public class Frequencyarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of element");
        int n=s.nextInt();
        
        int a[]=new int[n];
        int fcount[]=new int[n];
       
        System.out.println("Enter element one by one");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
            fcount[i]=1;
        }
        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1; j < n; j++) {
                if(a[i]==a[j]){
                    count++;
                    fcount[j]=0;
                }
            }
            if(fcount[i]!=0){
                fcount[i]=count;
            }
        }
        for (int i = 0; i < n; i++) {
            if(fcount[i]!=0){
                System.out.println(" "+ a[i]+ " " + fcount[i]);
            }
            
        }
        s.close();

    }
    
}
