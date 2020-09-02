package tutorial11;

public class robotapp {
	
	public static void main(String[] args) {
		
		Robot robot = new Robot();
		robot.start();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
