package me.joe.math;

import me.joe.math.types.Factors;

public class MATH {
	
    public static void main(String[] args) {    // main place	
    	int optionn = Util.mainMenu(); // get input
    	if(optionn == 1) { // if input is 1
    		Factors.findFactors(); // start finding factors
    	} else if(optionn == 2) { // if it's 2
    		System.exit(0); // close the program peacefully
    	} else {
    		Util.mainMenu(); // invalid input, send them back to main menu
    	}
    }
    	

}
