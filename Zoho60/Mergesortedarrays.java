package Zoho60;
// import java.util.Scanner;


public class Mergesortedarrays {
    public static void main(String[] args) {
        int a[]={1,3,4,5,6,7};
        int b[]={8,9,10,11,12};
        int c=a.length;
        int d=b.length;
        int i=0,j=0,k=0;
        int temp[]=new int[c+d];
        while (i<c && j <d) {
            if(a[i]<b[j]){
                temp[k++]=a[i];
                i++;
            }
            else{
                temp[k++]=b[i];
                j++;
            }
        }
        while (i<c) {
            temp[k++]=a[i];
            i++;
        }
        while (j<d) {
            temp[k++]=b[j];
            j++;
        }
        for (int l = 0; l < c+d; l++) {
            System.out.print(temp[l]+" ");
        }
    }
}
