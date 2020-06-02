package com.qa.portfolio;

public class EndsWith {
	
	/**
	 * Returns true if it the sentence ends in "java" 
	 * Ignores case
	 * 
	 * @param sentence which may or may not end in java
	 * @return true is sentence ends in java or it will return false
	 */
	public boolean endsJava(String sentence) {
		String result = sentence.toLowerCase();
		if (result.endsWith("java")) {
			return true;
		} else;
			return false;
	}

}
