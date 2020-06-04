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
		char str3 = numberList.charAt(3);
		char str4 = numberList.charAt(4);
		char str5 = numberList.charAt(6);
		char str6 = numberList.charAt(7);
		
		int toInt = Character.getNumericValue(str1);
		int toInt2 = Character.getNumericValue(str2);
		int toInt3 = Character.getNumericValue(str3);
		int toInt4 = Character.getNumericValue(str4);
		int toInt5 = Character.getNumericValue(str5);
		int toInt6 = Character.getNumericValue(str6);
		
		int num1 = toInt + toInt2;
		int num2 = toInt3 + toInt4;
		int num3 = toInt5 + toInt6;
		
		if (num1 > num2 && num1 >num3) {
			return num1;
		}
		if (num2 > num1 && num2 > num3) {
			return num2;
		}
		if (num3 > num1 && num3 > num2) {
			return num3;
		}
		
	}
}
