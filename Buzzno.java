import java.util.*;
public class Buzzno {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int lastdigit=n%10;
        
        if(n%7==0 || lastdigit==7){
            System.out.println("It is Buzz no");
        }
        else{
            System.out.println("not a Buzz no");
        }
    }
}
