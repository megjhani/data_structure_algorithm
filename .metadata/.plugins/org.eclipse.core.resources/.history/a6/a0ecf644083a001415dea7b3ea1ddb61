package com.codingInt.chap1;

/**
 * Write a method to decide if two strings are anagrams or not.
 * 
 * @author MURAD
 * 
 */
public class Question4 {
	/**
	 * 
	 * @param String:word1
	 * @param String:word2
	 * @return boolean : true if word1 is Anagram of word2
	 * Runnning Time : O(max(word1.length,word2.length)+256)
	 */
	public static boolean isAnagram(String word1, String word2) {
		boolean areAnagrams = true;
		int countWords[] = new int[256];
		int length = word1.length()>word2.length()?word1.length():word2.length();
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		for(int i = 0;i <length;i++){
			if(i<word1.length()){
				int val = word1.charAt(i);
				// 	32 ASCII for space // ignore spaces
				if(val != 32) ++countWords[val];
			}
			if(i<word2.length()){
				int val = word2.charAt(i);
				// 	32 ASCII for space
				if(val != 32) --countWords[val];
			}
		}
		for(int countword:countWords){
			if(countword !=0){
				areAnagrams = false;
				break;
			}
		}
		return areAnagrams;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "Sl ient";
		String word2 = "liSten";
		System.out.println(isAnagram(word1, word2));

	}

}
