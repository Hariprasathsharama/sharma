import java.util.*;
public class RemoveWhitespace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        // int temp=0;
        // String arr[]=new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) ==' '|| str.charAt(i)=='@'){
            continue;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
      
        s.close();
    }
}
