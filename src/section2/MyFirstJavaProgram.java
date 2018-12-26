package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	    Robot aLpha1 = new Robot();
	    aLpha1.setSpeed(200);
	    aLpha1.penDown();
	    aLpha1.turn (90);
	    aLpha1.setPenColor(Color.cyan);
	    aLpha1.move(91);
		for (int o = 0; o<4 ; o++) {
	    aLpha1.setSpeed(200);
		aLpha1.turn (90);
		aLpha1.setPenColor(Color.cyan);
		aLpha1.move(91);	
		}
	
	}
}