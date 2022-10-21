

public class Problem1 {
    public static void mergeArray(int[] a,int[] b){
        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        int m=a.length;
        int n=a.length;
        
        while (i<m && j<n) {
            if(a[i]<b[j]){
                c[k++]=a[i];
                i++;
            }
            else{
                c[k++]=b[j];
                j++;
            }
        }
        while (i<m) {
            c[k++]=a[i];
            i++;
        }
        while(j<n){
            c[k++]=b[j];
            j++;
        }

        // if(d[i]<d[j]){
        // for (int l = 0; l < c.length; l++) {
        //     System.out.print(c[l]);
        // }
        // ArrayList<Integer>arr=new ArrayList<>();
        int z=0,count=0;
        int d[]=new int[m+n];
       for ( i = 0; i < c.length-1; i++) {
                if(c[i]!=c[i+1]){
                    d[z++]=(c[i]);
                    count++;

                }
       }
       d[z++]=c[i];
  System.out.println();

       for (int l = 0; l <= count/2; l++) {
                int temp=d[l];
                d[l]=d[count-l];
                 d[count-l]= temp;
       }

       for (int l = 0; l <= count; l++) {
        
        System.out.print(d[l]);
       }

    }
    
    public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    int b[]={4,5,6,7,8};
    
    mergeArray(a,b);
    }
}
