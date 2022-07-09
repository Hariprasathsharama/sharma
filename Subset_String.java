import java.util.*;

public class Subset_String {
  public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.nextLine();
        int n=str.length();
        int temp=0;
        String arr[]=new String[n*(n+1)/2];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[temp]=str.substring(i,j+1);
                temp++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        s.close();
    }
}