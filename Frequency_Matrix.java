import java.util.*;
public class Frequency_Matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the row for matrix"); 
        int r=s.nextInt();
        System.out.println("Enter the column for matrix");
        int c=s.nextInt();
        int a[][]=new int[r][c];
        int odd=0,even=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=s.nextInt();
            }
        }
        
        if(r!=c){
            System.out.println("Matrix must be square");
        }    
        
        else{
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (a[i][j]%2==0) {
                        even++;
                    }
                    else{
                        odd++;
                    }
                }
            }
        }
        s.close();
        System.out.println("odd count in matrix " +odd);
        System.out.println("Even count in matrix " +even);
    }
}