package Recursion;

public class Binearysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=6;
       
        System.out.println( binearysearch(arr,target,0,arr.length));
    }
    static int binearysearch(int[] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int mid=end-(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return binearysearch(arr, target, start, mid-1);
        }
       
            return binearysearch(arr, target, mid+1, end);
        
     
    }
}
