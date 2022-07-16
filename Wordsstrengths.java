import java.util.*;

public class Wordsstrengths {

public static int Wordsstrength(int N,String[] S){
 int result=0,k=0;

for (int i = 0; i < N; i++) {

    if(S[i]=="a" || S[i]=="e" || S[i]=="i" || S[i]=="o" || S[i]=="u"){
         S[k++]="2";
    }
    else{
        S[k++]="1";
    }
    for (int j = 0; j < S.length; j++) {
        System.out.print(S[j]);
        result=result+Integer.parseInt(S[j]);
    }
   
}
return result;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String []S=new String[N];
        for (int i = 0; i < N; i++) {
            S[i]=sc.next();
        }
        sc.close();
        System.out.print(Wordsstrength(N, S));
    }
}
