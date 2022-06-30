import java.util.*;
public class Squareno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int i,flag=0;
        for(i=2;i<=n;i++){
            if(n%i==0){
                if(i*i==n){
                    flag=1;
                    System.out.println(i);
                }
            }
           
        }
        if(flag==0){
            System.out.println("Not a square number");
        }
       
    }
}
