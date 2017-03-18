package me.joe.math;

import me.joe.math.types.Factors;

public class MATH {
	
    public static void main(String[] args) {    	
    	
    	int optionn = Util.mainMenu();
    	if(optionn == 1) {
    		Factors.findFactors();
    	} else if(optionn == 2) {
    		System.exit(0);
    	} else {
    		Util.mainMenu();
    	}
    }
    	

}
