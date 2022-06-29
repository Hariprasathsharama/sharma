import java.util.*;
public class Spynumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int r,sum=0,p=1;
        while(n>0){
            r=n%10;
            sum=sum+r;
            p=p*r;
            n=n/10;
        }
        if(sum==p){
            System.out.println("It is spy number");
        }
        else{
            System.out.println("It is not spy number");
        }
    }
}
