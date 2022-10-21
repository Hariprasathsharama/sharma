package Aboutarrays;

import java.util.Arrays;


public class Rotatearrayleetcode {
    
    public static void rotate(int[] nums, int k) {
        
        
           int len=nums.length-1;
           int index=nums.length-k;
           int arr[]=new int[nums.length];
        //    int n=0;
           for(int i=0;i<nums.length;i++){
               while(i!=index){
                   arr[i]=nums[k--];
                   i++;
               }
               arr[i]=nums[--len];

           }

          System.out.print(Arrays.toString(arr));
        }
    public static void main(String[] args) {
       int a[]={1,2,3,4,5,6,7};
       int k=3;
        rotate(a,k); 
    }
}
