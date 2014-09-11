package com.codingInt.chap1;

/**
 * 
 * Design an algorithm and write code to remove the duplicate characters in a
 * string without using any additional buffer. NOTE: One or two additional
 * variables are fine. An extra copy of the array is not. FOLLOW UP Write the
 * test cases for this method.
 * 
 * @author MURAD
 * 
 */
public class Question3 {

	/**
	 * logic similar to that of Question 1, however this method creates a copy
	 * of word in stringbuilder and hence not an elegant solution
	 * 
	 * @param args
	 */
	public static String removeDuplicates(String word) {
		StringBuilder sb = new StringBuilder(word);
		int checker = 0;
		for (int i = 0; i < sb.length(); i++) {
			int val = sb.charAt(i) - 'a';
			if ((checker & 1 << val) > 0) {
				sb.deleteCharAt(i);
				i--;
			}
			checker |= 1 << val;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "AAAAAAAAAAaaaaaaaaaaabbbbbbbbbbbbbe11111111bbbbbbbbbbbbbbbbbbbbccddddddddddddddddddddddddaaaaaaaaaaaaaaaa";
		System.out.println(removeDuplicates(word));

	}

}
