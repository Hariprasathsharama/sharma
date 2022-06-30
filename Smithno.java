import java.util.Scanner;
/**
 * Smithno
 */
public class Smithno {

   public static int Sumofno(int n){
    int sum=0,r;
    while(n>0){
        r=n%10;
        sum=sum+r;
        n=n/10;

    }
    return sum;
   }
   public static int Sumoffactor(int n){
    int sof=0;
    for(int i=2;i<n;i++){
        while(n%i==0){
            sof=sof+Sumofno(i);
            n=n/i;
        }
        
    }
    if(n>2){
        sof=sof+Sumofno(n);
      }
      
    return sof;
   }
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    s.close();
    int res1=Sumofno(n);
    int res2= Sumoffactor(n);
    if(res1==res2){

    System.out.print("It is Smith number");
    }
    else{
        System.out.println("It is not smith number");
    }

   }
}