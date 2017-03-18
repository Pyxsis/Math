package me.joe.math;

import javax.swing.JOptionPane;

public class Util {
	
	public static double highestNumber(double number1, double number2) {
		if(number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}
	
	public static void print(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}    
    
	public static int mainMenu() {
    	String optionstr = JOptionPane.showInputDialog("Type one of the following options"
    			+ "\n\"1\" to find common factors of 2 numbers"
    			+ "\n\"2\" to close");
    	return Integer.parseInt(optionstr);
	}
	
	
}
