import java.util.Scanner;

/**
 * Nthelement
 */
public class Nthelement {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int first=s.nextInt();
        int last=s.nextInt();
        
        for (int i = 1; i < last; i++) {
         first*=2;
        }
        System.out.println(first);
        s.close();
    }
}