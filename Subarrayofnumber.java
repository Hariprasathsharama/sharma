import java.util.ArrayList;

public class Subarrayofnumber {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    
                    sum+=a[k];
                    System.out.print(a[k]);
                }
                System.out.println(sum);
                System.out.println();
            }
        }
    }
}
