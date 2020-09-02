package calendar;

import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		 
		System.out.println("Enter the date in the format: DD MM YYYY");
		
		Scanner scanner = new Scanner(System.in);
		
		int date = scanner.nextInt();
		
		int month = scanner.nextInt();
		
		int year = scanner.nextInt();
		
		
		Result result = new Result();
		
		result.getDay(date, month, year);

	}

}
class Result {
	
	public void getDay(int d, int m, int y){
		
		LocalDate dt = LocalDate.of(y, m, d);
		
		System.out.println("The day corresponding to "+ d+"/"+m+"/"+y+ " is " + dt.getDayOfWeek());
	}
	
	
}