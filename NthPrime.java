import java.util.*;
public class NthPrime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int count=0,num=1,i;
        while(count<n){
            num=num+1;
        for(i=2;i<num;i++){
            if(num%i==0){
            break;
            }
        }
           if(num==i){
            count=count+1;
           }
        }
    
       
            System.out.println(num);

        
    }
}
