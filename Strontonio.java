import java.util.*;
import java.lang.Math;
public class Strontonio {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    s.close();
    int str=n*2;
    int count=0;
    while(n>0){
        n=n/10;
        count++;
    }
    double div=Math.pow(10,count-1);
    
    int fd=(str/(int)div);
    int ld=str%10;
    if(fd==ld){
        System.out.println("It is strontonio number");
    }
    else{
        System.out.println("It is not strontonio number");
    }
}    
}
