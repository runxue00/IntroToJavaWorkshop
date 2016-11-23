package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What is your name?");
	String age=JOptionPane.showInputDialog("How old are you?");
	JOptionPane.showMessageDialog(null,"Hi "+name);
	JOptionPane.showMessageDialog(null,"I know you are "+age+ " years old");
	String country=JOptionPane.showInputDialog("What country do you live in?");
	JOptionPane.showMessageDialog(null,"I know you live in "+country+"."+" I am learning so much about you.");
}
}