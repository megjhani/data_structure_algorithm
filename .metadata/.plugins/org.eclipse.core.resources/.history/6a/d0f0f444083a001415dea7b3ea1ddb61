package com.codingInt.chap1;

/**
 * Implement an algorithm to determine if string has all unique characters. What
 * if you cannot use additional datastructures
 * 
 * @author MURAD
 * 
 */
public class Question1 {

	/**
	 * this method creates a new variable boolean
	 * 
	 * @param String
	 *            :word
	 * @return boolean
	 */
	public static boolean isUniqueChar(String word) {
		boolean hasUniqueChar = true;
		boolean char_set[] = new boolean[256];
		for (int i = 0; i < word.length(); i++) {
			int val = word.charAt(i);
			if (char_set[val]) {
				hasUniqueChar = false;
				break;
			} else {
				char_set[val] = true;
			}
		}
		return hasUniqueChar;
	}

	/**
	 * not straightforward, takes time to think for the solution elegant
	 * solution
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isUniqueChar2(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
			// left shift 1 by the val, note val is 0,1..(for a, b instead of
			// 97,98...)
			// checker in binary will have the value for a particular char for
			// example for b(=1) 1<<val will be 0010
			// and checker will hold 0010 and when we bitwise 'AND' with 1<<val
			// (b) again the value is greater than 0 since
			// b is already visited and thus return false
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val); // bitwise OR the 1<<val to store the
									// visited char
		}
		return true;
	}

	public static void main(String[] args) {
		String word = "abcdea";
		System.out.println(isUniqueChar2(word));

	}

}
