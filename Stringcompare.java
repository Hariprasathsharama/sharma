import java.util.*;
public class Stringcompare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int len1=str1.length(),len2=str2.length();
        boolean flag=true;
        s.close();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if (len1==len2) {
            for (int i = 0; i < len1-1; i++) {
                if (str1.charAt(i)!=str2.charAt(i)) {
                   flag=false;
                   break; 
                }
            }
            if (flag) {
                System.out.println("It is  same");
            }
            else{
                System.out.println("It is not same");
            }
        }
       else{
        System.out.println("length is not valid");
       }

    }
}
