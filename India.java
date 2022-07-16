
public class India {
    public static void main(String[] args) {
        String str="india";
        int n=str.length()-1;
        
        for(int i=1;i<=n;i++){
            int len=n-i-1;
            for(int j=1;j<=i;j++)
            {
                if(i==j || j==len){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
