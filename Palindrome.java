public class Palindrome {
    static String reverse(String a){
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
       return rev;
    }
    public static void main(String[] args) {
      String s="mom";
      String res=reverse(s);
      if(res.equals(s)){
        System.out.print("palindrome");
      }  
      else{
        System.out.print("Not a palindrome");
      }
    }
   
}
