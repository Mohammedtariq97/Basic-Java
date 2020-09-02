package oops2;

import java.util.Scanner;
import java.io.File;

public class Count {
		public static void main(String[] args) throws Exception{
			File file = new File("War prisoner money and medals.txt");
			Scanner scanner = new Scanner(file);
			
			int words = 0;
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				words = words+ line.split("").length;
			}
			System.out.println("THe file has " + words + " words");
		}

}
