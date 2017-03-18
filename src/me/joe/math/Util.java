package me.joe.math;

import javax.swing.JOptionPane;

public class Util {
	
	public static double highestNumber(double number1, double number2) { // take input
		if(number1 > number2) { // if number 1 is over number 2
			return number1; // number 1 is highest
		} else { // else
			return number2; // number 2 is highest
		}
	}
	
	public static void print(String msg) { // print dialogue
		JOptionPane.showMessageDialog(null, msg);
	}    
    
	public static int mainMenu() { // show main menu
    	String optionstr = JOptionPane.showInputDialog("Type one of the following options"
    			+ "\n\"1\" to find common factors of 2 numbers"
    			+ "\n\"2\" to close"); // get input
    	return Integer.parseInt(optionstr); // return input
	}
	
	
}
