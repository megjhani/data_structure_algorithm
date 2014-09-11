package com.codility;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SkylineHeight {
	/*
	 * You are going to build a stone wall. The wall should be straight and N meters long, and its thickness should be constant; 
	 * however, it should have different heights in different places. The height of the wall is 
	 * specified by a zero-indexed array H of N positive integers. H[I] is the height of the wall from I to I+1 meters to the right of its left end. 
	 * In particular, H[0] is the height of the walls left end and H[N-1] is the height of the walls right end.
	The wall should be built of cuboid stone blocks (that is, all sides of such blocks are rectangular). Your task is to compute the minimum number of blocks needed to build the wall.
	Write a function:
	class Solution { public int solution(int[] H); }
	that, given a zero-indexed array H of N positive integers specifying the height of the wall, returns the minimum number of blocks needed to build it.
	For example, given array H containing N = 9 integers:
	  H[0] = 8    H[1] = 8    H[2] = 5    
	  H[3] = 7    H[4] = 9    H[5] = 8    
	  H[6] = 7    H[7] = 4    H[8] = 8 

	 */

	public static int solution(int[] H) {
		// write your code in Java SE 7
		int n = H.length;
		int stones = 0;
		int[] stack = new int[n];
		int stack_num = 0;
		for (int i = 0; i < n; i++) {
			while (stack_num > 0 && stack[stack_num - 1] > H[i])
				stack_num -= 1;
			if (stack_num > 0 && stack[stack_num - 1] == H[i])
				continue;
			else
				stones += 1;
			stack[stack_num] = H[i];
			stack_num += 1;

		}
		return stones;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] H = { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
		System.out.println(solution(H));

	}

}
