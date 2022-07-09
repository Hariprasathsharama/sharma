import java.util.*;
public class Split_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        System.out.println("Enter the Number");
        int n=s.nextInt();
        int len=str.length();
        int num =len/n,temp=0;
        String str2[]=new String[n];
        if(len%n!=0){
            System.out.println("It is not dividable");
        }
        else{
            for (int i = 0; i < len; i+=num) {
                String part=str.substring(i,i+num);
                str2[temp]=part;
                temp++;

            }
            for (int i = 0; i < str2.length; i++) {
                System.out.println(str2[i]);
            }
        }
        
        s.close();
    }
}
