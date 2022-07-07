import java.util.*;
public class String1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        s.close();
        int len=str.length();
        int vowel=0,cons=0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i)== 'a' || str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u')
             {
                vowel++;
            }
            else{
                cons++;
            }
        }
        System.out.println(vowel);
        System.out.println(cons);
    }
}
