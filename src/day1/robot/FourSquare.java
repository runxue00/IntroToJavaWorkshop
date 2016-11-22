package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot soup = new Robot();

	void go() {
		soup.penDown();
		// 4. Make the robot move as fast as possible
		soup.setSpeed(10);
		// 5. Set the pen width to 5
		soup.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for (int i = 0; i < 4; i++) {

			// 7. Set the pen color to random
			soup.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare(5);
			// 8. Turn the robot 90 degrees to the right
			soup.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare(int sides) {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int i = 0; i < sides; i++) {
			soup.move(150);
			soup.turn(360/sides);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
