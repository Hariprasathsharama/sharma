import java.util.*;
public class Technumber {
    public static void main(String[] args) {
        int num,count=0,fh,sh,sq=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        num=n;
        while(n>0){
            n=n/10;
            count=count+1;
        }
        n=num;
        if(count%2==0){

            fh=n%(int)Math.pow(10,count/2);
            System.out.println(fh);
            sh=n/(int)Math.pow(10, count/2);
            System.out.println(sh);
            sq=(fh+sh)*(fh+sh);
            if(sq==n){
                System.out.println("It is tech number");

            }
            else{
                System.out.println("It is not tech number");
            }

        }
        else{
            System.out.println("Enter valid number");
        }
        s.close();
    }
}
