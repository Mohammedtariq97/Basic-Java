import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your name");
		
		String line = input.nextLine();
		
		System.out.println("You entered: " + line);

	}

}