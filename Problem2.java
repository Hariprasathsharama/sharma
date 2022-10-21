import java.util.ArrayList;

public class Problem2 {
    public  static void mergeArray(int[] a,int[] b){
        int m=a.length;
        int n=b.length;
        int i=0,j=0,k=0;
        int c[]=new int[m+n];
        //Merge the array
        while(i<m){
            c[k++]=a[i];
            i++;
        }
        while(j<n){
            c[k++]=b[j];
            j++;
        }
        
        //remove duplicates
        
        ArrayList<Integer>result=new ArrayList<>();
        for(int r=0;r<c.length-1;r++){
               if(c[r]!=c[r+1]){
                result.add(c[i]);
                break;
               }
                 
           }
        for (Integer t : result) {
            System.out.println(t);
        }
     
        //sort the array
        
        // for(int r=0;i<result.size();r++){
        //     for( int v=r+1;v<result.size();v++){
        //         if(result.get(r)<result.get(v)){
        //             int temp=result.get(r);
        //             result.set(r,result.get(v));
        //             result.set(v,temp);
        //         }
        //     }
        // }
        for( i=0;i<result.size();i++){
            System.out.print(result.get(i));
        }
        
        
    }
    
    public static void main(String args[]) {
    //   Scanner s=new Scanner(System.in);
    //   System.out.print("Enter the length for the first array");
    //   int len1=s.nextInt();
    //   System.out.print("Enter the length for the second array");
    //   int len2=s.nextInt();
      int arr1[]={1,2,3,4,5};
      int arr2[]={4,5,6,7,8};
    //   System.out.print("Enter the elements for first array");
    //   for(int i=0;i<len1;i++){
    //       arr1[i]=s.nextInt();
    //   }
    //   System.out.print("Enter the elements for second array");
    //   for(int i=0;i<len2;i++){
    //       arr2[i]=s.nextInt();
    //   }
      mergeArray(arr1,arr2);
      
    }
}


