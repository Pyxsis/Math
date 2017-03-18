package me.joe.math.types;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import me.joe.math.Util;

public class Factors {
	
	public static void findFactors() {
		ArrayList<String> factors = new ArrayList<String>(); // to print
		
		
    	double i, Number1, Number2, highestnumber; // defining variables
		
		String StrNumbers = JOptionPane.showInputDialog("Enter any 2 numbers seperated by a space to find common factors"); // getting input
		String[] stranumbers = StrNumbers.split(" "); // splitting input 
		Number1 = Double.parseDouble(stranumbers[0]); // first number 
		Number2 = Double.parseDouble(stranumbers[1]); // second number
		highestnumber = Util.highestNumber(Number1, Number2); // getting the highest of the two
		
		for(i = 1; i <= highestnumber; i++) { // looping through 1-highest factor
			if(Number1%i == 0 && Number2%i == 0) { // if both numbers divided by the current looped number don't have a remainder 
				factors.add(i + ""); // add to the array list
			}
		}
		
		Util.print(factors.toString() + "\nSending back to main menu"); // print array list and tell them they're going to main menu
		Util.mainMenu(); // open main menu
	}
	
	
}
