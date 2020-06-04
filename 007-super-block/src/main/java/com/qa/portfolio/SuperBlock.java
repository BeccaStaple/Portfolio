package com.qa.portfolio;

public class SuperBlock {

	/**
	 * Return the largest length of consecutively repeating characters, do not ignore case
	 * 
	 * @param input 
	 * @return the largest number of consecutive characters
	 */
	public int superBlock(String input) {

		for (int i = 0; i< input.length(); i++) {
			if (input.charAt(i) == i) {
				return 1;
			}
			
		}
    	
	}
}
