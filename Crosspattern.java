import java.util.*;
public class Crosspattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        
        String str=s.nextLine();
        s.close();
        int len=str.length();
        for (int i = 0; i < len; i++) {
            int j=len-i-1;
            for (int j2 = 0; j2 < len; j2++) {
                if(i==j2||j2==j){
                    System.out.print(str.charAt(j2));
                }
                else{
                    System.out.print(" ");
                }
               
            } 
            System.out.println();
        }
    }
}
