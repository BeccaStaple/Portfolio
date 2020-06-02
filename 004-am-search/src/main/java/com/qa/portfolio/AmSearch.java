package com.qa.portfolio;

public class AmSearch {

	/**
	 * Returns the number of times "am" appears in a String ignoring case <br>
	 * Only counts "am" if it is not proceeded or followed by another character 
	 * 
	 * @param sentence to search for "am" in
	 * @return the count of "am" words
	 */
	public int amSearch(String sentence) {
		boolean am = sentence.contains("am ");
		if (am) {
			return 1;
		}
		return -1;
	}
}
