package com.qa.portfolio;


public class MultiChar {

	/**
	 * For each character in the entered string the method will triplicate
	 * each the character and return the concatenated string.
	 * 
	 * @param input - any string
	 * @return triplicates of each letter from the input
	 */
	public String multiChar(String input) {
		// TODO
		
		StringBuilder strbld = new StringBuilder(input.length());
		for (int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			strbld.append(a);
			if (Character.isLetter(a)) {
				strbld.append(a);
			}
			if (Character.isLetter(a)) {
				strbld.append(a);
			}
			if (a == '-') {
				strbld.append(a).append(a);
			}
		}
		return strbld.toString();
		
		
		
		
	}

}
