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
		
		char str1 = numberList.charAt(0);
		char str2 = numberList.charAt(1);
		
		int toInt = Character.getNumericValue(str1);
		int toInt2 = Character.getNumericValue(str2);
		
		int result = toInt + toInt2;
		
		return result;
		
		
		
	}
}
