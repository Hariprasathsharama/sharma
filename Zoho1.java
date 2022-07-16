public class Zoho1 {
    public static void main(String[] args) {
        String s="a1b2c10";
        int n=s.length();
        int num=0;
        for (int i = 0; i < n; i++) {
            
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                if(s.charAt(i)=='0'){
                    num=s.charAt(i)-'0';
                    num=num*10;
                }
                  num=s.charAt(i)-'0';
            
            for (int j = 0; j < num; j++) {
                System.out.print(s.charAt(i-1));
            }
        }
        }
    }
}
