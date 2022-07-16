/**
 * BinearySearch
 */
public class BinearySearch {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=4;
        int ans=Search(arr,target);
        System.out.println(ans);
    }
    static int Search(int a[],int t){
        int end=a.length-1;
        int start=0;
        
       while(start<=end){
        int mid=(start)+(end-start)/2;
        if (t<a[mid]) {
            end=mid-1;
        }
        else if(t>a[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }
       }
       return -1;
    }
}