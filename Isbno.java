import java.util.*;
public class Isbno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();


        s.close();
        long r,sum=0,i=1;
        while(n>0){
            r=n%10;
            sum=sum+(r*i);
            i++;
            n=n/10;
        }
        System.out.println(sum);
        if(sum%11==0){
            System.out.println("It is legal bsn");
        }
        else{
            System.out.println("It is not legal bsn");
        }
    }
}