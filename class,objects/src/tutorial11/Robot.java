package tutorial11;

public class Robot {
	
	private int id=12;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public class Brain {
		public void think() {
			System.out.println("Robot is " + id+ " is thinking....");
		}
	}
	
	public static class Battery{
		public void charge() {
			System.out.println("Robot is charging");
		}
		
	}
	public void start() {
		
		System.out.println("Machine : " + id+ " starting");
		
		Brain brain = new Brain();
		
		brain.think();
		
		
	}
}
