public class Zoho4 {
    public static void main(String[] args) {
        String s="i love india";
        String []w=s.split(" ");
        String revwords=" ";
        for (int i = w.length-1; i >=0 ; i--) {
            revwords+=w[i]+" ";
        }
        System.out.print(revwords);
    }
}
