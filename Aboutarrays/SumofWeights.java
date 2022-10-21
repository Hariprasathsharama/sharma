package Aboutarrays;


import java.util.Scanner;

public class SumofWeights {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int w[]=new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
            w[i]=0;
        }
        for (int i = 0; i < a.length; i++) {
            int weight=0;
            int p=(int)(Math.sqrt(a[i]));
            if(p*p==a[i]){
                weight+=5;
                w[i]=weight;
            }
           
            if(a[i]%4==0 && a[i]%6==0){
                weight+=4;
                w[i]=weight;
            }
            if(a[i]%2==0){
                weight+=3;
                w[i]=weight;
            }
            
        }
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w.length; j++) {
                if(w[i]<w[j]){
                    int temp=w[i];
                    w[i]=w[j];
                    w[j]=temp;
                    int temp2=a[i];
                    a[i]=a[j];
                    a[j]=temp2;
                }
            }
        }
        for (int i = 0; i < w.length; i++) {
            System.out.println("<"+a[i]+","+w[i]+">");
        }
            s.close();
    }
}
