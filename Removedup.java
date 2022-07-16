public class Removedup {
    public static void main(String[] args) {
        int a[]={1,1,2,3,4,5,6,1,2,3};
        int n=a.length;int k=0;
        int temp[]=new int[n];
        for (int i = 0; i <n-1; i++) {
            for(int j=i+1;j<n;j++){
                if(a[i]!=a[j]){
                    temp[k]=a[i];
                    k++;
                }
            }
            
        }
        temp[k]=a[n-1];
        for (int i = 0; i < temp.length-1; i++) {
            System.out.print(temp[i]);
        }
    }
}
