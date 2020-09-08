import java.io.*;
import java.util.*;

public class splitmethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().length()==0) {
        	
        	System.out.println("0");
        	return;
        }
        // Write your code here.
         String [] str = s.split("[ .,?!'']+");
       System.out.println(str.length);
        for( String name : str) {
            
            System.out.println(name);
    }
}
}
