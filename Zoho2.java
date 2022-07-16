/**
 * Zoho2
 */
public class Zoho2 {

    public static void main(String[] args) {
        String s="welcome to zoho corp";
        String words[]=s.split(" ");
        String revsString="";
        for(String w:words){
            String revwords="";
            for (int i = w.length()-1; i >=0; i--) {
                revwords+=w.charAt(i);
            }
            revsString=revsString+revwords+" ";
        }
        System.out.print(revsString);
    }
}
