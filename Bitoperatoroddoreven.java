import java.util.Scanner;

public class Bitoperatoroddoreven {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n & 1) == 1 ){
            System.out.print("odd");
        }        
        else{
            System.out.println("even");
        }
        s.close();
    }
}
