package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot gravy=new Robot();
gravy.setPenColor(Color.PINK);
gravy.setPenWidth(10);
gravy.penDown();
//gravy.move(150);
//gravy.turn(90);
//gravy.move(150);
//gravy.move(150);
//gravy.turn(90);
//gravy.move(150);
for(int i=0; i<4; i++){
	gravy.move(150);
	gravy.turn(90);
}
	}
}
