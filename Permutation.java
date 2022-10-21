public class Permutation {

    public static String swap(String str,int i,int j){
        char[] a=str.toCharArray();
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return String.valueOf(a);
    }
    public static void main(String[] args) {
        String str="ABC";
        int len=str.length();
        generatePermutate(str,0,len);
    }
    public static void generatePermutate(String str,int start,int end){
        if (start==end-1) {
            System.out.println(str);
        }
        else{
            for (int i = start; i <end ; i++) {
                str=swap(str,start,i);
                generatePermutate(str, start+1, end);
                str=swap(str,start,i);
            }
        }
    }
}
 