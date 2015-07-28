package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 1. Create a new Robot
	Robot grey = new Robot();

	void go() {
		for (int i = 0; i < array.length; i++) {
			
		}
		// 3. Make the robot move as fast as possible
		grey.setSpeed(10);
		// 4. Set the pen width to 5
		grey.setPenWidth(5);
		// 5. Do steps #6 to #7 four times...
		grey.penDown();
		// 6. Set the pen color to random
		grey.setRandomPenColor();
		// 1. Call the drawSquare() method
		drawSquare();
		// 7. Turn the robot 90 degrees to the right
		grey.turn(90);
	}

	/* 2. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			grey.move(200);
			grey.turn(90);
			
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
