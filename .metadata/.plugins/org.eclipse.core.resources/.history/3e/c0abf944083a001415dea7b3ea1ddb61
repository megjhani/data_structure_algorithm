package com.codingInt.chap1;

/**
 * Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a
 * rotation of s1 using only one call to isSubstring (i.e., “waterbottle” is a
 * rotation of “erbottlewat”).
 * 
 * @author mmmegjha
 * 
 */
public class Question8 {
		
	public static boolean isSubstring(String s1, String s2){
		return s1.toLowerCase().contains(s2.toLowerCase());
		
	}

	public static boolean isRotated(String s1, String s2){
		boolean rotated = false;
		rotated = isSubstring(s1+s1, s2);
		return rotated;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isRotated(s1, s2));
	}

}
