package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot revolution = new Robot();
		revolution.setRandomPenColor();
		revolution.penDown();
		revolution.setSpeed(10);
		revolution.move(200);
		revolution.sparkle();
		revolution.miniaturize();
		revolution.turn(90);
		revolution.move(100);
		revolution.expand();
		revolution.sleep(50);
		revolution.hide();
		revolution.turn(90);
		revolution.move(300);
		
	}

	
		
		
	}
