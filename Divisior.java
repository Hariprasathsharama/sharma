import java.util.Scanner;
public class Divisior {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int []a=new int[n];
        
        int j=0;
        //divisor
        for(int i=1;i<=n;i++){
            if(n%i==0){
                
                    a[j]=i;
                    j++;
            }
            
        }
        System.out.println("Divisor");
        for(int i=0;i<j;i++){
          
            System.out.println(a[i]);
        }
        //factor
        System.out.println("Factor");
        for(int i=2;i<n;i++){
            while(n%i==0){
                System.out.println(i+"");
                n=n/i;

            }
        }
       
        if(n>2){
                        System.out.println(n);
        }
    }
}
