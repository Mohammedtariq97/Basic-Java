
public class application9 {

	public static void main(String[] args) {
		
		int dayOfWeek = 6;
		
		String schedule;
		
		switch(dayOfWeek) {
		
		case 1: System.out.println("Gym in the morning");
		break;
		
		case 2: System.out.println("Class after work");
		break; 
		
		case 3: System.out.println("Meeting all day");
		break;
		
		case 4: System.out.println("Work from home");
		break;
		
		case 5: System.out.println("Game night after work");
		break;
		
		case 6: case 7: System.out.println("Free");
		break;
		
		
		default: System.out.println("Enter the value between 1 and 7");
		break;
		
		}
		
	}
}
