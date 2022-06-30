import java.util.Scanner;
public class Increasing_number {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int digit,flag=0;
        s.close();
        String str=Integer.toString(n);
        for(int i=0;i<str.length()-1;i++){
            digit=str.charAt(i);
            if(digit>str.charAt(i+1)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("It is not increasing number");
        }
        else{
            System.out.println("it is increasing number");
        }
    }
}
