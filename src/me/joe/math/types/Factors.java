package me.joe.math.types;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import me.joe.math.Util;

public class Factors {
	
	public static void findFactors() {
		ArrayList<String> factors = new ArrayList<String>();
		
		
    	double i, Number1, Number2;
		
		String StrNumbers = JOptionPane.showInputDialog("Enter any 2 numbers seperated by a space to find common factors");
		String[] stranumbers = StrNumbers.split(" ");
		Number1 = Double.parseDouble(stranumbers[0]);
		Number2 = Double.parseDouble(stranumbers[1]);
		double highestnumber = Util.highestNumber(Number1, Number2);
		
		for(i = 1; i <= highestnumber; i++) {
			if(Number1%i == 0 && Number2%i == 0) {
				factors.add(i + "");
			}
		}
		
		Util.print(factors.toString() + "\nSending back to main menu");
		Util.mainMenu();
	}
	
	
}
