import java.util.*;
public class Xylem_phloem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int count=0,xy=0,ph=0,r;
        int digcount=0;
        int num=n;
        while (n>0) {
            n=n/10;
            digcount++;
        }
        while (num>0) {
            r=num%10;
            count++;
            if(count==1||count==digcount){
                xy=xy+r;
            }
            else{
                ph=ph+r;
            }
         num=num/10;   
        }
        
        if(ph==xy){

        
        System.out.println("It is xylem");
        }
        else{
            System.out.println("It is pholem");
        }
    }
}
