import java.util.*;
public class Sort_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        s.close();
        char temp;
        char []string=str.toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (string[i]>string[j]) {
                 temp=string[i];
                 string[i]=string[j];
                 string[j]=temp;

                }
            }
        }
        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i]);
        }
    }
}
