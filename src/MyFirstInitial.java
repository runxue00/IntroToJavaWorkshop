import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstInitial {
public static void main(String[] args) {
	Robot yelp=new Robot();
	yelp.penDown();
yelp.setPenColor(Color.MAGENTA);
	yelp.setPenWidth(6);
	yelp.setSpeed(10);
	yelp.turn(90);
	yelp.move(150);
	yelp.setPenColor(Color.PINK);
	yelp.turn(-90);
	yelp.move(150);
	yelp.setPenColor(Color.GRAY);
	yelp.turn(-90);
	yelp.move(150);
	yelp.setPenColor(Color.PINK);
	yelp.turn(90);
	yelp.move(150);
	yelp.setPenColor(Color.MAGENTA);
	yelp.turn(90);
	yelp.move(150);
	yelp.turn(45);
	yelp.move(25);
	yelp.turn(45);
	yelp.move(25);
	yelp.turn(45);
	yelp.move(25);
	yelp.penUp();
	yelp.move(400);
}
}
