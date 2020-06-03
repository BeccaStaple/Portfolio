package com.qa.portfolio;

public class Largest {

	
	/**
	 * Splits the inputed string into individual numbers separated by spaces. <br>
	 * Then sums the value of the individual digits which make up that number <br>
	 * 
	 * <b>Example:</b><br>
	 * String numberList = "55 72 86"<br>
	 * <br>
	 * "55" will equal the integer 10 <br>
	 * "72" will equal the integer 9 <br>
	 * "86" will equal the integer 14 <br>
	 * Therefore 14 would be returned
	 * @param numberList - a string of space separated numbers
	 * @return the largest sum of the units of the numbers
	 */
	public int largest(String numberList) {
		
		String[] strings = numberList.split("");
		// now it's an int
		int toInt = Integer.parseInt(numberList);
		//my toInt needs to be split and added
		while (toInt > 0) {
		int result = toInt % 10;
		    int newInt = result / 10;
		    return newInt;
		} 
	}
}
