package com.qa.portfolio;

public class FizzBuzz {

	/**
	 * Gives string output of a numeric value by applying the fizzbuzz rules: <br>
	 * <ul>
	 * <li>If the number is divisible by 3 it will return "fizz"</li>
	 * <li>If the number is divisible by 5 it will return "buzz"</li>
	 * <li>If the number is divisible by 3 and 5 it will return "fizzbuzz"</li>
	 * <li>If the number is divisible by neither 3 or 5 it will return the 
	 * value of the the number as a string</li>
	 * </ul>
	 * @param number
	 * @return "fizz", "buzz", "fizzbuzz" or numeric value as a string
	 */
	public String fizzBuzz(int number) {
<<<<<<< HEAD
		//if statement 
		
		if (number % 5 ==0 && number % 3 ==0) {
			return "fizzbuzz";
		}
		
		if (number % 3 == 0) {
			return "fizz";
		}
			
		if (number % 5 == 0) {
			return "buzz";
		} 
		
		if (number % 5 != 0 && number % 3 !=0) {
			return Integer.toString(number);
		}
		return null;
		
    	
=======
    	return "";
>>>>>>> d5ba18acb02557d02ef8144461d51a5622760c9d
	}
}
