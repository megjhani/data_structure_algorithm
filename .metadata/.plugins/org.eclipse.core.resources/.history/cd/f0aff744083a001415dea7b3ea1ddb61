package com.codingInt.chap1;

/**
 * Write a method to replace all spaces in a string with ‘%20’.
 * 
 * @author MURAD
 * 
 */
public class Question5 {
	public static String replaceWhiteSpace(String word,String replaceWith){
		StringBuilder sb = new StringBuilder(word);
		int lenghtOfReplacingString = replaceWith.length()-1;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i)== ' ') {
				sb.deleteCharAt(i);
				sb.insert(i,replaceWith.toCharArray());
				i=i--;
			}
		}
		return sb.toString();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "a bcdef";
		System.out.println(replaceWhiteSpace(word, "%20"));
	}

}
