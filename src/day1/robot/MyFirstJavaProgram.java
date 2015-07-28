package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot joe = new Robot ();
		joe.setPenColor(Color.DARK_GRAY);
joe.penDown();
for (int i = 0; i < 4; i++) {joe.move(100);joe.turn(270);
}	

}}