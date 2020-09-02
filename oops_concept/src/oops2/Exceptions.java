package oops2;
import java.util.Scanner;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        int r=0;
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j=0; j<n; j++)
            {
                for(int k=0;k< n; k++){
                    
                    while(i<=0){
                       r=r+a;
                    }
                    r= r + (2^k *b);
                }

                System.out.print(r + " ");   
            }
            System.out.println();


        }
        in.close();
    }
}
