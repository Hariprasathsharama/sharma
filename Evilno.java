import java.util.*;
public class Evilno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int sum=0;
        while(n>0){
            int r=n%2;
             sum=sum+r;
            n=n/2;
        }
       
        if(sum%2==0){
            System.out.println("it is evil number");
        }
        else{
            System.out.println("It is odious number");
        }
    }
}
