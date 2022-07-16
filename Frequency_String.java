
public class Frequency_String {
    public static void main(String[] args) {
        
        String s="pasumponbharathi";
        int n=s.length();
        int f[]=new int[n];
        for (int i = 0; i < n; i++) {
            f[i]=1;
        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                    f[j]=0;
                }
            }
            if(f[i]!=0){
                f[i]=count;
            }
        }
        for (int i = 0; i < f.length; i++) {
            if(f[i]!=0){
                System.out.println(s.charAt(i) + " "+ f[i]);
                

            }
        }
        int max=0,ele=0;
        for (int i = 0; i < f.length; i++) {
            
                if(f[i]>max){
                    max=f[i];
                    ele=i;
                }
            
        }
        System.out.print(s.charAt(ele) + " " + max);
    }
}
