package oops.Map;

/**
 * Twosum
 */
import java.util.*;

public class Twosum {
    public static int[] sum(int[] c,int t){
        Map <Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<c.length;i++){
            Integer cno=(Integer)(t-c[i]);
            if(map.containsKey(cno)){
                int rno[]={map.get(cno),i};
                return rno;
            }
            map.put(c[i],i);
        }  
        return null;
       }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter the target");
        int target=s.nextInt();
        System.out.println( sum(a,target));
       
        s.close();
    }
}