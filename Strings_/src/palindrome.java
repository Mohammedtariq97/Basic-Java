import java.io.*;
import java.util.*;

public class palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);
    
        sb = sb.reverse();
  
     
        if (A.equals(sb.toString())){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
