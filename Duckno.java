import java.util.*;
/**
 * Duckno
 */
public class Duckno {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // int []a=new int[100];
        // int i=0;
        int flag=0;
        s.close();

        while(n>0){
            int r=n%10;
            if(r==0){
                 flag=1;
                break;
            }
            n=n/10;

        }
if(flag==1){
    System.out.println("it is a Buzz no");
}
else{
    System.out.println("it is not a Buzz no");
}
      
        // if(firstdigit==0){
        //     System.out.println("It is not a duck number");
        // }
        // else{
        //     System.out.println("It is a duck no");
        // }

    }
}