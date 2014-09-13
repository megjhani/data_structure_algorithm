package com.geeksforgeeks.solutions;

/**
 * check if the number is repeated odd number of times in a list only one number
 * is repeated odd number of times rest of the numbers are all repeated even
 * number of times.
 * 
 * @author MURAD
 * 
 */
public class Question1 {

	public static int getOddNumberInList(int list[]) {
		int checker = 0;
		for (int i = 0; i < list.length; i++) {
			checker ^= list[i];
		}
		return checker;
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		int list[] = { 2, 3, 2, 3, 3, 4,4  };
		System.out.println(getOddNumberInList(list));

	}
}
