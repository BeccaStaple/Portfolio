package com.qa.portfolio;

public class EvenlySpaced {

	/**
	 * Returns true if the three values are evenly spaced <br>
	 * Works with any order
	 * 
	 * @param num1 integer value
	 * @param num2 integer value
	 * @param num3 integer value
	 * @return boolean value for if the 3 values entered are evenly spaced
	 */
	public boolean evenlySpaced(int num1, int num2, int num3) {
		//TODO
<<<<<<< HEAD
		int space = num2 - num1;
		int nxtSpace = num1 - num3;
		if (num3 == num2 + space || num2 == num1 + nxtSpace) {
			return true;
		} else {
			return false;
		}
=======
		return false;
>>>>>>> d5ba18acb02557d02ef8144461d51a5622760c9d
	}
}
