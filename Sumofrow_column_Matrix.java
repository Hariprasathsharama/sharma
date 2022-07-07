import java.util.Scanner;

public class Sumofrow_column_Matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the row for matrix"); 
        int r=s.nextInt();
        System.out.println("Enter the column for matrix");
        int c=s.nextInt();
        int a[][]=new int[r][c];
        int sumrow=0,sumcol=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=s.nextInt();
            }
        }
        
        if(r==c)
        {
            for (int i = 0; i < r; i++) {
                sumrow=0;
                for (int j = 0; j < c; j++) {
                   
                   sumrow=sumrow+a[i][j];
                }
                System.out.println("sum of " + (i+1) + "row" + sumrow);
            }
            
            for (int i = 0; i < r; i++) {
                sumcol=0;
                for (int j = 0; j < c; j++) {
                    sumcol=sumcol+a[i][j];
                }
                System.out.println("sum of" + (i+1) + "column"+ sumcol);
            }
        }    
        else{
            System.out.println("Matrix must be square");                        
        }
        s.close();

        
        
        
        
    }
}
