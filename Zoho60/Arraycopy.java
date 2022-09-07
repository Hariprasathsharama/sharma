package Zoho60;



public class Arraycopy {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            b[k++]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
